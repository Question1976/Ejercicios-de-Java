package com.sbs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Ingresamos al m�todo POST de MyServlet");

		// Recibir los par�metros de 'index.jsp'
		// en la variable 'nombre' que viene del 
		// atributo 'name' del formulario
		System.out.println(request.getParameter("nombre"));
		
		// Forma 1 => mediante 'request'
		// S�lo se mantiene en el request
		// Pasar variables desde 'MyServlet' a 'presentacion.jsp'
		request.setAttribute("name1", request.getParameter("nombre"));
		
		// Forma 2 => mediante 'session'
		// Dura toda la sesi�n de la aplicaci�n
		// Pasar variables desde 'MyServlet' a 'presentacion.jsp'
		request.getSession().setAttribute("nameSesion", request.getParameter("nombre"));
		
		// Forma 3 => mediante 'context'
		// Dura mientras viva el servlet
		// Pasar variables desde 'MyServlet' a 'presentacion.jsp'		
		getServletContext().setAttribute("nameContext", request.getParameter("nombre"));
		
		// Redireccionar a 'presentacion.jsp'
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/presentacion.jsp");
		rd.forward(request, response);
	}

}
