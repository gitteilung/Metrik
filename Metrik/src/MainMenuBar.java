import java.awt.*;

public class MainMenuBar extends MenuBar {

	private Menu _BackroundMenu;
	private Menu _radiusMenu;
	
	
	//Creates a menu for the background colors and adds the listener
	public MainMenuBar(MainCanvas Mc) {
		_BackroundMenu = new Menu("Hintergrund");
		_BackroundMenu.add(new MenuItem("Rot"));
		_BackroundMenu.add(new MenuItem("Grün"));
		_BackroundMenu.add(new MenuItem("Blau"));
		
		this.add(_BackroundMenu);
		_BackroundMenu.addActionListener(new MainMenuItemListener(Mc));
		_radiusMenu = new Menu("Radius");
		this.add(_radiusMenu);
		_radiusMenu.addActionListener(new MainMenuItemListener(Mc));
	}
	
}
