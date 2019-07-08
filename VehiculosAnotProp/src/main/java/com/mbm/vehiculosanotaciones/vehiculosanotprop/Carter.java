package com.mbm.vehiculosanotaciones.vehiculosanotprop;

import org.springframework.stereotype.Component;

@Component
public class Carter {
	
	private double volumenAceite;

//	public Carter() { }
//
//	public Carter(double volumenAceite) {		
//		this.volumenAceite = volumenAceite;
//	}

	public double getVolumenAceite() {
		return volumenAceite;
	}

	public void setVolumenAceite(double volumenAceite) {
		this.volumenAceite = volumenAceite;
	}

	@Override
	public String toString() {
		return "Carter [volumenAceite=" + volumenAceite + "]";
	}
	
}
