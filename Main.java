/*
									UNIVERSIDAD AUT�NOMA DE BAJA CALIFORNIA
								  FACULTAD DE CIENCIAS QU�MICAS E INGENIER�A
									  ALGORITMOS Y ESTRUCTURA DE DATOS
											     PR�CTICA #8

Nombre: Rodr�guez Mu�oz Jos� Luis
Pr�ctica: Simulaci�n con Colas
Fecha: 28/OCT/2019

Descripci�n:
Las colas se presentan naturalmente en situaciones donde la tasa de demanda de servicio por
parte de los clientes puede superar a la tasa de servicio que puede proporcionar el servidor; por
ejemplo, los carros al llegar a una caseta de cobro pudieran esperar en una cola antes de acceder a
la caseta. El mismo tipo de situaci�n puede ocurrir en una red de �rea local donde muchas
computadoras comparten unas impresoras, los trabajos de impresi�n pueden acumularse en una
cola de impresi�n; lo mismo pasa en las cajas de los mercados, en la fila de espera para cruzar a
Estados Unidos o los pacientes que esperan para ser atendidos en un hospital. En el caso de una
cola de trabajos de impresi�n, el sistema puede contar con varios servidores, cada uno con una
tasa de impresi�n diferente y N trabajos de impresi�n.

Un car wash ofrece 3 servicios de lavado para autos grandes y peque�os. Antes de pagar en la
caja, se indica al cliente el tiempo de espera y el costo que debe pagar.

	- A todos los carros se les hace un prelavado que dura 3 minutos.
	- El lavado del auto dura 5 minutos.
	- El secado del auto dura 10 minutos.
	- El aspirado interno dura 15 minutos.
	- La aplicaci�n de armor all dura 5 minutos.

Los servicios que se ofrecen son:

	Express: Solo lavado y secado
	Regular: Incluye lavado, secado y armor all
	Deluxe: Incluye lavado, secado, armor all y aspirado.
	
Los costos son:

	B�sico $70
	Regular $90
	Deluxe $120
	
En esta pr�ctica se pide simular un CARWASH con el esquema cliente / servidor con las siguientes especificaciones:

- Los momentos de llegada de los clientes ser�n generados por el operador.
- Simule el tiempo de lavado usando retrasos o pausas (delay)
- Antes de que un cliente pague, debe indicarse el tiempo aproximado de espera.
- Debe indicarse claramente el momento de llegada de cada cliente.
- Debe indicarse claramente el momento de entrada al t�nel de lavado.
- Debe indicarse el momento de terminaci�n de cada trabajo.
- El programa debe contar con una opci�n para terminar.
- En todo momento deben estar visibles los carros pendientes en la cola.
- El lenguaje de programaci�n es libre.
- El programa debe estar organizado en funciones o m�todos que realicen solo una tarea.

*/

package carWash;

import javax.swing.*;
import java.awt.event.*;

public class Main {
	
	public static void main(String[] args) {
		
		CarWash simulation = new CarWash();
		simulation.setBounds(0, 0, 450, 300); // Ubicaci�n de la ventana
		simulation.setResizable(false); // No modificar ventana
		simulation.setVisible(true); // Hace visible la ventana
		simulation.setLocationRelativeTo(null); // Centro de la pantalla
	}
}