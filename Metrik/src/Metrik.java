/** 
 *Creates a window on which a circle is drawn when double-clicked.
 *     
 * @author Nico Hinterthaner, Hoang Long Heiligentag
 * @version 1.1.0
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
		
		//adds the canvas to the frame
		Mf.add(Mc);
		//adds the MouseListener to the canvas
		Mc.addMouseListener(Mm);
		//creates a menubar and adds it to the window
		Mf.setMenuBar(new MainMenuBar(Mc));
		
		
	}

}
