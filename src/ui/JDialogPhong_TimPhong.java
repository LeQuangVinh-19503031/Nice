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
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class JDialogPhong_TimPhong extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the dialog.
	 */
	public JDialogPhong_TimPhong() {
		getContentPane().setBackground(new Color(222, 184, 135));
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("Tìm kiếm phòng");
		setBounds((size.width/8)*2, (size.height/7)*2, 612, 448 );
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
				JLabel lblNewLabel = new JLabel("TÌM PHÒNG");
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
					JLabel lblNewLabel_1 = new JLabel("Mã Phòng");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField = new JTextField();
					textField.setBackground(Color.WHITE);
					textField.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField.setColumns(10);
					panel_1.add(textField);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Tên Phòng");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					textField_1 = new JTextField();
					textField_1.setBackground(Color.WHITE);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					textField_1.setColumns(10);
					panel_1.add(textField_1);
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
					panel_1_1.setLayout(new GridLayout(1, 1, 0, 0));
					{
						JRadioButton rdbtnNewRadioButton = new JRadioButton("TRỐNG");
						rdbtnNewRadioButton.setBackground(Color.WHITE);
						rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(rdbtnNewRadioButton);
					}
					{
						JRadioButton rdbtnangSDng = new JRadioButton("ĐANG SỬ DỤNG");
						rdbtnangSDng.setBackground(Color.WHITE);
						rdbtnangSDng.setHorizontalAlignment(SwingConstants.CENTER);
						rdbtnangSDng.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(rdbtnangSDng);
					}
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Loại phòng");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1_1.setOpaque(false);
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(1, 1, 0, 0));
					{
						JCheckBox chckbxVip = new JCheckBox("VIP");
						chckbxVip.setBackground(Color.WHITE);
						chckbxVip.setHorizontalAlignment(SwingConstants.CENTER);
						chckbxVip.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(chckbxVip);
					}
					{
						JCheckBox chckbxNewCheckBox_1 = new JCheckBox("THƯỜNG");
						chckbxNewCheckBox_1.setBackground(Color.WHITE);
						chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
						chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(chckbxNewCheckBox_1);
					}
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Số người");
					lblNewLabel_1.setBackground(Color.WHITE);
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_1);
				}
				{
					JPanel panel_1_1 = new JPanel();
					panel_1_1.setOpaque(false);
					panel_1.add(panel_1_1);
					panel_1_1.setLayout(new GridLayout(1, 1, 0, 0));
					{
						JCheckBox chckbxNgi = new JCheckBox("5 NGƯỜI");
						chckbxNgi.setBackground(Color.WHITE);
						chckbxNgi.setHorizontalAlignment(SwingConstants.CENTER);
						chckbxNgi.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(chckbxNgi);
					}
					{
						JCheckBox chckbxNewCheckBox_1 = new JCheckBox("10 NGƯỜI");
						chckbxNewCheckBox_1.setBackground(Color.WHITE);
						chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
						chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(chckbxNewCheckBox_1);
					}
					{
						JCheckBox chckbxNewCheckBox_1 = new JCheckBox("20 NGƯỜI");
						chckbxNewCheckBox_1.setBackground(Color.WHITE);
						chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
						chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_1_1.add(chckbxNewCheckBox_1);
					}
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
				btnTmKim.setPreferredSize(new Dimension(200, 30));
				btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnTmKim.setActionCommand("OK");
				buttonPane.add(btnTmKim);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.setPreferredSize(new Dimension(70, 30));
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
