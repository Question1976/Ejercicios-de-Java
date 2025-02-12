package testing;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import logica.GestionContactos;

class TestGestionContactos {
	static GestionContactos gestionContactos;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gestionContactos=new GestionContactos();
		gestionContactos.agregar("c1", 10, "c1@gmail.com");
		gestionContactos.agregar("c2", 20, "c2@gmail.com");
		gestionContactos.agregar("c3", 30, "c3@gmail.com");
		gestionContactos.agregar("c4", 40, "c4@gmail.com");
	}

	@Test
	void testExisteContacto() {
		assertTrue(gestionContactos.existeContacto("c1"));
		assertFalse(gestionContactos.existeContacto("otro"));
	}

	@Test
	void testContactoMayor() {
		assertEquals("c4", gestionContactos.contactoMayor().getNombre());
	}

	@Test
	void testBuscarPorNombre() {
		assertNotNull(gestionContactos.buscarPorNombre("c1"));
		assertNull(gestionContactos.buscarPorNombre("no existe"));
	}

	@Test
	void testRecuperarNombres() {
		assertEquals(4, gestionContactos.recuperarNombres().size());
	}

	@Test
	void testEdadMedia() {
		assertEquals(25,gestionContactos.edadMedia());
	}

}
