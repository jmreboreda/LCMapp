/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.principal;

import com.github.lcmapp.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author jmrb
 */
public class LCMapp {
    
    public static void main (String args[]){
        
       Session session = HibernateUtil.getSessionFactory().openSession();
       if (session != null)
           System.out.println("Habemus session!!!\n" + session.toString());
       
        
    }
    
}
