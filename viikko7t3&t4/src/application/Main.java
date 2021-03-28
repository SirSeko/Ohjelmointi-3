package application;
	



import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;

import javax.imageio.ImageIO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Vertical boxi, arvonta nappi ja muut kent‰t
				File source = new File("C:\\temp\\savonia.jpg");
				Image kuva = new Image(source.toURI().toString());
				Tuote t = new Tuote();
				ImageView iv = new ImageView();
				iv.setImage(kuva);
				iv.autosize();
				VBox verticalBox = new VBox();
				verticalBox.setPadding(new Insets(10));
				verticalBox.setSpacing(8);
				
				Label labeli = new Label("Anna Tiedot:");
				TextField txbNimi = new TextField("Nimi");
				DatePicker pvm = new DatePicker();
				TextField txbHinta = new TextField("100");
				TextField txbOstaja = new TextField("Ostajan Nimi");
				Button btn = new Button("Tallenna");
				Button btn2 = new Button("Sulje");
				
				//Lis‰t‰‰n textiboxit ja nappi verticalboxiin
				verticalBox.getChildren().addAll(iv,labeli, txbNimi,pvm, txbHinta, txbOstaja,
						btn, btn2);
				//Laitetaan vertical boxi sceneen
				Scene scene = new Scene(verticalBox, 350, 350);
				//Laitetaan scene primaryStageen
				primaryStage.setScene(scene);
				primaryStage.show();
				
				txbNimi.focusedProperty().addListener(new ChangeListener<Boolean>() {

					@Override
					public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
							Boolean newValue) {
						t.setNimi(txbNimi.getText());
						System.out.println(txbNimi.getText());
						
					}

					
					
					
				});
				txbHinta.focusedProperty().addListener(new ChangeListener<Boolean>() {

					@Override
					public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
							Boolean newValue) {
						Double d = Double.parseDouble(txbHinta.getText());
						t.setMyyntihinta(d);
						System.out.println(d);
						
					}

					
					
					
				});
				txbOstaja.focusedProperty().addListener(new ChangeListener<Boolean>() {

					@Override
					public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
							Boolean newValue) {
						t.setOstaja(txbOstaja.getText());
						System.out.println(txbOstaja.getText());
						
					}

					
					
					
				});
				btn.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						String date = pvm.getValue().toString();
						t.setKayttoonottopaiva(date);
						for (Node node : verticalBox.getChildren()) {
							if (node instanceof TextField) {
								
							}
						}
					}
					
				});
				btn2.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						System.exit(0);
					}
					
				});
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
