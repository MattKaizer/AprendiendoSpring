package com.mbm.vehiculosconInterfaz.vehiculos2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
        
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/mbm/vehiculos2/xml/beans.xml");

		Vehiculo v1 = (Vehiculo) appContext.getBean("vehiculo");
		v1.setMarca("Porsche");
		v1.setModelo("911");

		
		 Vehiculo v2 = (Vehiculo) appContext.getBean("vehiculo"); 
		 v2.setMarca("Seat");
		 v2.setModelo("Marbella");
		 

		System.out.println(v1);
		System.out.println(v2);

		((ConfigurableApplicationContext) appContext).close();
    	
    }
}
