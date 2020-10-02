/**
 * 
 */
package com.adri.presentacion;

import java.util.Scanner;

import com.adri.negocio.Calculo;

/**
 * @author Giddy
 *
 */
public class Vista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la persona a la que quieres calcularle el índice de masa corporal: ");
		String nombre = sc.next();
		
		System.out.println("El índice de masa corporal de " + nombre + " es " + calculo.calcularIndice(nombre));
		
	}

}
