package com.mbm.ioc;

import com.mbm.ioc.interfaces.Empleados;

public class JefeEmpleado implements Empleados {

	public String getTareas () 
	{
		return "Jefe: Gestiono a los empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Jefe: mi informe";
	}
	
}
