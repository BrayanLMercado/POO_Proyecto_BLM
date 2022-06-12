package MainPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorInputWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = -1249194514106409352L;

	public ErrorInputWindow(){
		JFrame frame = new JFrame("Error");
		JButton b=new JButton("Regresar"); 
		b.setBounds(90,90,100,30);
		b.setBackground(Color.white);
	    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    frame.add(b);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setSize(320,180);  
		frame.setResizable(false);
	    frame.setLayout(null); 
	    frame.setVisible(true);
	    JLabel adver = new JLabel();
	    adver.setBounds(30,15,250,50);
	    adver.setText("Debe Llenar Los Recuadros, No sea Imbécil");
	    //adver.setText("Debe Llenar Los Recuadros con números");
	    adver.setForeground(Color.white);
	    adver.setVisible(true);
	    frame.add(adver);
	   
	    ActionListener a = new ActionListener(){
	    	@SuppressWarnings("deprecation")
			@Override
	 		public void actionPerformed(ActionEvent e) {
	 			if (e.getSource()==b){
	 				frame.hide();
	 				
	 			}
	 		}	
	    };
	    b.addActionListener(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
