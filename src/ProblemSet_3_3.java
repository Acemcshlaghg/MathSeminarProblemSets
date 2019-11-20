import java.awt.Graphics;
import java.awt.Polygon;

public class ProblemSet_3_3 extends GraphicsPanel {
	private int sideCoeff = 3;
	private int baseLength = sideCoeff * 10;

	public void paintComponent(Graphics g) {
		int[] xPoints = { 10, 150, 290 };
		int[] yPoints = { 290, 10, 290 };
		Polygon firstTriangle = new Polygon(xPoints, yPoints, 3);
		for (Polygon p : triangler(firstTriangle)) {

		}
	}

	public Polygon[] triangler(Polygon p) {
		if (p.xpoints[0] - p.xpoints[2] <= 30) {
			int[] xPoints = {p.xpoints[0], p.xpoints[0] + 10, p.xpoints[0] + 20};
			int[] yPoints = {p.ypoints[0], p.ypoints[0] - 10, p.ypoints[0]};
			Polygon p1 = new Polygon(xPoints, yPoints, 3);
			Polygon[] finalArr = {p1};
			return finalArr;
		} else {
			
		}
	}
}
