
public class Idendificador extends Atomo {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		PalavraReservada palavra = new PalavraReservada();
		if (detectarCaracteresEspeciais(atomo))// Verifica se o Idendificador
												// começa com alguma letra do
												// alfabeto
			return false;
		if (verificar(atomo)) {// Verifica se o Idendificador começa com alguma
								// letra do alfabeto

			if (palavra.setAtomo(atomo)) {
				this.atomo = palavra.getAtomo();
				return true;
			}
			this.atomo = atomo;
			return true;
		}
		return false;
	}

	private boolean verificar(String atomo) {
		boolean verificador = false;
		char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < atomo.length(); i++) {
			for (int j = 0; j < alfabeto.length; j++) {
				if (atomo.charAt(0) == alfabeto[j])
					verificador = true;
				if (verificaCaractereEspecial(atomo.charAt(i)))
					return false;

			}
		}
		if (verificador)
			return true;
		return false;
	}

}
