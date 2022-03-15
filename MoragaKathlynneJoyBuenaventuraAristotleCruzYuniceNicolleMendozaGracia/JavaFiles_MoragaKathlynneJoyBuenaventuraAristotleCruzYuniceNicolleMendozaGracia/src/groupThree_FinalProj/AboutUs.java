package groupThree_FinalProj;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.UIManager;
public class AboutUs extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutUs.class.getResource("/res/Logo Top.png")));
		
		//Exit system with options
				addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						Admin admin = new Admin();
						
						ImageIcon logo = new ImageIcon(getClass().getResource("/res/3MBC Payroll System LOGO.png"));
						Image img3MBC = logo.getImage();
						Image modifiedLogo = img3MBC.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
						logo = new ImageIcon(modifiedLogo);
						
						int confirmed = JOptionPane.showConfirmDialog(admin,  "Are you sure you want to exit?",
								"3MBC Payroll System", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, logo);

						if (confirmed == JOptionPane.YES_OPTION) {
							setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						} else if (confirmed == JOptionPane.NO_OPTION) {
							setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
						}
					}
				});
				
		setBounds(450, 190, 1014, 597);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("About Us");
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JTextArea txtPayroll = new JTextArea();
		txtPayroll.setBounds(225, 99, 571, 176);
		txtPayroll.setWrapStyleWord(true);
		txtPayroll.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPayroll.setLineWrap(true);
		txtPayroll.setForeground(new Color(255, 255, 255));
		txtPayroll.setBackground(new Color(255, 153, 0));
		txtPayroll.setEditable(false);
		txtPayroll.setText("\tThe 3MBC Payroll System is designed to digitize the  current manual systems used by companies nowadays. It was developed to help the manager/administrator to  arrange the employees' salaries in a more efficient, secure, and timely manner. It encrypts sensitive data and information and enables storage over an extended length of time while allowing for easy access and modification. This system can keep and view digital records without obtaining redundant entries. The project comprises how to manage employees' data effectively and provide enhanced services to employees.");
		contentPane.add(txtPayroll);

		JLabel lblBehind = new JLabel("Behind the Name");
		lblBehind.setBounds(370, 286, 289, 53);
		lblBehind.setForeground(new Color(255, 255, 51));
		lblBehind.setBackground(new Color(255, 255, 255));
		lblBehind.setFont(new Font("Consolas", Font.PLAIN, 35));
		contentPane.add(lblBehind);

		JLabel lblAbout = new JLabel("About Us");
		lblAbout.setBounds(427, 55, 188, 41);
		contentPane.add(lblAbout);
		lblAbout.setForeground(new Color(255, 255, 51));
		lblAbout.setFont(new Font("Consolas", Font.PLAIN, 35));

		JTextPane txtpnForMoreDe = new JTextPane();
		txtpnForMoreDe.setBounds(225, 326, 571, 71);
		txtpnForMoreDe.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnForMoreDe.setForeground(new Color(255, 255, 255));
		txtpnForMoreDe.setBackground(new Color(255, 153, 0));
		txtpnForMoreDe.setText("\tThe developers wish to come up with a very intriguing name. Something eye-catching and short. They decided to use their surnames for this project namely 'Mendoza, Moraga and Muñez' for the 3M  then B and C for 'Buenaventura and Cruz'." );
		contentPane.add(txtpnForMoreDe);

		JLabel lblContact1 = new JLabel("Problem with the program?");
		lblContact1.setBounds(225, 461, 192, 14);
		lblContact1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContact1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblContact1);

		JLabel lblContact2 = new JLabel("Reach us at 0932498990 or email us at 3MBC@gmail.com");
		lblContact2.setBounds(225, 480, 356, 14);
		lblContact2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContact2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblContact2);

		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(UIManager.getFont("Button.font"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Go back to Dashboard
				Dashboard dashboard = new Dashboard();
				dashboard.setVisible(true);
				AboutUs.this.dispose();
				
			}
		});

		btnNewButton.setBounds(462, 506, 89, 29);
		contentPane.add(btnNewButton);

		JLabel Logo = new JLabel("");
		Logo.setBounds(850, 393, 158, 176);
		contentPane.add(Logo);
		Logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3MBC Payroll System LOGO.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));

		//admin will lead to console 
		JButton meet= new JButton("Click Me!");
		meet.setFont(UIManager.getFont("Button.font"));
		meet.setBounds(462, 408, 89, 29);
		contentPane.add(meet);

		meet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scanner sc = new Scanner (System.in);
				//BFS and DFS
				Graph graph = new Graph();

				graph.addEmployee("Manager","Gracia");         
				graph.addEmployee("Main Programmer 1","Aristotle");			
				graph.addEmployee("Main Programmer 2","Yunice");
				graph.addEmployee("Sub Programmer","Jackilou");	
				graph.addEmployee("System Analyst","Kathlynne");			

				graph.connectEmp("Manager","Main Programmer 1");
				graph.connectEmp("Manager","Main Programmer 2");
				graph.connectEmp("Manager","Sub Programmer");
				graph.connectEmp("Manager","System Analyst");

				int choice;
				//selection of graph traversal
				do {
					System.out.println();
					System.out.println();
					System.out.print("Choose what type of transversal (1 or 2):");
					System.out.print("\n 1) BFS \t 2) DFS \t 3)Exit");
					System.out.println();
					System.out.println();
					System.out.print("Answer: ");
					choice = sc.nextInt();
					
					switch(choice) {
					
					case 1: 
						graph.findBFSpath("Manager");break;
					
					case 2: 
						graph.findDFSpath("Manager");break;
					
					case 3:
						//return to about us page 
						AboutUs back = new AboutUs();
						back.setVisible(true);
						back.setExtendedState(JFrame.NORMAL);
						back.setAlwaysOnTop(true);
						back.setAlwaysOnTop(false);
						
						AboutUs.this.dispose();
						
						
						;break;
						
					default:
						return;
					}
					
				} while(choice<3);
				
			}

		});
		
	}
	
}

	
