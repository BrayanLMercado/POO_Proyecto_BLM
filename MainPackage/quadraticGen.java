package MainPackage;

import java.util.Random;

public class quadraticGen {

	public quadraticGen(){
		
	}
	protected static int [] quadraticEc(){
		int terms[]= new int [3];
		int a=24,b=1,c=4;
		Random random = new Random();
		while(((b*b)<(4*a*c)) || a==0){
			a=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1);
			b=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1);
			c=(random.nextInt(1+30)+1) - (random.nextInt(1+30)+1);
		}
		terms[0]=a;
		terms[1]=b;
		terms[2]=c;
		return terms;
	}
	
	protected static double [] Roots (int [] ecu){
		double roots [] = new double [2];
		double disc,a,b;
		
		disc=Math.sqrt((ecu[1]*ecu[1])-(4*ecu[0]*ecu[2]));
		a=(-1*ecu[1] + disc)/(2*ecu[0]);
		b=(-1*ecu[1] - disc)/(2*ecu[0]);
		roots[0]=Math.round(a*100.0)/100.0;
		roots[1]=Math.round(b*100.0)/100.0;
		
		/*for(int i=0;i<roots.length;i++)
			System.out.print(roots[i] + ", ");*/
		
		return roots;
	}
	
	protected static void aciertos (double answers[][], double resultados[][]){
		
		int points=0;
	    for(int z=0;z<answers.length;z++){
				for(int y=0;y<answers[z].length;y++){
					if(answers[z][y]== resultados[z][y]){
						points+=50;
					}
				}
			}
	    new Score(points);
	}
	
	protected static String text(int Ecu[]){
		String Text = Ecu[0] + "x^2 " + Ecu[1] + "x " + Ecu[2]; ;
		if(Ecu[1]>=0){
			Text=Ecu[0] + "x^2 + " + Ecu[1] + "x  " + Ecu[2];
		}
		else if(Ecu[2]>=0){
			Text=Ecu[0] + "x^2 " + Ecu[1] + "x + " + Ecu[2];
		}
		return Text;
	}
}
