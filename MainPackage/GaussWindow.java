package MainPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GaussWindow extends JFrame {

	public GaussWindow(String title) {
		JFrame frame = new JFrame(title);
		JButton b1=new JButton("Responder");
		JButton e=new JButton("Exit");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	    b1.setBounds(100,210,100,30);
	    e.setBounds(300,210,100,30); 
	    
	    JLabel label1= new JLabel("b = ");
		label1.setBounds(10, 35, 90, 90);
		
		JLabel label2= new JLabel("a = ");
		label2.setBounds(10, 115, 90, 90);
		
		JLabel label3= new JLabel("dx     = ");
		label3.setBounds(255, 75, 90, 90);
	    
		double limites [] = new double [2];
		double coef[] = new double[4];
		double resultado;
		
		limites=GaussGen.limites();
		coef=GaussGen.coeficientes();
		resultado=GaussGen.Cuadratura(limites,coef);
		
	    JTextField f1= new JTextField(GaussGen.text(coef)); // Cuadros De Problemas
		f1.setBounds(60,110,190,20);
		f1.setEditable(false);
		
		JTextField I1= new JTextField(""+ limites[1]); // Intervalos
		I1.setBounds(40,70,45,20);
		I1.setEditable(false);
		
		JTextField I2= new JTextField(""+ limites[0]); 
		I2.setBounds(40,150,45,20);
		I2.setEditable(false);
	    
	    JTextField Af1= new JTextField(); // Cuadros de respuestas
		Af1.setBounds(295,110,105,20);
		
		b1.setBackground(Color.white);
		e.setBackground(Color.white);
		label1.setForeground(Color.white);
		label2.setForeground(Color.white);
		label3.setForeground(Color.white);
		
		frame.add(b1);
		frame.add(I1);
		frame.add(I2);
	    frame.add(e);
	    frame.add(f1);
	    frame.add(Af1);
	    frame.add(label1);
	    frame.add(label2);
	    frame.add(label3);
	    frame.setSize(450,300);  
		frame.setResizable(false);
	    frame.setLayout(null); 
	    frame.setVisible(true); 
	    frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	    
	    ActionListener a = new ActionListener(){
	    	@SuppressWarnings("deprecation")
			@Override
	 		public void actionPerformed(ActionEvent at) {
	 			if(at.getSource()==e){
	 				frame.hide();
	 			}
	 			if(at.getSource()==b1){
	 				double answerP1[] = new double [1];
	 				
	 				try{
	 					answerP1[0]=Integer.parseInt(Af1.getText());
	 					GaussGen.aciertos(answerP1, resultado);
	 					
	 				}
	 				catch (Exception ext){
	 					ErrorInputWindow z= new ErrorInputWindow();
	 				}
	 			}
	 		}	
	    };
	    e.addActionListener(a);
	    b1.addActionListener(a);
	} 
}
