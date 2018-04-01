
public class Luncher {

	public static void main(String[] args) {

		Game game =new Game();
		
		
		for(int x=0;x<16;x++) {
			game.addNumber();
		}
		game.printArray();
		game.pushUp();
		game.printArray();
		
		
		
		

	}

}
