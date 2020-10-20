import java.awt.*;
import java.awt.event.*;

public class MainMenuItemListener implements ActionListener{

	
	private MainCanvas _Mc;
	
	
	public MainMenuItemListener(MainCanvas Mc ) {
		_Mc = Mc;
	}
	
	//With a corresponding action the background color is changed
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Menu m =(Menu) e.getSource();
		//MenuBar mb = (MenuBar) m.getParent();
	//	MainFrame mf = (MainFrame) mb.getParent();
	//	MainCanvas mc = (MainCanvas) mf.getComponent(0);
		String action = e.getActionCommand();
		
		{
		switch (action) {
		
		case "Rot": 
			_Mc.setBackground(Color.RED);
			break;
		case "Grün": 
			_Mc.setBackground(Color.GREEN);
			break;
		case "Blau": 
			_Mc.setBackground(Color.BLUE);
			break;
		}
		//mc.repaint();
		}
	}
	
}
