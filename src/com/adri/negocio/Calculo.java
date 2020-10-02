/**
 * 
 */
package com.adri.negocio;

import com.adri.datos.Personas;

/**
 * @author Giddy
 *
 */
public class Calculo {
	Personas p1 = new Personas();
	
	public int calcularIndice(String nombre) {
		int resultado = p1.getPeso()/(p1.getAltura()/100);
		return resultado;
	}
}
