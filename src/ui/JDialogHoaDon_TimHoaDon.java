package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class JDialogHoaDon_TimHoaDon extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public JDialogHoaDon_TimHoaDon() {
		setTitle("TÌM HÓA ĐƠN");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(size.width / 8, size.height / 5, size.width / 8 * 6, size.height / 5 * 3);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(4, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.BLACK);
				panel_1.setPreferredSize(new Dimension(10, 30));
				panel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel = new JLabel("TÌM HÓA ĐƠN");
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblNewLabel.setForeground(Color.WHITE);
					lblNewLabel.setBackground(Color.WHITE);
					panel_1.add(lblNewLabel);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setOpaque(false);
				panel_1.setPreferredSize(new Dimension(700, 10));
				panel.add(panel_1, BorderLayout.EAST);
				panel_1.setLayout(new BorderLayout(0, 4));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(new Color(0, 0, 0));
					panel_1.add(panel_2, BorderLayout.NORTH);
					{
						JLabel lblNewLabel_2 = new JLabel("KẾT QUẢ TÌM KIẾM");
						lblNewLabel_2.setForeground(new Color(255, 255, 255));
						lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
						panel_2.add(lblNewLabel_2);
					}
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						table = new JTable();
						table.setModel(new DefaultTableModel(new Object[][] {},
								new String[] { "M\u00C3 H\u00D3A \u0110\u01A0N", "NG\u00C0Y", "TH\u1EDCI GIAN",
										"PH\u00D2NG S\u1ED0", "TI\u1EC0N THU\u00CA PH\u00D2NG",
										"TI\u1EC0N D\u1ECACH V\u1EE4" }));
						scrollPane.setViewportView(table);
					}
				}
			}
			{
				JPanel panel_2 = new JPanel();
				panel_2.setOpaque(false);
				panel.add(panel_2, BorderLayout.CENTER);
				panel_2.setLayout(new BorderLayout(4, 4));
				{
					JPanel panel_1 = new JPanel();
					panel_2.add(panel_1, BorderLayout.NORTH);
					panel_1.setLayout(new BorderLayout(0, 0));
					{
						JLabel lblNewLabel_3 = new JLabel("NHẬP THÔNG TIN CẦN TÌM");
						lblNewLabel_3.setForeground(new Color(255, 255, 255));
						lblNewLabel_3.setBackground(new Color(0, 0, 0));
						lblNewLabel_3.setOpaque(true);
						lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_3.setPreferredSize(new Dimension(130, 30));
						lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
						panel_1.add(lblNewLabel_3);
					}
				}
				{
					JPanel panel_1 = new JPanel();
					panel_1.setBackground(Color.WHITE);
					panel_2.add(panel_1, BorderLayout.CENTER);
					panel_1.setLayout(new BorderLayout(4, 0));
					{
						JPanel panel_1_1 = new JPanel();
						panel_1.add(panel_1_1, BorderLayout.WEST);
						panel_1_1.setBackground(Color.WHITE);
						panel_1_1.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
						panel_1_1.setPreferredSize(new Dimension(150, 10));
						panel_1_1.setLayout(new GridLayout(0, 1, 0, 10));
						{
							JLabel lblNewLabel_1 = new JLabel("");
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn");
							lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Phòng số");
							lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Ngày");
							lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Thời gian");
							lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
							lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("");
							panel_1_1.add(lblNewLabel_1);
						}
					}
					{
						JPanel panel_1_1 = new JPanel();
						panel_1.add(panel_1_1, BorderLayout.CENTER);
						panel_1_1.setBackground(Color.WHITE);
						panel_1_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
						panel_1_1.setLayout(new GridLayout(0, 1, 0, 10));
						{
							JLabel lblNewLabel_1 = new JLabel("");
							panel_1_1.add(lblNewLabel_1);
						}
						{
							textField = new JTextField();
							textField.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(textField);
							textField.setColumns(10);
						}
						{
							textField_2 = new JTextField();
							textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(textField_2);
							textField_2.setColumns(10);
						}
						{
							JPanel panel_3 = new JPanel();
							panel_3.setBackground(Color.WHITE);
							panel_1_1.add(panel_3);
							panel_3.setLayout(new GridLayout(1, 0, 20, 0));
							{
								JComboBox comboBox = new JComboBox();
								comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
								panel_3.add(comboBox);
							}
							{
								JComboBox comboBox = new JComboBox();
								comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
								panel_3.add(comboBox);
							}
							{
								JComboBox comboBox = new JComboBox();
								comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
								panel_3.add(comboBox);
							}
						}
						{
							JPanel panel_2_1 = new JPanel();
							panel_2_1.setBackground(Color.WHITE);
							panel_1_1.add(panel_2_1);
							panel_2_1.setLayout(new GridLayout(1, 0, 20, 0));
							{
								JComboBox comboBox = new JComboBox();
								comboBox.setModel(new DefaultComboBoxModel(new String[] { "Giờ" }));
								comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
								panel_2_1.add(comboBox);
							}
							{
								JComboBox comboBox = new JComboBox();
								comboBox.setModel(new DefaultComboBoxModel(new String[] { "Phút" }));
								comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
								panel_2_1.add(comboBox);
							}
						}
						{
							textField_1 = new JTextField();
							textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							textField_1.setColumns(10);
							panel_1_1.add(textField_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("");
							panel_1_1.add(lblNewLabel_1);
						}
					}
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel = new JPanel();
				panel.setBorder(new EmptyBorder(5, 0, 5, 0));
				panel.setBackground(new Color(0, 0, 0));
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				buttonPane.add(panel);
				{
					JButton btnXemChiTit = new JButton("Xem thời gian đặt phòng");
					btnXemChiTit.setEnabled(false);
					btnXemChiTit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JDialogPhong_TimDatPhong timPhong = new JDialogPhong_TimDatPhong(null, "");
							timPhong.show();
						}
					});
					panel.add(btnXemChiTit);
					btnXemChiTit.setPreferredSize(new Dimension(250, 30));
					btnXemChiTit.setFont(new Font("Dialog", Font.BOLD, 14));
					btnXemChiTit.setActionCommand("OK");
				}
				{
					JButton okButton = new JButton("Xem dịch vụ sử dụng");
					okButton.setEnabled(false);
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JDialogDichVu_TimDatDichVu timDatDichVu = new JDialogDichVu_TimDatDichVu(null);
							timDatDichVu.show();
						}
					});
					panel.add(okButton);
					okButton.setPreferredSize(new Dimension(250, 30));
					okButton.setFont(new Font("Dialog", Font.BOLD, 14));
					okButton.setActionCommand("OK");
				}
			}
			{
				JPanel panel = new JPanel();
				panel.setBorder(new EmptyBorder(5, 0, 5, 0));
				panel.setBackground(new Color(0, 0, 0));
				buttonPane.add(panel, BorderLayout.EAST);
				{
					JButton okButton = new JButton("Tìm kiếm");
					panel.add(okButton);
					okButton.setPreferredSize(new Dimension(150, 30));
					okButton.setFont(new Font("Dialog", Font.BOLD, 16));
					okButton.setActionCommand("OK");
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Hủy");
					panel.add(cancelButton);
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					cancelButton.setPreferredSize(new Dimension(150, 30));
					cancelButton.setFont(new Font("Dialog", Font.BOLD, 16));
					cancelButton.setActionCommand("Cancel");
				}
			}
		}
	}

}
