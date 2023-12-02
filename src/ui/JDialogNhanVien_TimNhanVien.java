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

public class JDialogNhanVien_TimNhanVien extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the dialog.
	 */
	public JDialogNhanVien_TimNhanVien() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(200, 300));
		setModal(true);
		Point p =  MouseInfo.getPointerInfo().getLocation();
		setTitle("Tìm kiếm nhân  viên");
		setBounds(p.x+50, p.y-100, 1051, 683);
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
				JLabel lblNewLabel = new JLabel("TÌM NHÂN VIÊN");
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
					},
					new String[] {
						"M\u00C3 PH\u00D2NG", "T\u00CAN PH\u00D2NG", "GI\u1EDAI T\u00CDNH", "NG\u00C0Y SINH", "CCCD", "CH\u1EE8C V\u1EE4", "\u0110\u1ECAA CH\u1EC8", "S\u1ED0 \u0110I\u1EC6N THO\u1EA0I", "M\u00C3 QU\u1EA2N L\u00DD", "H\u1EC6 S\u1ED0 L\u01AF\u01A0NG", "T\u00CCNH TR\u1EA0NG"
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
						JLabel lblThngTinCn = new JLabel("THÔNG TIN CẦN TÌM");
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
					JLabel lblNewLabel_3 = new JLabel("");
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("");
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Mã Nhân Viên");
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
					JLabel lblNewLabel_1 = new JLabel("Tên Nhân Viên");
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
					JLabel lblNewLabel_1 = new JLabel("Chức Vụ");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField_2.setColumns(10);
					panel_1.add(textField_2);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Hệ Số Lương");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_3 = new JTextField();
					textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField_3.setColumns(10);
					panel_1.add(textField_3);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("");
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("");
					panel_1.add(lblNewLabel_3);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EmptyBorder(2, 0, 10, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setVgap(0);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnTmKim = new JButton("TÌM KIẾM");
				btnTmKim.setPreferredSize(new Dimension(200, 30));
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
