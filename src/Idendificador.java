
public class Idendificador extends Atomo {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		PalavraReservada palavra = new PalavraReservada();
		if (detectarCaracteresEspeciais(atomo)){// Verifica se o Idendificador
												// começa com alguma letra do
												// alfabeto
			return false;
		}
		if (verificar(atomo)) {// Verifica se o Idendificador começa com alguma
								// letra do alfabeto
			if (palavra.setAtomo(atomo)) {
				this.atomoArmazenado = palavra.getAtomo();
				return true;
			}
			this.atomoArmazenado = atomo;
			return true;
		}
		return false;
	}

	// 65-90 97-122
	private boolean verificar(String atomo) {
		boolean verificador = false;
		for (int i = 0; i < atomo.length(); i++) {
			int ascii = atomo.charAt(0);
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
				verificador = true;
			if (verificaCaractereEspecial(atomo.charAt(i)))
				return false;
		}
		if (verificador)
			return true;
		return false;
	}

}
