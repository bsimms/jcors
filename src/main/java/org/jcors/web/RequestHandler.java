package org.jcors.web;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jcors.config.JCorsConfig;

/**
 * Interface for a CORS RequestHandler
 * 
 * @author Diego Silveira
 */
public interface RequestHandler {

	/**
	 * Properly handles the CORS request
	 * 
	 * @param request
	 * @param response
	 * @param chain
	 * @param config
	 * @throws IOException
	 * @throws ServletException
	 */
	void handle(HttpServletRequest request, HttpServletResponse response, FilterChain chain, JCorsConfig config) throws IOException,
			ServletException;

}
