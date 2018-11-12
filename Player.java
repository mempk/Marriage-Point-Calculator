
public class Player {
	
public String playerName;
public char playerStatus;
public int playerPoints;
public boolean Dublee=true;
public int tirnePoints;


public Player(){
	
}

public Player(String pname, char pstatus, int ppoints, boolean dub){
	playerName= pname;
	playerStatus= pstatus;
	playerPoints= ppoints;
	Dublee = dub;
	
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public char getPlayerStatus() {
	return playerStatus;
}
public void setPlayerStatus(char playerStatus) {
	this.playerStatus = playerStatus;
}
public int getPlayerPoints() {
	return playerPoints;
}
public void setPlayerPoints(int playerPoints) {
	this.playerPoints = playerPoints;
}
public boolean isDublee() {
	return Dublee;
}
public void setDublee(boolean dublee) {
	Dublee = dublee;
}


public void settirnePoints(int points){
	tirnePoints = points;
	
	
}
public int gettirnePoints(){
	return tirnePoints;
}

public void PrintName(){
	System.out.printf("%-12s",getPlayerName());
	
	}
public void PrintPoints(){
	
	System.out.printf("%-12d", gettirnePoints());
}

	
	

}
