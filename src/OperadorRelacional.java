
public class OperadorRelacional extends Atomo {

	@Override
	public boolean setAtomo(String atomo) {
		// TODO Auto-generated method stub
		String operadores[] = { "<", "<=", "=", "<>", ">", ">=" };
		for (int i = 0; i < operadores.length; i++) {
			if (atomo.equals(operadores[i])) {
				this.atomo = operadores[i];
				return true;
			}
		}
		return false;
	}

}
