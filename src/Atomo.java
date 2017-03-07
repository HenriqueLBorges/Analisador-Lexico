
public abstract class Atomo {
	protected String atomo = "";

	public String getAtomo() {
		return atomo;
	}

	public Boolean detectarCaracteresEspeciais(String Atomo) {
		for (int i = 0; i < atomo.length(); i++) {
			if (verificaCaractereEspecial(atomo.charAt(i))){
				return true;
			}
		}
		return false;
	}
	public Boolean verificaCaractereEspecial(char atomo) {
		if (atomo == '/' || atomo == '*' || atomo == '$' || atomo == '¨'
				|| atomo == '&' || atomo == '@' || atomo == '"'
				|| atomo == '#' || atomo == '%' || atomo == '('
				|| atomo == ')' || atomo == '-' || atomo == '='
				|| atomo == '+' || atomo == '/' || atomo == '°'
				|| atomo == '?' || atomo == '>' || atomo == '<'
				|| atomo == '`' || atomo == '´' || atomo == '.') {
				return true;
		}
		return false;
	}
	public abstract boolean setAtomo(String atomo);

}
