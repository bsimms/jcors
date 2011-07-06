package org.jcors.web;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jcors.config.JCorsConfig;
import org.jcors.util.Constraint;

/**
 * Specialized handler for Preflight Requests
 * 
 * @author Diego Silveira
 */
public class SimpleRequestHandler implements RequestHandler {

	/**
	 * @see RequestHandler.handle
	 */
	public void handle(HttpServletRequest request, HttpServletResponse response, FilterChain chain, JCorsConfig config) throws IOException,
			ServletException {
		
		Constraint.ensureTrue(config.isNonCorsRequestsEnabled(), "Non-CORS requests are disabled");
		chain.doFilter(request, response);
	}

	
	
}
