package groupThree_FinalProject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField usernameTxtField;
	private static JTextField passwordTextField;
	private final JLabel lblNewLabel = new JLabel("Welcome");

	private String user;
	private String pass;

	public Admin(String username, String password) {

		user = username;
		pass = password;
	}


	public String getUsername() {
		return user;
	}


	public void setUser(String username) {
		this.user = username;
	}


	public String getPassword() {
		return pass;
	}


	public void setPass(String password) {
		this.pass = password;
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame.
	 * @param password 
	 * @param username 
	 */
	public Admin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/res/3MBC Payroll System LOGO.png")));
		setTitle("Admin Login");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);


		//Welcome 
		JLabel lblNewUserRegister = new JLabel("WELCOME!");
		lblNewUserRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUserRegister.setFont(new Font("Consolas", Font.PLAIN, 35));
		lblNewUserRegister.setBounds(624, 72, 325, 50);
		contentPane.add(lblNewUserRegister);

		//Username
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblUsername.setBounds(500, 209, 150, 29);
		contentPane.add(lblUsername);

		usernameTxtField = new JTextField();
		usernameTxtField.setFont(new Font("Consolas", Font.PLAIN, 20));
		usernameTxtField.setBounds(624, 200, 311, 50);
		contentPane.add(usernameTxtField);


		//Password
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblPassword.setBounds(500, 285,150, 29);
		contentPane.add(lblPassword);

		passwordTextField = new JPasswordField();
		passwordTextField.setFont(new Font("Consolas", Font.PLAIN, 20));
		passwordTextField.setBounds(624, 279, 311, 50);
		contentPane.add(passwordTextField);


		//To log in
		JButton Submit = new JButton("Log In");
		Submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if(loginAuthorization() == true) {
					//will proceed to Dashboard Page
					Dashboard dashboard = new Dashboard();
					dashboard.setVisible(true);
					Admin.this.dispose();

				} else 
					return;

			}
		});
		Submit.setForeground(new Color(255, 153, 0));
		Submit.setBackground(Color.WHITE);
		Submit.setFont(new Font("Consolas", Font.BOLD, 20));
		Submit.setBounds(624,361,311,50);
		contentPane.add(Submit);


		//Image
		JLabel lblImage = new JLabel("");
		lblImage.setForeground(new Color(255, 165, 0));
		lblImage.setBounds(0, 72, 477, 441);
		lblImage.setIcon(new ImageIcon(Admin.class.getResource("/res/3MBC Payroll System LOGO.png")));
		contentPane.add(lblImage);
		lblNewLabel.setBounds(19, -31, 98, 31);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);



	}


	public static boolean loginAuthorization() {

		JFrame errorFrame = new JFrame();
		String username = usernameTxtField.getText();
		String password = new String(((JPasswordField) passwordTextField).getPassword());
		
		//Using Arraylist to authenticate the administrators of the Company
		ArrayList<Admin> management = new ArrayList<Admin>();
		Admin managerOne = new Admin("admin","passpash1");
		Admin managerTwo = new Admin("admin","passpash2");
		management.add(managerOne);
		management.add(managerTwo);

		for(int i = 0; i < management.size(); i++) {
			if(management.get(i).getUsername().compareTo(username) == 0 && management.get(i).getPassword().compareTo(password) == 0) {
				return true;
			}
		}
		passwordTextField.setText("");
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(errorFrame, "User not registered", "Authorization Failed",JOptionPane.ERROR_MESSAGE);
		return false;

	}

}







