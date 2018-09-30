package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class ATM_sys {

	protected static final String NULL = null;
	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_sys window = new ATM_sys();
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
	public ATM_sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 28, 163, 190);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jBtnBalance = new JButton("");
		jBtnBalance.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b.PNG")));
		showBalance(jBtnBalance);
		jBtnBalance.setEnabled(false);
		jBtnBalance.setBounds(10, 11, 136, 79);
		panel.add(jBtnBalance);
		
		JButton jBtnDiposit = new JButton("");
		jBtnDiposit.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b.PNG")));
		diposit(jBtnDiposit);
		jBtnDiposit.setEnabled(false);
		jBtnDiposit.setBounds(10, 100, 136, 79);
		panel.add(jBtnDiposit);
		
		JPanel Panel_1 = new JPanel();
		Panel_1.setBackground(new Color(30, 144, 255));
		Panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Panel_1.setBounds(183, 28, 321, 190);
		frame.getContentPane().add(Panel_1);
		Panel_1.setLayout(null);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setEnabled(false);
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setBackground(new Color(255, 255, 255));
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setBounds(10, 34, 73, 27);
		Panel_1.add(lblBalance);
		
		JLabel lblPrint = new JLabel("Print");
		lblPrint.setEnabled(false);
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setForeground(Color.WHITE);
		lblPrint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPrint.setBounds(238, 34, 73, 27);
		Panel_1.add(lblPrint);
		
		JLabel lblDiposit = new JLabel("Diposit");
		lblDiposit.setEnabled(false);
		lblDiposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiposit.setForeground(Color.WHITE);
		lblDiposit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDiposit.setBounds(10, 129, 73, 27);
		Panel_1.add(lblDiposit);
		
		JLabel lblWithdraw = new JLabel("Withdraw");
		lblWithdraw.setEnabled(false);
		lblWithdraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithdraw.setForeground(Color.WHITE);
		lblWithdraw.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblWithdraw.setBounds(222, 129, 89, 27);
		Panel_1.add(lblWithdraw);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setForeground(new Color(255, 255, 255));
		jlblDisplay.setFont(new Font("Times New Roman", Font.BOLD, 18));
		jlblDisplay.setBackground(new Color(30, 144, 255));
		jlblDisplay.setBounds(60, 72, 197, 48);
		Panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		message = new JTextField();
		message.setFont(new Font("Tahoma", Font.BOLD, 14));
		message.setText("Enter Your PIN");
		message.setForeground(new Color(0, 0, 0));
		message.setBackground(new Color(30, 144, 255));
		message.setBounds(90, 41, 138, 20);
		Panel_1.add(message);
		message.setColumns(10);
//		jlblDisplay.setText("ENTER YOUR PIN");
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(514, 28, 161, 190);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jBtnPrint = new JButton("");
		jBtnPrint.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b0.PNG")));
		jBtnPrint.setEnabled(false);
		jBtnPrint.setBounds(10, 11, 136, 79);
		panel_2.add(jBtnPrint);
		
		JButton jBtnWithdraw = new JButton("");
		jBtnWithdraw.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b0.PNG")));
		jBtnWithdraw.setEnabled(false);
		jBtnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int income=100000;
				int w=Integer.parseInt(jlblDisplay.getText());
				if(w>100000) {
					jlblDisplay.setText("Not sufficient balance ");
				}
				else {
				int withdraw=income-w;
				jlblDisplay.setText("");
				String Balance=jlblDisplay.getText()+withdraw;
				jlblDisplay.setText(Balance);
				}
			}
		});
		jBtnWithdraw.setBounds(10, 100, 136, 79);
		panel_2.add(jBtnWithdraw);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 240, 665, 373);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jBtn1 = new JButton("");
		jBtn1.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/1.PNG")));
		jBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+1;
				jlblDisplay.setText(EnterNumber);
			}
		});
		jBtn1.setBounds(10, 11, 136, 79);
		panel_3.add(jBtn1);
		
		JButton jBtn2 = new JButton("");
		jBtn2.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/2.PNG")));
		jBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+2;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn2.setBounds(167, 11, 136, 79);
		panel_3.add(jBtn2);
		
		JButton jBtn3 = new JButton("");
		jBtn3.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/3.PNG")));
		jBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+3;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn3.setBounds(326, 11, 136, 79);
		panel_3.add(jBtn3);
		
		JButton jBtnCancel = new JButton("");
		jBtnCancel.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/cancel.PNG")));
		jBtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jBtnBalance.setEnabled(false);
				jBtnWithdraw.setEnabled(false);
				jBtnDiposit.setEnabled(false);
				jBtnPrint.setEnabled(false);
				
				jBtnBalance.setVisible(false);
				jBtnWithdraw.setVisible(false);
				jBtnDiposit.setVisible(false);
				jBtnPrint.setVisible(false);
				
				lblBalance.setEnabled(false);
				lblWithdraw.setEnabled(false);
				lblDiposit.setEnabled(false);
				lblPrint.setEnabled(false);

			
				
			}
		});
		jBtnCancel.setBounds(491, 11, 136, 79);
		panel_3.add(jBtnCancel);
		
		JButton jBtnClear = new JButton("");
		jBtnClear.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/clear.PNG")));
		clearButton(jBtnClear);
		jBtnClear.setBounds(491, 101, 136, 79);
		panel_3.add(jBtnClear);
		
		JButton jBtn6 = new JButton("");
		jBtn6.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/6.PNG")));
		jBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+6;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn6.setBounds(326, 101, 136, 79);
		panel_3.add(jBtn6);
		
		JButton jBtn5 = new JButton("");
		jBtn5.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/5.PNG")));
		jBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+5;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn5.setBounds(167, 101, 136, 79);
		panel_3.add(jBtn5);
		
		JButton jBtn4 = new JButton("");
		jBtn4.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/4.PNG")));
		jBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=jlblDisplay.getText()+4;
				jlblDisplay.setText(EnterNumber);
			}
		});
		jBtn4.setBounds(10, 101, 136, 79);
		panel_3.add(jBtn4);
		
		JButton jBtnEnter = new JButton("");
		jBtnEnter.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/Enter.PNG")));
		jBtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1=Integer.parseInt(jlblDisplay.getText());
				int pin2=Integer.parseInt(jlblDisplay.getText());
				int pin3=Integer.parseInt(jlblDisplay.getText());
				int pin4=Integer.parseInt(jlblDisplay.getText());
				int pin5=Integer.parseInt(jlblDisplay.getText());
				
				if(pin1==1234)
				{
					
					jBtnBalance.setEnabled(true);
					jBtnWithdraw.setEnabled(true);
					jBtnDiposit.setEnabled(true);
					jBtnPrint.setEnabled(true);
					
					jBtnBalance.setVisible(true);
					jBtnWithdraw.setVisible(true);
					jBtnDiposit.setVisible(true);
					jBtnPrint.setVisible(true);
					
					lblBalance.setEnabled(true);
					lblWithdraw.setEnabled(true);
					lblDiposit.setEnabled(true);
					lblPrint.setEnabled(true);
					
					jlblDisplay.setText("");
			
				}
				
				
				else if(pin2==1821)
				{
					
					jBtnBalance.setEnabled(true);
					jBtnWithdraw.setEnabled(true);
					jBtnDiposit.setEnabled(true);
					jBtnPrint.setEnabled(true);
					
					jBtnBalance.setVisible(true);
					jBtnWithdraw.setVisible(true);
					jBtnDiposit.setVisible(true);
					jBtnPrint.setVisible(true);
					
					lblBalance.setEnabled(true);
					lblWithdraw.setEnabled(true);
					lblDiposit.setEnabled(true);
					lblPrint.setEnabled(true);

					jlblDisplay.setText("");
				}
			
				
				
				else if(pin3==4081)
				{
					
					jBtnBalance.setEnabled(true);
					jBtnWithdraw.setEnabled(true);
					jBtnDiposit.setEnabled(true);
					jBtnPrint.setEnabled(true);
					
					jBtnBalance.setVisible(true);
					jBtnWithdraw.setVisible(true);
					jBtnDiposit.setVisible(true);
					jBtnPrint.setVisible(true);
					
					lblBalance.setEnabled(true);
					lblWithdraw.setEnabled(true);
					lblDiposit.setEnabled(true);
					lblPrint.setEnabled(true);

					jlblDisplay.setText("");
				}
				
				else if(pin4==1234)
				{
					
					jBtnBalance.setEnabled(true);
					jBtnWithdraw.setEnabled(true);
					jBtnDiposit.setEnabled(true);
					jBtnPrint.setEnabled(true);
					
					jBtnBalance.setVisible(true);
					jBtnWithdraw.setVisible(true);
					jBtnDiposit.setVisible(true);
					jBtnPrint.setVisible(true);
					
					lblBalance.setEnabled(true);
					lblWithdraw.setEnabled(true);
					lblDiposit.setEnabled(true);
					lblPrint.setEnabled(true);
					
					jlblDisplay.setText("");
				}
				else if(pin5==5691)
				{
					
					jBtnBalance.setEnabled(true);
					jBtnWithdraw.setEnabled(true);
					jBtnDiposit.setEnabled(true);
					jBtnPrint.setEnabled(true);
					
					jBtnBalance.setVisible(true);
					jBtnWithdraw.setVisible(true);
					jBtnDiposit.setVisible(true);
					jBtnPrint.setVisible(true);
					
					lblBalance.setEnabled(true);
					lblWithdraw.setEnabled(true);
					lblDiposit.setEnabled(true);
					lblPrint.setEnabled(true);

					jlblDisplay.setText("");
				}
				else
				{
					jlblDisplay.setText("Invalid Pin");
				}
				
				message.setVisible(false);;

				
			}
		});
		jBtnEnter.setBounds(491, 191, 136, 79);
		panel_3.add(jBtnEnter);
		
		JButton jBtn9 = new JButton("");
		jBtn9.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/9.PNG")));
		jBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+9;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn9.setBounds(326, 191, 136, 79);
		panel_3.add(jBtn9);
		
		JButton jBtn8 = new JButton("");
		jBtn8.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/8.PNG")));
		jBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+8;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn8.setBounds(167, 191, 136, 79);
		panel_3.add(jBtn8);
		
		JButton jBtn7 = new JButton("");
		jBtn7.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/7.PNG")));
		jBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+7;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn7.setBounds(10, 191, 136, 79);
		panel_3.add(jBtn7);
		
		JButton jBtnExit = new JButton("");
		jBtnExit.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/exit.PNG")));
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"You want to Exit",NULL, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		jBtnExit.setBounds(491, 281, 136, 79);
		panel_3.add(jBtnExit);
		
		JButton button_12 = new JButton("");
		button_12.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b2.PNG")));
		button_12.setBounds(326, 281, 136, 79);
		panel_3.add(button_12);
		
		JButton jBtn0 = new JButton("");
		jBtn0.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/0.PNG")));
		jBtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=jlblDisplay.getText()+0;
				jlblDisplay.setText(EnterNumber);
				
			}
		});
		jBtn0.setBounds(167, 281, 136, 79);
		panel_3.add(jBtn0);
		
		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon(ATM_sys.class.getResource("/ATM/b1.PNG")));
		button_14.setBounds(10, 281, 136, 79);
		panel_3.add(button_14);
	}
	public void showBalance(JButton jBtnBalance) {
		jBtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 int income=100000;
		String Balance=jlblDisplay.getText()+income;
		jlblDisplay.setText(Balance);
			}
		});
	}
	public void clearButton(JButton jBtnClear) {
		jBtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				jlblDisplay.setText("");
				
				
			}
		});
	}
	public void diposit(JButton jBtnDiposit)
	{
		jBtnDiposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int income=100000;
				int d=Integer.parseInt(jlblDisplay.getText());
				int diposit=income+d;
				jlblDisplay.setText("");
				String Balance=jlblDisplay.getText()+diposit;
				jlblDisplay.setText(Balance);
				
			}
		});
	}	
		public void displayMessage(String message) {
			
			jlblDisplay.setText(message);
			
		}
	
}
