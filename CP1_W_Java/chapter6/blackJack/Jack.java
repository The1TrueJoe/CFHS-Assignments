package blackJack;

public class Jack {

	private int compTotal;
	private int userTotal;
	
	public Jack() {
		compTotal = 0;
		userTotal = 0;
	}
	
	public void setComp(int comp) {
		compTotal += comp;
	}
	
	public void setUser(int user) {
		userTotal += user;
	}
	
	public int getComp() {
		return compTotal;
	}
	
	public int getUser() {
		return userTotal;
	}
	
	public String isWinner() {
		if (userWins()) {
			return "User Wins";
		} if (compWins()) {
			return "Computer Wins";
		} else {
			return "Over 21";
		}
	}
	
	private boolean userWins() {
		if (userTotal > compTotal && userTotal <= 21) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean compWins() {
		if (compTotal > userTotal && compTotal <= 21) {
			return true;
		} else {
			return false;
		}
	}
}
