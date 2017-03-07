
public class Numero_Real extends Atomo implements Numero {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		if (detectarCaracteresEspeciais(atomo))
			return false;
		if(verificaCaracteres(atomo))
			return false;
		if(!verificaNumero(atomo))
			return false;
		
		return false;
	}

	public Boolean verificaCaractereInvalido(char atomo) {
		if (atomo == '/' || atomo == '*' || atomo == '$' || atomo == '¨' || atomo == '&' || atomo == '@' || atomo == '"'
				|| atomo == '#' || atomo == '%' || atomo == '(' || atomo == ')' || atomo == '-' || atomo == '='
				|| atomo == '+' || atomo == '/' || atomo == '°' || atomo == '?' || atomo == '>' || atomo == '<'
				|| atomo == '`' || atomo == '´') {
			return true;
		}
		return false;
	}

	@Override
	public boolean verificaNumero(String atomo) {
		for (int i = 0; i < atomo.length(); i++) {
			if (verificaNumero(atomo.charAt(i)))
				return true;
		}
		return false;
	}
}
