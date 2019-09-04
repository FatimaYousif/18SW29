import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JOptionPane;

class Gui
{
	public static void main(String a[])
	{
	JFrame f=new JFrame("REGISTRATION FORM");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JButton b1=new JButton("REGISTER");
	JButton b2=new JButton("RESET");
	//components:
	JLabel name=new JLabel("NAME");
	JLabel gender=new JLabel("GENDER");
	JLabel father=new JLabel("FATHER NAME");
	JLabel pass=new JLabel("PASSWORD");
	JLabel confirm=new JLabel("CONFIRM PASSWORD");
	JLabel city=new JLabel("CITY");
	JLabel email=new JLabel("EMAIL");
	//JLabel message=new JLabel(" ");


	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JPasswordField t3=new JPasswordField();
	JPasswordField t4=new JPasswordField();
	JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	
	t3.setEchoChar('*');
	t4.setEchoChar('*');
	
	
	String items[]={"select","male", "female"};
	JComboBox j1=new JComboBox(items);
	
	//p1 gridBagLayout
	
	GridBagConstraints gbc=new GridBagConstraints();
	p1.setLayout(new GridBagLayout());
	
	
	gbc.gridx=0;			//column=gridx
	gbc.gridy=0;		//row=gridy
	gbc.anchor=GridBagConstraints.LINE_START;
	gbc.insets=new Insets(30,0,0,0);      		//insets==>spacing between two components as here(b/w 2 labels). aka MARGIN     (top,bottom,left, right)<===are the parameters
	gbc.ipadx=100;
	p1.add(name,gbc);
	
	gbc.gridx=0;
	gbc.gridy=2;
	p1.add(gender,gbc);
	
	gbc.gridx=0;
	gbc.gridy=4;
	p1.add(father,gbc);
	
	gbc.gridx=0;
	gbc.gridy=6;
	p1.add(pass,gbc);
	
	gbc.gridx=0;
	gbc.gridy=8;
	p1.add(confirm,gbc);

	gbc.gridx=0;
	gbc.gridy=10;
	p1.add(city,gbc);
	
	gbc.gridx=0;
	gbc.gridy=12;
	p1.add(email,gbc);
	
	
	gbc.gridx=1;			//coloumn=gridx
	gbc.gridy=0;	//row=gridy
	gbc.anchor=GridBagConstraints.LINE_START;     //right or left alignment
	p1.add(t1,gbc);
	

	gbc.gridx=1;			//coloumn=gridx
	gbc.gridy=2;	//row=gridy
	gbc.ipadx=50;
	p1.add(j1,gbc);
	
	gbc.gridx=1;			//coloumn=gridx
	gbc.gridy=4;	//row=gridy
	gbc.ipadx=100;
	p1.add(t2,gbc);
	
	gbc.gridx=1;			//coloumn=gridx
	gbc.gridy=6;	//row=gridy
	p1.add(t3,gbc);
	
	gbc.gridx=1;			//coloumn=gridx
	gbc.gridy=8;	//row=gridy
	p1.add(t4,gbc);
	
	gbc.gridx=1;
	gbc.gridy=10;
	 p1.add(t5,gbc);
	 
	 gbc.gridx=1;
	 gbc.gridy=12;	 
	 p1.add(t6,gbc);
	 
	 //for p2
	 p2.setLayout(new GridLayout(1,2,7,7));
	 p2.add(b1);
	 p2.add(b2);
	
	 //for register button
	 b1.addActionListener(new ActionListener()
	 {
		public void actionPerformed(ActionEvent e)
		{
			if(t3.getText().equals(t4.getText())){
		JOptionPane.showMessageDialog(null, "name: "+t1.getText() +
		"\ngender: "+j1.getSelectedItem()+
		"\nFather name: "+t2.getText() +
		"\ncity: "+t5.getText() +
		"\nemail: "+t6.getText() ,
		"REGISTERED ACCOUNT",
		JOptionPane.PLAIN_MESSAGE);
			}
			else {
		JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD" , "REGISTRATION FAILED" , JOptionPane.PLAIN_MESSAGE);		
			}
		}			
	 }
	 );

	 //for reset button
	 b2.addActionListener(new ActionListener()
	 {
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			j1.setSelectedItem("select");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
		}			
	 }
	 );
	 
	 //end
	 
	f.add(p1,BorderLayout.WEST);
	f.add(p2,BorderLayout.SOUTH);
	p1.setBackground(Color.pink);
	p2.setBackground(Color.pink);
	f.setBackground(Color.pink);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(347,500);
	f.setResizable(false);
	f.setVisible(true);
	
	}
}