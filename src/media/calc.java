package media;

public class calc {

	public static void main(String[] args) {
		int nota0 = 5;

		int nota1 = 5;

		int nota2 = 6;

		int nota3 = 8;

		int soma = (nota0 + nota1 + nota2 + nota3) / 4;
		System.out.println(soma);
		if (soma >= 6) {
			System.out.println("passou!");
		} else
			System.out.println("não passou");

	}

}
