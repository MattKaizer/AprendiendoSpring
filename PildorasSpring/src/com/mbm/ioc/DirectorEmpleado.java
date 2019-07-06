package com.mbm.ioc;

import com.mbm.ioc.interfaces.CreacionInformes;
import com.mbm.ioc.interfaces.Empleados;

public class DirectorEmpleado implements Empleados {
	
	//Creacion del campo de la interfaz Informe
	
	private CreacionInformes informeNuevo;
	
	
	//El constructor inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Director: Gestionar la plantilla";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Director: " + informeNuevo.getInforme();
	}

}
