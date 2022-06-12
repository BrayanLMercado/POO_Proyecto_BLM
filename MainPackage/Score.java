package MainPackage;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Score {

	public Score(int points){
		
		JFrame frame = new JFrame ("Puntaje");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
		JLabel label1= new JLabel ("Puntaje : ");
		label1.setForeground(Color.white);
		label1.setBounds(10,30, 90, 90);
		
		JTextField f1 = new JTextField();
		f1.setEditable(false);
		f1.setBounds(85,65,100,20);
		
		f1.setText(String.valueOf(points));
		
		frame.add(label1);
		frame.add(f1);
		frame.setSize(250,200);  
		frame.setResizable(false);
	    frame.setLayout(null); 
	    frame.setVisible(true); 
	    
	}
}
