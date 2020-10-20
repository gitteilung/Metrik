import java.awt.*;
import java.awt.event.*;

public class MainMouseListener extends Frame implements MouseListener {
	
	
	MainCanvas _Canvas;
	int _circle_counter = 0;

	MainMouseListener(MainCanvas Mc) {
		addMouseListener(this);
		_Canvas = Mc;
	}

	// reads on doubleclick the coordinates of the mouse and lets it draw at the
	// position
	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getClickCount() == 2) {
			_Canvas.onDoubleClick(e);
			
		}
		// _canvas.update(_canvas.getGraphics())
		// System.out.println("Click: " + e.getClickCount());
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}