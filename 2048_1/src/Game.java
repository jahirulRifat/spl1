import java.util.ArrayList;
import java.util.Random;

public class Game {

	private  int[][] gameBoard;
	Random random=new Random();
	private int  number;
	
	public Game() {
		gameBoard=new int [4][4];
	}
	
	public void printArray() {
		for(int[] x: gameBoard) {
			System.out.format("%6d%6d%6d%6d\n",x[0],x[1],x[2],x[3]);
		}
		System.out.println("\n");
	}
	
	public void addNumber() {
		ArrayList<Integer> emptySpacesX=new ArrayList<Integer>();
		ArrayList<Integer> emptySpacesY=new ArrayList<Integer>();
		
		
		for(int x=0;x<4;x++) {
			for(int y=0;y<4;y++) {
				if(gameBoard[x][y] == 0) {
					emptySpacesX.add(new Integer(x));
					emptySpacesY.add(new Integer(y));
				}
			}
		}
		

		int	index = random.nextInt(emptySpacesX.size());
		int selectedX=emptySpacesX.get(index);
		int selectedY=emptySpacesY.get(index);
	
		int numberChooser=random.nextInt(10);
		if(numberChooser==0) {
			number=4;
		}
		else {
			number=2;
		}
		
		gameBoard[selectedX][selectedY]=number;
		
	}
	
	public void pushUp() {
		
		for(int y=0;y<4;y++) {
			for(int x=1;x<4;x++) {
				//printArray();
				
				if(gameBoard[x][y] != 0) {
					int value=gameBoard[x][y];
					
					int X = x-1;
					while((X>=0) && (gameBoard[X][y]==0)) {
						X--;
					}
					//System.out.println(X+" "+y);
					
					if(X == -1) {
						gameBoard[0][y]=value;
						gameBoard[x][y]=0;
						//System.out.println("X= -1");
					}
					else if(gameBoard[X][y]!= value) {
						gameBoard[X+1][y]=value;
						gameBoard[x][y]=0;
						//System.out.println("X= X+1");
					}
					else {
						gameBoard[X][y]*=2;
						gameBoard[x][y]=0;
						//System.out.println("X= X");
					}
				}
			}
		}
	}
	
	
}
