
public class Numero_Real extends Atomo implements Numero {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		if (detectarCaracteresEspeciais(atomo))
			return false;
		if(verificaNumero(atomo))
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
		// TODO Auto-generated method stub
		boolean ponto = false;
		char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < atomo.length(); i++) {
			for (int j = 0; j < alfabeto.length; j++) {
				if(verificaCaractereInvalido(atomo.charAt(i)))
					return false;
				if(atomo.charAt(i) == '.')
					ponto = true;
				if(atomo.charAt(i) == '.' && ponto)
					return false;
			}
		}
		return true;
	}
}
