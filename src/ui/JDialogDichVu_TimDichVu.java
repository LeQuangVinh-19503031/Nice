package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class JDialogDichVu_TimDichVu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;

	/**
	 * Create the dialog.
	 */
	public JDialogDichVu_TimDichVu(){
		getContentPane().setBackground(new Color(222, 184, 135));
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("Tìm dịch vụ");
		setBounds((size.width / 8) * 2, (size.height / 7) * 2, 520, 615);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(222, 184, 135));
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
				JLabel lblNewLabel = new JLabel("TÌM DỊCH VỤ");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setPreferredSize(new Dimension(200, 30));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBackground(new Color(255, 255, 255));
			panel.setPreferredSize(new Dimension(300, 10));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
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
				panel_1.setOpaque(false);
				panel_1.setBackground(new Color(255, 250, 250));
				panel_1.setPreferredSize(new Dimension(250, 10));
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new GridLayout(0, 2, 10, 10));
				{
					JLabel lblNewLabel_1 = new JLabel("Mã sản phẩm");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
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
					JLabel lblNewLabel_1 = new JLabel("Loại sản phẩm");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
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
					JLabel lblNewLabel_1 = new JLabel("Tên sản phẩm");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
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
					JLabel lblNewLabel_2 = new JLabel("Tình trạng");
					lblNewLabel_2.setBackground(Color.WHITE);
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1_1.setOpaque(false);
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(1, 1, 4, 0));
					{
						JRadioButton rdbtnNewRadioButton = new JRadioButton("Còn hàng");
						rdbtnNewRadioButton.setBorderPainted(true);
						rdbtnNewRadioButton.setBorder(new LineBorder(new Color(0, 0, 0)));
						rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnNewRadioButton.setBackground(Color.WHITE);
						rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(rdbtnNewRadioButton);
					}
					{
						JRadioButton rdbtnangSDng = new JRadioButton("Hết hàng");
						rdbtnangSDng.setBorderPainted(true);
						rdbtnangSDng.setBorder(new LineBorder(new Color(0, 0, 0)));
						rdbtnangSDng.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnangSDng.setBackground(Color.WHITE);
						rdbtnangSDng.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(rdbtnangSDng);
					}
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Giá lớn hơn");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_5 = new JTextField();
					panel_1.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Giá nhỏ hơn");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_6 = new JTextField();
					panel_1.add(textField_6);
					textField_6.setColumns(10);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Ngày nhập");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
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
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new EmptyBorder(2, 0, 2, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setVgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnTmKim = new JButton("TÌM KIẾM");
				btnTmKim.setPreferredSize(new Dimension(300, 30));
				btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnTmKim.setActionCommand("OK");
				buttonPane.add(btnTmKim);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.setPreferredSize(new Dimension(150, 30));
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
