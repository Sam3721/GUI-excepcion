package co.edu.udistrital.controller;

import co.edu.udistrital.model.Operaciones;

public class DivisionCero {
	public DivisionCero() {
		
	}
	
	public static void Validar(int x, int y) throws ExcepcionCero {
		
		if (Operaciones.dividir(x, y)==Double.POSITIVE_INFINITY ||Operaciones.dividir(x, y)==Double.NEGATIVE_INFINITY || Double.isNaN(Operaciones.dividir(x, y))) {
			
		throw new ExcepcionCero();	
	}
	}
}
