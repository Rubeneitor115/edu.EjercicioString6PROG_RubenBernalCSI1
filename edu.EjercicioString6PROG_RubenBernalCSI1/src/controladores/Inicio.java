/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * rbr - 061024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 061024
	 * @param args
	 */
	public static void main(String[] args) {

		//Variable
		String frase = "Tengo 30 años de edad";
		
		//Extraigo las posiciones 6 y 7 y lo guardo en una variable String nueva
		String posiciones = frase.substring(6, 8);
		
		//Muestro la cadena resultante por consola
		System.out.println(posiciones);

	}

}
