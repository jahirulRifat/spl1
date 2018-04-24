
package sourceCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;


public class Luncher implements KeyListener{

	public static void main(String[] args) {
		

		Game game =new Game();
//		Gui gui = new Gui();
//		
//		
//		for(int x=0;x<16;x++) {
//			game.addNumber();
//		}
		
		game.printArray();
		while(game.checkHasMoves()) {
			
			
			System.out.println("Enter 'W' for pushUp");
			System.out.println("Enter 'S' for pushDown");
			System.out.println("Enter 'D' for pushRight");
			System.out.println("Enter 'A' for pushLeft");
			
			Scanner sc =new Scanner(System.in);
			char ch = (char) sc.next(".").charAt(0);
			
			while(true) {
				if((ch=='w' || ch =='W') || (ch=='D' || ch =='d') || (ch=='s' || ch =='S') || (ch=='a' || ch =='A')) break;
				
				System.out.println("Please enter valid input");
				ch = (char) sc.next(".").charAt(0);
			}
			
			if(ch=='W' || ch=='w') {
				game.pushUp();
			}
			else if (ch=='s' || ch=='S') {
				game.pushDown();
			}
			else if(ch == 'D' || ch == 'd') {
				game.pushRight();
			}
			else if (ch == 'a' || ch == 'A') {
				game.pushLeft();
			}
			game.addNumber();
			
			game.printArray();
			System.out.printf("\n\nCurrent Score: %d\n\n",game.getScore());
			
			if(game.checkHasMoves() && game.checkBoardFull()) {
				
				
				System.out.println("Enter 'W' for pushUp");
				System.out.println("Enter 'S' for pushDown");
				System.out.println("Enter 'D' for pushRight");
				System.out.println("Enter 'A' for pushLeft");
				
				ch = (char) sc.next(".").charAt(0);
				while(true) {
					if((ch=='w' || ch =='W') || (ch=='D' || ch =='d') || (ch=='s' || ch =='S') || (ch=='a' || ch =='A')) break;
					
					System.out.println("Please enter valid input");
					ch = (char) sc.next(".").charAt(0);
				}
				
				
				if(ch=='W' || ch=='w') {
					game.pushUp();
				}
				else if (ch=='s' || ch=='S') {
					game.pushDown();
				}
				else if(ch == 'D' || ch == 'd') {
					game.pushRight();
				}
				else if (ch == 'a' || ch == 'A') {
					game.pushLeft();
				}
				
				
				game.addNumber();
				
				game.printArray();
				System.out.printf("\nCurrent Score: %d\n\n",game.getScore());
				
				if(!game.checkHasMoves()) break;
				
			}
			
			
		}
		System.out.println("\n\n--------End Game--------\n");
		System.out.printf("\nFinal Score : %d",game.getScore());
		
//		game.pushDown();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushUp();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushRight();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushLeft();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushDown();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushUp();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushRight();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
//		
//		game.pushLeft();
//		game.printArray();
//		game.addNumber();
//		game.printArray();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//[e.getKeyCode()]
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
