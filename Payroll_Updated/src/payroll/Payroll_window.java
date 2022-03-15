package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Payroll_window {

	private JFrame frmPayroll;
	private JTextField textFieldID;
	private JTextField textFieldField;
	private JTextField textFieldMedical;
	private JTextField textFieldPayment;
	private JTextField textFieldTax;
	private JTextField textFieldGross;
	private JTextField textFieldTotal;
	private JTextField textFieldNet;
	private JTextField textFieldSSS;
	private JTextField textFieldOTP;
	private JTextField textFieldWorkingHours;
	private JTextField textFieldName;
	private JTable tablePayRoll;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll_window window = new Payroll_window();
					window.frmPayroll.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayroll = new JFrame();
		frmPayroll.getContentPane().setEnabled(false);
		frmPayroll.setResizable(false);
		frmPayroll.setTitle("PayRoll");
		frmPayroll.setBounds(450, 190, 1014, 597);
		frmPayroll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayroll.getContentPane().setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setFont(new Font("Consolas", Font.BOLD, 18));
		lblID.setBounds(172, 16, 30, 21);
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		frmPayroll.getContentPane().add(lblID);
		
		textFieldID = new JTextField();
		//textFieldID.setPrompt
		textFieldID.setBounds(203, 15, 150, 20);
		frmPayroll.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);
		
		JLabel lblField = new JLabel("FIELD:");
		lblField.setHorizontalAlignment(SwingConstants.CENTER);
		lblField.setFont(new Font("Consolas", Font.BOLD, 18));
		lblField.setBounds(142, 39, 60, 21);
		frmPayroll.getContentPane().add(lblField);
		
		textFieldField = new JTextField();
		textFieldField.setColumns(10);
		textFieldField.setBounds(203, 38, 150, 20);
		frmPayroll.getContentPane().add(textFieldField);
		
		JLabel lblPayment = new JLabel("PAYMENT:");
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setFont(new Font("Consolas", Font.BOLD, 18));
		lblPayment.setBounds(122, 64, 80, 21);
		frmPayroll.getContentPane().add(lblPayment);
		
		textFieldPayment = new JTextField();
		textFieldPayment.setColumns(10);
		textFieldPayment.setBounds(203, 63, 150, 20);
		frmPayroll.getContentPane().add(textFieldPayment);
		
		JLabel lblMedical = new JLabel("MEDICAL:");
		lblMedical.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedical.setFont(new Font("Consolas", Font.BOLD, 18));
		lblMedical.setBounds(122, 89, 80, 21);
		frmPayroll.getContentPane().add(lblMedical);
		
		textFieldMedical = new JTextField();
		textFieldMedical.setColumns(10);
		textFieldMedical.setBounds(203, 86, 150, 20);
		frmPayroll.getContentPane().add(textFieldMedical);
		
		JLabel lblGross = new JLabel("GROSS:");
		lblGross.setHorizontalAlignment(SwingConstants.CENTER);
		lblGross.setFont(new Font("Consolas", Font.BOLD, 18));
		lblGross.setBounds(142, 112, 60, 21);
		frmPayroll.getContentPane().add(lblGross);
		
		textFieldGross = new JTextField();
		textFieldGross.setColumns(10);
		textFieldGross.setBounds(203, 111, 150, 20);
		frmPayroll.getContentPane().add(textFieldGross);
		
		JLabel lblTax = new JLabel("TAX:");
		lblTax.setHorizontalAlignment(SwingConstants.CENTER);
		lblTax.setFont(new Font("Consolas", Font.BOLD, 18));
		lblTax.setBounds(162, 135, 40, 21);
		frmPayroll.getContentPane().add(lblTax);
		
		textFieldTax = new JTextField();
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(203, 134, 150, 20);
		frmPayroll.getContentPane().add(textFieldTax);
		
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Consolas", Font.BOLD, 18));
		lblName.setBounds(481, 17, 50, 21);
		frmPayroll.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(532, 16, 150, 20);
		frmPayroll.getContentPane().add(textFieldName);
		
		JLabel lblWorkingHours = new JLabel("WORKING HOURS:");
		lblWorkingHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkingHours.setFont(new Font("Consolas", Font.BOLD, 18));
		lblWorkingHours.setBounds(391, 40, 140, 21);
		frmPayroll.getContentPane().add(lblWorkingHours);
		
		textFieldWorkingHours = new JTextField();
		textFieldWorkingHours.setColumns(10);
		textFieldWorkingHours.setBounds(532, 39, 150, 20);
		frmPayroll.getContentPane().add(textFieldWorkingHours);
		
		JLabel lblOTP = new JLabel("OTP:");
		lblOTP.setHorizontalAlignment(SwingConstants.CENTER);
		lblOTP.setFont(new Font("Consolas", Font.BOLD, 18));
		lblOTP.setBounds(491, 65, 40, 21);
		frmPayroll.getContentPane().add(lblOTP);
		
		textFieldOTP = new JTextField();
		textFieldOTP.setColumns(10);
		textFieldOTP.setBounds(532, 64, 150, 20);
		frmPayroll.getContentPane().add(textFieldOTP);
		
		JLabel lblSSS = new JLabel("SSS:");
		lblSSS.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSS.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSSS.setBounds(491, 90, 40, 21);
		frmPayroll.getContentPane().add(lblSSS);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setColumns(10);
		textFieldSSS.setBounds(532, 87, 150, 20);
		frmPayroll.getContentPane().add(textFieldSSS);

		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Consolas", Font.BOLD, 18));
		lblTotal.setBounds(471, 136, 60, 21);
		frmPayroll.getContentPane().add(lblTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(532, 134, 150, 20);
		frmPayroll.getContentPane().add(textFieldTotal);
		
		JLabel lblNet = new JLabel("NET:");
		lblNet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNet.setFont(new Font("Consolas", Font.BOLD, 18));
		lblNet.setBounds(491, 113, 40, 21);
		frmPayroll.getContentPane().add(lblNet);
		
		textFieldNet = new JTextField();
		textFieldNet.setColumns(10);
		textFieldNet.setBounds(532, 112, 150, 20);
		frmPayroll.getContentPane().add(textFieldNet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 175, 988, 382);
		frmPayroll.getContentPane().add(scrollPane);
		
		tablePayRoll = new JTable();
		tablePayRoll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i= tablePayRoll.getSelectedRow();
				if(i>=0) {
					textFieldID.setText(model.getValueAt(i,0).toString());
					textFieldName.setText(model.getValueAt(i,1).toString());
					textFieldField.setText(model.getValueAt(i,2).toString());
					textFieldMedical.setText(model.getValueAt(i,3).toString());
					textFieldPayment.setText(model.getValueAt(i,4).toString());
					textFieldOTP.setText(model.getValueAt(i,5).toString());
					textFieldSSS.setText(model.getValueAt(i,6).toString());
					textFieldWorkingHours.setText(model.getValueAt(i,7).toString());
					textFieldGross.setText(model.getValueAt(i,8).toString());
					textFieldNet.setText(model.getValueAt(i,9).toString());
					textFieldTax.setText(model.getValueAt(i,10).toString());
					textFieldTotal.setText(model.getValueAt(i,11).toString());
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
				
			}
		});
		tablePayRoll.setFont(new Font("Consolas", Font.PLAIN, 11));
		model = new DefaultTableModel();
		Object[] column = {"ID", "Name", "Field", "Working Hours", "Payment", "OTP", "Medical", "SSS", "Gross", "Net", "Tax", "Total"};
		final Object[] row = new Object[12];
		
		model.setColumnIdentifiers(column);
		tablePayRoll.setModel(model);
		
		scrollPane.setViewportView(tablePayRoll);
		
		
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldID.getText().equals("") || textFieldName.getText().equals("") || textFieldField.getText().equals("") || textFieldMedical.getText().equals("") || textFieldPayment.getText().equals("") 
						|| textFieldOTP.getText().equals("") || textFieldSSS.getText().equals("") || textFieldWorkingHours.getText().equals("") || textFieldGross.getText().equals("") || textFieldNet.getText().equals("")
						|| textFieldTax.getText().equals("") || textFieldTotal.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} else {
					row[0]= textFieldID.getText();
					row[1]= textFieldName.getText();
					row[2]= textFieldField.getText();
					row[3]= textFieldMedical.getText();
					row[4]= textFieldPayment.getText();
					row[5]= textFieldOTP.getText();
					row[6]= textFieldSSS.getText();
					row[7]= textFieldWorkingHours.getText();
					row[8]= textFieldGross.getText();
					row[9]= textFieldNet.getText();
					row[10]= textFieldTax.getText();
					row[11]= textFieldTotal.getText();
					model.addRow(row);
					textFieldID.setText("");
					textFieldName.setText("");
					textFieldField.setText("");
					textFieldMedical.setText("");
					textFieldPayment.setText("");
					textFieldOTP.setText("");
					textFieldSSS.setText("");
					textFieldWorkingHours.setText("");
					textFieldGross.setText("");
					textFieldNet.setText("");
					textFieldTax.setText("");
					textFieldTotal.setText("");
					JOptionPane.showMessageDialog(null, "Saved Successfully");
				}

				
				
				
			}
		});
		btnAdd.setBounds(713, 14, 89, 23);
		frmPayroll.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = tablePayRoll.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
				
			}
		});
		btnDelete.setBounds(713, 50, 89, 23);
		frmPayroll.getContentPane().add(btnDelete);
		
		JButton btnPrint = new JButton("CLEAR");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldID.setText("");
				textFieldName.setText("");
				textFieldField.setText("");
				textFieldMedical.setText("");
				textFieldPayment.setText("");
				textFieldOTP.setText("");
				textFieldSSS.setText("");
				textFieldWorkingHours.setText("");
				textFieldGross.setText("");
				textFieldNet.setText("");
				textFieldTax.setText("");
				textFieldTotal.setText("");
			}
		});
		btnPrint.setBounds(713, 90, 89, 23);
		frmPayroll.getContentPane().add(btnPrint);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = tablePayRoll.getSelectedRow();
				model.setValueAt(textFieldID.getText(), i, 0);
				model.setValueAt(textFieldName.getText(), i, 1);
				model.setValueAt(textFieldField.getText(), i, 2);
				model.setValueAt(textFieldMedical.getText(), i, 3);
				model.setValueAt(textFieldPayment.getText(), i, 4);
				model.setValueAt(textFieldOTP.getText(), i, 5);
				model.setValueAt(textFieldSSS.getText(), i, 6);
				model.setValueAt(textFieldWorkingHours.getText(), i, 7);
				model.setValueAt(textFieldGross.getText(), i, 8);
				model.setValueAt(textFieldNet.getText(), i, 9);
				model.setValueAt(textFieldTax.getText(), i, 10);
				model.setValueAt(textFieldTotal.getText(), i, 11);
			}
		});
		btnUpdate.setBounds(713, 130, 89, 23);
		frmPayroll.getContentPane().add(btnUpdate);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(928, 150, 65, 21);
		frmPayroll.getContentPane().add(btnBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(906, 15, 87, 21);
		frmPayroll.getContentPane().add(comboBox);
		comboBox.addItem("ID");
		comboBox.addItem("Name");
		comboBox.addItem("Field");
		comboBox.addItem("Medical");
		comboBox.addItem("Payment");
		comboBox.addItem("OTP");
		comboBox.addItem("SSS");
		comboBox.addItem("Working Hours");
		comboBox.addItem("Gross");
		comboBox.addItem("Net");
		comboBox.addItem("Tax");
		comboBox.addItem("Total");
		
		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSortBy.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSortBy.setBounds(824, 18, 80, 21);
		frmPayroll.getContentPane().add(lblSortBy);
	}
}
