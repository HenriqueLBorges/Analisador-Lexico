
public class AnalisadorLexico {
	int numeroLinha = 0;

	public String linha(String linha) {
		String atomo = "", saida = "";
		int j;
		for (int i = 0; i < linha.length(); i++) {
			if (linha.charAt(i) != ' ') {
				atomo = "";
				j = i;
				System.out.println("TESTE - indice = " + j);
				if (linha.charAt(j) == '/') {
					atomo += linha.charAt(j);
					boolean verifica = false;
					if (j + 1 < linha.length()) {
						j++;
					}
					while (linha.charAt(j) != '/') {
						atomo += linha.charAt(j);
						if (linha.charAt(j - 1) == '*' && linha.charAt(j) == '/') {
							verifica = true;
							break;
						} else {
							verifica = false;
						}
						if (j + 1 == linha.length()) {
							break;
						}
						j++;
					}
					if (linha.charAt(j) == '/') {
						atomo += linha.charAt(j);
					}
					verifica = true;
					// atomo += linha.charAt(j);
					System.out.println("TESTE - atomo = " + atomo);
					if (verifica) {
						try {
							saida += adicionaAtomo(atomo);
							System.out.println("TESTE - saida = " + saida);
						} catch (AtomoInvalidoException e) {
							// TODO Auto-generated catch block
							char aspas = '"';
							System.out.println(
									"Syntax ERROR - linha " + this.numeroLinha + ", atomo = " + aspas + atomo + aspas);
							e.printStackTrace();
						}
						j++;
					}
					i = j;
					atomo = "";
				}
				if (i < linha.length()) {
					while (linha.charAt(i) != ' ') {
						atomo += linha.charAt(i);
						if (i + 1 == linha.length()) {
							break;
						}
						i++;
					}

					try {
						saida += adicionaAtomo(atomo);
					} catch (AtomoInvalidoException e) {
						// TODO Auto-generated catch block
						char aspas = '"';
						System.out.println(
								"Syntax ERROR - linha " + this.numeroLinha + ", atomo = " + aspas + atomo + aspas);
						e.printStackTrace();
					}
				}
			}
			if (i == linha.length()) {
				break;
			}
		}
		return saida;
	}

	private String adicionaAtomo(String atomo) throws AtomoInvalidoException {
		String saida = "";
		boolean verifica = false;
		Idendificador idendificador = new Idendificador();
		Comentario comentario = new Comentario();
		Numero_Inteiro inteiro = new Numero_Inteiro();
		Numero_Real real = new Numero_Real();
		Frase frase = new Frase();
		OperadorLogico op_logico = new OperadorLogico();
		OperadorRelacional op_relacional = new OperadorRelacional();

		if (idendificador.setAtomo(atomo)) {
			saida += idendificador.getAtomo();
			saida += " ";
			verifica = true;
		}

		if (comentario.setAtomo(atomo)) {
			saida += comentario.getAtomo();
			saida += " ";
			verifica = true;
		}

		if (frase.setAtomo(atomo)) {
			saida += frase.getAtomo();
			saida += " ";
			verifica = true;
		}

		if (inteiro.setAtomo(atomo)) {
			saida += inteiro.getAtomo();
			saida += " ";
			verifica = true;
		} else if (real.setAtomo(atomo)) {
			saida += real.getAtomo();
			saida += " ";
			verifica = true;
		}
		if (op_logico.setAtomo(atomo)) {
			saida += op_logico.getAtomo();
			saida += " ";
			verifica = true;
		}
		if (op_relacional.setAtomo(atomo)) {
			saida += op_relacional.getAtomo();
			saida += " ";
			verifica = true;
		}
		if (!verifica) {
			AtomoInvalidoException erro = new AtomoInvalidoException();
			throw erro;
		}

		return saida;
	}

}
