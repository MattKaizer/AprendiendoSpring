package com.mbm.vehiculosconInterfaz.vehiculos2;

import org.springframework.cglib.core.Block;
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
        
//		ApplicationContext appContext = new ClassPathXmlApplicationContext(
//				"com/mbm/vehiculos2/xml/beans.xml");
//
//		Vehiculo v1 = (Vehiculo) appContext.getBean("vehiculo");
//		v1.setMarca("Porsche");
//		v1.setModelo("911");
//
//		
//		 Vehiculo v2 = (Vehiculo) appContext.getBean("vehiculo"); 
//		 v2.setMarca("Seat");
//		 v2.setModelo("Marbella");
//		 
//
//		System.out.println(v1);
//		System.out.println(v2);
//
//		((ConfigurableApplicationContext) appContext).close();
    	
//    	Ejemplo de IOC del mismo ejemplo anterior solo usando solo java
    	Vehiculo v1 = new Vehiculo("Coche", "Seat", "Marbella", new Motor(1.8, new Culata(4), new Bloque(4), new Carter(6.5)), new InformeItv());
    	
    	System.out.println(v1);
    	
    }
}
