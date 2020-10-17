import java.awt.*;


//customized derived awt frame
public class MainFrame extends Frame {

	
	public MainFrame(int width, int height) {
		this.setSize(width, height);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Metrik Version 1.0");
		MainWindowListener te= new MainWindowListener();
		this.addWindowListener(te);
		
	}
}
