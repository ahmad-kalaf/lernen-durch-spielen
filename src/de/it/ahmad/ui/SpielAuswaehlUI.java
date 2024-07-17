package de.it.ahmad.ui;

import de.it.ahmad.application.Main;
import de.it.ahmad.konstanten.Fenstergroesse;
import de.it.ahmad.ui.mathespiel.MatheSpielEinstellungenUI;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SpielAuswaehlUI
{
	private Scene scene;

	public Scene getScene()
	{
		return scene;
	}

	public BorderPane getRoot()
	{
		return root;
	}

	private BorderPane root;

	public SpielAuswaehlUI()
	{
		initScene();
	}

	private void initScene()
	{
		root = new BorderPane();
		scene = new Scene(root, Fenstergroesse.getBreite(), Fenstergroesse.getHoehe());
		root.setTop(erstelleInfoFlaeche());
//		Hier können weitere Elemente in den Bereichen Right, Bottom und Left eingefügt werden
//		root.setRight(erstelleRechts());
//		root.setBottom(erstelleUnten());
//		root.setLeft(erstelleLinks());
		root.setCenter(erstelleMitte());
	}

	private Pane erstelleInfoFlaeche()
	{
		BorderPane box = new BorderPane();
		setzeFarbeUndHintergrund(box, Color.WHITE, false);
		Text infoText = new Text("Wähle ein Spiel aus");
		infoText.setFont(new Font(null, 20));
		Button beenden = new Button("beenden");
		beenden.setFocusTraversable(false);
		beenden.setBackground(null);
		beenden.setOnMouseEntered(event ->
		{
			beenden.setBackground(Background.fill(Color.RED));
			beenden.setTextFill(Color.WHITE);
		});
		beenden.setOnMouseExited(event ->
		{
			beenden.setBackground(Background.EMPTY);
			beenden.setTextFill(Color.BLACK);
		});
		beenden.setOnAction(event ->
		{
			Main.get_primaryStage().close();
		});
		box.setLeft(infoText);
		box.setRight(beenden);
		return box;
	}

	private void resetButtonStyle(Button button)
	{
		button.setBackground(Background.EMPTY);
		button.setTextFill(Color.BLACK);
	}

	private HBox erstelleUnten()
	{
		HBox box = new HBox();
		setzeFarbeUndHintergrund(box, Color.WHITE, false);
		return box;
	}

	private VBox erstelleRechts()
	{
		VBox box = new VBox();
		setzeFarbeUndHintergrund(box, Color.WHITE, false);
		return box;
	}

	private VBox erstelleLinks()
	{
		VBox box = new VBox();
		setzeFarbeUndHintergrund(box, Color.WHITE, false);
		return box;
	}

	private Pane erstelleMitte()
	{
		FlowPane pane = new FlowPane();
		pane.setOrientation(Orientation.VERTICAL);
		pane.setAlignment(Pos.CENTER);
		setzeFarbeUndHintergrund(pane, Color.WHITE, true);

		MatheSpielEinstellungenUI matheSpielUI = new MatheSpielEinstellungenUI();
		Button matheSpielButton = new Button("Mathespiel");
		matheSpielButton.setFocusTraversable(false);
		matheSpielButton.setOnAction(event ->
		{
			matheSpielUI.wechsleZumFenster(scene);
		});
		pane.getChildren().add(matheSpielButton);
		return pane;
	}

	private void setzeFarbeUndHintergrund(Pane pane, Color hintergrund, boolean gerundeterRahmen)
	{
		assert pane != null : "Bedingung verletzt: pane != null";
		assert hintergrund != null : "Bedingung verletzt: hintergrund != null";
		if (gerundeterRahmen)
		{
			pane.setPadding(new Insets(90));
			pane.setBorder(gerundeterRahmen());
		}
		BackgroundFill backgroundFill = new BackgroundFill(hintergrund, // Hintergrundfarbe
				null, // Rundung des Hintergrunds
				Insets.EMPTY // Kein innerer Abstand
		);
		pane.setBackground(new Background(backgroundFill));
		pane.setPadding(new Insets(5));
	}

	private Border gerundeterRahmen()
	{
		BorderStroke stroke = new BorderStroke(Paint.valueOf("RED"), BorderStrokeStyle.SOLID, new CornerRadii(10),
				new BorderWidths(3), new Insets(1));
		Border border = new Border(stroke);
		return border;
	}
}
