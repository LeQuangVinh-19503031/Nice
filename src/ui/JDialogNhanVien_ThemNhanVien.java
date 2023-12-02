package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.UIManager;

public class JDialogNhanVien_ThemNhanVien extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_2;

	/**
	 * Create the dialog.
	 */
	public JDialogNhanVien_ThemNhanVien() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(200, 300));
		setModal(true);
		Point p =  MouseInfo.getPointerInfo().getLocation();
		setTitle("Thêm nhân viên");
		setBounds(p.x, p.y, 759, 662);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(0, 2, 10, 10));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				panel_1.setLayout(new GridLayout(0, 1, 0, 1));
				{
					JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel = new JLabel("Tên Nhân viên");
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("Giới tính\r\n");
					lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Số điện thoại");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Địa chỉ");
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Ngày sinh");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Chức vụ");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("CCCD");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Mã quản lý");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Hệ số lương");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Tình trạng");
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_4);
				}
			}
			{
				JPanel panel_2 = new JPanel();
				panel.add(panel_2);
				panel_2.setLayout(new GridLayout(0, 1, 0, 10));
				{
					textField = new JTextField();
					textField.setFont(new Font("Dialog", Font.BOLD, 12));
					textField.setColumns(10);
					panel_2.add(textField);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_1.setColumns(10);
					panel_2.add(textField_1);
				}
				{
					JPanel panel_18 = new JPanel();
					panel_18.setOpaque(false);
					panel_2.add(panel_18);
					panel_18.setLayout(new GridLayout(1, 0, 20, 0));
					{
						JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
						rdbtnNewRadioButton.setSelected(true);
						rdbtnNewRadioButton.setOpaque(false);
						rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnNewRadioButton.setFont(new Font("Dialog", Font.PLAIN, 12));
						panel_18.add(rdbtnNewRadioButton);
					}
					{
						JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
						rdbtnNewRadioButton_1.setOpaque(false);
						rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.PLAIN, 12));
						panel_18.add(rdbtnNewRadioButton_1);
					}
				}
				{
					textField_4 = new JTextField();
					textField_4.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_4.setColumns(10);
					panel_2.add(textField_4);
				}
				{
					JPanel panel_16 = new JPanel();
					panel_16.setBackground(Color.WHITE);
					panel_2.add(panel_16);
					panel_16.setLayout(new GridLayout(1, 0, 30, 0));
					{
						JComboBox comboBox_3 = new JComboBox();
						comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Tỉnh (Thành Phố)"}));
						comboBox_3.setMaximumRowCount(100);
						comboBox_3.setFont(new Font("Dialog", Font.PLAIN, 12));
						comboBox_3.setDoubleBuffered(true);
						comboBox_3.setBackground(UIManager.getColor("Button.background"));
						panel_16.add(comboBox_3);
					}
					{
						JComboBox comboBox_4 = new JComboBox();
						comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Huyện (Quận)"}));
						comboBox_4.setFont(new Font("Dialog", Font.PLAIN, 12));
						comboBox_4.setBackground(UIManager.getColor("Button.background"));
						panel_16.add(comboBox_4);
					}
					{
						JComboBox comboBox_6 = new JComboBox();
						comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Xã(Phường)"}));
						comboBox_6.setFont(new Font("Dialog", Font.PLAIN, 12));
						comboBox_6.setBackground(UIManager.getColor("Button.background"));
						panel_16.add(comboBox_6);
					}
					{
						JComboBox comboBox_5 = new JComboBox();
						comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Ấp(Tên Đường)"}));
						comboBox_5.setFont(new Font("Dialog", Font.PLAIN, 12));
						comboBox_5.setBackground(UIManager.getColor("Button.background"));
						panel_16.add(comboBox_5);
					}
				}
				{
					JPanel panel_15 = new JPanel();
					panel_15.setOpaque(false);
					panel_2.add(panel_15);
					panel_15.setLayout(new GridLayout(1, 0, 20, 0));
					{
						JComboBox comboBox = new JComboBox();
						comboBox.setFont(new Font("Dialog", Font.PLAIN, 12));
						panel_15.add(comboBox);
					}
					{
						JComboBox comboBox_2 = new JComboBox();
						comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 12));
						panel_15.add(comboBox_2);
					}
					{
						JComboBox comboBox_1 = new JComboBox();
						comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 12));
						panel_15.add(comboBox_1);
					}
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
					panel_2.add(comboBox);
				}
				{
					textField_6 = new JTextField();
					textField_6.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_6.setColumns(10);
					panel_2.add(textField_6);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
					panel_2.add(comboBox);
				}
				{
					textField_3 = new JTextField();
					textField_3.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_3.setColumns(10);
					panel_2.add(textField_3);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_2.setColumns(10);
					panel_2.add(textField_2);
				}
			}
		}
		{
			JLabel lblNewLabel_5 = new JLabel("");
			contentPanel.add(lblNewLabel_5, BorderLayout.NORTH);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel = new JPanel();
				panel.setOpaque(false);
				buttonPane.add(panel, BorderLayout.EAST);
				{
					JButton okButton = new JButton("OK");
					panel.add(okButton);
					okButton.setFont(new Font("Tahoma", Font.BOLD, 12));
					okButton.setActionCommand("OK");
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					panel.add(cancelButton);
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
					cancelButton.setActionCommand("Cancel");
				}
			}
		}
	}

}
