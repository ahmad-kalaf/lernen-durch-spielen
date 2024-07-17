module LernenDurchSpielen {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens de.it.ahmad.application to javafx.graphics, javafx.fxml;
}
