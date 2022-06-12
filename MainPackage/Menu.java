package MainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import MainPackage.Main.STATE;

public class Menu extends MouseAdapter{
	public static final int WIDTH=540,HEIGHT=WIDTH/12*9;
	
	private Main main;
	
	public Menu(Main main){
		this.main=main;
	}
	
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		
		if(main.gameState==STATE.Menu){
			if (mouseOver(mx,my,260, 300, 200, 64)){// Exit
				//System.exit(1);
				new exitWindow("Confirmar Salida");
			}
			if (mouseOver(mx,my,260, 100, 200, 64)){// Modo Facil
				main.gameState = STATE.Easy;
			}
			
			if (mouseOver(mx,my,260, 200, 200, 64)){// Modo Dificil
				main.gameState = STATE.Hard;
			}
		}
		
		else if (main.gameState==STATE.Hard){
			
			if (mouseOver(mx,my,260, 270, 200, 64)){// Retroceso Modo Dificil
				main.gameState = STATE.Menu;
				return;
			}
			
			if (mouseOver(mx,my,260, 185, 200, 64)){// Vectores
				new VectorWindow("Vectores y Numeros Complejos");
			}
			
			if (mouseOver(mx,my,260, 100, 200, 64)){// Integración
				new GaussWindow("Integrales Definidas");
			}
		}
		
		else if (main.gameState==STATE.Easy){
			if (mouseOver(mx,my,300, 300, 200, 64)){// Retroceso Modo Facil
				main.gameState = STATE.Menu;
				return;
			}
			
			if (mouseOver(mx,my,260, 100, 200, 64)){// Ecuaciones Cuadraticas
				new quadraticWindow("Ecuaciones Cuadraticas");
			}
			
			if (mouseOver(mx,my,260, 200, 200, 64)){// Aritmetica
				new aritmeticWindow("Aritmetica");
			}
			
			
		}
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	private boolean mouseOver(int mx ,int my ,int x, int y, int width, int height){
		if (mx >x && mx<x+width){
			if (my>y && my<y+height){
				return true;
			}else return false;
		}else return false;
	}
	
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		Font fnt = new Font("arial",2,50);
		Font fnt2 = new Font("arial",2,30);
		Font fnt3 = new Font("arial",2,15);
		
		if (main.gameState==STATE.Menu){
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Menú", 290, 70);
			
			g.setFont(fnt2);
			g.setColor(Color.white);//Easy Mode 
			g.drawString("Modo Fácil",285,145);
			g.drawRect(260, 100, 200, 64);
			
			g.setFont(fnt2);
			g.setColor(Color.white);//Hard Mode
			g.drawString("Modo Díficil",285,245);
			g.drawRect(260, 200, 200, 64);
			
			g.setColor(Color.white);//Salir
			g.drawString("Salir",330,345);
			g.drawRect(260, 300, 200, 64);
		}
		
		else if(main.gameState==STATE.Easy){
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Modo Fácil", 237, 70);
			
			g.setFont(fnt3);
			g.setColor(Color.white);//Ecuaciones De Segundo Grado
			g.drawString("Ecuaciones Cuadraticas",285,140);
			g.drawRect(260, 100, 200, 64);
			
			g.setColor(Color.white);
			g.drawString("Aritmetica", 330, 240);  // Texto, Coordenada X, Coordenada Y
			g.drawRect(260, 200, 200, 64);
			
			g.setColor(Color.white);//Retroceder
			g.drawString("Atras",340,340);
			g.drawRect(260, 300, 200, 64);
		}
		
		else if(main.gameState==STATE.Hard){
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Modo Díficil", 225, 70);
			
			g.setFont(fnt3);
			g.setColor(Color.white);
			g.drawString("Numeros Complejos", 300, 215);  
			g.drawString("y Vectores", 330, 235);  
			g.drawRect(260, 185, 200, 64);
			
			g.setColor(Color.white);//Integración 
			g.drawString("Integrales Definidas",295,140);
			g.drawRect(260, 100, 200, 64);
			
			g.setColor(Color.white);//Retroceder
			g.drawString("Atras",340,310);
			g.drawRect(260, 270, 200, 64);
		}
		
	}
}
