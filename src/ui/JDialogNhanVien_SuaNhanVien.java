package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class JDialogNhanVien_SuaNhanVien extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_6;

	/**
	 * Create the dialog.
	 */
	public JDialogNhanVien_SuaNhanVien() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(200, 300));
		setModal(true);
		Point p =  MouseInfo.getPointerInfo().getLocation();
		setTitle("Sửa nhân viên");
		setBounds(p.x+50, p.y-100, 1146, 762);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(4, 4));
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(0);
			flowLayout.setHgap(0);
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("SỬA NHÂN VIÊN");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setPreferredSize(new Dimension(200, 30));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				table = new JTable();
				table.setRowHeight(20);
				table.setBorder(new LineBorder(new Color(0, 0, 0)));
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null},
					},
					new String[] {
						"M\u00C3 NH\u00C2N VI\u00CAN", "T\u00CAN NH\u00C2N VI\u00CAN", "GI\u1EDAI T\u00CDNH", "\u0110\u1ECAA CH\u1EC8", "S\u1ED0 \u0110I\u1EC6N THO\u1EA0I", "CCCD", "CH\u1EE8C V\u1EE4", "NG\u00C0Y SINH", "M\u00C3 QU\u1EA2N L\u00DD", "H\u1EC6 S\u1ED0 L\u01AF\u01A0NG", "T\u00CCNH TR\u1EA0NG"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(300, 10));
			contentPanel.add(panel, BorderLayout.WEST);
			panel.setLayout(new BorderLayout(0, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setVgap(0);
				flowLayout.setHgap(0);
				flowLayout.setAlignment(FlowLayout.LEFT);
				panel.add(panel_1, BorderLayout.NORTH);
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(Color.BLACK);
					panel_1.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					{
						JLabel lblThngTinCn = new JLabel("THÔNG TIN ");
						lblThngTinCn.setPreferredSize(new Dimension(200, 30));
						lblThngTinCn.setHorizontalAlignment(SwingConstants.CENTER);
						lblThngTinCn.setForeground(Color.WHITE);
						lblThngTinCn.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_2.add(lblThngTinCn);
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setPreferredSize(new Dimension(250, 10));
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new GridLayout(0, 2, 10, 10));
				{
					JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField = new JTextField();
					textField.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField.setColumns(10);
					panel_1.add(textField);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Tên nhân viên");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField_1.setColumns(10);
					panel_1.add(textField_1);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Giới tính");
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(0, 1, 0, 0));
					{
						JPanel panel_18 = new JPanel();
						panel_18.setOpaque(false);
						panel_1_1.add(panel_18);
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
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Địa chỉ");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(0, 1, 0, 0));
					{
						textField_3 = new JTextField();
						textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
						textField_3.setColumns(10);
						panel_1_1.add(textField_3);
					}
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Số điện thoại");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(0, 1, 0, 0));
					{
						textField_5 = new JTextField();
						textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
						textField_5.setColumns(10);
						panel_1_1.add(textField_5);
					}
				}
				{
					JLabel lblNewLabel_1 = new JLabel("CCCD");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_4 = new JTextField();
					textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField_4.setColumns(10);
					panel_1.add(textField_4);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Chức vụ");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
					panel_1.add(comboBox);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Ngày sinh\r\n");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JPanel panel_15 = new JPanel();
					panel_15.setOpaque(false);
					panel_1.add(panel_15);
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
					JLabel lblNewLabel_1 = new JLabel("Mã quản lý");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
					panel_1.add(comboBox);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Hệ số lương");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_2.setColumns(10);
					panel_1.add(textField_2);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Tình trạng");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_6 = new JTextField();
					textField_6.setFont(new Font("Dialog", Font.BOLD, 12));
					textField_6.setColumns(10);
					panel_1.add(textField_6);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setBorder(new EmptyBorder(2, 0, 10, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setVgap(0);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnTmKim = new JButton("Lưu");
				btnTmKim.setPreferredSize(new Dimension(100, 30));
				btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnTmKim.setActionCommand("OK");
				buttonPane.add(btnTmKim);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.setPreferredSize(new Dimension(100, 30));
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
