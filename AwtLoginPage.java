import java.awt.*;
class AwtLoginPage
{
	Frame F;
	Panel p;


	public AwtLoginPage()
	{
		F = new Frame();
		p = new Panel();

		Label lblUsername = new Label();
		TextField txtUsername = new TextField();

		Label lblPassword = new Label();
		TextField txtPassword = new TextField();

		Button btnlogin = new Button("Login");
		Button btncancel = new Button("Cancel");

		p.setLayout(null);

		lblUsername.setText("Enter the Username :");
		lblUsername.setBounds(50,50,150,30);
		p.add(lblUsername);

		txtUsername.setBounds(50,90,150,30);
		p.add(txtUsername);

		lblPassword.setText("Enter the Password :");
		lblPassword.setBounds(50,130,150,30);
		p.add(lblPassword);

		txtPassword.setBounds(50,170,150,30);
		p.add(txtPassword);

		btnlogin.setBounds(50,210,70,30);
		p.add(btnlogin);

		btncancel.setBounds(130,210,70,30);
		p.add(btncancel);

		F.setSize(500,500);
		F.setLocation(50,50);
		F.add(p);
		F.setTitle("Awt Login Page.");
		F.setVisible(true);
	}
	public static void main(String args[])
	{
		new AwtLoginPage();
	}
}