/**
 * @author UO281827 - Rodríguez López, Alejandro.
 *Crear una clase Pantalla que tenga como atributos la diagonal en pulgadas (diagonal), a y b (ratio a:b) (ancho:alto)
 *	Crear los métodos set y get correspondientes.
 *	Crear un método muestraPantalla que muestre las carácterísticas de la pantalla.
 *	Crear un método calculaÁrea que devuelva el área en centímetros cuadrados.
 *		Téngase en cuenta que una pulgada es equivalente a 2'54cm.
 *		La fórmula para el área es: (D^2*(A/B))/((A/B)^2+1).
 *	Crear un  método esMayorQue que reciba una pantalla como parámetro y devuelva true si la pantalla con la que se llama tiene mayor área.
 *	Comentar el código con comentarios JavaDoc.
 *
 *Crear una clase TestPantalla que pruebe todas los métodos de Pantalla.
 */

import java.util.Scanner;		//IMPORTA SCANNE
public class TestPantalla {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		
//---------OBJETO 1-------------
		Pantalla P1 = new Pantalla ();					//CREA PANTALLA 1
		
		System.out.println("Se ha creado una pantalla.");		//AVISO PARA USUARIO
		
	//--------INPUTS OBJETO 1---------
		System.out.print("Introduzca diagonal en pulgadas: ");		//SOLICITA DATO
		P1.setDiagonal(teclado.nextDouble());		//ALMACENA DATO CON MÉTODO SETDIAGONAL()
		System.out.println("La pantalla es de ratio a:b.");		//GUÍA USUARIO
		System.out.print("Defina a: ");								//SOLICITA DATO
		P1.setA(teclado.nextInt());				//ALMACENA DATO CON MÉTODO SETA()
		System.out.print("Defina b: ");								//SOLICITA DATO
		P1.setB(teclado.nextInt());				//ALMACENA DATO CON MÉTODO SETB()
	
	//---------OUTPUTS OBJETO 1---------
		System.out.println("Las características de la pantalla definida son: ");		//AVISO USUARIO
		P1.muestraPantalla();			//MUESTRA CARACTERÍSTICAS CON MÉTODO MUESTRAPANTALLA()
		
		System.out.printf("El área de la pantalla definida es %.3f.\n",P1.calculaÁrea());		//CALCULA ÁREA
															//MÉTODO CALCULAÁREA() [SÓLO 3 DECIMALES]
		
		System.out.println("----------------------------------------------------------------------------");			//LÍNEA SEPARACIÓN USUARIO
		
//--------OBJETO 2-----------
	//--------INPUTS OBJETO 2--------
		Pantalla P2 = new Pantalla();		//CREA PANTALLA 2
		P2.setDiagonal(32);			//DEFINE DIAGONAL
		P2.setA(4);					//DEFINE A
		P2.setB(3);					//DEFINE B
		
	//-------OUTPUTS OBJETO 2---------
		System.out.println("Se ha creado otra pantalla de características: ");		//AVISO USUARIO
		P2.muestraPantalla();			//MUESTRA CARACTERÍSTICAS PANTALLA 2
		System.out.printf("El área de la pantalla es %.3f.\n",P2.calculaÁrea());		//CALCULA ÁREA
														//MÉTODO CALCULAÁREA() [SÓLO 3 DECIMALES]
		
//---------COMPARACIÓN: OBJETO 1 / OBJETO 2----------
				//MÉTODO ESMAYORQUE()			(OUTPUT=BOOLEAN)
		System.out.printf("El área de la primera pantalla es mayor que la de la segunda: %B.", P1.esMayorQue(P2));
																			//FORMATO BOOLEAN = %B
	}

}
