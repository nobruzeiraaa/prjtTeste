package prjtTeste;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		

		Calculadora1 calc = new Calculadora1();
		Scanner in = new Scanner(System.in);
		
		int n1, n2;
		int operacao;
		
		System.out.print("\nDigite 1 para + \nDigite 2 para - \nDigite 3 para � \nDigite 4 para x \n" );
		operacao = in.nextInt();
		
		
		switch (operacao) {
		case 1:
			calc.somar();
			System.out.println("Digite o Primeiro N�mero: "); 
			calc.numero1 = in.nextInt();
			
			System.out.println("Digite o Segundo N�mero" );
			calc.numero2 = in.nextInt();
			
			System.out.println(calc.resultado);
			break;
		case 2:
			calc.subtrair(2, 4);
			System.out.println(calc.resultado);
			break;
		case 3:
			
			System.out.println("Digite o Primeiro N�mero: "); 
			calc.numero1 = in.nextInt();
			
			System.out.println("Digite o Segundo N�mero" );
			calc.numero2 = in.nextInt();
			if(calc.numero1 == 0 || calc.numero2 == 0) {
				System.out.println("Imposs�vel calcular");
			}else {
			calc.dividir();
			System.out.println(calc.resultado);
			}
			break;
		case 4:
			calc.multiplicar(2, 4);
			System.out.println(calc.resultado);
			break;
			default:
				System.out.println("Operador inv�lido");
		}
	
	}

}


