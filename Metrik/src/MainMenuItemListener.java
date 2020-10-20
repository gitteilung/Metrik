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
		case "5": 
			_Mc.setRadius(5);
			break;
		case "10": 
			_Mc.setRadius(10);
			break;
		case "15": 
			_Mc.setRadius(15);
			break;
		case "20": 
			_Mc.setRadius(20);
			break;
		case "25": 
			_Mc.setRadius(25);
			break;
		case "30": 
			_Mc.setRadius(30);
			break;
		}
		//mc.repaint();
		}
	}
	
}
