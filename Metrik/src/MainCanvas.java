import java.awt.*;
import java.awt.geom.*;


public class MainCanvas extends Canvas {

	//coordinates for the drawing
	float _xcoord;
	float _ycoord;
	
	
	
	
	public MainCanvas(int width, int height) {
		this.setSize(width, height);
		this.setBackground(Color.GREEN);
		this.setVisible(true);
		this.setFocusable(false);
		
	}
	
	
	
	//draws a circle
	@Override
	public void paint(Graphics g) {
		Ellipse2D ellipse2D;
		ellipse2D = new Ellipse2D.Float(
				_xcoord-12.5F, _ycoord-12.50F, //coords
				25.0F, 25.0F); //size
		Graphics2D gd2 = (Graphics2D)g;
	//	g.setColor(Color.BLACK);
		gd2.draw(ellipse2D);
				
		//System.out.println("keks");
		//System.out.println("Koordinate X: "+_xcoord);
		//System.out.println("Koordinate Y: "+_ycoord);
		
	}
	
	

	float getXCoord() {
		return _xcoord;
	}
	
	float getYCoord() {
		return _ycoord;
	}
	
	void setXCoord(float x) {
		_xcoord = x;
	}
	
	void  setYCoord(float y) {
		_ycoord = y;
	}
	
	
}
