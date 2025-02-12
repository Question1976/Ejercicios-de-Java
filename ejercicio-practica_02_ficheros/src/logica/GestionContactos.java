package logica;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import beans.Contacto;

public class GestionContactos {

	String ruta = "D:\\temporal\\contactos.txt";

	public boolean agregar(String nombre, int edad, String email) {
		// Si no existe, se añade.
		if (buscar(email) == null) {
			Contacto c = new Contacto(nombre, email, edad);
			try (FileOutputStream fos = new FileOutputStream(ruta, true); PrintStream salida = new PrintStream(fos)) {
				salida.println(nombre + "|" + edad + "|" + email);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscar(String email) {
		Contacto c = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
			String s;
			while ((s = bf.readLine()) != null) {
				String[] datos = s.split("[|]");
				if (datos[2].equals(email)) {
					c = new Contacto(datos[0], datos[2], Integer.parseInt(datos[1]));
					break;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// Devuelve el contacto encontrado, y sino null.
		return c;
	}

	public boolean eliminar(String email) {
		// Recuperamos todos los contactos y volvemos a 
		// guardarlos todos salvo el que queremos eliminar.
		boolean res = false;
		Contacto[] todos = recuperarContactos();
		try (PrintStream out = new PrintStream(ruta);) {
			for (Contacto c : todos) {
				// Comprueba si hay coincidencia de email 
				// antes de guardar.
				if (!email.equals(c.getEmail())) {
					out.println(c.getNombre() + "|" + c.getEdad() + "|" + c.getEmail());
				} else {
					// Si hay coincidencia no se guarda, 
					// por tanto se pone la variable res pasa 
					// a true para indicar que se elimina.
					res = true;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public Contacto[] recuperarContactos() {
		// Recupera los contactos y los guarda en una colección
		// ArrayList que luego trasforma en array.
		ArrayList<Contacto> existentes = new ArrayList<>();
		Contacto c = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(ruta));) {
			String s;
			while ((s = bf.readLine()) != null) {
				String[] datos = s.split("[|]");
				c = new Contacto(datos[0], datos[2], Integer.parseInt(datos[1]));
				existentes.add(c);
			}
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
		// El método toArray devuelve un array con los elementos
		// de la colección requiere que se le pase como parámetro
		// un array vacío.
		return existentes.toArray(new Contacto[0]);
	}

}
