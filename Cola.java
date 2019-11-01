package carWash;

public class Cola {
	
	class Nodo {
		
		int informacion;
		Nodo siguiente;
	}
	
	Nodo nodo, frente; // Atributos de Nodo
	
	// Método constructor
	Cola() {
		
		nodo = null;
		frente = null;
	}
	
	boolean vacia() { 
		
		if(nodo == null)
			return true;    // Regresa verdadero cuando la cola este vacía
		else
			return false;   // En caso contrario regresa falso
	}
	
	// Inserta un elemento al frente de la cola
	void insertar(int informacion) {
		
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.informacion = informacion;
		nuevo.siguiente = null;
		
		if(vacia()) {
			
			nodo = nuevo;
			frente = nuevo;
		} else {
			
			frente.siguiente = nuevo;
			frente = nuevo;
		}
	}
	
	// Remueve el primero elemento de la cola
	int remover() {
		
		if(!vacia()) {
			
			int informacion = nodo.informacion;
			
			if(nodo == frente) {
				
				nodo = null;
				frente = null;
			} else {
				
				nodo = nodo.siguiente;
			}
			return informacion;
		} else {
			
			return Integer.MAX_VALUE; // Obtener el máximo valor del arreglo
		}
	}
	
	public void imprimir() {
		
		Nodo aux = nodo;
		System.out.println("\n Listado de todos los elementos de la cola");
		
		while(aux != null) {
			
			System.out.println(aux.informacion + "-");
			aux = aux.siguiente;
		}
		System.out.println();
	}
	
	// Cantidad de nodos
	public int cantidad() {
		
		int cant = 0;
		Nodo aux = nodo;
		
		while(aux != null) {
			
			cant++;
			aux = aux.siguiente;
		}
		return cant;
	}
}

