package MainPackage;

import java.util.Random;

public class vectorGen {
	public vectorGen(){
		
	}
	
	protected static int [] vectorDot(int vector1 [], int vector2[]){
		int dot[]= new int[1];
		int Dot=0;
		for (int i=0; i<vector1.length; i++){
			Dot+= vector1[i]*vector2[i];
		}
		dot[0]=Dot;
		return dot;
	}
	
	protected static int [] vectorCross(int vector1[], int vector2[]){
		int crossNum[]= new int[3];
		
		crossNum[0] = (vector1[1]*vector2[2]) - (vector1[2]*vector2[1]);
		crossNum[1] = (vector1[2]*vector2[0]) - (vector1[0]*vector2[2]) ;
		crossNum[2] = (vector1[0]*vector2[1]) - (vector1[1]*vector2[0]) ;
		/*for(int i=0;i<crossNum.length;i++)
			System.out.print(crossNum[i] + ", ");
		System.out.println();*/
		return crossNum;
	}
	
	protected static int [] complexProduct(int Nc1[], int Nc2[]){
		int complexNum[]= new int[2];
		
		complexNum[0]= (Nc1[0]*Nc2[0]) - (Nc1[1]*Nc2[1]);
		complexNum[1]= (Nc1[0]*Nc2[1]) + (Nc1[1]*Nc2[0]);
		/*for(int i=0;i<complexNum.length;i++)
			System.out.print(complexNum[i] + ", ");
		System.out.println();*/
		return complexNum;
	}
	
	protected static int[] ComplexGen(){
		Random random = new Random();
		int NumCx [] = new int [2];
		for(int j=0;j<NumCx.length;j++){
			NumCx[j]=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1) ;
		}
		return NumCx;
	}
	
	protected static int[] VectorGen(){
		Random random = new Random();
		int Vector [] = new int [3];
		for(int j=0;j<Vector.length;j++){
			if(j==0){
				Vector[j]=(random.nextInt(1+30)+1); 
			}
			else{
				Vector[j]=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1); 
			}
		}
		return Vector;
	}
	
	protected static String TextCross(int[] vector,int[] vector2){
		String Text="("+ vector[0] + "," + vector[1] + "," + vector[2] + ")" + " x " +
				  "("+ vector2[0] + "," + vector2[1] + "," + vector2[2] + ")";
		return Text;
	}
	
	protected static String TextComplex(int[] NumCX1,int[] NumCX2){
		
		String Text="("+ NumCX1[0] + " " + NumCX1[1] + "i )" + " * " + "("+ NumCX2[0] + " " + NumCX2[1] + "i )";
		
		if(NumCX1[1]>=0){
			Text="("+ NumCX1[0] + " + " +  NumCX1[1] + "i )" + " * " + "("+ NumCX2[0] + " " + NumCX2[1] + "i )";
		}
		else if(NumCX2[1]>=0){
			Text="("+ NumCX1[0] + " " +  NumCX1[1] + "i )" + " * " + "("+ NumCX2[0] + " + " + NumCX2[1] + "i )";
		}
		else if(NumCX1[1]>=0 && NumCX2[1]>=0){
			Text="("+ NumCX1[0] + " + " +  NumCX1[1] + "i )" + " * " + "("+ NumCX2[0] + " + " + NumCX2[1] + "i )";
		}
		return Text;
	}
	
	protected static String TextDot(int[] vector,int[] vector2){
		String Text="("+ vector[0] + "," + vector[1] + "," + vector[2] + ")" + "*" +
				  "("+ vector2[0] + "," + vector2[1] + "," + vector2[2] + ")";
		return Text;
	}
	
	
	protected static void aciertos (int answers[][], int resultados[][]){
		int points=0;
		
	    for(int z=0;z<answers.length;z++){
				for(int y=0;y<answers[z].length;y++){
					if(answers[z][y]== resultados[z][y]){
						points+=100;
					}
				}
			}
	    new Score(points);
	}
}
