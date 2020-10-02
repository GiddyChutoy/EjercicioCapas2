/**
 * 
 */
package com.adri.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Giddy
 *
 */
public class Personas {
	private String nombre;
	private int peso;
	private int altura;
	
	public void cogerDatos(String nombre) throws IOException {
		File fichero = new File("C:/Users/Giddy/Documents/personas.txt");
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		while((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			if(array[0].equalsIgnoreCase(nombre)) {
				this.nombre = array[0];
				peso = Integer.parseInt(array[1]);
				altura = Integer.parseInt(array[2]);
				break;
			}
		}
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
