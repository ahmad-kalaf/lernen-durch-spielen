package de.it.ahmad.ui.mathespiel;

import de.it.ahmad.application.Main;
import de.it.ahmad.konstanten.Fenstergroesse;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MatheSpielEinstellungenUI
{
	private Scene scene;
	private Scene letzteScene;

	public MatheSpielEinstellungenUI()
	{
		initScene();
	}

	private void initScene()
	{
		AnchorPane pane = new AnchorPane();

		Button button = new Button("Zurück zur Spielauswahl");
		HBox box = new HBox();
		box.setBackground(Background.fill(Color.YELLOW));
		box.setAlignment(Pos.CENTER);
		box.setMinHeight(button.getHeight());
		button.setFocusTraversable(false);
		
		AnchorPane.setTopAnchor(box, 0.0);
		AnchorPane.setRightAnchor(box, 0.0);
		AnchorPane.setLeftAnchor(box, 0.0);

		Button spielBeginnen = erstelleButton("Spiel beginnen", event ->
		{
			MatheSpielFrageAnwortenUI m = new MatheSpielFrageAnwortenUI();
			m.wechsleZumFenster(scene);
		});
		
		AnchorPane.setTopAnchor(spielBeginnen, 100.0);
		AnchorPane.setBottomAnchor(spielBeginnen, 100.0);
		AnchorPane.setRightAnchor(spielBeginnen, 100.0);
		AnchorPane.setLeftAnchor(spielBeginnen, 100.0);

		button.setOnAction(event ->
		{
			Main.get_primaryStage().setScene(letzteScene);
		});

		box.getChildren().addAll(button);
		pane.getChildren().addAll(box, spielBeginnen);
		scene = new Scene(pane, Fenstergroesse.getBreite(), Fenstergroesse.getHoehe());
	}

	public Scene wechsleZumFenster(Scene source)
	{
		Main.get_primaryStage().setScene(scene);
		letzteScene = source;
		return scene;
	}

	public Scene getScene()
	{
		return scene;
	}

	private Button erstelleButton(String beschriftung, EventHandler<ActionEvent> event)
	{
		Button button = new Button(beschriftung);
		button.setOnAction(event);
		button.setFocusTraversable(false);
		button.setTextFill(Color.BLACK);
		return button;
	}

	// erstelle die Oberfläche für die Ergebnisausgabe am Ende einer Spielrunde
	// implementiere die Funktionalität zum Bewerten der Ergebnisse
	// implementiere die Funktionalität zur Ausgabe des Gesammtergebnisses
}
