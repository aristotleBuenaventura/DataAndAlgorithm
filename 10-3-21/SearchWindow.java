package groupThree_FinalProject;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class SearchWindow extends JFrame {
	
	public SearchWindow() {
		setTitle("Search");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SearchWindow.class.getResource("/res/Logo Top.png")));
	}

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldID;
	private JTextField textFieldField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchWindow frame = new SearchWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void SearchWindow(String name, String ID, String field) {
		
		setTitle("RESULT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("--RECORD FOUND--");
		lblNewLabel.setBounds(70, 11, 128, 14);
		contentPane.add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setEditable(false);
		textFieldName.setBounds(79, 67, 86, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		textFieldName.setText(name);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(23, 70, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(23, 39, 46, 14);
		contentPane.add(lblID);
		
		textFieldID = new JTextField();
		textFieldID.setEditable(false);
		textFieldID.setColumns(10);
		textFieldID.setBounds(79, 36, 86, 20);
		contentPane.add(textFieldID);
		textFieldID.setText(ID);
		
		JLabel lblField = new JLabel("FIELD:");
		lblField.setBounds(23, 104, 46, 14);
		contentPane.add(lblField);
		
		textFieldField = new JTextField();
		textFieldField.setEditable(false);
		textFieldField.setColumns(10);
		textFieldField.setBounds(79, 101, 86, 20);
		contentPane.add(textFieldField);
		textFieldField.setText(field);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SearchWindow.this.dispose();
			}
		});
		btnNewButton.setBounds(173, 124, 52, 23);
		contentPane.add(btnNewButton);
	}

	
}
