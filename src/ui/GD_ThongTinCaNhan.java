package ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import java.awt.ComponentOrientation;
import javax.swing.JSpinner;
import java.awt.Choice;

public class GD_ThongTinCaNhan extends JPanel {
	private JTextField txtNv;
	private JTextField txtLQuangVinh;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public GD_ThongTinCaNhan() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(4, 4));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN CÁ NHÂN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setPreferredSize(new Dimension(100, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 250, 154));
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(4, 4));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_2.add(panel_20, BorderLayout.CENTER);
		panel_20.setLayout(new BorderLayout(4, 4));
		
		JPanel panel_9 = new JPanel();
		panel_20.add(panel_9, BorderLayout.NORTH);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_9.add(panel_10, BorderLayout.WEST);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("THÔNG TIN NHÂN VIÊN");
		lblNewLabel_3.setPreferredSize(new Dimension(200, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel panel_14_1 = new JPanel();
		panel_20.add(panel_14_1, BorderLayout.WEST);
		
		JPanel panel_14 = new JPanel();
		panel_20.add(panel_14, BorderLayout.EAST);
		
		JPanel panel_TTNV = new JPanel();
		panel_20.add(panel_TTNV, BorderLayout.CENTER);
		panel_TTNV.setBorder(null);
		panel_TTNV.setBackground(Color.WHITE);
		panel_TTNV.setLayout(new GridLayout(7, 0, 0, 5));
		
		JPanel panel_row1 = new JPanel();
		panel_row1.setBackground(Color.WHITE);
		panel_TTNV.add(panel_row1);
		panel_row1.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10_1.setBackground(Color.WHITE);
		panel_row1.add(panel_10_1);
		panel_10_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Mã nhân viên:");
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
		panel_10_1.add(lblNewLabel_4, BorderLayout.WEST);
		
		txtNv = new JTextField();
		txtNv.setHorizontalAlignment(SwingConstants.CENTER);
		txtNv.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtNv.setText("NV01");
		panel_10_1.add(txtNv, BorderLayout.CENTER);
		txtNv.setColumns(10);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_1.setBackground(Color.WHITE);
		panel_row1.add(panel_9_1);
		panel_9_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Ngày sinh:");
		lblNewLabel_4_1_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_3.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9_1.add(lblNewLabel_4_1_3, BorderLayout.WEST);
		
		JPanel panel_15 = new JPanel();
		panel_15.setOpaque(false);
		panel_9_1.add(panel_15, BorderLayout.CENTER);
		panel_15.setLayout(new GridLayout(1, 0, 20, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_15.add(comboBox);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_15.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_15.add(comboBox_1);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(UIManager.getColor("Panel.background"));
		panel_TTNV.add(panel_28);
		panel_28.setLayout(new GridLayout(1, 0, 10, 0));
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_28.add(panel_29);
		panel_29.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("Tên nhân viên:");
		lblNewLabel_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_29.add(lblNewLabel_4_1, BorderLayout.WEST);
		
		txtLQuangVinh = new JTextField();
		txtLQuangVinh.setHorizontalAlignment(SwingConstants.CENTER);
		txtLQuangVinh.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtLQuangVinh.setText("Lê Quang Vinh");
		txtLQuangVinh.setBackground(Color.WHITE);
		panel_29.add(txtLQuangVinh, BorderLayout.CENTER);
		txtLQuangVinh.setColumns(10);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_30.setBackground(UIManager.getColor("Button.background"));
		panel_28.add(panel_30);
		panel_30.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_4 = new JLabel("CCCD:");
		lblNewLabel_4_1_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_4.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_30.add(lblNewLabel_4_1_4, BorderLayout.WEST);
		
		textField_3 = new JTextField();
		textField_3.setText("123456789000");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_3.setBackground(Color.WHITE);
		panel_30.add(textField_3, BorderLayout.CENTER);
		textField_3.setColumns(10);
		
		JPanel panel_row2 = new JPanel();
		panel_row2.setBackground(Color.WHITE);
		panel_TTNV.add(panel_row2);
		panel_row2.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26.setOpaque(false);
		panel_row2.add(panel_26);
		panel_26.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Giới tính:");
		lblNewLabel_4_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_2.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_26.add(lblNewLabel_4_1_2, BorderLayout.WEST);
		
		JPanel panel_18 = new JPanel();
		panel_18.setOpaque(false);
		panel_26.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new GridLayout(1, 0, 20, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_18.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_18.add(rdbtnNewRadioButton_1);
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12_1.setBackground(Color.WHITE);
		panel_row2.add(panel_12_1);
		panel_12_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Chức vụ:");
		lblNewLabel_4_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_12_1.add(lblNewLabel_4_1_1, BorderLayout.WEST);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_12_1.add(comboBox_8, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_TTNV.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.add(panel_11_1, BorderLayout.CENTER);
		panel_11_1.setBackground(UIManager.getColor("Panel.background"));
		panel_11_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Địa chỉ:");
		lblNewLabel_4_1_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_5.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_11_1.add(lblNewLabel_4_1_5, BorderLayout.WEST);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_11_1.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(new GridLayout(1, 0, 30, 0));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setDoubleBuffered(true);
		comboBox_3.setMaximumRowCount(100);
		comboBox_3.setBackground(UIManager.getColor("Panel.background"));
		comboBox_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Tỉnh(Thành Phố)"}));
		comboBox_3.setEditable(true);
		panel_16.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Huyện (Quận)"}));
		comboBox_4.setBackground(UIManager.getColor("Panel.background"));
		comboBox_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_16.add(comboBox_4);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Xã (Phường)"}));
		comboBox_6.setBackground(UIManager.getColor("Panel.background"));
		comboBox_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_16.add(comboBox_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Ấp (Tên đường)"}));
		comboBox_5.setBackground(UIManager.getColor("Panel.background"));
		comboBox_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_16.add(comboBox_5);
		
		JPanel panel_row2_1_1 = new JPanel();
		panel_row2_1_1.setBackground(Color.WHITE);
		panel_TTNV.add(panel_row2_1_1);
		panel_row2_1_1.setLayout(new GridLayout(1, 0, 10, 0));
		
		JPanel panel_26_1 = new JPanel();
		panel_26_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26_1.setOpaque(false);
		panel_row2_1_1.add(panel_26_1);
		panel_26_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Số điện thoại:");
		lblNewLabel_4_1_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_2_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_26_1.add(lblNewLabel_4_1_2_1, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_2.setText("0123456789");
		panel_26_1.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_27_1 = new JPanel();
		panel_27_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_27_1.setOpaque(false);
		panel_row2_1_1.add(panel_27_1);
		panel_27_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Mã quản lý:");
		lblNewLabel_4_1_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_3_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_27_1.add(lblNewLabel_4_1_3_1, BorderLayout.WEST);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_27_1.add(comboBox_9, BorderLayout.CENTER);
		
		JPanel panel_row2_1_2 = new JPanel();
		panel_row2_1_2.setBackground(Color.WHITE);
		panel_TTNV.add(panel_row2_1_2);
		panel_row2_1_2.setLayout(new GridLayout(1, 0, 10, 0));
		
		JPanel panel_26_2 = new JPanel();
		panel_26_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_row2_1_2.add(panel_26_2);
		panel_26_2.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_3_2_1_1 = new JLabel("Tình trạng:");
		lblNewLabel_4_1_3_2_1_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_3_2_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_26_2.add(lblNewLabel_4_1_3_2_1_1, BorderLayout.WEST);
		
		JComboBox comboBox_7_1 = new JComboBox();
		comboBox_7_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_26_2.add(comboBox_7_1, BorderLayout.CENTER);
		
		JPanel panel_27_2 = new JPanel();
		panel_27_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_row2_1_2.add(panel_27_2);
		panel_27_2.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_4_1_3_2 = new JLabel("Hệ số lương:");
		lblNewLabel_4_1_3_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4_1_3_2.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_27_2.add(lblNewLabel_4_1_3_2, BorderLayout.WEST);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_4.setText("2.5");
		textField_4.setBackground(Color.WHITE);
		panel_27_2.add(textField_4, BorderLayout.CENTER);
		textField_4.setColumns(10);

	}

}
