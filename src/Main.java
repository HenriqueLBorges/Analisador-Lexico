
public class Main {
	/*public static void main(String Args []){
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
		Comentario comentario = new Comentario();
		System.out.println(comentario.setAtomo(linha));
		System.out.println(comentario.getAtomo());
	}*/
	public static void main (String Args []){
		AnalisadorLexico analisador = new AnalisadorLexico();
		char aspas ='"';
		String teste = "   algOritMO vVariavel 15155 1515.00 \\" +aspas +"henrique" +aspas; //+ "\\*" +aspas +"teste comentário em bloco*\\";
		System.out.println("Antes =" +teste); 
		teste = analisador.linha(teste); //18
		System.out.println("\nDepois =" +teste);
	}
}
