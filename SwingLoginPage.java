import javax.swing.*;
class SwingLoginPage
{

	public SwingLoginPage()
	{
		JFrame F = new JFrame();
		JPanel p = new JPanel();

		JLabel lblStudName = new JLabel();
		JTextField txtStudName = new JTextField();
		JLabel lblStudEmail = new JLabel();
		JTextField txtStudEmail = new JTextField();
		JLabel lblStudPhoneNo = new JLabel();
		JTextField txtStudPhoneNo = new JTextField();
		JButton btnSubmit = new JButton("Submit");
		JButton btnReset = new JButton("Reset");
		p.setLayout(null);

		lblStudName.setText("Enter the Student Name :");
		lblStudName.setBounds(50,50,150,30);
		p.add(lblStudName);

		txtStudName.setBounds(220,50,150,30);
		p.add(txtStudName);

		lblStudEmail.setText("Enter the Student Email id :");
		lblStudEmail.setBounds(50,80,150,30);
		p.add(lblStudEmail);

		txtStudEmail.setBounds(220,80,150,30);
		p.add(txtStudEmail);

		lblStudPhoneNo.setText("Enter the Student Phone No :");
		lblStudPhoneNo.setBounds(50,120,150,30);
		p.add(lblStudPhoneNo);

		txtStudPhoneNo.setBounds(220,120,150,30);
		p.add(txtStudPhoneNo);

		btnSubmit.setBounds(90,160,70,30);
		p.add(btnSubmit);

		btnReset.setBounds(170,160,70,30);
		p.add(btnReset);


		F.add(p);
		F.setSize(400,400);
		F.setLocation(50,50);
		F.setTitle("Swing Login Page.");
		F.setVisible(true);
	}
	public static void main(String args[])
	{
		SwingLoginPage s = new SwingLoginPage();
	}
}