
import java.util.Scanner;

public class Exemplo2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalPessoas = 0;

		for (int i = 0; i < 5; i++) {

			int idade = sc.nextInt();
			double salario = sc.nextDouble();

			if (idade < 30 && salario > 3000.00) {
				totalPessoas++;
			}

		}
		System.out.println("Total de pessoas acima dos 30 anos com mais de R$ 3.000,00 de salário: " + totalPessoas);
		sc.close();
	}

}
