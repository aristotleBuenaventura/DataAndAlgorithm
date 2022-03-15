package groupThree_FinalProject;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class EmployeeList extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTable table;
	DefaultTableModel model;
	private int managerCount=0;
	private int tellerCount=0;
	private EmployeePos list = new EmployeePos();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeList frame = new EmployeeList();
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

	public EmployeeList() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Payroll_JFrame.class.getResource("/res/3.png")));
		setTitle("Employee Attendance");
		setBounds(450, 190, 1014, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(289, 22, 457, 92);
		logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Horizontal Logo.png")).getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		contentPane.add(logo);

		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(51, 126, 84, 17);
		contentPane.add(lblName);

		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPosition.setBounds(51, 175, 84, 17);
		contentPane.add(lblPosition);

		nameTextField = new JTextField();
		nameTextField.setBounds(145, 121, 189, 31);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] { "Manager", "Teller", "Technician", "Instructor"}));
		comboBox_1.setBounds(145, 175, 189, 29);
		contentPane.add(comboBox_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					comboBox_1.setSelectedItem(model.getValueAt(i,0).toString());
					nameTextField.setText(model.getValueAt(i,1).toString());
				}else {
					JFrame errorFrame = new JFrame();
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(errorFrame, "Please Select a Row First","3MBC Payroll System", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		scrollPane.setBounds(22, 226, 953, 324);
		contentPane.add(scrollPane);

		table = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"POSITION", "NAME"};
		final Object[] row = new Object[2]; 
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int i = table.getSelectedRow();
				if(i>=0) {
					int n = JOptionPane.showConfirmDialog(
							null,
							"Are you sure you want to permanently remove this item?",
							"3MBC Payroll System",
							JOptionPane.YES_NO_OPTION);
					if(n==JOptionPane.YES_OPTION) {
					model.removeRow(i);
						ImageIcon logo = new ImageIcon(getClass().getResource("/res/3MBC Payroll System LOGO.png"));
						Image img3MBC = logo.getImage();
						Image modifiedLogo = img3MBC.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
						logo = new ImageIcon(modifiedLogo);
						JOptionPane.showMessageDialog(null, "Deleted Successfully","3MBC Payroll System", JOptionPane.INFORMATION_MESSAGE, logo);
					}

				}else {
					JFrame errorFrame = new JFrame();
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(errorFrame, "Please Select a Row First","3MBC Payroll System", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(855, 152, 85, 21);
		contentPane.add(btnDelete);

		JButton btnPrint = new JButton("DONE");
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Will proceed to Payroll Page
				Payroll_JFrame payroll = new Payroll_JFrame();
				payroll.setVisible(true);
				EmployeeList.this.dispose();
			}
		});
		btnPrint.setBounds(855, 183, 85, 21);
		contentPane.add(btnPrint);


		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameTextField.getText().equals("")) {

					JFrame errorFrame = new JFrame();
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(errorFrame, "Please Fill Complete Information","3MBC Payroll System", JOptionPane.ERROR_MESSAGE);
				} else {
					String position = comboBox_1.getSelectedItem().toString();
					String name = nameTextField.getText();
					int rowCount = model.getRowCount();
					model.setRowCount(rowCount);

					int index = 0;
					if (position.equals("Manager")) {
						index = list.prepend(name, position);
						++managerCount;

					} else if (position.equals("Teller")) {
						if(managerCount==0) {
							index = list.prepend(name, position);
						} else {
							index = list.add(managerCount + 1, name, position);
						}
						++tellerCount;
					} else if(position.equals("Technician")){
						if(managerCount==0) {
							index = list.prepend(name, position);
						} else if(tellerCount ==0) {
							index = list.add(managerCount +1, name, position);
						} else {
							index = list.add(managerCount + tellerCount + 1, name, position);
						}

					} else if(position.equals("Instructor")) {
						index = list.append(name, position);
					}	

					row[0] = position;
					row[1] = name;

					model.insertRow(index, row);
					nameTextField.setText("");
					
				}
				
			}
		});

		btnAdd.setBounds(855, 121, 85, 21);
		contentPane.add(btnAdd);
	}
}




