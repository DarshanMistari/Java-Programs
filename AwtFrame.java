import java.awt.*;
class AwtFrame extends Component
{
public static void main(String args[])
{
Frame F = new Frame();
F.setSize(400,400);
F.setLocation(50,50);
F.setTitle("My Frame");
F.add(new AwtFrame());
F.setVisible(true);
}
public void paint(Graphics g)
{
g.drawRect(50,50,100,100);
g.drawOval(50,50,100,100); 
g.drawLine(50,50,150,150);
g.drawLine(150,150,100,100);
}
}