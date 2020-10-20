import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class MainCanvas extends Canvas {

	//coordinates for the drawing
	float _xcoord1;
	float _ycoord1;
	float _xcoord2;
	float _ycoord2;
	

	int _circle_counter = 0;
	private int radius = 0;
	private int radius1 = 0;
	private int radius2 = 0;
	private Label Label1;
	private Label Label2;
	
	
	
	public MainCanvas(int width, int height) {
		this.setSize(width, height);
		this.setBackground(Color.GREEN);
		this.setVisible(true);
		this.setFocusable(false);
		
	}
	
	// draws a new circle, or redraws both, e.g. when changing the background
	@Override
	public void paint(Graphics g) { 
		if (_circle_counter > 0) {
			
			if (_circle_counter == 2) {
				_circle_counter = 1;
				paint(this.getGraphics());
				_circle_counter = 2;
			}

			
		Ellipse2D ellipse2D;
		ellipse2D = new Ellipse2D.Float(
				this.getXCoord(_circle_counter) - this.getRadius(1)/2,
				this.getYCoord(_circle_counter) - this.getRadius(1)/2, // coords
				25.0F, 25.0F); // size
		Graphics2D gd2 = (Graphics2D) g;
		// g.setColor(Color.BLACK);
		gd2.draw(ellipse2D);
		getLabel(_circle_counter).setText("  Koordinaten Kreis"+_circle_counter +": X:" +getXCoord(_circle_counter)+ "    Y: "+getYCoord(_circle_counter ));
	
		
				
		//System.out.println("keks");
		//System.out.println("Koordinate X: "+_xcoord);
		//System.out.println("Koordinate Y: "+_ycoord);
		}	
	}
	
	public void onDoubleClick(MouseEvent e) {

		if (_circle_counter < 2) {
			_circle_counter++;
			setXCoord(_circle_counter, e.getX());
			setYCoord(_circle_counter, e.getY());
			paint(this.getGraphics());
			// every 2 drawings the canvas is cleared
		} else {
			_circle_counter = 1;
			setXCoord(_circle_counter, e.getX());
			setYCoord(_circle_counter, e.getY());
			getLabel(2).setText("  Koordinaten Kreis2");
			radius1 = radius;
			radius2 = radius;
			repaint();
		}
		
	}

	
	
	

	@Override
	public void repaint() {
		System.out.println("repaint");
		super.repaint();
	}

	@Override
	public void update(Graphics g) {
		System.out.println("update");
		super.update(g);
	}

	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	void setRadius(Label label, int n) {
		switch (n) {
		case 1:
			Label1 = label ;
			break;
		case 2:
			Label2 = label;
			break;
		}

		
	}

	int getRadius(int n) {
		switch (n) {
		case 1:
			return radius1;
			
		case 2:
			return radius2;
		
		default:
			return radius;
		}
	}
	
	void setLabel(Label label, int n) {
		switch (n) {
		case 1:
			Label1 = label ;
			break;
		case 2:
			Label2 = label;
			break;
		}

		
	}
	Label getLabel(int n) {
		switch (n) {
		case 1:
			return Label1;
			
		case 2:
			return Label2;
		
		default:
			return Label1;
		}
		

		
	}

	float getXCoord(int n) {
		switch (n) {
		case 1:
			return _xcoord1;
		case 2:
			return _xcoord2;
		}
		return 0;
	}

	float getYCoord(int n) {
		switch (n) {
		case 1:
			return _ycoord1;
		case 2:
			return _ycoord2;
		}
		return 0;
	}

	void setXCoord(int n, float x) {
		switch (n) {
		case 1:
			_xcoord1 = x;
			break;
		case 2:
			_xcoord2 = x;
			break;
		}
	}

	void setYCoord(int n, float y) {
		switch (n) {
		case 1:
			_ycoord1 = y;
			break;
		case 2:
			_ycoord2 = y;
			break;
		}
	}
	
	
}
