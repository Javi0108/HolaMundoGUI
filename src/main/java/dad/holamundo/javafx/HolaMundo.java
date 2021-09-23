package dad.holamundo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		//Creamos el botón para saludar
		Button saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
		saludarButton.setTooltip(new Tooltip("Cuando me pulses te saludo"));
		saludarButton.setOnAction(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
		
		//Creamos el panel raíz
		Pane rootlPanel = new Pane();
		rootlPanel.getChildren().addAll(saludoLabel, saludarButton);
		
		//Creamos una escena
		Scene scene = new Scene(rootlPanel, 320, 200);
		
		//En este caso el Stage (ventana) no lo creamos nosotros, nos lo da JavaFX
		primaryStage.setTitle("Hola mundo con JavaFX");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
