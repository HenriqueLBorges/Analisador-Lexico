
public class AtomoSemAtributo extends Atomo {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		boolean verifica = false;
		if (verificaAtomoSemAtributo(atomo.charAt(0)) && atomo.length() < 2) {
			this.atomoArmazenado = "" + atomo.charAt(0);
			verifica = true;
		} else
			verifica = false;
		if (verifica)
			return true;
		return false;
	}

	private boolean verificaAtomoSemAtributo(char caractere) {
		// 40 = '(', 41 = ')', 45 = '-', 46 = '.', 47 = '/' e 59 = ';'
		if (caractere == 40 || caractere == 41 || caractere == 45 || caractere == 46 || caractere == 47
				|| caractere == 59) {
			return true;
		}
		return false;
	}
}
