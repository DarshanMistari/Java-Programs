import java.awt.*;
class AwtFrameCircle extends Component
{
	public static void main(String args[])
	{
		Frame F = new Frame();
		F.setSize(500,500);
	    F.setLocation(50,50);
		F.setTitle("My Frame Circle Draw.");
		F.add(new AwtFrameCircle());
		F.setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(200,200,300,3= 00);
		g.setColor(Color.YELLOW);
		g.fillRect(100,100,200,200);
		g.setColor(Color.BLACK);
		g.drawLine(150,150,50,50);
		g.setColor(Color.BLACK);
		g.drawLine(50,50,100,100);
	}

}