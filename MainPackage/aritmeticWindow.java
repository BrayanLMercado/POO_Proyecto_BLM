package MainPackage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class aritmeticWindow extends JFrame {
	public aritmeticWindow(String title){
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
		
		JLabel labelR1= new JLabel(" = ");
		labelR1.setBounds(270, 10, 90, 90);
		JLabel labelR2= new JLabel(" = ");
		labelR2.setBounds(270, 40, 90, 90);
		JLabel labelR3= new JLabel(" = ");
		labelR3.setBounds(270, 70, 90, 90);
		JLabel labelR4= new JLabel(" = ");
		labelR4.setBounds(270, 100, 90, 90);
		JLabel labelR5= new JLabel(" = ");
		labelR5.setBounds(270, 130, 90, 90);
		
		int [] array1 = new int[2];
		int [] array2 = new int [2];
		int [] array3 = new int [2];
		int [] array4 = new int [2];
		int [] array5 = new int [2];
		
		int resultado1 [] = new int[1];
		int resultado2 [] = new int[1];
		int resultado3 [] = new int[1];
		int resultado4 [] = new int[1];
		int resultado5 [] = new int[1];
		
		int resultados[][]= new int [5][];
		
		array1=aritmeticGen.NumberGen();
		array2=aritmeticGen.NumberGen();
		array3=aritmeticGen.NumberGen();
		array4=aritmeticGen.NumberGen();
		array5=aritmeticGen.NumberGen();
		
		resultado1[0]=aritmeticGen.answers(array1,0);
		resultado2[0]=aritmeticGen.answers(array2,0);
		resultado3[0]=aritmeticGen.answers(array3,1);
		resultado4[0]=aritmeticGen.answers(array4,1);
		resultado5[0]=aritmeticGen.answers(array5,2);
		
		resultados[0]=resultado1;
		resultados[1]=resultado2;
		resultados[2]=resultado3;
		resultados[3]=resultado4;
		resultados[4]=resultado5;
		
		JTextField f1= new JTextField(aritmeticGen.Text(array1,0)); // Cuadros De Problemas
		f1.setBounds(90,50,180,20);
		f1.setEditable(false);
		
		JTextField f2= new JTextField(aritmeticGen.Text(array2,0));
		f2.setBounds(90,80,180,20);
		f2.setEditable(false);

		JTextField f3= new JTextField(aritmeticGen.Text(array3,1));
		f3.setBounds(90,110,180,20);
		f3.setEditable(false);
		
		JTextField f4= new JTextField(aritmeticGen.Text(array4,1));
		f4.setBounds(90,140,180,20);
		f4.setEditable(false);

		JTextField f5= new JTextField(aritmeticGen.Text(array5,2));
		f5.setBounds(90,170,180,20);
		f5.setEditable(false);
		
		JTextField Af1= new JTextField(); // Cuadros de respuestas
		Af1.setBounds(285,50,105,20);
		JTextField Af2= new JTextField();
		Af2.setBounds(285,80,105,20);
		JTextField Af3= new JTextField();
		Af3.setBounds(285,110,105,20);
		JTextField Af4= new JTextField();
		Af4.setBounds(285,140,105,20);
		JTextField Af5= new JTextField();
		Af5.setBounds(285,170,105,20);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	    b1.setBounds(100,210,100,30);
	    e.setBounds(285,210,100,30); 
	    
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
	    
	    b1.setBackground(Color.white);
	    e.setBackground(Color.white);
	    ImageIcon ba = new ImageIcon("src/MainPackage/Sniki.png");
	    
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

	    frame.add(b1);
	    frame.add(e);
	    
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
	 				int a,b,c,d,e;
	 				
	 				int answerP1[] = new int [1];
	 				int answerP2[] = new int [1];
	 				int answerP3[] = new int [1];
	 				int answerP4[] = new int [1];
	 				int answerP5[] = new int [1];
	 				
	 				int answers[][] = new int [5][];
	 				
	 				try{
	 					a= Integer.parseInt(Af1.getText());
		 				b= Integer.parseInt(Af2.getText());
		 				c= Integer.parseInt(Af3.getText());
		 				d= Integer.parseInt(Af4.getText());
		 				e= Integer.parseInt(Af5.getText());
		 				
		 				answerP1 [0]=a;
		 				answerP2 [0]=b;
		 				answerP3 [0]=c;
		 				answerP4 [0]=d;
		 				answerP5 [0]=e;
		 				
		 				answers[0]=answerP1;
		 				answers[1]=answerP2;
		 				answers[2]=answerP3;
		 				answers[3]=answerP4;
		 				answers[4]=answerP5;

		 			aritmeticGen.aciertos(answers,resultados);
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
