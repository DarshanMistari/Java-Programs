import javax.swing.JOptionPane;
class WinInput
{
	public static void main(String agrs[])
	{
		String name,input,display;
		input = "Enter the Name :";
		name = JOptionPane.showInputDialog(input);
		System.out.println(name);
	}
}