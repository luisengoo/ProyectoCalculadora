import java.util.Scanner;
/**
 * 
 * @author Luis
 * @version 3.0
 */
public class calculadora {
	/**
	 * 
	 * @param operacion Valor que se usa para escoger la operacion a realizar
	 * @param primeroperando Valor para asignar el valor del primer operando de la operación
	 * @param segundooperando Valor para asignar el valor del segundo operando de la operación
	 * @param suma Devuelve el valor de la suma
	 * @param resta Devuelve el valor de la resta
	 * @param multiplicacion Devuelve el valor de la multiplicación
	 * @param division Devuelve el valor de la división
	 * @param raiz Devuelve el valor de la Raiz Cuadrada
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int operacion;
		double primeroperando;
		double segundooperando;
		do {
		System.out.println( "-->Menú calculadora<--" );
		System.out.println( "1. Suma" );
		System.out.println( "2. Resta" );
		System.out.println( "3. Multiplicación" );
		System.out.println( "4. División" );
		System.out.println( "5. Raiz cuadrada" );
		System.out.println( "6. Salir" );
		operacion = teclado.nextInt();
		
			switch (operacion) {
			case 1: //SUMA
				System.out.println( "Introduzca el primer operador de la suma" );
				primeroperando = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la suma" );
				segundooperando = teclado.nextDouble();
				double suma=primeroperando+segundooperando;
				System.out.println("El resultado de la suma es: " + suma);
				break;
			
			case 2: //RESTA
				System.out.println( "Introduzca el primer operador de la resta" );
				primeroperando = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la resta" );
				segundooperando = teclado.nextDouble();
				double resta=primeroperando-segundooperando;
				System.out.println("El resultado de la resta es: " + resta);
				break;
			case 3: //MULTIPLICACION
				System.out.println( "Introduzca el primer operador de la multiplicacion" );
				primeroperando = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la multiplicacion" );
				segundooperando = teclado.nextDouble();
				double multiplicacion=primeroperando*segundooperando;
				System.out.println("El resultado de la multiplicación es: " + multiplicacion);
				break;
			case 4: //DIVISION
				System.out.println( "Introduzca el primer operador de la division" );
				primeroperando = teclado.nextDouble();
				System.out.println( "Introduzca el segundo operador de la division" );
				segundooperando = teclado.nextDouble();
				double division=primeroperando/segundooperando;
				System.out.println("El resultado de la división es: " + division);
				break;
			case 5: //RAIZ CUADRADA
				System.out.println( "Introduzca el operando de la raiz cuadrada" );
				primeroperando = teclado.nextDouble();
				double raiz=primeroperando*primeroperando;
				System.out.println("El resultado de la raiz cuadrada es: " + raiz);
				break;
			default: System.out.println("Saludos hasta la proxima") ;
				break;
			}
		}while (operacion!=6);
 	}
 }