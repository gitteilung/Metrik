import java.awt.*;

public class MainMenuBar extends MenuBar {

	private Menu _menu;
	
	public MainMenuBar() {
		_menu = new Menu("Background Color");
		_menu.add(new MenuItem("Color: red"));
		_menu.add(new MenuItem("Color: green"));
		_menu.add(new MenuItem("Color: blue"));
		
		this.add(_menu);
		_menu.addActionListener(new MainMenuItemListener());
		
	}
	
}
