package application;





import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Vertical boxi, arvonta nappi ja muut kent‰t
		VBox verticalBox = new VBox();
		verticalBox.setPadding(new Insets(10));
		verticalBox.setSpacing(8);
		Button btn = new Button("Arvo uudet numerot");
		Label arvotut = new Label();
		Label teksti = new Label("Anna omat numerot ilman pilkkua");
		TextField txb = new TextField();
		Label osumat = new Label("Osumat");
		
		
		// Arvotaan numerot listaan
		ArrayList<Integer> numerot = new ArrayList<>();
		ArrayList<Integer> Knumerot = new ArrayList<>();
		Random randi = new Random();
	
		
	
		//Lis‰t‰‰n labeli ja nappi verticalboxiin
		verticalBox.getChildren().addAll(arvotut, teksti,txb, btn, osumat);
		//Laitetaan vertical boxi sceneen
		Scene scene = new Scene(verticalBox, 250, 250);
		//Laitetaan scene primaryStageen
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Nappia painaessa
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				for (int i = 0; i < 7; i++) {
					int r = randi.nextInt(40);
					numerot.add(r);
					System.out.println(r);
				}
				//Yhdistet‰‰n arvotut numerot string joinerilla
				StringJoiner joiner = new StringJoiner(",");
				for (Integer integer : numerot) {
					joiner.add(integer.toString());
				}
				arvotut.setText(joiner.toString());
				String teksti = txb.getText();
				System.out.println(teksti);
				Scanner input = new Scanner(teksti);
				while (input.hasNextInt()) {
					Knumerot.add(input.nextInt());
				}
				input.close();
				Collections.sort(numerot);
				Collections.sort(Knumerot);
				int ii = 0;
				for (Integer sama: numerot) {
					
					if (Knumerot.contains(sama)) {
						ii++;
						
					}
					
				} osumat.setText("Osumat: " + ii);
				
			}
			
		});
		

	}

	public static void main(String[] args) {
		launch(args);
	}
}
