package MainPackage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VectorWindow extends JFrame{

	private static final long serialVersionUID = -3823889479953068613L;

	public VectorWindow (String title){
		JFrame frame = new JFrame(title);
		JButton b=new JButton("Responder");  
		JButton ex=new JButton("Exit"); 
		
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
		
		JLabel labelR1= new JLabel(" =( ");
		labelR1.setBounds(225, 10, 90, 90);
		JLabel labelR2= new JLabel(" =( ");
		labelR2.setBounds(225, 40, 90, 90);
		JLabel labelR4= new JLabel(") ");
		labelR4.setBounds(360, 10, 90, 90);
		JLabel labelR5= new JLabel(") ");
		labelR5.setBounds(360, 40, 90, 90);
		JLabel labelR6 = new JLabel(" = ");
		labelR6.setBounds(225,75,90,90);
		JLabel labelR7 = new JLabel(" =( ");
		labelR7.setBounds(225,105,90,90);
		JLabel labelR8 = new JLabel(" ) ");
		labelR8.setBounds(315,105,90,90);
		JLabel labelR9 = new JLabel(" =( ");
		labelR9.setBounds(225,135,90,90);
		JLabel labelR10 = new JLabel(" ) ");
		labelR10.setBounds(315,135,90,90);
		
		// Generador De Vectores
		int [] vector1= new int[3];
		int [] vector2 = new int [3];
		int [] vector3= new int[3];
		int [] vector4 = new int [3];
		int [] vector5 = new int [3];
		
		int [] NumCX1 = new int [2];
		int [] NumCX2 = new int [2];
		int [] NumCX3 = new int [2];
		int [] NumCX4 = new int [2];
		
		int cross[] = new int[3];
		int cross2[] = new int[3];
		int productNComplex[] = new int[2];
		int productNComplex2[] = new int[2];
		
		int dot[]= new int[1];
		
		vector1=vectorGen.VectorGen();
		vector2=vectorGen.VectorGen();
		vector3=vectorGen.VectorGen();
		vector4=vectorGen.VectorGen();
		vector5=vectorGen.VectorGen();
		NumCX1=vectorGen.ComplexGen();
		NumCX2=vectorGen.ComplexGen();
		NumCX3=vectorGen.ComplexGen();
		NumCX4=vectorGen.ComplexGen();
		
		// Resultados De Los Problemas
		int resultados[][] = new int [5][];
		
		dot = vectorGen.vectorDot(vector5,vector3);
		cross = vectorGen.vectorCross(vector1,vector2);
		cross2 = vectorGen.vectorCross(vector4,vector3);
		productNComplex= vectorGen.complexProduct(NumCX1,NumCX2);
		productNComplex2= vectorGen.complexProduct(NumCX4,NumCX3);
		
		resultados[0]=cross;
		resultados[1]=cross2;
		resultados[2]=dot;
		resultados[3]=productNComplex;
		resultados[4]=productNComplex2;
		
		// Cuadros De Problemas
		JTextField f1= new JTextField(vectorGen.TextCross(vector1,vector2)); 
		f1.setBounds(90,50,135,20);
		f1.setEditable(false);
											// 4 ,3 
		JTextField f2= new JTextField(vectorGen.TextCross(vector4,vector3));
		f2.setBounds(90,80,135,20);
		f2.setEditable(false);
		
		JTextField f3= new JTextField(vectorGen.TextDot(vector5, vector3));
		f3.setBounds(90,110,135,20);
		f3.setEditable(false);
		
		JTextField f4= new JTextField(vectorGen.TextComplex(NumCX1, NumCX2));
		f4.setBounds(90,140,135,20);
		f4.setEditable(false);
		
		JTextField f5= new JTextField(vectorGen.TextComplex(NumCX4, NumCX3));
		f5.setBounds(90,170,135,20);
		f5.setEditable(false);
		
		JTextField Af1= new JTextField(); // Cuadros de respuestas
		Af1.setBounds(240,50,35,20);
		JTextField Af2= new JTextField();
		Af2.setBounds(240,80,35,20);
		JTextField Af3= new JTextField();
		Af3.setBounds(240,110,35,20);
		JTextField Af4= new JTextField();
		Af4.setBounds(240,140,35,20);
		JTextField Af5= new JTextField();
		Af5.setBounds(240,170,35,20);
		JTextField Af6= new JTextField(); 
		Af6.setBounds(280,50,35,20);
		JTextField Af7= new JTextField();
		Af7.setBounds(280,80,35,20);
		JTextField Af9= new JTextField();
		Af9.setBounds(280,140,35,20);
		JTextField Af10= new JTextField();
		Af10.setBounds(280,170,35,20);
		JTextField Af11= new JTextField();
		Af11.setBounds(320,50,35,20);
		JTextField Af12= new JTextField();
		Af12.setBounds(320,80,35,20);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
	    b.setBounds(90,210,100,30); 
	    ex.setBounds(240,210,100,30); 
	    
	    label1.setForeground(Color.white);
	    label2.setForeground(Color.white);
	    label3.setForeground(Color.white);
	    label4.setForeground(Color.white);
	    label5.setForeground(Color.white);
	    labelR1.setForeground(Color.white);
	    labelR2.setForeground(Color.white);
	    labelR4.setForeground(Color.white);
	    labelR5.setForeground(Color.white);
	    labelR6.setForeground(Color.white);
	    labelR7.setForeground(Color.white);
	    labelR8.setForeground(Color.white);
	    labelR9.setForeground(Color.white);
	    labelR10.setForeground(Color.white);
	    
	    b.setBackground(Color.white);
	    ex.setBackground(Color.white);
	    
	    frame.add(f1);
	    frame.add(f2);
	    frame.add(f3);
	    frame.add(f4);
	    frame.add(f5);
	    frame.add(label1);
	    frame.add(label2);
	    frame.add(label3);
	    frame.add(label4);
	    frame.add(label5);
	    frame.add(Af1);
	    frame.add(Af2);
	    frame.add(Af3);
	    frame.add(Af4);
	    frame.add(Af5);
	    frame.add(Af6);
	    frame.add(Af7);
	    frame.add(Af9);
	    frame.add(Af10);
	    frame.add(Af11);
	    frame.add(Af12);
	    frame.add(labelR1);
	    frame.add(labelR2);
	    frame.add(labelR4);
	    frame.add(labelR5);
	    frame.add(labelR6);
	    frame.add(labelR7);
	    frame.add(labelR8);
	    frame.add(labelR9);
	    frame.add(labelR10);
	    frame.add(b);
	    frame.add(ex);
	    
	    frame.setSize(450,300);  
		frame.setResizable(false);
	    frame.setLayout(null); 
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	    
	    ActionListener a = new ActionListener(){
	    	@SuppressWarnings("deprecation")
	    	
			@Override
	 		public void actionPerformed(ActionEvent ae) {
	 			if(ae.getSource()==ex){
	 				frame.hide();
	 			}
	 			if(ae.getSource()==b){
	 				int a,b,c,d,e,f,g,h,i,j,k;
	 				
	 				int answerVec1[] = new int [3];
	 				int answerVec2[] = new int [3];
	 				
	 				int answerNC1[] = new int [2];
	 				int answerNC2[] = new int [2];
	 				int answerDot[] = new int [1];
	 				
	 				int answers[][] = new int [5][];
	 				
	 				try{
	 					a= Integer.parseInt(Af1.getText());
		 				b= Integer.parseInt(Af6.getText());
		 				c= Integer.parseInt(Af11.getText());
		 				
		 				d= Integer.parseInt(Af2.getText());
		 				e= Integer.parseInt(Af7.getText());
		 				f= Integer.parseInt(Af12.getText());
		 				
		 				g= Integer.parseInt(Af3.getText()); //Producto Punto
		 				
		 				h= Integer.parseInt(Af4.getText());
		 				i= Integer.parseInt(Af9.getText());
		 				
		 				j= Integer.parseInt(Af5.getText());
		 				k= Integer.parseInt(Af10.getText());
		 				
		 				answerVec1 [0]=a;
		 				answerVec1 [1]=b;
		 				answerVec1 [2]=c;
		 				answerVec2 [0]=d;
		 				answerVec2 [1]=e;
		 				answerVec2 [2]=f;
		 				answerDot[0] = g;
		 				answerNC1[0] = h;
		 				answerNC1[1] = i;
		 				answerNC2[0] = j;
		 				answerNC2[1] = k;
		 				
		 				answers[0]=answerVec1;
		 				answers[1]=answerVec2;
		 				answers[2]=answerDot;
		 				answers[3]=answerNC1;
		 				answers[4]=answerNC2;
		 				vectorGen.aciertos(answers,resultados);
	 				}
	 				catch (Exception ext){
	 					ErrorInputWindow z= new ErrorInputWindow();
	 				}
	 			}
	 		}	
	    };
	    ex.addActionListener(a);
	    b.addActionListener(a);
	}
	
}
