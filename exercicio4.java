package curso_programacao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double horas, valor_horas, salario;
		int num;
		num = sc.nextInt();
		horas = sc.nextDouble();
		valor_horas = sc.nextDouble();
		salario = valor_horas * horas;
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f", salario);
	}

}
