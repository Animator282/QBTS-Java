module test {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.media;
	requires javafx.swing;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls, javafx.base, javafx.media, javafx.swing, javafx.web;
}
