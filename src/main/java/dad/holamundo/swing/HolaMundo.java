package dad.holamundo.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] args) {

		//Creamos la etiqueta para mostrar el saludo
		JLabel saludoLabel = new JLabel();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		//Creamos el botón para saludar
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Como me pulses te saludo");
		saludarButton.addActionListener( e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
			
		//Panel (contenedor) que contiene la etiqueta y el botón
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//Ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
