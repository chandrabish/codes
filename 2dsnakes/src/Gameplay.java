import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class Gameplay extends JPanel implements KeyListener , ActionListener{
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_TIME = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_TIME;
	static final int DEALY = 75;
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6; 
	int appleseaten ;
	int applex;
	int appley;
	char direction = 'R';
	boolean running = false;
	Gameplay(){
		random = new Random();
		this.setPreferredSize(new Dimension (SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	
	