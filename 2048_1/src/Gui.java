package sourceCode;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Gui 
{	
	
	private int height = 500;
	

	private int width= 400;
	private int margin = 16;
	private int gameBoardSize=296;
	Color backgroundColor = new Color(255,225,120);

	JFrame frame;
	
	public Gui() {
		
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GameBoard gameboard = new GameBoard();
		
		
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout());
		northPanel.setPreferredSize(new Dimension(width, 100));
		
		
		JLabel gameName =new JLabel("2048",SwingConstants.CENTER);
		gameName.setFont(new Font("Serif", Font.BOLD, 20));
		northPanel.add(gameName);
		
		JLabel score = new JLabel("Score:\n 10",SwingConstants.CENTER);
		northPanel.add(score);
		
		JLabel highScore = new JLabel("HighScore :\n 10",SwingConstants.CENTER);
		northPanel.add(highScore);
		
		JLabel retry = new JLabel("Retry",SwingConstants.CENTER);
		northPanel.add(retry);
		
		northPanel.setBackground(backgroundColor);
		
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(margin,gameBoardSize));
		westPanel.setBackground(backgroundColor);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(margin,gameBoardSize));
		eastPanel.setBackground(backgroundColor);
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(width,margin));
		southPanel.setBackground(backgroundColor);
		
		frame.getContentPane().add(northPanel,BorderLayout.NORTH);
		frame.getContentPane().add(westPanel,BorderLayout.WEST);
		frame.getContentPane().add(eastPanel,BorderLayout.EAST);
		frame.getContentPane().add(southPanel,BorderLayout.SOUTH);		
		
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setVisible(true);
				
	}
	class GameBoard extends JPanel{

		@Override
		protected void paintComponent(Graphics g) 
		{
			g.setColor(new Color(255,255,255));
			g.fillRect(0, 0, width, height);
			
		}
	}

	
	
	

}
