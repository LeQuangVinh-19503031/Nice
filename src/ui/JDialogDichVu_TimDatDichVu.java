package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDialogDichVu_TimDatDichVu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private GD_DichVu home;
	private String ten;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public JDialogDichVu_TimDatDichVu(GD_DichVu home) {
		this.home = home;
		setTitle("Tìm đặt dịch vụ");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		Dimension screenSizr = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(screenSizr.width/6, screenSizr.height/6, screenSizr.width/6*4, screenSizr.height/6*4);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(222, 184, 135));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(4, 4));
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.WEST);
			panel.setLayout(new BorderLayout(4, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setOpaque(false);
				panel_1.setPreferredSize(new Dimension(130, 50));
				panel.add(panel_1, BorderLayout.WEST);
				panel_1.setLayout(new BorderLayout(4, 0));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setOpaque(false);
					panel_1.add(panel_2, BorderLayout.CENTER);
					panel_2.setLayout(new BorderLayout(0, 4));
					{
						JPanel panel_1_1 = new JPanel();
						panel_1_1.setOpaque(false);
						panel_2.add(panel_1_1, BorderLayout.CENTER);
						panel_1_1.setBackground(Color.WHITE);
						panel_1_1.setLayout(new GridLayout(0, 1, 0, 10));
						{
							JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn");
							lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
							lblNewLabel_1.setBackground(new Color(255, 255, 255));
							lblNewLabel_1.setOpaque(true);
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Số phòng");
							lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
							lblNewLabel_1.setBackground(new Color(255, 255, 255));
							lblNewLabel_1.setOpaque(true);
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Thời gian lập");
							lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
							lblNewLabel_1.setBackground(new Color(255, 255, 255));
							lblNewLabel_1.setOpaque(true);
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Tình trạng");
							lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
							lblNewLabel_1.setBackground(new Color(255, 255, 255));
							lblNewLabel_1.setOpaque(true);
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(lblNewLabel_1);
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Mã NV lập");
							lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
							lblNewLabel_1.setBackground(new Color(255, 255, 255));
							lblNewLabel_1.setOpaque(true);
							lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
							panel_1_1.add(lblNewLabel_1);
						}
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_2 = new JLabel("NHẬP THÔNG TIN CẦN TÌM");
					lblNewLabel_2.setBorder(new LineBorder(Color.WHITE));
					lblNewLabel_2.setBackground(Color.BLACK);
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setForeground(Color.WHITE);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setPreferredSize(new Dimension(43, 30));
					panel_1.add(lblNewLabel_2);
				}
			}
			{
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setOpaque(false);
				panel.add(panel_1_1, BorderLayout.CENTER);
				panel_1_1.setBackground(Color.WHITE);
				panel_1_1.setLayout(new GridLayout(0, 1, 0, 10));
				{
					textField_1 = new JTextField();
					textField_1.setHorizontalAlignment(SwingConstants.CENTER);
					textField_1.setFont(new Font("Dialog", Font.BOLD, 16));
					panel_1_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					textField_2 = new JTextField();
					textField_2.setHorizontalAlignment(SwingConstants.CENTER);
					textField_2.setFont(new Font("Dialog", Font.PLAIN, 16));
					panel_1_1.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					JPanel panel_2_1 = new JPanel();
					panel_2_1.setOpaque(false);
					panel_1_1.add(panel_2_1);
					panel_2_1.setLayout(new GridLayout(1, 0, 5, 0));
					{
						JComboBox comboBox = new JComboBox();
						comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tháng"}));
						panel_2_1.add(comboBox);
					}
					{
						JComboBox comboBox = new JComboBox();
						comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ngày"}));
						panel_2_1.add(comboBox);
					}
				}
				{
					JComboBox comboBox = new JComboBox();
					panel_1_1.add(comboBox);
				}
				{
					textField_3 = new JTextField();
					textField_3.setHorizontalAlignment(SwingConstants.CENTER);
					textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
					panel_1_1.add(textField_3);
					textField_3.setColumns(10);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setPreferredSize(new Dimension(500, 10));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(4, 4));
			{
				JLabel lblNewLabel_2 = new JLabel("KẾT QUẢ TÌM KIẾM");
				lblNewLabel_2.setPreferredSize(new Dimension(43, 30));
				lblNewLabel_2.setOpaque(true);
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_2.setForeground(Color.WHITE);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_2.setBorder(new LineBorder(Color.WHITE));
				lblNewLabel_2.setBackground(Color.BLACK);
				panel.add(lblNewLabel_2, BorderLayout.NORTH);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					table = new JTable();
					table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"M\u00C3 H\u00D3A \u0110\u01A0N", "PH\u00D2NG", "TH\u1EDCI GIAN L\u1EACP", "NG\u00C0Y L\u1EACP", "NH\u00C2N VI\u00CAN L\u1EACP", "GI\u00C1 D\u1ECACH V\u1EE4", "T\u00CCNH TR\u1EA0NG"
						}
					));
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("TÌM KIẾM");
				okButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				okButton.setPreferredSize(new Dimension(150, 30));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				cancelButton.setPreferredSize(new Dimension(150, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setBorder(new LineBorder(Color.WHITE));
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("TÌM HÓA ĐƠN ĐẶT DỊCH VỤ");
				lblNewLabel.setPreferredSize(new Dimension(135, 30));
				lblNewLabel.setBorder(new LineBorder(Color.WHITE));
				panel.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
		}
	}

	private String getGiaPhongCu() {
		String giaCu = "200.000";
		return giaCu+" VNĐ";
	}

}
