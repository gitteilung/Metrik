/** 
 *Creates a window on which a circle is drawn when double-clicked.
 *     
 * @author Nico Hinterthaner, Hoang Long Heiligentag
 * @version 1.2.2
 * 
 */
import java.awt.*;
public class Metrik {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dimensions of the window
		final int width = 1200;
		final int height = width / 16 * 9;
		
		//creation of the necessary awt classes
		MainFrame Mf = new MainFrame(width, height);
		MainCanvas Mc = new MainCanvas(width, height);
		MainMouseListener Mm = new MainMouseListener(Mc);
		
		
		//creates Label   
		Label derKreis1 = new Label ("  Koordinaten Kreis1: ");	
		derKreis1.setBounds(20, 60, 250, 15);
		Label derKreis2 = new Label ("  Koordinaten Kreis2: ");
		derKreis2.setBounds(20, 80, 250, 15);
		Mf.add(derKreis1);
		Mf.add(derKreis2);
		Label radius = new Label ("  Kreisradius: ");	
		radius.setBounds(20, 40, 250, 15);
		Mf.add(radius);
		
		
		//adds the canvas to the frame
		Mf.add(Mc);
		//adds the MouseListener to the canvas
		Mc.addMouseListener(Mm);
		Mc.setLabel(derKreis1, 1);
		Mc.setLabel(derKreis2, 2);
		Mc.setLabel(radius,3);
		
		Mc.setRadius(25);
		//creates a menubar and adds it to the window
		Mf.setMenuBar(new MainMenuBar(Mc));
		
	
		
	//adsadaw	
	}

}
