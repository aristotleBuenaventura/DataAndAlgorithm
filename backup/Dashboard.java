package groupThree_FinalProject;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Dashboard extends JFrame {

	private JPanel dashboardFrame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {

		setLocationByPlatform(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/res/3MBC Payroll System LOGO.png")));
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		dashboardFrame = new JPanel();
		dashboardFrame.setBackground(Color.WHITE);
		dashboardFrame.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(dashboardFrame);
		dashboardFrame.setLayout(null);

		JLabel lblPayroll = new JLabel("");
		lblPayroll.setBounds(0, 133, 312, 278);
		dashboardFrame.add(lblPayroll);
		lblPayroll.setForeground(new Color(255, 165, 0));
		lblPayroll.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Payroll Icon.png")).getImage().getScaledInstance(358, 358, Image.SCALE_SMOOTH)));

		JLabel lblAboutUs = new JLabel("");
		lblAboutUs.setForeground(new Color(255, 165, 0));
		lblAboutUs.setBounds(320, 124, 331, 301);
		lblAboutUs.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/About Us Icon.png")).getImage().getScaledInstance(360, 360, Image.SCALE_SMOOTH)));
		dashboardFrame.add(lblAboutUs);

		JLabel lblLogout = new JLabel("");
		lblLogout.setForeground(new Color(255, 165, 0));
		lblLogout.setBounds(652, 114, 315, 297);
		lblLogout.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Logout Icon.png")).getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
		dashboardFrame.add(lblLogout);

		JPanel payroll = new JPanel();
		payroll.setForeground(Color.WHITE);
		payroll.setBorder(null);
		payroll.setBackground(Color.WHITE);
		payroll.setBounds(76, 447, 220, 46);
		dashboardFrame.add(payroll);
		payroll.setLayout(null);

		JLabel lblPayrollText = new JLabel("PAYROLL");
		lblPayrollText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//will proceed to Payroll Page
				Payroll_JFrame payroll = new Payroll_JFrame();
				payroll.setVisible(true);
				Dashboard.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPayrollText.setForeground(new Color(44,57,54));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPayrollText.setForeground(Color.ORANGE);
			}
		});
		lblPayrollText.setForeground(Color.ORANGE);
		lblPayrollText.setBorder(null);
		lblPayrollText.setBounds(6, 6, 208, 34);
		payroll.add(lblPayrollText);
		lblPayrollText.setBackground(Color.WHITE);
		lblPayrollText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayrollText.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 30));

		JPanel aboutUs = new JPanel();
		aboutUs.setBorder(null);
		aboutUs.setBackground(Color.WHITE);
		aboutUs.setBounds(390, 447, 220, 46);
		dashboardFrame.add(aboutUs);
		aboutUs.setLayout(null);

		JLabel lblAboutUsText = new JLabel("ABOUT US");
		lblAboutUsText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//will proceed to About Us Page
				AboutUs aboutUs = new AboutUs();
				aboutUs.setVisible(true);
				Dashboard.this.dispose();

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAboutUsText.setForeground(new Color(44,57,54));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAboutUsText.setForeground(Color.ORANGE);
			}
		});
		lblAboutUsText.setForeground(Color.ORANGE);
		lblAboutUsText.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutUsText.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 30));
		lblAboutUsText.setBounds(6, 6, 208, 34);
		aboutUs.add(lblAboutUsText);

		JPanel logout = new JPanel();
		logout.setBorder(null);
		logout.setBackground(Color.WHITE);
		logout.setBounds(722, 447, 220, 46);
		dashboardFrame.add(logout);
		logout.setLayout(null);

		JLabel lblLogoutText = new JLabel("LOG OUT");
		lblLogoutText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ImageIcon logo = new ImageIcon(getClass().getResource("/res/3MBC Payroll System LOGO.png"));
				Image img3MBC = logo.getImage();
				Image modifiedLogo = img3MBC.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				logo = new ImageIcon(modifiedLogo);
				int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "3MBC Payroll System", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION,logo);

				if (confirmed == JOptionPane.YES_OPTION) {
					Dashboard.this.dispose();
				}

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogoutText.setForeground(new Color(44,57,54));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogoutText.setForeground(Color.ORANGE);
			}
		});
		lblLogoutText.setForeground(Color.ORANGE);
		lblLogoutText.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoutText.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 30));
		lblLogoutText.setBounds(6, 6, 208, 34);
		logout.add(lblLogoutText);

		JLabel lblHorizontal = new JLabel("");
		lblHorizontal.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorizontal.setBounds(286, 17, 457, 92);
		lblHorizontal.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Horizontal Logo.png")).getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		dashboardFrame.add(lblHorizontal);
		setLocationRelativeTo(null);


	}
}
