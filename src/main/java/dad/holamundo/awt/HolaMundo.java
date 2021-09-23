package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundo {

	public static void main(String[] args) {

		//Creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50); // x, y, ancho y alto
		
		//Creamos el botón para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		//Establecemos un listener para la pulsación del botón
		saludarButton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!")); //Mostramos el saludo en la etiqueta 
		
		//Panel (contenedor) que contiene la etiqueta y el botón
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//Ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			};
		});
		
		frame.setVisible(true);
		
	}

}
