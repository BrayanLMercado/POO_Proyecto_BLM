package MainPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class quadraticWindow extends JFrame{

	private static final long serialVersionUID = -6059720196692888831L;

	public quadraticWindow(String title){
		
		JFrame frame = new JFrame(title);
		JButton b1=new JButton("Responder");
		JButton e=new JButton("Exit");
		
		JLabel label1= new JLabel("Problema 1 : ");
		label1.setBounds(10, 10, 90, 90);
		JLabel label2= new JLabel("Problema 2 : ");
		label2.setBounds(10, 40, 90, 90);
		JLabel label3= new JLabel("Problema 3 : ");
		label3.setBounds(10, 70, 90, 90);
		JLabel label4= new JLabel("Problema 4 : ");
		label4.setBounds(10, 100, 90, 90);
		JLabel label5= new JLabel("Problema 5 : ");
		label5.setBounds(10, 130, 90, 90);
		
		JLabel labelR1= new JLabel("X1 : ");
		labelR1.setBounds(210, 10, 90, 90);
		JLabel labelR2= new JLabel("X1 : ");
		labelR2.setBounds(210, 40, 90, 90);
		JLabel labelR3= new JLabel("X1 : ");
		labelR3.setBounds(210, 70, 90, 90);
		JLabel labelR4= new JLabel("X1 : ");
		labelR4.setBounds(210, 100, 90, 90);
		JLabel labelR5= new JLabel("X1 : ");
		labelR5.setBounds(210, 130, 90, 90);
		
		JLabel labelW1= new JLabel("X2 : ");
		labelW1.setBounds(350, 10, 90, 90);
		JLabel labelW2= new JLabel("X2 : ");
		labelW2.setBounds(350, 40, 90, 90);
		JLabel labelW3= new JLabel("X2 : ");
		labelW3.setBounds(350, 70, 90, 90);
		JLabel labelW4= new JLabel("X2 : ");
		labelW4.setBounds(350, 100, 90, 90);
		JLabel labelW5= new JLabel("X2 : ");
		labelW5.setBounds(350, 130, 90, 90);
		
		int [] Ecu1= new int[3];
		int [] Ecu2 = new int [3];
		int [] Ecu3= new int[3];
		int [] Ecu4 = new int [3];
		int [] Ecu5 = new int [3];
		
		double raices1 [] = new double[2];
		double raices2 [] = new double[2];
		double raices3 [] = new double[2];
		double raices4 [] = new double[2];
		double raices5 [] = new double[2];
		
		double resultados[][]= new double [5][];
		
		Ecu1=quadraticGen.quadraticEc();
		Ecu2=quadraticGen.quadraticEc();
		Ecu3=quadraticGen.quadraticEc();
		Ecu4=quadraticGen.quadraticEc();
		Ecu5=quadraticGen.quadraticEc();
		
		raices1=quadraticGen.Roots(Ecu1);
		raices2=quadraticGen.Roots(Ecu2);
		raices3=quadraticGen.Roots(Ecu3);
		raices4=quadraticGen.Roots(Ecu4);
		raices5=quadraticGen.Roots(Ecu5);
		
		resultados[0]=raices1;
		resultados[1]=raices2;
		resultados[2]=raices3;
		resultados[3]=raices4;
		resultados[4]=raices5;
		
		JTextField f1= new JTextField(quadraticGen.text(Ecu1)); // Cuadros De Problemas
		f1.setBounds(90,50,105,20);
		f1.setEditable(false);
		
		JTextField f2= new JTextField(quadraticGen.text(Ecu2));
		f2.setBounds(90,80,105,20);
		f2.setEditable(false);

		JTextField f3= new JTextField(quadraticGen.text(Ecu3));
		f3.setBounds(90,110,105,20);
		f3.setEditable(false);
		
		JTextField f4= new JTextField(quadraticGen.text(Ecu4));
		f4.setBounds(90,140,105,20);
		f4.setEditable(false);

		JTextField f5= new JTextField(quadraticGen.text(Ecu5));
		f5.setBounds(90,170,105,20);
		f5.setEditable(false);
		
		JTextField Af1= new JTextField(); // Cuadros de respuestas
		Af1.setBounds(235,50,105,20);
		JTextField Af2= new JTextField();
		Af2.setBounds(235,80,105,20);
		JTextField Af3= new JTextField();
		Af3.setBounds(235,110,105,20);
		JTextField Af4= new JTextField();
		Af4.setBounds(235,140,105,20);
		JTextField Af5= new JTextField();
		Af5.setBounds(235,170,105,20);
		JTextField Af6= new JTextField(); 
		Af6.setBounds(375,50,105,20);
		JTextField Af7= new JTextField();
		Af7.setBounds(375,80,105,20);
		JTextField Af8= new JTextField();
		Af8.setBounds(375,110,105,20);
		JTextField Af9= new JTextField();
		Af9.setBounds(375,140,105,20);
		JTextField Af10= new JTextField();
		Af10.setBounds(375,170,105,20);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	    b1.setBounds(100,210,100,30);
	    e.setBounds(310,210,100,30); 
	    
	    label1.setForeground(Color.white);
	    label2.setForeground(Color.white);
	    label3.setForeground(Color.white);
	    label4.setForeground(Color.white);
	    label5.setForeground(Color.white);
	    labelR1.setForeground(Color.white);
	    labelR2.setForeground(Color.white);
	    labelR3.setForeground(Color.white);
	    labelR4.setForeground(Color.white);
	    labelR5.setForeground(Color.white);
	    labelW1.setForeground(Color.white);
	    labelW2.setForeground(Color.white);
	    labelW3.setForeground(Color.white);
	    labelW4.setForeground(Color.white);
	    labelW5.setForeground(Color.white);
	    
	    b1.setBackground(Color.white);
	    e.setBackground(Color.white);
	    
	    frame.add(f1);
	    frame.add(f2);
	    frame.add(f3);
	    frame.add(f4);
	    frame.add(f5);
	    frame.add(Af1);
	    frame.add(Af2);
	    frame.add(Af3);
	    frame.add(Af4);
	    frame.add(Af5);
	    frame.add(Af6);
	    frame.add(Af7);
	    frame.add(Af8);
	    frame.add(Af9);
	    frame.add(Af10);
 
	    frame.add(label1);
	    frame.add(label2);
	    frame.add(label3);
	    frame.add(label4);
	    frame.add(label5);
	    frame.add(labelR1);
	    frame.add(labelR2);
	    frame.add(labelR3);
	    frame.add(labelR4);
	    frame.add(labelR5);
	    frame.add(labelW1);
	    frame.add(labelW2);
	    frame.add(labelW3);
	    frame.add(labelW4);
	    frame.add(labelW5);
	    frame.add(b1);
	    frame.add(e);
	    
	    frame.setSize(550,300);  
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
	 				double a,b,c,d,e,f,g,h,i,j;
	 				
	 				double answerEc1[] = new double [2];
	 				double answerEc2[] = new double [2];
	 				double answerEc3[] = new double [2];
	 				double answerEc4[] = new double [2];
	 				double answerEc5[] = new double [2];
	 				
	 				double answers[][] = new double [5][];
	 				
	 				try{
	 					a= Double.parseDouble(Af1.getText());
		 				b= Double.parseDouble(Af6.getText());
		 				c= Double.parseDouble(Af2.getText());
		 				d= Double.parseDouble(Af7.getText());
		 				e= Double.parseDouble(Af3.getText());
		 				f= Double.parseDouble(Af8.getText());
		 				g= Double.parseDouble(Af4.getText());
		 				h= Double.parseDouble(Af9.getText());
		 				i= Double.parseDouble(Af5.getText());
		 				j= Double.parseDouble(Af10.getText());
		 				
		 				answerEc1 [0]=a; answerEc1 [1]=b;
		 				answerEc2 [0]=c; answerEc2 [1]=d;
		 				answerEc3 [0]=e; answerEc3 [1]=f;
		 				answerEc4 [0]=g; answerEc4 [1]=h;
		 				answerEc5 [0]=i; answerEc5 [1]=j;
		 				
		 				answers[0]=answerEc1;
		 				answers[1]=answerEc2;
		 				answers[2]=answerEc3;
		 				answers[3]=answerEc4;
		 				answers[4]=answerEc5;

		 			quadraticGen.aciertos(answers,resultados);
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
