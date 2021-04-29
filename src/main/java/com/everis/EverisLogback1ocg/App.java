package com.everis.EverisLogback1ocg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	
	
	/** Logger */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	
	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	
    public static void main( String[] args ) {
    	
    	LOGGER.info("Metodo iniciado");
    	
    	// iteracion
    	for (int i = 0; i < 500; i++) {
    		LOGGER.debug("Iteracion numero: {}", i);
    	}
        
    	
    	LOGGER.info("Metodo terminado");
    }
}
