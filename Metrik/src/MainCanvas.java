import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.lang.*;


public class MainCanvas extends Canvas {

	//coordinates for the drawing
	float _xcoord1;
	float _ycoord1;
	float _xcoord2;
	float _ycoord2;
	

	int _circle_counter = 0;
	private int radius = 25;
	private int radius1 = 25;
	private int radius2 = 25;
	private Label Label1;
	private Label Label2;
	private Label Label3;
	private Label Label4;
	
	
	
	public MainCanvas(int width, int height) {
		this.setSize(width, height);
		this.setBackground(Color.GREEN);
		this.setVisible(true);
		this.setFocusable(false);
		
		
	}
	
	// draws a new circle, or redraws both, e.g. when changing the background
	@Override
	public void paint(Graphics g) { 
		getLabel(4).setText("  Entfernung der beide Kreise: ");
		if (_circle_counter > 0) {
			
			if (_circle_counter == 2) {
				_circle_counter = 1;
				paint(this.getGraphics());
				_circle_counter = 2;
				//calculates the distance between the circles and show it 
				Label4.setText(String.format("  Entfernung der beide Kreise: " +"%.2f",Math.sqrt(Math.pow((double)(this.getXCoord(1) - this.getXCoord(2)),2) + Math.pow((double)(this.getYCoord(1) - this.getYCoord(2)) ,2))));
				//draws a line between the circles
				g.drawLine((int) getXCoord(1),(int) getYCoord(1),(int) getXCoord(2),(int) getYCoord(2));


			}
			
		Ellipse2D ellipse2D;
		ellipse2D = new Ellipse2D.Float(
				this.getXCoord(_circle_counter) - this.getRadius(_circle_counter)/2,
				this.getYCoord(_circle_counter) - this.getRadius(_circle_counter)/2, // coords
				this.getRadius(_circle_counter), this.getRadius(_circle_counter)); // size
		Graphics2D gd2 = (Graphics2D) g;
		// g.setColor(Color.BLACK);
		gd2.draw(ellipse2D);
		getLabel(_circle_counter).setText("  Koordinaten Kreis"+_circle_counter +": X:" +getXCoord(_circle_counter)+ "    Y: "+getYCoord(_circle_counter ));
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
		Label3.setText("  Kreisradius: "+ radius);
		if (_circle_counter == 0) {
			this.radius1 = radius;
			this.radius2 = radius;
		}
		if (_circle_counter == 1) {
			this.radius2 = radius;
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
		case 3:
			Label3 = label;
			break;
		case 4:
			Label4 = label;
			break;
		}

		
	}
	Label getLabel(int n) {
		switch (n) {
		case 1:
			return Label1;
			
		case 2:
			return Label2;
			
		case 3:
			return Label3;
			
		case 4:
			return Label4;
			
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
