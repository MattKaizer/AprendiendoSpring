package com.mbm.spring.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mbm/spring/xml/beans.xml");
    	
    	Mundo m = (Mundo) appContext.getBean("mundo");
    	System.out.println(m.getMensaje());
    	
    	//Como la clase ApplicationContext a traves de la clase ClassPathXmlApplicationContext
    	//no tiene un metodo para ser cerrado, tenemos que hacerlo a traves de la interfaz
    	//configurable.
    	
    	((ConfigurableApplicationContext)appContext).close();
    	
    }
}
