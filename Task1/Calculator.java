package Calculators;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
//import java.awt.Color;
//import javax.swing.JPanel;



public class Calculator {

	private JFrame frame;
	//private JTextField textField;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JTextField txtScientificCalculator;

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
		frame.setBounds(100, 100, 308, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JTextField txtDisplay = new JTextField();
		txtDisplay.setBounds(2,43,282,57);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		


		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String EnterNumber = txtDisplay.getText() + btn7.getText();
					txtDisplay.setText(EnterNumber );
				
			}		
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(2, 253, 72, 72);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 253, 67, 72);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(136, 253, 78, 72);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(211, 253, 73, 72);
		frame.getContentPane().add(btnPlus);
		
		// --------------- Row 1 -----------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(2, 320, 72, 66);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 320, 67, 66);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(136, 320, 78, 66);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(211, 320, 73, 66);
		frame.getContentPane().add(btnSub);
		
		// --------------- Row 2 -------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(2, 385, 72, 66);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 386, 67, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(136, 385, 78, 66);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(211, 385, 73, 66);
		frame.getContentPane().add(btnMul);
		
		// --------------- Row 3 ---------------------
		
		JButton btn00 = new JButton(".");
		
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(2, 450, 72, 78);
		frame.getContentPane().add(btn00);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(70, 450, 67, 78);
		frame.getContentPane().add(btn0);
		
		JButton btnDot= new JButton("00");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(136, 450, 78, 78);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(211, 450, 73, 78);
		frame.getContentPane().add(btnEqual);
		
		//-------------- Row 4 ------------------------
		
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
				txtDisplay.setText(null);
        	}
        });
		
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(2, 185, 72, 72);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackspace.setBounds(70, 185, 67, 72);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnPercent= new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(136, 185, 78, 72);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(212, 185, 72, 76);
		frame.getContentPane().add(btnDivide);
		
		txtScientificCalculator = new JTextField();
		txtScientificCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		txtScientificCalculator.setText("Scientific Calculator");
		txtScientificCalculator.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtScientificCalculator.setBounds(23, 10, 247, 29);
		frame.getContentPane().add(txtScientificCalculator);
		txtScientificCalculator.setColumns(10);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(2, 146, 72, 44);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sinh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSinh.setBounds(2, 110, 72, 38);
		frame.getContentPane().add(btnSinh);
		
		JButton btncosh = new JButton("cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cosh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btncosh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btncosh.setBounds(64, 110, 72, 37);
		frame.getContentPane().add(btncosh);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cos(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCos.setBounds(70, 146, 67, 44);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.tan(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(136, 146, 78, 44);
		frame.getContentPane().add(btnTan);
		
		JButton btntanh = new JButton("tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.tanh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btntanh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntanh.setBounds(136, 110, 78, 40);
		frame.getContentPane().add(btntanh);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.log(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLog.setBounds(211, 112, 73, 36);
		frame.getContentPane().add(btnLog);
		
		JButton btnsquare = new JButton("x^2");
		btnsquare.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=(Double.parseDouble(txtDisplay.getText()));
				a=a*a;
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			
				
			}
		});
		btnsquare.setBounds(211, 146, 72, 44);
		frame.getContentPane().add(btnsquare);
		
	}
}
