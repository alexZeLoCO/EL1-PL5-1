/**
 * @author UO281827 - Rodr�guez L�pez, Alejandro.
 *Crear una clase Pantalla que tenga como atributos la diagonal en pulgadas (diagonal), a y b (ratio a:b) (ancho:alto)
 *	Crear los m�todos set y get correspondientes.
 *	Crear un m�todo muestraPantalla que muestre las car�cter�sticas de la pantalla.
 *	Crear un m�todo calcula�rea que devuelva el �rea en cent�metros cuadrados.
 *		T�ngase en cuenta que una pulgada es equivalente a 2'54cm.
 *		La f�rmula para el �rea es: (D^2*(A/B))/((A/B)^2+1).
 *	Crear un  m�todo esMayorQue que reciba una pantalla como par�metro y devuelva true si la pantalla con la que se llama tiene mayor �rea.
 *	Comentar el c�digo con comentarios JavaDoc.
 *
 *Crear una clase TestPantalla que pruebe todas los m�todos de Pantalla.
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
		P1.setDiagonal(teclado.nextDouble());		//ALMACENA DATO CON M�TODO SETDIAGONAL()
		System.out.println("La pantalla es de ratio a:b.");		//GU�A USUARIO
		System.out.print("Defina a: ");								//SOLICITA DATO
		P1.setA(teclado.nextInt());				//ALMACENA DATO CON M�TODO SETA()
		System.out.print("Defina b: ");								//SOLICITA DATO
		P1.setB(teclado.nextInt());				//ALMACENA DATO CON M�TODO SETB()
	
	//---------OUTPUTS OBJETO 1---------
		System.out.println("Las caracter�sticas de la pantalla definida son: ");		//AVISO USUARIO
		P1.muestraPantalla();			//MUESTRA CARACTER�STICAS CON M�TODO MUESTRAPANTALLA()
		
		System.out.printf("El �rea de la pantalla definida es %.3f.\n",P1.calcula�rea());		//CALCULA �REA
															//M�TODO CALCULA�REA() [S�LO 3 DECIMALES]
		
		System.out.println("----------------------------------------------------------------------------");			//L�NEA SEPARACI�N USUARIO
		
//--------OBJETO 2-----------
	//--------INPUTS OBJETO 2--------
		Pantalla P2 = new Pantalla();		//CREA PANTALLA 2
		P2.setDiagonal(32);			//DEFINE DIAGONAL
		P2.setA(4);					//DEFINE A
		P2.setB(3);					//DEFINE B
		
	//-------OUTPUTS OBJETO 2---------
		System.out.println("Se ha creado otra pantalla de caracter�sticas: ");		//AVISO USUARIO
		P2.muestraPantalla();			//MUESTRA CARACTER�STICAS PANTALLA 2
		System.out.printf("El �rea de la pantalla es %.3f.\n",P2.calcula�rea());		//CALCULA �REA
														//M�TODO CALCULA�REA() [S�LO 3 DECIMALES]
		
//---------COMPARACI�N: OBJETO 1 / OBJETO 2----------
				//M�TODO ESMAYORQUE()			(OUTPUT=BOOLEAN)
		System.out.printf("El �rea de la primera pantalla es mayor que la de la segunda: %B.", P1.esMayorQue(P2));
																			//FORMATO BOOLEAN = %B
	}

}
