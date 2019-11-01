
					UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
				      FACULTAD DE CIENCIAS QUÍMICAS E INGENIERÍA
                                         ALGORITMOS Y ESTRUCTURA DE DATOS
	                                           PRÁCTICA #8

Nombre: Rodríguez Muñoz José Luis

Descripción:
Las colas se presentan naturalmente en situaciones donde la tasa de demanda de servicio por
parte de los clientes puede superar a la tasa de servicio que puede proporcionar el servidor; por
ejemplo, los carros al llegar a una caseta de cobro pudieran esperar en una cola antes de acceder a
la caseta. El mismo tipo de situación puede ocurrir en una red de área local donde muchas
computadoras comparten unas impresoras, los trabajos de impresión pueden acumularse en una
cola de impresión; lo mismo pasa en las cajas de los mercados, en la fila de espera para cruzar a
Estados Unidos o los pacientes que esperan para ser atendidos en un hospital. En el caso de una
cola de trabajos de impresión, el sistema puede contar con varios servidores, cada uno con una
tasa de impresión diferente y N trabajos de impresión.

Un car wash ofrece 3 servicios de lavado para autos grandes y pequeños. Antes de pagar en la
caja, se indica al cliente el tiempo de espera y el costo que debe pagar.

	- A todos los carros se les hace un prelavado que dura 3 minutos.
	- El lavado del auto dura 5 minutos.
	- El secado del auto dura 10 minutos.
	- El aspirado interno dura 15 minutos.
	- La aplicación de armor all dura 5 minutos.

Los servicios que se ofrecen son:

	Express: Solo lavado y secado
	Regular: Incluye lavado, secado y armor all
	Deluxe: Incluye lavado, secado, armor all y aspirado.
	
Los costos son:

	Básico $70
	Regular $90
	Deluxe $120
	
En esta práctica se pide simular un CARWASH con el esquema cliente / servidor con las siguientes especificaciones:

- Los momentos de llegada de los clientes serán generados por el operador.
- Simule el tiempo de lavado usando retrasos o pausas (delay)
- Antes de que un cliente pague, debe indicarse el tiempo aproximado de espera.
- Debe indicarse claramente el momento de llegada de cada cliente.
- Debe indicarse claramente el momento de entrada al túnel de lavado.
- Debe indicarse el momento de terminación de cada trabajo.
- El programa debe contar con una opción para terminar.
- En todo momento deben estar visibles los carros pendientes en la cola.
- El lenguaje de programación es libre.
- El programa debe estar organizado en funciones o métodos que realicen solo una tarea.
