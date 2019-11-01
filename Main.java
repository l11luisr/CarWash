import javax.swing.*;
import java.awt.event.*;

public class Main {
	
	public static void main(String[] args) {
		
		CarWash simulation = new CarWash();
		simulation.setBounds(0, 0, 450, 300); // Ubicación de la ventana
		simulation.setResizable(false); // No modificar ventana
		simulation.setVisible(true); // Hace visible la ventana
		simulation.setLocationRelativeTo(null); // Centro de la pantalla
	}
}