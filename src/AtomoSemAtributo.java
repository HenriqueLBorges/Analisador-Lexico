
public class AtomoSemAtributo extends Atomo {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < atomo.length(); i++) {
			if (verificaAtomoSemAtributo(atomo.charAt(i))) {
				this.atomoArmazenado = atomo;
				return true;
			}
		}
		return false;
	}

	private boolean verificaAtomoSemAtributo(char caractere) {
		// 40 = '(', 41 = ')', 45 = '-', 46 = '.', 47 = '/' e 59 = ';'
		if (caractere == 40 || caractere == 41 || caractere == 45 || caractere == 46 || caractere == 47
				|| caractere == 59)
			return true;
		return false;
	}
}
