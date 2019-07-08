package com.mbm.vehiculosanotaciones.vehiculosanotprop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/mbm/vehiculosanotprop/xml/beans.xml");

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
		
		Vehiculo v1 = (Vehiculo) appContext.getBean("vehiculo");
		v1.setTipo("coche");
		v1.setMarca("seat");
		v1.setModelo("marbella");
		
		System.out.println(v1.getInfo());
		
		((ConfigurableApplicationContext) appContext).close();
	}

}
