import java.util.Scanner;

class Classe_Scanner {

	public static void main (String [] args){

		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int resultado;

		System.out.println("DIGITE O N1: ");
		num1 = entrada.nextInt();

		System.out.println("DIGITE O N2: ");
		num2 = entrada.nextInt();

		System.out.println("DIGITE O N3: ");
		num3 = entrada.nextInt();

		resultado = num3 * (num1 + num2);

		System.out.println(num3 +" * "+"("+num1 +" + "+ num2 +")"+" = "+resultado);

	}
	
}