package ar.edu.unju.fi.ejercicio2.model;

import ar.edu.unju.fi.ejercicio2.contantes.meses;

public class efemeride {

	private String codigo;
	private meses mes;
	private int dia;
	private String detalle;
	
	public efemeride() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public meses getMes() {
		return mes;
	}

	public void setMes(meses mes) {
		this.mes = mes;
	}

	

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
