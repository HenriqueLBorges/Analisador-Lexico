
public class Main {
	public static void main(String Args []){
		String linha = "\\";
		linha += '"';
		linha += "ouhui636ey8732gb ydsvc f  ^ ^ `";
		linha += '"';
		Idendificador palavra = new Idendificador();
		Frase frase = new Frase();
		Numero_Real numero = new Numero_Real();
		System.out.println(palavra.setAtomo(linha));
		System.out.println(palavra.getAtomo());
		System.out.println("---------------------------------");
		System.out.println(numero.setAtomo(linha));
		System.out.println(numero.getAtomo());
		System.out.println("---------------------------------");
		System.out.println(frase.setAtomo(linha));
		System.out.println(frase.getAtomo());
		linha = "/* ouhui636ey8732gb ydsvc f  ^ ^ `  */";
		Comentario comentario = new Comentario();
		System.out.println(comentario.setAtomo(linha));
		System.out.println(comentario.getAtomo());
	}
}
