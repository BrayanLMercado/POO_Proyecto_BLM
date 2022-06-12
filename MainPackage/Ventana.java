package MainPackage;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = -6768037413073049807L;
	public Ventana(int width,int height, String title, Main game){
		
		JFrame frame= new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
