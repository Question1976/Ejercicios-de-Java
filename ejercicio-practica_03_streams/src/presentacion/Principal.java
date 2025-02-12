package presentacion;

import java.util.Scanner;

import beans.Contacto;
import logica.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		
		GestionContactos gestor = new GestionContactos();
		Scanner sc = new Scanner(System.in);
		int op, edad;
		String nombre, email;
		
		do {
			// MENÚ.
			System.out.println("1.- Añadir contacto");
	        System.out.println("2.- Buscar contacto");
	        System.out.println("3.- Eliminar contacto");
	        System.out.println("4.- Mostrar todos");
	        System.out.println("5.- Filtrar por edad");
	        System.out.println("6.- Salir");
	           
	        op = Integer.parseInt(sc.nextLine());
	        
	        switch(op){
	        	// AÑADIR CONTACTO.
		        case 1:
		        	System.out.println("Nombre:");
	                nombre = sc.nextLine();
	                System.out.println("Edad: ");
	                edad = Integer.parseInt(sc.nextLine());
	                System.out.println("Email:");
	                email = sc.nextLine();
	                gestor.agregar(nombre, edad,email);                 
	                break;
	                
                // BUSCAR CONTACTO.
		        case 2:
		        	System.out.println("Email: ");
	                email = sc.nextLine();
	                Contacto c = gestor.buscar(email);
	                   // Si es null, es que no se ha encontrado.
	                   if (c == null){
	                       System.out.println("No se encontró el contacto");  
	                    }
	                    else{
	                       System.out.println(c.getNombre() + "-" + c.getEmail() + "-" + c.getEdad());   
	                    }
	                   break;
	                   
                // ELIMINAR CONTACTO.
		        case 3:
		        	System.out.println("Email: ");
	                   email = sc.nextLine();
	                   if (gestor.eliminar(email)){
	                	   System.out.println("Contacto eliminado"); 
	                   } else {
	                	   System.out.println("No se encontró el contacto");
	                   }
	                   break;
	                   
                // MOSTRAR TODOS LOS CONTACTOS.
		        case 4:
		        		// En la variable se guarda el array
		        		// devuelto por el método.
	                   Contacto[] todos = gestor.recuperarContactos();
	                   for (Contacto con : todos){
	                        System.out.println(con.getNombre() + "-" + con.getEmail() + "-" + con.getEdad());
	                    }
	                   break;
	                   
                // FILTRAR POR EDAD.
		        case 5:
		        	   System.out.println("Introduce edad máxima: ");
	                   edad = Integer.parseInt(sc.nextLine());
	                   Contacto[] filtro = gestor.recuperarPorEdadMaxima(edad);
	                   for (Contacto con : filtro){
	                        System.out.println(con.getNombre() + "-" + con.getEmail() + "-" + con.getEdad());
	                    }
	                   break;
	                   
                // SALIR.
		        case 6:
		        	   sc.close();
	                   break;
	            default:
	                   System.out.println("Debes escribir una opción válida");
	        }
			
		} while (op != 6);

	}

}
