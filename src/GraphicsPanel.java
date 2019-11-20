
// Project: CheckerboardNN
// Written by: Daniel Rosen
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageFilter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel implements KeyListener {
	private static Scanner s = new Scanner(System.in);
	private final int SQUARE_HEIGHT = 300; // The width of one space on the board. Constant used for drawing board.
	private final int SQUARE_LENGTH = 300;

	Font f = new Font("serif", Font.PLAIN, 20);

	public GraphicsPanel() {
		setPreferredSize(new Dimension(SQUARE_LENGTH, SQUARE_HEIGHT));
		this.setFocusable(true); // for keylistener
		this.addKeyListener(this);
		
	}

	public void paintComponent(Graphics g) {
		GraphicsPanel problem;
		GraphicsPanel[][] problems = new GraphicsPanel[10][10];
		problems[2][2] = new ProblemSet_3_3();
		/*System.out.println("Enter Problem Set #:");
		int psNum = s.nextInt();
		System.out.println("Enter Problem #:");
		int pNum = s.nextInt();*/
//		problem = problems[psNum - 1][pNum - 1];
		problem = problems[2][2];
		problem.paintComponent(g);
		
	}// end of paintComponent

	@Override
	public void keyPressed(KeyEvent key) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
