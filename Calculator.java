/*calculator  in Graphical_User_Interface working on operations like addition ,multiplication,
division,subtraction but it is giving addition for all the operations*/ 
package gui_pro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
      JTextArea txtDisplay=new JTextArea();
      double fno;
      double sno;
      double result;
      String operations;
      String answer;
      

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		txtDisplay.setBounds(10, 11, 213, 44);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton bttn7 = new JButton("7");
		bttn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn7.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn7.setBounds(10, 66, 46, 44);
		frame.getContentPane().add(bttn7);
		
		JButton bttn8 = new JButton("8");
		bttn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn8.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn8.setBounds(66, 66, 46, 44);
		frame.getContentPane().add(bttn8);
		
		JButton bttn9 = new JButton("9");
		bttn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn9.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn9.setBounds(121, 66, 46, 44);
		frame.getContentPane().add(bttn9);
		
		JButton bttnpluse = new JButton("+");
		bttnpluse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fno=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("+");
				operations="+";
			}
		});
		
		bttnpluse.setFont(new Font("Tahoma", Font.BOLD, 10));
		bttnpluse.setBounds(177, 66, 46, 44);
		frame.getContentPane().add(bttnpluse);
		//........................................2ndrow.....................................................//
		
		JButton bttn4 = new JButton("4");
		bttn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn4.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn4.setBounds(10, 121, 46, 44);
		frame.getContentPane().add(bttn4);
		
		JButton bttn5 = new JButton("5");
		bttn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn5.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn5.setBounds(66, 121, 46, 44);
		frame.getContentPane().add(bttn5);
		
		JButton bttn6 = new JButton("6");
		bttn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn6.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn6.setBounds(121, 121, 46, 44);
		frame.getContentPane().add(bttn6);
		
		JButton bttnsub = new JButton("-");
		bttnsub.setFont(new Font("Tahoma", Font.BOLD, 15));
		bttnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fno=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("-");
				operations="-";
			}
		});
		bttnsub.setBounds(177, 121, 46, 44);
		frame.getContentPane().add(bttnsub);
		//.....................................3rdrow.............................................//
		
		JButton bttn1 = new JButton("1");
		bttn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn1.getText();
				txtDisplay.setText(Eneternumber);
			
			}
		});
		bttn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn1.setBounds(10, 176, 46, 44);
		frame.getContentPane().add(bttn1);
		
		JButton bttn2 = new JButton("2");
		bttn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn2.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn2.setBounds(66, 176, 46, 44);
		frame.getContentPane().add(bttn2);
		
		JButton bttn3 = new JButton("3");
		bttn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn3.getText();
				txtDisplay.setText(Eneternumber);
			}
		});
		bttn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn3.setBounds(121, 176, 46, 44);
		frame.getContentPane().add(bttn3);
		
		JButton bttnmul = new JButton("*");
		bttnmul.setFont(new Font("Tahoma", Font.BOLD, 14));
		bttnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fno=Double.parseDouble(txtDisplay.getName());
				txtDisplay.setText("*");
				operations="*";
				
			}
		});
		bttnmul.setBounds(175, 176, 46, 44);
		frame.getContentPane().add(bttnmul);
		//.............................................4throw......................................//
		
		JButton bttn0 = new JButton("0");
		bttn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Eneternumber=txtDisplay.getText()+bttn0.getText();
				txtDisplay.setText(Eneternumber);
				
			}
		});
		bttn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttn0.setBounds(10, 227, 46, 34);
		frame.getContentPane().add(bttn0);
		
		JButton bttndiv = new JButton("%");
		bttndiv.setFont(new Font("Tahoma", Font.BOLD, 10));
		bttndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fno=Double.parseDouble(txtDisplay.getName());
				txtDisplay.setText("%");
				operations="%";
				
			}
		});
		bttndiv.setBounds(66, 227, 46, 34);
		frame.getContentPane().add(bttndiv);
		
		JButton bttnclear = new JButton("C");
		bttnclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		bttnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		bttnclear.setBounds(121, 227, 46, 34);
		frame.getContentPane().add(bttnclear);
		
		JButton bttnequal = new JButton("=");
		bttnequal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bttnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				sno=Double.parseDouble(txtDisplay.getText());
				if(operations=="+")
				{
					result=fno+sno;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
					
					
				}
				else if(operations=="-")
				{
					result=fno-sno;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if(operations=="*")
				{
					result=fno*sno;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations=="%")
				{
					result=fno%sno;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
			}
		});
		bttnequal.setBounds(177, 227, 46, 34);
		frame.getContentPane().add(bttnequal);
		
		
			
		
	}
}
