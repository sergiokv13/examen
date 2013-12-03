package examen;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;
import java.io.PrintWriter;
public class principalServlet extends HttpServlet {
	anho a = new anho();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				int anho =Integer.parseInt ( request.getParameter("anho") );
				if ( a.anhoBisiesto(anho) )
					out.println("El anho es Bisiesto");
				else
					out.println("El anho no es Bisiesto");

				out.println("<a href=\"/\" > Atras </a>");
	}
}
