/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.exceptions;

/**
 *
 * @author jmrb
 */
public class InstanceNotFoundException extends InstanceException {

	private static final long serialVersionUID = -1765310600493994975L;

	public InstanceNotFoundException(Object key, String className) {
        super("Instance not found", key, className);
    }
    
}