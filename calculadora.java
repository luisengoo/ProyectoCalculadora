import java.util.Scanner;

import javax.swing.JOptionPane;
public class calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int operacion;
		
		System.out.println( "-->Menú calculadora<--" );
		System.out.println( "1. Suma" );
		System.out.println( "2. Resta" );
		System.out.println( "3. Multiplicación" );
		System.out.println( "4. División" );
		System.out.println( "5. Salir" );
		operacion = teclado.nextInt();
		
			switch (operacion) {
			case 1: //SUMA
				System.out.println( "Introduzca el primer operador de la suma" );
				double suma1 = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la suma" );
				double suma2 = teclado.nextDouble();
				double suma=suma1+suma2;
				System.out.println("El resultado de la suma es: " + suma);
				break;
			
			case 2: //RESTA
				System.out.println( "Introduzca el primer operador de la resta" );
				double resta1 = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la resta" );
				double resta2 = teclado.nextDouble();
				double resta=resta1-resta2;
				System.out.println("El resultado de la resta es: " + resta);
				break;
			case 3: //MULTIPLICACION
				System.out.println( "Introduzca el primer operador de la multiplicacion" );
				double multiplicacion1 = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la multiplicacion" );
				double multiplicacion2 = teclado.nextDouble();
				double multiplicacion=multiplicacion1*multiplicacion2;
				System.out.println("El resultado de la multiplicación es: " + multiplicacion);
				break;
			case 4: //DIVISION
				System.out.println( "Introduzca el primer operador de la division" );
				double division1 = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la division" );
				double division2 = teclado.nextDouble();
				double division=division1/division2;
				System.out.println("El resultado de la división es: " + division);
				break;
			default: System.out.println("Saludos hasta la proxima") ;
				break;
			}
 	}
 }