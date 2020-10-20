import java.awt.*;

public class MainMenuBar extends MenuBar {

	private Menu _menu;
	
	
	//Creates a menu for the background colors and adds the listener
	public MainMenuBar(MainCanvas Mc) {
		_menu = new Menu("Hintergrund");
		_menu.add(new MenuItem("Rot"));
		_menu.add(new MenuItem("Grün"));
		_menu.add(new MenuItem("Blau"));
		
		this.add(_menu);
		_menu.addActionListener(new MainMenuItemListener(Mc));
		
	}
	
}
