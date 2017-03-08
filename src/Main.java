
public class Main {
	public static void main(String Args []){
		String linha = "ALGorITMO";
		Idendificador palavra = new Idendificador();
		Numero_Real numero = new Numero_Real();
		System.out.println(palavra.setAtomo(linha));
		System.out.println(palavra.getAtomo());
		System.out.println("---------------------------------");
		System.out.println(numero.setAtomo(linha));
		System.out.println(numero.getAtomo());
	}
}
