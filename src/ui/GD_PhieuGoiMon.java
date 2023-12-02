package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.border.SoftBevelBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class GD_PhieuGoiMon extends JPanel {
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Color colorBackGenral = new Color(0, 255, 127);
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public GD_PhieuGoiMon() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(4, 4));
		
		JPanel pnl_North = new JPanel();
		pnl_North.setBackground(new Color(0, 0, 0));
		add(pnl_North, BorderLayout.NORTH);
		pnl_North.setLayout(new BorderLayout(0, 0));
		
		JPanel pnl_Center = new JPanel();
		pnl_Center.setMinimumSize(new Dimension(750, 10));
		pnl_Center.setBackground(Color.WHITE);
		pnl_Center.setPreferredSize(new Dimension(750, 10));
		add(pnl_Center, BorderLayout.CENTER);
		pnl_Center.setLayout(new BorderLayout(4, 4));
		
		JPanel panel_1 = new JPanel();
		pnl_Center.add(panel_1, BorderLayout.NORTH);
		panel_1.setPreferredSize(new Dimension(700, 300));
		panel_1.setBackground(colorBackGenral);
		panel_1.setLayout(new BorderLayout(0, 4));
		
		JPanel pnlNorth_TitleSheet = new JPanel();
		pnlNorth_TitleSheet.setBackground(Color.WHITE);
		pnlNorth_TitleSheet.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(pnlNorth_TitleSheet, BorderLayout.NORTH);
		pnlNorth_TitleSheet.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setPreferredSize(new Dimension(400, 30));
		panel_12.setBackground(Color.BLACK);
		panel_12.setForeground(Color.BLACK);
		pnlNorth_TitleSheet.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitlePage = new JLabel("ĐẶT NƯỚC UỐNG");
		panel_12.add(lblTitlePage, BorderLayout.CENTER);
		lblTitlePage.setForeground(Color.WHITE);
		lblTitlePage.setPreferredSize(new Dimension(78, 30));
		lblTitlePage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitlePage.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setMinimumSize(new Dimension(10, 300));
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_15, BorderLayout.CENTER);
		panel_15.setLayout(new BorderLayout(4, 0));
		
		JPanel pnl_Infor = new JPanel();
		pnl_Infor.setBorder(null);
		pnl_Infor.setBackground(Color.WHITE);
		panel_15.add(pnl_Infor, BorderLayout.CENTER);
		pnl_Infor.setLayout(new GridLayout(6, 0, 0, 5));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.BLACK);
		pnl_Infor.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("THÔNG TIN PHIẾU GỌI MÓN");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_5, BorderLayout.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JPanel panel_row1 = new JPanel();
		panel_row1.setBackground(Color.WHITE);
		pnl_Infor.add(panel_row1);
		panel_row1.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(Color.WHITE);
		panel_row1.add(panel_10_1);
		panel_10_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Mã phiếu:");
		lblNewLabel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10_1.add(lblNewLabel_6, BorderLayout.WEST);
		
		textField = new JTextField();
		panel_10_1.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JPanel panel_11_1 = new JPanel();
		panel_row1.add(panel_11_1);
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_6_4 = new JLabel("Thời gian:");
		lblNewLabel_6_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_4.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_11_1.add(lblNewLabel_6_4, BorderLayout.WEST);
		
		textField_4 = new JTextField();
		panel_11_1.add(textField_4, BorderLayout.CENTER);
		textField_4.setColumns(10);
		
		JPanel panel_row2 = new JPanel();
		panel_row2.setBackground(Color.WHITE);
		pnl_Infor.add(panel_row2);
		panel_row2.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setBackground(Color.WHITE);
		panel_row2.add(panel_12_1);
		panel_12_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_6_1 = new JLabel("Mã phòng:");
		lblNewLabel_6_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_12_1.add(lblNewLabel_6_1, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_12_1.add(textField_1, BorderLayout.CENTER);
		
		JPanel panel_11_1_1 = new JPanel();
		panel_row2.add(panel_11_1_1);
		panel_11_1_1.setBackground(Color.WHITE);
		panel_11_1_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_6_5 = new JLabel("Ngày:");
		lblNewLabel_6_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_5.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_11_1_1.add(lblNewLabel_6_5, BorderLayout.WEST);
		
		textField_5 = new JTextField();
		panel_11_1_1.add(textField_5, BorderLayout.CENTER);
		textField_5.setColumns(10);
		
		JPanel panel_row2_1 = new JPanel();
		panel_row2_1.setBackground(Color.WHITE);
		pnl_Infor.add(panel_row2_1);
		panel_row2_1.setLayout(new GridLayout(0, 2, 10, 20));
		
		JPanel panel_12_1_1 = new JPanel();
		panel_12_1_1.setBackground(Color.WHITE);
		panel_row2_1.add(panel_12_1_1);
		panel_12_1_1.setLayout(new BorderLayout(10, 20));
		
		JLabel lblNewLabel_6_2 = new JLabel("Mã mặt hàng:");
		lblNewLabel_6_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_2.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_12_1_1.add(lblNewLabel_6_2, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_12_1_1.add(textField_2, BorderLayout.CENTER);
		
		JPanel panel_11_1_1_1 = new JPanel();
		panel_row2_1.add(panel_11_1_1_1);
		panel_11_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1.setLayout(new BorderLayout(10, 0));
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Mã nhân viên:");
		lblNewLabel_6_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_2_2.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_11_1_1_1.add(lblNewLabel_6_2_2, BorderLayout.WEST);
		
		textField_6 = new JTextField();
		panel_11_1_1_1.add(textField_6, BorderLayout.CENTER);
		textField_6.setColumns(10);
		
		JPanel panel_row2_1_1 = new JPanel();
		panel_row2_1_1.setBackground(Color.WHITE);
		pnl_Infor.add(panel_row2_1_1);
		panel_row2_1_1.setLayout(new GridLayout(0, 2, 10, 20));
		
		JPanel panel_12_1_1_1 = new JPanel();
		panel_12_1_1_1.setBackground(Color.WHITE);
		panel_row2_1_1.add(panel_12_1_1_1);
		panel_12_1_1_1.setLayout(new BorderLayout(10, 20));
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Tên sản phẩm:");
		lblNewLabel_6_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_6_2_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_12_1_1_1.add(lblNewLabel_6_2_1, BorderLayout.WEST);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_12_1_1_1.add(textField_3, BorderLayout.CENTER);
		
		JPanel panel_18 = new JPanel();
		panel_18.setForeground(Color.WHITE);
		panel_18.setBackground(Color.WHITE);
		pnl_Infor.add(panel_18);
		
		JPanel pnl_ChooseWater = new JPanel();
		panel_15.add(pnl_ChooseWater, BorderLayout.WEST);
		pnl_ChooseWater.setPreferredSize(new Dimension(250, 10));
		pnl_ChooseWater.setBorder(null);
		pnl_ChooseWater.setBackground(Color.WHITE);
		pnl_ChooseWater.setLayout(new GridLayout(6, 0, 0, 5));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.BLACK);
		pnl_ChooseWater.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CHỌN NƯỚC UỐNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setPreferredSize(new Dimension(72, 30));
		
		JPanel panel_17_1 = new JPanel();
		panel_17_1.setBackground(Color.WHITE);
		pnl_ChooseWater.add(panel_17_1);
		
		JPanel panel_row2_2 = new JPanel();
		panel_row2_2.setBackground(Color.WHITE);
		pnl_ChooseWater.add(panel_row2_2);
		panel_row2_2.setLayout(new BorderLayout(5, 0));
		
		JLabel lblNewLabel_6_7 = new JLabel("Loại mặt hàng:");
		lblNewLabel_6_7.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_row2_2.add(lblNewLabel_6_7, BorderLayout.WEST);
		
		JSpinner spinner_1 = new JSpinner();
		panel_row2_2.add(spinner_1, BorderLayout.CENTER);
		spinner_1.setModel(new SpinnerListModel(new String[] {"Bia", "R\u01B0\u1EE3u", "N\u01B0\u1EDBc su\u1ED1i", "N\u01B0\u1EDBc ng\u1ECDt"}));
		
		JPanel panel_row2_1_2 = new JPanel();
		panel_row2_1_2.setBackground(Color.WHITE);
		pnl_ChooseWater.add(panel_row2_1_2);
		panel_row2_1_2.setLayout(new BorderLayout(5, 0));
		
		JLabel lblNewLabel_6_8 = new JLabel("Tên mặt hàng:");
		lblNewLabel_6_8.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_row2_1_2.add(lblNewLabel_6_8, BorderLayout.WEST);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"Bia Tiger tr\u1EAFng th\u00F9ng", "Bia Tiger n\u00E2u th\u00F9ng", "Bia Saigon xanh th\u00F9ng", "R\u01B0\u1EE3u chu\u1ED1i h\u1ED9t chai", "R\u01B0\u1EE3u g\u1EA1o chai", "R\u01B0\u1EE3u n\u1EBFp s\u1EEFa chai", "N\u01B0\u1EDBc ng\u1ECDt CocaCola chai", "N\u01B0\u1EDBc ng\u1ECDt Pepsi chai", "N\u01B0\u1EDBc ng\u1ECDt Number One chai", "Tr\u00E0 Olong chai", "Tr\u00E0 Xanh chai", "N\u01B0\u1EDBc su\u1ED1i Aquafina chai"}));
		panel_row2_1_2.add(spinner, BorderLayout.CENTER);
		
		JPanel panel_18_1 = new JPanel();
		panel_18_1.setBackground(Color.WHITE);
		pnl_ChooseWater.add(panel_18_1);
		panel_18_1.setLayout(new BorderLayout(4, 0));
		
		JLabel lblNewLabel_6_7_1 = new JLabel("Số lượng:");
		lblNewLabel_6_7_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_6_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_7_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_7_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_18_1.add(lblNewLabel_6_7_1, BorderLayout.WEST);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		panel_18_1.add(spinner_2, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		pnl_Center.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 4));
		
		JPanel panel = new JPanel();
		panel_7.add(panel, BorderLayout.NORTH);
		panel.setBackground(new Color(255, 140, 0));
		panel.setLayout(new BorderLayout(4, 4));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 140, 0));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setPreferredSize(new Dimension(400, 30));
		panel.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(5, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tìm theo mã phiếu", "Tìm theo mã phòng"}));
		panel_3.add(comboBox, BorderLayout.WEST);
		
		JButton btnNewButton_4 = new JButton("HỦY");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(btnNewButton_4, BorderLayout.EAST);
		
		textField_7 = new JTextField();
		panel_3.add(textField_7, BorderLayout.CENTER);
		textField_7.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(10, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 140, 0));
		panel_5.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(1, 1, 5, 0));
		
		JButton btnNewButton = new JButton("THÊM PHIẾU");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SỬA PHIẾU");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LƯU PHIẾU");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("TÌM KIẾM");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("   ");
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("  ");
		panel.add(lblNewLabel_7, BorderLayout.SOUTH);
		
		JPanel panelCenter = new JPanel();
		panel_7.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setPreferredSize(new Dimension(10, 300));
		panelCenter.setBackground(colorBackGenral);
		panelCenter.setLayout(new BorderLayout(0, 4));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCenter.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_2.add(panel_6, BorderLayout.WEST);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("DANH SÁCH PHIẾU GỌI MÓN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setPreferredSize(new Dimension(200, 30));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelCenter.add(scrollPane_1, BorderLayout.CENTER);
		
		table_1 = new JTable();
		table_1.setPreferredScrollableViewportSize(new Dimension(450, 300));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00C3 PHI\u1EBEU", "M\u00C3 PH\u00D2NG", "M\u00C3 S\u1EA2N PH\u1EA8M", "S\u1ED0 L\u01AF\u1EE2NG", "T\u00CCNH TR\u1EA0NG", "TH\u1EDCI GIAN", "NG\u00C0Y", "M\u00C3 NH\u00C2N VI\u00CAN"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
	}

}
