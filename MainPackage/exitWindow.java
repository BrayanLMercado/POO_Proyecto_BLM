package MainPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exitWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 359460016246043594L;
	
	public exitWindow(String title){
		JFrame frame = new JFrame(title);
		JButton b=new JButton("Cancelar"); 
		JButton c=new JButton("Salir"); 
		b.setBounds(90,30,100,30); 
		c.setBounds(90,80,100,30); 
		b.setBackground(Color.white);
	    c.setBackground(Color.white);
	    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    frame.add(b);
	    frame.add(c);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setSize(320,180);  
		frame.setResizable(false);
	    frame.setLayout(null); 
	    frame.setVisible(true);
	    c.addActionListener(this);
	   
	    ActionListener a = new ActionListener(){
	    	@SuppressWarnings("deprecation")
			@Override
	 		public void actionPerformed(ActionEvent e) {
	 			if(e.getSource()==c){
	 				System.exit(0);
	 			}
	 			if (e.getSource()==b){
	 				frame.hide();
	 				
	 			}
	 		}	
	    };
	    c.addActionListener(a);
	    b.addActionListener(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
