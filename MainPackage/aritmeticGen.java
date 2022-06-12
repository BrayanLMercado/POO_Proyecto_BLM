package MainPackage;

import java.util.Random;

public class aritmeticGen {
	public aritmeticGen(String title){
		
	}
	
	protected static int[] NumberGen(){
		Random random = new Random();
		int a=1,b=0;
		int Numero [] = new int [3];

		for(int j=0;j<Numero.length;j++){
			Numero[j]=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1) ;
		}
		return Numero;
	}
	
	protected static String Text(int[] array, int id){
		String Text="";
		if(id==0){
			Text=array[0] + " + (" +" (" + array[0] + " x " + array[1]+ " ) " + " x " + array[0] + " )" ;
		}
		if (id==1){
			Text=array[0] + " + ( " + array[2] + " * " + array[1] + " ) x "+ "(" + array[2] + ")" ;
		}
		else if(id==2){
			Text=array[2] + " + ( " + array[0] + " * " + array[1] + " ) x "+ "(" + array[1] + ")" ;
		}
		return Text;
	}
	
	protected static int answers(int[] array, int id){
		int answer=0;
		if (id==0){
			answer=( (array[0]*array[1]) * array[0]) + array[0] ;
		}
		if (id==1){
			answer=array[0] + (array[2]*array[1])* array[2] ;
		}
		else if(id==2){
			answer=array[2] + ( array[0]* array[1])*array[1] ;
		}
		return answer;
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
