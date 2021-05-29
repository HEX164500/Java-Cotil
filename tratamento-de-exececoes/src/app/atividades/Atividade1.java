package app.atividades;

@SuppressWarnings("all")
public class Atividade1 {

	public static void main(String... args) {

		Object o = null;
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("Acesso a referencia inválida, verifique e tente novamente");
		}
	}

}
