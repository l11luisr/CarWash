import javax.swing.*;
import java.awt.event.*;

public class CarWash extends JFrame implements ActionListener {
	
	private JLabel l1, l2, l3, l4, l5, l6;
	private JButton boton1;
	
	// Método constructor
	public CarWash() {
		
		// Se crean los botones/etiquetas
		setLayout(null);
		boton1 = new JButton("Activar simulación");
		boton1.setBounds(125, 20, 180, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		l1 = new JLabel("Atendidos: ");
		l1.setBounds(20, 70, 300, 30);
		add(l1);
		
		l2 = new JLabel("En cola: ");
		l2.setBounds(20, 110, 300, 30);
		add(l2);
		
		l3 = new JLabel("Minuto de llegada: ");
		l3.setBounds(20, 150, 400, 30);
		add(l3);
		
		l4 = new JLabel("Prelavado: ");
		l4.setBounds(250, 70, 300, 30);
		add(l4);
		
		l5 = new JLabel("Tiempo espera: ");
		l5.setBounds(250, 110, 300, 30);
		add(l5);
		
		l6 = new JLabel("Precio: ");
		l6.setBounds(250, 150, 300, 30);
		add(l6);
	}
	
	// Interacción del usuario con el sistema
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boton1) {
			
			simulacion();
		}
	}
	
	// Validaciones de la simulación 
	public void simulacion() {
		
		int estado = 0;
		int llegada = 2 + (int) (Math.random() * 2);
		int salida = -1;
		int carrosAtendidos = -15;
		int prelavado = 3;
		int lavado = 0;
		int precio = 0;
		Cola cola = new Cola();
		
		for(int minuto = 0; minuto < 60; minuto++) {
			
			if(llegada == minuto) {
				
				if(estado == 0) {
					
					estado = 1;
					salida = minuto + 2 + (int)(Math.random() * 3);
					lavado = 15;
					precio = 70;
					
				} else {
					
					cola.insertar(minuto);
				}
				llegada = minuto + 2 + (int)(Math.random() * 2);
				lavado = 20;
				precio = 90;
			}
			
			if(salida == minuto) {
				
				estado = 0;
				carrosAtendidos++;
				
				if(!cola.vacia()) {
					
					cola.remover();
					estado = 1;
					salida = minuto + 2 +(int)(Math.random() * 3);
					lavado = 35;
					precio = 120;
				}
			}
		}
		
		// Se imprimen los respectivos resultados para cada opción
		l1.setText("Atendidos: " + String.valueOf(carrosAtendidos));
		l2.setText("En cola: " + String.valueOf(cola.cantidad()));
		l3.setText("Minuto de llegada: " + String.valueOf(cola.remover()));
		l4.setText("Prelavado: " + prelavado + " min");
		l5.setText("Tiempo espera: " + String.valueOf(lavado) + " min");
		l6.setText("Precio: $ " + String.valueOf(precio));
		
	}
	
}