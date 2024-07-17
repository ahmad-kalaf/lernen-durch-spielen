package de.it.ahmad.ui.mathespiel;

import java.util.Arrays;

import de.it.ahmad.application.Main;
import de.it.ahmad.fragen_antworten.FrageUndAntworten;
import de.it.ahmad.konstanten.Fenstergroesse;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class MatheSpielFrageAnwortenUI
{
	// Pane enthaelt alle Elemente für dieses Fenster
	private BorderPane pane;
	private Scene scene, letzteScene;
	private int frageIndex;
	private FrageUndAntworten fragenSammlung;
	// Hier werden die Fragen und Antworten gespeichert
	private String[] frageAntworten;
	private String frage, a1, a2, a3, a4, korrekteAntwort;
	// Das aktuelle Ergebnis der Spielrunde
	private String aktuellesErgebnis;
	// Statistische Daten ueber die Fragen
	private int richtigBeantwortete, beantwortete, anzahlFragenGesamt;
	// Diese Buttons sind zum Auswaehlen einer Antwort
	private Button a1Button, a2Button, a3Button, a4Button;
	// Hier wird die Frage angezeigt
	private HBox frageBox;
	private Label korrektBeantworteteAnzeige, gesamtAnzahlAnzeige, falschBeantworteteAnzeige;

	public MatheSpielFrageAnwortenUI()
	{
		frageIndex = -1;
		fragenSammlung = new FrageUndAntworten();
		initUI();
	}

	private void initUI()
	{
		pane = new BorderPane();
		naechsteFrage();

//		Frage wird oben angezeigt
		frageBox = new HBox();
		frageBox.setAlignment(Pos.CENTER);
		pane.setTop(frageBox);
		frageBox.getChildren().add(new Text(frage));

//		Die Buttons mit den Antwortmöglichkeiten werden in der Mitte angezeigt
		a1Button = new Button(a1);
		a1Button.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		a2Button = new Button(a2);
		a2Button.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		a3Button = new Button(a3);
		a3Button.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		a4Button = new Button(a4);
		a4Button.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		GridPane antwortenBox = new GridPane();
		antwortenBox.add(a1Button, 0, 0);
		antwortenBox.add(a2Button, 0, 1);
		antwortenBox.add(a3Button, 0, 2);
		antwortenBox.add(a4Button, 0, 3);
		antwortenBox.setVgap(30);
		antwortenBox.setAlignment(Pos.CENTER);
		pane.setCenter(antwortenBox);
//		Formattiere das Aussehen der Buttons und gebe ihnen die Funktionalitaet
		formateButtons(a1Button, a2Button, a3Button, a4Button);
		Arrays.stream(new Button[]
		{ a1Button, a2Button, a3Button, a4Button }).forEach(b -> b.setOnAction(event -> frageBeantwortet(b)));

//		Aktuelles Ergebnis / Fortschritt anzeigen
		VBox infoBoxRechts = new VBox();
		GridPane gridPaneRechts = new GridPane();
		korrektBeantworteteAnzeige = new Label();
		gesamtAnzahlAnzeige = new Label();
		falschBeantworteteAnzeige = new Label();
//		gridPaneRechts.setBackground(Background.fill(Color.BLUE));
		infoBoxRechts.getChildren().add(gridPaneRechts);
		
		anzahlFragenGesamt = fragenSammlung.getAnzahlFragen();
		aktuellesErgebnis = String.valueOf(richtigBeantwortete);
		
//		infoBoxRechts.setAlignment(Pos.CENTER);
//		infoBoxRechts.setBackground(Background.fill(Color.LIGHTBLUE));
		
		korrektBeantworteteAnzeige.setTextAlignment(TextAlignment.CENTER);
		korrektBeantworteteAnzeige.setText(aktuellesErgebnis);
		gridPaneRechts.add(new Label("Korrekt beantwortet:"), 0, 0);
		gridPaneRechts.add(korrektBeantworteteAnzeige, 0, 1);
		gridPaneRechts.setAlignment(Pos.CENTER);
		
		pane.setRight(infoBoxRechts);

		scene = new Scene(pane, Fenstergroesse.getBreite(), Fenstergroesse.getHoehe());
	}

	private void frageBeantwortet(Button button)
	{
		if (button.getText().equals(korrekteAntwort))
		{
			++richtigBeantwortete;
		}
		++beantwortete;
		aktuellesErgebnis = String.valueOf(richtigBeantwortete);
		korrektBeantworteteAnzeige.setText(aktuellesErgebnis);
		naechsteFrage();
		frageBox.getChildren().clear();
		frageBox.getChildren().add(new Text(frage));
		a1Button.setText(a1);
		a2Button.setText(a2);
		a3Button.setText(a3);
		a4Button.setText(a4);
	}

	private void formateButtons(Button... buttons)
	{
		for (Button button : buttons)
		{
			button.setBackground(Background.EMPTY);
			button.setOnMouseEntered(event ->
			{
				button.setBackground(Background.fill(Color.RED));
			});
			button.setOnMouseExited(event ->
			{
				button.setBackground(Background.EMPTY);
			});
		}
	}

	private String[] naechsteFrage()
	{
		frageIndex++;
		frageAntworten = fragenSammlung.getFrageUndAntworten(frageIndex);
		frage = frageAntworten[0];
		a1 = frageAntworten[1];
		a2 = frageAntworten[2];
		a3 = frageAntworten[3];
		a4 = frageAntworten[4];
		korrekteAntwort = frageAntworten[5];
		return frageAntworten;
	}

	public Scene wechsleZumFenster(Scene source)
	{
		Main.get_primaryStage().setScene(scene);
		letzteScene = source;
		return scene;
	}
}