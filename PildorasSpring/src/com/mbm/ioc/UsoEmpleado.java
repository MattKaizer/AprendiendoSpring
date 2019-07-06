package com.mbm.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mbm.ioc.interfaces.Empleados;

public class UsoEmpleado {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Obj jefe empleado
		
//		Empleados emp1 = new DirectorEmpleado();
//		
//		System.out.println(emp1.getTareas());
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mbm/beans/xml/beans.xml");
		
		
		//Inyeccion via constructor
//		Empleados juan = (Empleados) context.getBean("empleado");	
//		System.out.println(juan.getTareas());		
//		System.out.println(juan.getInforme());
		
		
		//Inyeccion via setter
		SecretarioEmpleado maria = (SecretarioEmpleado) context.getBean("secretario");
		System.out.println(maria.getTareas());		
		System.out.println(maria.getInforme());
		System.out.println("Email: " + maria.getEmail());
		System.out.println("Empresa: " + maria.getNombreEmpresa());
		
		
		
		((ConfigurableApplicationContext)context).close();

	}

}
