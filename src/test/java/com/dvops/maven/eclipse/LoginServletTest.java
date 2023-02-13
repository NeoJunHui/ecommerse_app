package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

class LoginServletTest {
	LoginServlet loginServlet = new LoginServlet();
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	RequestDispatcher requestDispatcher = mock(RequestDispatcher.class);
	
	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
		
	@Test
	void doPostTest() throws IOException, ServletException {	
		when(request.getParameter("userName")).thenReturn("john");
		when(response.getWriter()).thenReturn(writer);
		
		loginServlet.doPost(request, response);
		
		assertEquals("Hello john", stringWriter.toString());
	}
}