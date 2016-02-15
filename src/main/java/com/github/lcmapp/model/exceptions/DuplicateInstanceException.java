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
public class DuplicateInstanceException extends InstanceException {

	private static final long serialVersionUID = 8813633570761819259L;

	public DuplicateInstanceException(Object key, String className) {
        super("Duplicate instance", key, className);
    }
    
}
