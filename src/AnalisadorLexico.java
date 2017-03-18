
public class AnalisadorLexico {
	private int numeroLinha = 0;
	private int contador = 0;
	private String atomo = "";

	public String linha(String linha) {
		String saida = "";
		for (int i = 0; i < linha.length(); i++) {
			if (linha.charAt(i) != ' ') {
				atomo = "";
				contador = i;
				if (comentario(linha)) {
					try {
						saida += adicionaAtomo();
						//
					} catch (AtomoInvalidoException e) {
						// TODO Auto-generated catch block
						char aspas = '"';
						System.out.println(
								"Syntax ERROR - linha " + this.numeroLinha + ", atomo = " + aspas + atomo + aspas);
						e.printStackTrace();
					}
					// contador++;
					i = contador;
					atomo = "";
				} else if (i < linha.length()) {
					while (linha.charAt(i) != ' ') {
						atomo += linha.charAt(i);
						if (i + 1 == linha.length()) {
							break;
						}
						i++;
					}

					try {
						saida += adicionaAtomo();

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
		numeroLinha++;
		return saida;
	}

	/*private String adicionaAtomo() throws AtomoInvalidoException {
		String saida = "";
		boolean verifica = false;
		Idendificador idendificador = new Idendificador();
		Comentario comentario = new Comentario();
		Numero_Inteiro inteiro = new Numero_Inteiro();
		Numero_Real real = new Numero_Real();
		Frase frase = new Frase();
		OperadorLogico op_logico = new OperadorLogico();
		OperadorRelacional op_relacional = new OperadorRelacional();
		PalavraReservada palavraReservada = new PalavraReservada();
		AtomoSemAtributo atomoSemAtributo = new AtomoSemAtributo();

		if (palavraReservada.setAtomo(atomo)) {
			saida += palavraReservada.getAtomo();
			saida += " ";
			System.out.println("Palavra Reservada = " + atomo);
			verifica = true;
		}

		if (atomoSemAtributo.setAtomo(atomo)) {
			saida += atomoSemAtributo.getAtomo();
			saida += " ";
			System.out.println("Atomo Sem Atributo = " + atomoSemAtributo.getAtomo());
			verifica = true;
		}

		if (idendificador.setAtomo(atomo)) {
			saida += idendificador.getAtomo();
			saida += " ";
			System.out.println("Indendificador = " + atomo);
			verifica = true;
		}

		if (comentario.setAtomo(atomo)) {
			saida += comentario.getAtomo();
			saida += " ";
			System.out.println("comentario = " + atomo);
			verifica = true;
		}
		if (frase.setAtomo(atomo)) {
			saida += frase.getAtomo();
			saida += " ";
			System.out.println("frase = " + atomo);
			verifica = true;
		}

		if (inteiro.setAtomo(atomo)) {
			saida += inteiro.getAtomo();
			saida += " ";
			System.out.println("inteiro = " + atomo);
			verifica = true;
		} else if (real.setAtomo(atomo)) {
			saida += real.getAtomo();
			saida += " ";
			System.out.println("real = " + atomo);
			verifica = true;
		}
		if (op_logico.setAtomo(atomo)) {
			saida += op_logico.getAtomo();
			saida += " ";
			System.out.println("operador logico = " + atomo);
			verifica = true;
		}
		if (op_relacional.setAtomo(atomo)) {
			saida += op_relacional.getAtomo();
			saida += " ";
			System.out.println("operador relacional = " + atomo);
			verifica = true;
		}
		if (!verifica) {
			AtomoInvalidoException erro = new AtomoInvalidoException();
			throw erro;
		}

		return saida;
	}*/

	private String adicionaAtomo() throws AtomoInvalidoException {
		String saida = "";
		boolean verifica = false;
		Idendificador idendificador = new Idendificador();
		Comentario comentario = new Comentario();
		Numero_Inteiro inteiro = new Numero_Inteiro();
		Numero_Real real = new Numero_Real();
		Frase frase = new Frase();
		OperadorLogico op_logico = new OperadorLogico();
		OperadorRelacional op_relacional = new OperadorRelacional();
		PalavraReservada palavraReservada = new PalavraReservada();
		AtomoSemAtributo atomoSemAtributo = new AtomoSemAtributo();

		if (palavraReservada.setAtomo(atomo)) {
			saida += palavraReservada.getAtomo();
			saida += " ";
			verifica = true;
		}

		if (atomoSemAtributo.setAtomo(atomo)) {
			saida += atomoSemAtributo.getAtomo();
			saida += " ";
			verifica = true;
		}

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

	private boolean comentario(String linha) {
		if (linha.charAt(contador) == '/') {
			atomo += linha.charAt(contador);
			if (contador + 1 < linha.length()) {
				contador++;
			}
			if (linha.charAt(contador) == '*') {
				while (linha.charAt(contador) != '/') {
					atomo += linha.charAt(contador);
					if (linha.charAt(contador - 1) == '*' && linha.charAt(contador) == '/') {
						break;
					}
					if (contador + 1 == linha.length()) {
						break;
					}
					contador++;
				}
			}
			if (linha.charAt(contador) == '/') {
				atomo += linha.charAt(contador);
			}
			System.out.println("saida ficou =" + atomo);
			// atomo += linha.charAt(j);
			return true;
		}
		return false;
	}
	
	public int getNumeroLinha(){
		return numeroLinha;
	}

}
