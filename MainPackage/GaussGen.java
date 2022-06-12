package MainPackage;

import java.util.Random;

public class GaussGen {
	public GaussGen(){
	
	}
	
	protected static double [] limites(){
		double limites[] = new double[2];
		Random random = new Random();
		double a=0, b=-1;
		while(b<a || b==a){
			a=(random.nextInt(1+7)+1)-(random.nextInt(1+7)+1);
			b=(random.nextInt(1+7)+1)-(random.nextInt(1+7)+1);
		}
		limites[0]=a;
		limites[1]=b;
		return limites;
	}
	
	protected static double [] coeficientes(){
		double coef[] = new double[4];
		Random random = new Random();
		
		for(int u=0;u<coef.length;u++){
			coef[u]=(random.nextInt(1+30)+1)-(random.nextInt(1+30)+1);
		}
		return coef;
	}
	
	protected static double Cuadratura(double[] inter, double[] coef){
		double result=0;
		double variable;
		double [] points = new double [] {-0.57735026, 0.57735026};
		double inter1=(inter[1]-inter[0])*0.5;
		double inter2=(inter[0]+inter[1])*0.5;
		for(int w=0;w<2;w++){
			variable =  (inter1* points[w])  + inter2;
			result+=funcion(coef,variable);
		}
		result*=(inter[1]-inter[0])*0.5;
		result=Math.round(result*100.0)/100.0;
		return result;
	}
	
	protected static double funcion(double[] coef, double point){
		return ((Math.pow(coef[0],3)*point) + (Math.pow(coef[1], 2)*point) + (Math.pow(coef[2], 1)*point) + coef[3]);
	}
	
	protected static String text(double Ecu[]){
		String Text = Ecu[0] + "x^3 " + Ecu[1] + "x^2 " + Ecu[2] + "x " +Ecu[3] ;
		if(Ecu[1]>=0){
			Text = Ecu[0] + "x^3 + " + Ecu[1] + "x^2 " + Ecu[2] + "x " +Ecu[3] ;
		}
		else if(Ecu[2]>=0){
			Text = Ecu[0] + "x^3 " + Ecu[1] + "x^2 + " + Ecu[2] + "x " +Ecu[3] ;
		}
		
		else if(Ecu[3]>=0){
			Text = Ecu[0] + "x^3 " + Ecu[1] + "x^2 " + Ecu[2] + " x + " +Ecu[3] ;
		}
		return Text;
	}
	
	protected static void aciertos (double answers[], double resultado){
		
		int points=0;
			if(answers[0]==resultado){
				points+=500;
			}
	    new Score(points);
	}
}
