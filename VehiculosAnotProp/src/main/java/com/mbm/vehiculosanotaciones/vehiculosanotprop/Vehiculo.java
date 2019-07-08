package com.mbm.vehiculosanotaciones.vehiculosanotprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mbm.vehiculosanotprop.interfaces.I_itv;

@Component
public class Vehiculo {
	
	private InformeItv informe;
	private String tipo;
	private String marca;
	private String modelo;
	private Motor motor;
	private I_itv informeNuevo;
	
	
//	public Vehiculo() { }

	@Autowired
	public Vehiculo(String tipo, String marca, String modelo, I_itv informeNuevo) {
		this.marca = marca;
		this.modelo = modelo;
//		this.motor = motor;
		this.tipo = tipo;
		this.informeNuevo = informeNuevo;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getInfo() {
		return informeNuevo.getEstadoBloque();
	}

	@Override
	public String toString() {
		return "Ficha Técnica: " + "\n" +
				"Tipo de Vehículo= " + tipo + "\n" +
				"marca=" + marca + "\n" +
				"modelo=" + modelo + "\n" + 
				"motor=" + motor + "\n" +
				"+++++++++++++++++++++++++" + "\n" +
				"Detalle ITV:" + "\n" + 
				informe.getEstadoMotor() + "\n" +
				informe.getEstadoCulata() + "\n" +
				informe.getEstadoBloque() + "\n" +
				informe.getEstadoCarter() + "\n" + "\n" ;
	}

}
