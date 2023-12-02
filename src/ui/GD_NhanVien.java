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

import dao.NhanVien_Dao;
import entity.NhanVien;

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

public class GD_NhanVien extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DefaultTableModel model;

	/**
	 * Create the panel.
	 */
	public GD_NhanVien() {
		setOpaque(false);
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(4, 4));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel.setBorder(new LineBorder(Color.WHITE));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setPreferredSize(new Dimension(100, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 250, 154));
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(4, 4));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_3.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_2.add(panel_20, BorderLayout.CENTER);
		panel_20.setLayout(new BorderLayout(4, 4));
		
		JPanel pnl_North = new JPanel();
		pnl_North.setPreferredSize(new Dimension(10, 100));
		pnl_North.setOpaque(false);
		pnl_North.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_20.add(pnl_North, BorderLayout.NORTH);
		pnl_North.setLayout(new GridLayout(2, 1, 4, 4));
		
		JPanel pnl_Search = new JPanel();
		pnl_Search.setOpaque(false);
		pnl_Search.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Search.setBackground(new Color(255, 140, 0));
		pnl_North.add(pnl_Search);
		pnl_Search.setLayout(new GridLayout(1, 0, 4, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		pnl_Search.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(500, 30));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setColumns(10);
		panel_5.add(textField, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên nhân viên");
		lblNewLabel_1_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_1_1, BorderLayout.WEST);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		pnl_Search.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Chức vụ");
		lblNewLabel_1_1_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1_1.add(lblNewLabel_1_1_1, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(500, 30));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		panel_1_1.add(textField_1, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("TÌM KIẾM");
		btnNewButton_1.setPreferredSize(new Dimension(100, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		panel_1_1.add(btnNewButton_1, BorderLayout.EAST);
		
		JPanel pnl_Filter = new JPanel();
		pnl_Filter.setOpaque(false);
		pnl_Filter.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Filter.setBackground(new Color(255, 140, 0));
		pnl_North.add(pnl_Filter);
		pnl_Filter.setLayout(new GridLayout(1, 0, 4, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		pnl_Filter.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Tình trạng");
		lblNewLabel_1_1_2.setBackground(new Color(255, 140, 0));
		lblNewLabel_1_1_2.setOpaque(true);
		lblNewLabel_1_1_2.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_1_1_2, BorderLayout.WEST);
		
		JComboBox comboBox_10 = new JComboBox();
		panel_7.add(comboBox_10, BorderLayout.CENTER);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setOpaque(false);
		pnl_Filter.add(panel_1_2);
		panel_1_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("LÀM MỚI");
		btnNewButton_2.setPreferredSize(new Dimension(100, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		panel_1_2.add(btnNewButton_2, BorderLayout.EAST);
		
		JLabel lblNewLabel_4_1_3_1_1 = new JLabel("Người quản lý");
		lblNewLabel_4_1_3_1_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_4_1_3_1_1.setOpaque(true);
		lblNewLabel_4_1_3_1_1.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_4_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_3_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_2.add(lblNewLabel_4_1_3_1_1, BorderLayout.WEST);
		
		textField_2 = new JTextField();
		panel_1_2.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_20.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(4, 4));
		
		JLabel lblNewLabel_1 = new JLabel("DANH SÁCH NHÂN VIÊN");
		lblNewLabel_1.setBackground(Color.BLACK);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setPreferredSize(new Dimension(200, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setOpaque(false);
		
		table = new JTable();
		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"M\u00C3 NH\u00C2N VI\u00CAN", "T\u00CAN NH\u00C2N VI\u00CAN", "M\u00C3 QU\u1EA2N L\u00DD", "CH\u1EE8C V\u1EE4", "S\u1ED0 \u0110I\u1EC6N THO\u1EA0I", "M\u1EACT KH\u1EA8U", "NG\u00C0Y SINH", "T\u00CCNH TR\u1EA0NG", "CCCD", "GI\u1EDAI T\u00CDNH", "\u0110\u1ECAA CH\u1EC8", "H\u1EC6 S\u1ED0 L\u01AF\u01A0NG"
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			};
		table.setModel(model);
		scrollPane.setViewportView(table);

		updateViewEmployees();
		
	}

	private void updateViewEmployees() {
		for (NhanVien a : NhanVien_Dao.getAllDB()) {
			System.out.println(a);
		}
		
	}

}
