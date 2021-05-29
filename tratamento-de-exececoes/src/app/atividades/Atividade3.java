package app.atividades;

public class Atividade3 {

	public static void main(String... args) {

		new CalculoMatematico().divisao(4, 0);
	}

	public static class CalculoMatematico {
		public double divisao(int arg0, int arg1) {
			try {
				return arg0 / arg1;
			} catch (ArithmeticException e) {
				System.out.println("A operação não pode ser realizada");
			}
			return 0;
		}
	}
}
