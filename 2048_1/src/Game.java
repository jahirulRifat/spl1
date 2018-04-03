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
	public void pushDown() {
		
		for(int y=0;y<=3;y++) {
			for(int x=2;x>=0;x--) {
				//printArray();
				
				if(gameBoard[x][y] != 0) {
					int value=gameBoard[x][y];
					
					int X = x+1;
					while((X<=3) && (gameBoard[X][y]==0)) {
						X++;
					}
					//System.out.println(X+"  "+y);
					
					if(X == 4) {
						gameBoard[3][y]= value;
						gameBoard[x][y]= 0;
						//System.out.println("X= 4");
					}
					else if(gameBoard[X][y] != value) {
						
						if(x==X-1 ) {
							gameBoard[x][y]= value;
						}else {
							gameBoard[X-1][y]= value;
							gameBoard[x][y]= 0;
						}
						//System.out.println("X= X-1");
					}
					else if (gameBoard[X][y]== gameBoard[x][y]){
						gameBoard[X][y]*=2;
						gameBoard[x][y]=0;
						//System.out.println("X= X");
					}
				}
			}
		}
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
	
	public void pushRight() {
		
		System.out.println("Pushing Right");
		
		for(int x=3;x>=0;x--) {
			for(int y=2;y>=0;y--) {
				//printArray();
				
				if(gameBoard[x][y] != 0) {
					int value=gameBoard[x][y];
					
					int Y = y+1;
					while((Y<=3) && (gameBoard[x][Y]==0)) {
						Y++;
					}
					//System.out.println(X+"  "+y);
					
					if(Y == 4) {
						gameBoard[x][3]= value;
						gameBoard[x][y]= 0;
						//System.out.println("X= 4");
					}
					else if(gameBoard[x][Y] != value) {
						
						if(y==Y-1 ) {
							gameBoard[x][y]= value;
						}else {
							gameBoard[x][Y-1]= value;
							gameBoard[x][y]= 0;
						}
						//System.out.println("X= X-1");
					}
					else if (gameBoard[x][Y]== gameBoard[x][y]){
						gameBoard[x][Y]*=2;
						gameBoard[x][y]=0;
						//System.out.println("X= X");
					}
				}
			}
		}
	}
	public void pushLeft() {
		
		System.out.println("Pushing Left");
		
		for(int x=0;x<=3;x++) {
			for(int y=1;y<=3;y++) {
				//printArray();
				
				if(gameBoard[x][y] != 0) {
					int value=gameBoard[x][y];
					
					int Y = y-1;
					while((Y>=0) && (gameBoard[x][Y]==0)) {
						Y--;
					}
					//System.out.println(X+"  "+y);
					
					if(Y == -1) {
						gameBoard[x][0]= value;
						gameBoard[x][y]= 0;
						//System.out.println("X= 4");
					}
					else if(gameBoard[x][Y] != value) {
						
						if(y==Y+1 ) {
							gameBoard[x][y]= value;
						}else {
							gameBoard[x][Y+1]= value;
							gameBoard[x][y]= 0;
						}
						//System.out.println("X= X-1");
					}
					else if (gameBoard[x][Y]== gameBoard[x][y]){
						gameBoard[x][Y]*=2;
						gameBoard[x][y]=0;
						//System.out.println("X= X");
					}
				}
			}
		}
	}
	
}
