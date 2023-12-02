package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class JDialogDoiMatKhau extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogDoiMatKhau dialog = new JDialogDoiMatKhau();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogDoiMatKhau() {
		setTitle("Đổi Mật Khẩu");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Label label = new Label("Tên tài khoản:");
		label.setBounds(73, 40, 103, 28);
		contentPanel.add(label);
		
		Label label_1 = new Label("Mật khẩu cũ:");
		label_1.setBounds(73, 81, 103, 28);
		contentPanel.add(label_1);
		
		Label label_2 = new Label("Mật khẩu mới:");
		label_2.setBounds(73, 122, 103, 28);
		contentPanel.add(label_2);
		
		Label label_3 = new Label("Xác nhận mật khẩu:");
		label_3.setBounds(44, 167, 132, 28);
		contentPanel.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(182, 49, 183, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 90, 183, 19);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 131, 183, 19);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 176, 183, 19);
		contentPanel.add(textField_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hiển thị mật khẩu");
		chckbxNewCheckBox.setBounds(182, 201, 124, 21);
		contentPanel.add(chckbxNewCheckBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
