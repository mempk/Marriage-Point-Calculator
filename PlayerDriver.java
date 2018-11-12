import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerDriver extends Player {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numberofPlayer;

		ArrayList<Player> Khiladi = new ArrayList<Player>();

		Khiladi.add(new Player("Hari",  	'S', 15   , false));
		Khiladi.add(new Player("Madhav", 	'W', 25  , false));
		Khiladi.add(new Player("PRATAP", 	'S', 7  , false    ));
		Khiladi.add(new Player("Sanjib", 	'U', 2 , false    ));
		Khiladi.add(new Player("Deep", 		'S', 0  , false    )); 
		

		int MaalUtheko = 0; 
		int winningIndex = 0;
		int TotalMaal = 0; 

		for (int i = 0; i < Khiladi.size(); i++) {
			if (Khiladi.get(i).getPlayerStatus() == 'W' || Khiladi.get(i).getPlayerStatus() == 'S') {
				MaalUtheko += Khiladi.get(i).getPlayerPoints();

				if (Khiladi.get(i).getPlayerStatus() == 'W') {
					winningIndex = i;
				}
			}
		}
		System.out.println(MaalUtheko);
		System.out.println(winningIndex);

		for (int j = 0; j < Khiladi.size(); j++) {
			if (j != winningIndex) {

				if (Khiladi.get(winningIndex).Dublee == true) {

					if (Khiladi.get(j).getPlayerStatus() == 'S' && Khiladi.get(j).isDublee()) {
						Khiladi.get(j).settirnePoints((Khiladi.get(j).getPlayerPoints() * Khiladi.size()) - MaalUtheko);
						
					}
					if (Khiladi.get(j).getPlayerStatus() == 'S' && Khiladi.get(j).isDublee()==false) {
						Khiladi.get(j).settirnePoints((Khiladi.get(j).getPlayerPoints() * Khiladi.size()) - (MaalUtheko + 5));
						
					}
					if (Khiladi.get(j).getPlayerStatus() == 'U') {
						Khiladi.get(j).settirnePoints(-(MaalUtheko + 10));
						
					}

					TotalMaal += Khiladi.get(j).gettirnePoints();
					System.out.println(TotalMaal);

				}

				else {

					if (Khiladi.get(j).getPlayerStatus() == 'S' && Khiladi.get(j).isDublee()== true) {
						Khiladi.get(j).settirnePoints((Khiladi.get(j).getPlayerPoints() * Khiladi.size()) - MaalUtheko);
						
					}
					

					
					if (Khiladi.get(j).getPlayerStatus() == 'S' && Khiladi.get(j).isDublee()== false){
						Khiladi.get(j).settirnePoints((Khiladi.get(j).getPlayerPoints() * Khiladi.size()) - (MaalUtheko + 3));
						
					}
					
					
					if (Khiladi.get(j).getPlayerStatus() == 'U') {
						Khiladi.get(j).settirnePoints(-(MaalUtheko + 10));
						
					}
					
					
					TotalMaal += Khiladi.get(j).gettirnePoints();
					//System.out.println(TotalMaal);

				}

			}
		}
		Khiladi.get(winningIndex).settirnePoints( 0 - TotalMaal);
		
		for(int l=0; l<Khiladi.size(); l++){
			if(l== 0){
				for(int m=0;m<Khiladi.size(); m++ ){
					Khiladi.get(m).PrintName();
					
					
				
				}System.out.println();
			}
			Khiladi.get(l).PrintPoints();
		}
		System.out.println(MaalUtheko);
		


	}
}
