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
		
	}		
 }