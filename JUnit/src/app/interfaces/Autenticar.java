package app.interfaces;

public interface Autenticar {

	default boolean autentica(String arg0) {
		return arg0.equals("assinante");
	}
}
