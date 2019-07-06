package com.mbm.ioc;

import com.mbm.ioc.interfaces.CreacionInformes;
import com.mbm.ioc.interfaces.Empleados;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	private String email, nombreEmpresa;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Secretario: Gestionar agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Secretario: " + informeNuevo.getInforme();
	}

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	

}
