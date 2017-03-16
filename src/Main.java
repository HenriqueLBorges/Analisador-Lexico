
public class Main {
	public static void main (String Args []){
		AnalisadorLexico analisador = new AnalisadorLexico();
		char aspas ='"';
		String teste = "   algOritMO vVariavel 15155 1515.00 \\" +aspas +"henrique" +aspas + " /*teste comentário em bloco*//*Henriqueewqeqweqwwqeqweqweqweqweqweqwewqeqweqweqweqweqweqweqweqweqweqwrqwerqweqwewq432*//*teste teste teste*/";
		System.out.println("Antes =" +teste); 
		teste = analisador.linha(teste); //18
		System.out.println("\nDepois =" +teste);
	}
}
