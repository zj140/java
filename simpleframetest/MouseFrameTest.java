import java.awt.EventQueue;

import javax.swing.*;

public class MouseFrameTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->
		{
			JFrame frame = new MouseFrame();
			frame.setTitle("MouseFrameTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class MouseFrame extends JFrame
{
	public MouseFrame()
	{
		add(new MouseComponent());
		pack();
	}
}
