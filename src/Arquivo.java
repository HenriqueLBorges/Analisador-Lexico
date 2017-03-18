import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
	public Arquivo(String caminho) throws IOException {
		AnalisadorLexico analisador = new AnalisadorLexico();
		// Leitura do arquivo externo
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		while (br.ready()) {
			String linha = br.readLine();
			System.out.println(analisador.getNumeroLinha() +" - "+ analisador.linha(linha));
		}
		System.out.println("\n--------------------------------\n");
		br.close();
	}
}
