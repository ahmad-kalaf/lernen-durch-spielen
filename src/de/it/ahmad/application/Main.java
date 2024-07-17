package de.it.ahmad.application;

import de.it.ahmad.ui.SpielAuswaehlUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage _primaryStage;
	
	public static Stage get_primaryStage()
	{
		return _primaryStage;
	}

	@Override
	public void start(Stage primaryStage) {
		_primaryStage = primaryStage;
		try {
			SpielAuswaehlUI scene = new SpielAuswaehlUI();
			primaryStage.setScene(scene.getScene());
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
