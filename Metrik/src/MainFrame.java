	
import java.awt.*;

//customized derived awt frame
public class MainFrame extends Frame {
	Label dieKoordinateX;
	Label dieKoordinateY;
	
	
	
	public MainFrame(int width, int height) {
		this.setSize(width, height);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Metrik Version 1.0");
		MainWindowListener te= new MainWindowListener();
		this.addWindowListener(te);
		
		
		dieKoordinateX = new Label ("Koordinate X: ");
		dieKoordinateX.setBounds(500, 200, 150, 10);
		dieKoordinateY = new Label ("Koordinate Y: ");
		dieKoordinateY.setBounds(500, 300, 150, 10);
		add(dieKoordinateX);
		add(dieKoordinateY);
		
	}
	
		
}

