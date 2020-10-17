import java.awt.*;
import java.awt.event.*;

public class MainMenuItemListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Menu m =(Menu) e.getSource();
		MenuBar mb = (MenuBar) m.getParent();
		MainFrame mf = (MainFrame) mb.getParent();
		MainCanvas mc = (MainCanvas) mf.getComponent(0);
		String action = e.getActionCommand();
		
		{
		switch (action) {
		
		case "Color: red": 
			mc.setBackground(Color.RED);
			break;
		case "Color: green": 
			mc.setBackground(Color.GREEN);
			break;
		case "Color: blue": 
			mc.setBackground(Color.BLUE);
			break;
		}
		mc.repaint();
		}
	}
	
}
