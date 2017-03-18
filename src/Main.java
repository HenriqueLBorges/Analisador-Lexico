import java.io.IOException;
import java.util.Scanner;

public class Main {
	static String caminho = "";

	public static void main(String Args[]) {
		//C:\Users\hlborges\Desktop\teste.txt
		menu();

	}
	public static void debug(){
		AnalisadorLexico analisador = new AnalisadorLexico();
		Scanner leitor = new Scanner(System.in);
		char aspas = '"';
		System.out.println("Insira uma linha");
		String teste = leitor.next();
		System.out.println("Antes = " +teste);
		System.out.println("\n--------------------------------\n");
		System.out.println(analisador.getNumeroLinha() +" - "+ analisador.linha(teste));
		System.out.println("\n--------------------------------\n");
	}
	public static void menu() {
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("ANALISADOR LEXICO");
		System.out.println("1 - Inserir caminho.");
		System.out.println("2 - Rodar Analisador.");
		System.out.println("3 - Debug");
		System.out.println("0 - Encerrar.");
		opcao = leitor.nextInt();
		switch (opcao) {
		case 0:
			System.exit(0);
		case 1:
			System.out.println("Insira um caminho:");
			caminho = leitor.next();
			System.out.println("Caminho do arquivo = " + caminho);
			System.out.println("\n--------------------------------\n");
			menu();
		case 2:
			System.out.println("Caminho do arquivo = " + caminho);
			System.out.println("\n--------------------------------\n");
			try {
				Arquivo arquivo = new Arquivo(caminho);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			menu();
		case 3:
			debug();
		default:
			menu();
		}
	}
}
