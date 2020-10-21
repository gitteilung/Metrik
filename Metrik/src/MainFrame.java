import java.awt.*;

//customized derived awt frame
public class MainFrame extends Frame {
	
	
	
	public MainFrame(int width, int height) {
		this.setSize(width, height);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Metrik Variante 1.2.2");
		MainWindowListener te= new MainWindowListener();
		this.addWindowListener(te);
		
		
		
		
	}
	
		
}

