/**
 * @author UO281827 - RodrÌguez LÛpez, Alejandro.
 *Crear una clase Pantalla que tenga como atributos la diagonal en pulgadas (diagonal), a y b (ratio a:b) (ancho:alto)
 *	Crear los mÈtodos set y get correspondientes.
 *	Crear un mÈtodo muestraPantalla que muestre las car·cterÌsticas de la pantalla.
 *	Crear un mÈtodo calcula¡rea que devuelva el ·rea en centÌmetros cuadrados.
 *		TÈngase en cuenta que una pulgada es equivalente a 2'54cm.
 *		La fÛrmula para el ·rea es: (D^2*(A/B))/((A/B)^2+1).
 *	Crear un  mÈtodo esMayorQue que reciba una pantalla como par·metro y devuelva true si la pantalla con la que se llama tiene mayor ·rea.
 *	Comentar el cÛdigo con comentarios JavaDoc.
 *
 *Crear una clase TestPantalla que pruebe todas los mÈtodos de Pantalla.
 */

public class Pantalla {

//----------INICIALIZACI”N VARIABLES-----------
	private double diagonal;		//VARIABLE PRIVADA REAL DIAGONAL (PULGADAS)
			//LA RELACI”N DE PANTALLA NO EST¡ FORMADA POR N⁄MEROS REALES (16:9 4:3 ...)
	private int a;				//VARIABLE PRIVADA ENTERA A
	private int b;				//VARIABLE PRIVADA ENTERA B
	
//----------M…TODOS SET-----------
	public void setDiagonal(double x) {		//DA VALOR A DIAGONAL
		diagonal = x;		//ALMACENA VALOR DE X EN DIAGONAL
	}
	public void setA(int x) {			//DA VALOR A A
		a = x;				//ALMACENA VALOR DE X EN A
	}
	public void setB(int x) {			//DA VALOR A B
		b = x;				//ALMACENA VALOR DE X EN B
	}
	
//------------M…TODOS GET----------
	public double getDiagonal () {			//DEVUELVE LA DIAGONAL
		return diagonal;		//(PULGADAS)
	}
	public int getA() {					//DEVUELVE A
		return a;
	}
	public int getB() {					//DEVUELVE B
		return b;
	}
	
//----------M…TODOS C¡LCULO---------
	public void muestraPantalla() {		//DEVUELVE CARACTERÕSTICAS DE PANTALLA
		System.out.printf("Diagonal de %.2f pulgadas, aspecto %d:%d.\n",getDiagonal(),getA(),getB());		//OUTPUT
									//S”LO 2 DECIMALES
	}
	public double calcula¡rea() {			//CALCULA ¡REA
							//GETA() GETB() --> INT ==> (DOUBLE)GETA() (DOUBLE) GETB() --> DOUBLE
		return (Math.pow((getDiagonal()*2.54), 2)*((double)getA()/(double)getB()))/(Math.pow(((double)getA()/(double)getB()), 2)+1);		//¡REA
							//CONVERSI”N
	}
	public boolean esMayorQue(Pantalla x) {				//TRUE SI ¡REA PANTALLA LLAMADA > ¡REA PANTALLA PAR¡METRO
		return (calcula¡rea()>x.calcula¡rea());			//OUTPUT
	}
}
