import javax.swing.*;
class SwingStudentRegistrationForm
{
	JFrame F;
	JPanel p;

	public SwingStudentRegistrationForm()
	{
		F = new JFrame();
		p = new JPanel();

		JLabel lblStudName = new JLabel();
		JTextField txtStudName = new JTextField();

		JLabel lblStudEmail = new JLabel();
		JTextField txtStudEmail = new JTextField();

		JLabel lblStudRegisterNo = new JLabel();
		JTextField txtStudRegisterNo = new JTextField();

		JLabel lblPhoneNo = new JLabel();
		JTextField txtPhoneNo = new JTextField();

		JLabel lblAddress = new JLabel();
		JTextField txtAddress = new JTextField();

		JButton btnSubmit = new JButton("Submit");
		JButton btnReset = new JButton("Reset");

		p.setLayout(null);

		lblStudName.setText("Enter the Student Name :");
		lblStudName.setBounds(50,50,170,30);
		p.add(lblStudName);

		txtStudName.setBounds(220,50,170,30);
		p.add(txtStudName);

		lblStudEmail.setText("Enter the Student Email Id :");
		lblStudEmail.setBounds(50,110,170,40);
		p.add(lblStudEmail);

		txtStudEmail.setBounds(220,110,170,30);
		p.add(txtStudEmail);

		lblStudRegisterNo.setText("Enter the Register No :");
		lblStudRegisterNo.setBounds(50,150,170,30);
		p.add(lblStudRegisterNo);

		txtStudRegisterNo.setBounds(220,150,170,30);
		p.add(txtStudRegisterNo);

		lblPhoneNo.setText("Enter the Phone No :");
		lblPhoneNo.setBounds(50,200,170,30);
		p.add(lblPhoneNo);

		txtPhoneNo.setBounds(220,200,170,30);
		p.add(txtPhoneNo);

		lblAddress.setText("Enter the Student Address :");
		lblAddress.setBounds(50,240,170,30);
		p.add(lblAddress);

		txtAddress.setBounds(220,240,170,30);
		p.add(txtAddress);

		btnSubmit.setBounds(120,280,90,30);
	    p.add(btnSubmit);

		btnReset.setBounds(220,280,90,30);
		p.add(btnReset);

		F.add(p);
		F.setSize(400,400);
		F.setLocation(30,30);
		F.setTitle("Student Registration Form");
		F.setVisible(true);
	}

	public static void main(String args[])
	{
		  new  SwingStudentRegistrationForm();
	}
}