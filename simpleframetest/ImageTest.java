import java.awt.*;
import javax.swing.*;

public class ImageTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->
		{
			JFrame frame = new ImageFrame();
			frame.setTitle("ImageTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class ImageFrame extends JFrame
{
	public ImageFrame()
	{
		add(new ImageComponent());
		pack();
	}
}

class ImageComponent extends JComponent
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	private Image image;
	
	public ImageComponent()
	{
		image = new ImageIcon("test.JPG").getImage();
	}
	
	public void paintComponent(Graphics g)
	{
		if (image == null) return;
		
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);
		
		g.drawImage(image,0,0,null);
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}