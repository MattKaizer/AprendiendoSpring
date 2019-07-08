package com.mbm.vehiculosanotaciones.vehiculosanotprop;

import org.springframework.stereotype.Component;

import com.mbm.vehiculosanotprop.interfaces.I_itv;

@Component
public class InformeItv implements I_itv{
	
	

	public String getEstadoMotor() {
		// TODO Auto-generated method stub
		return "Estado general del motor: APTO";
	}

	public String getEstadoCulata() {
		// TODO Auto-generated method stub
		return "Estado de culata: APTO";
	}

	public String getEstadoCarter() {
		// TODO Auto-generated method stub
		return "Estado del carter: APTO";
	}

	public String getEstadoBloque() {
		// TODO Auto-generated method stub
		return "Estado del bloque en general: APTO";
	}
	
	

}
