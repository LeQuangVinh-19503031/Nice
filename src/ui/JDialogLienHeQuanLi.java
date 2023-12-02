package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.TextField;

public class JDialogLienHeQuanLi extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogLienHeQuanLi dialog = new JDialogLienHeQuanLi();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogLienHeQuanLi() {
		setTitle("Thông Tin Liên Hệ");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel = new JLabel("Tên người quản lí:");
			lblNewLabel.setBounds(45, 42, 121, 13);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		contentPanel.setLayout(null);
		contentPanel.add(lblNewLabel);
		
		TextField textField = new TextField();
		textField.setBounds(169, 34, 186, 21);
		contentPanel.add(textField);
		
		JLabel lblStLinLc = new JLabel("SĐT liên lạc:");
		lblStLinLc.setHorizontalAlignment(SwingConstants.CENTER);
		lblStLinLc.setBounds(45, 99, 121, 13);
		contentPanel.add(lblStLinLc);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(45, 150, 121, 13);
		contentPanel.add(lblEmail);
		
		JLabel lblCaLmVic = new JLabel("Ca làm việc:");
		lblCaLmVic.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaLmVic.setBounds(45, 201, 121, 13);
		contentPanel.add(lblCaLmVic);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(169, 91, 186, 21);
		contentPanel.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(169, 142, 186, 21);
		contentPanel.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(169, 193, 186, 21);
		contentPanel.add(textField_3);
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
