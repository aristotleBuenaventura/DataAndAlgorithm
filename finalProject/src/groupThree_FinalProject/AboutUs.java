package groupThree_FinalProject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutUs.class.getResource("/res/3MBC Payroll System LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		lblBehind.setBounds(363, 287, 289, 53);
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
		txtpnForMoreDe.setBounds(225, 341, 571, 96);
		txtpnForMoreDe.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnForMoreDe.setForeground(new Color(255, 255, 255));
		txtpnForMoreDe.setBackground(new Color(255, 153, 0));
		txtpnForMoreDe.setText("\tThe developers wish to come up with a very intruiging name. Something eye-catching and short. They decided to use their surnames for this project namely 'Mendoza, Moraga and Muñez' for the 3M  then B and C for 'Buenaventura and Cruz'." );
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

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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

	}
}
	
