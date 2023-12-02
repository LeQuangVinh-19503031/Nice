package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class JdialogHeThong_ThongTinCaNhan extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdialogHeThong_ThongTinCaNhan dialog = new JdialogHeThong_ThongTinCaNhan();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdialogHeThong_ThongTinCaNhan() {
		setTitle("Thông tin nhân viên");
		setBounds(100, 100, 977, 556);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(4, 4));
		{
			JLabel lblNewLabel = new JLabel("THÔNG TIN CÁ NHÂN");
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setOpaque(true);
			lblNewLabel.setPreferredSize(new Dimension(100, 30));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			contentPanel.add(lblNewLabel, BorderLayout.NORTH);
		}
		{
			JPanel panel_TTNV = new JPanel();
			panel_TTNV.setBorder(null);
			panel_TTNV.setBackground(Color.WHITE);
			contentPanel.add(panel_TTNV, BorderLayout.CENTER);
			panel_TTNV.setLayout(new GridLayout(7, 0, 0, 5));
			{
				JPanel panel_row1 = new JPanel();
				panel_row1.setBackground(Color.WHITE);
				panel_TTNV.add(panel_row1);
				panel_row1.setLayout(new GridLayout(0, 2, 10, 0));
				{
					JPanel panel_10_1 = new JPanel();
					panel_10_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_10_1.setBackground(Color.WHITE);
					panel_row1.add(panel_10_1);
					panel_10_1.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Mã nhân viên:");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_10_1.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
				{
					JPanel panel_9_1 = new JPanel();
					panel_9_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_9_1.setBackground(Color.WHITE);
					panel_row1.add(panel_9_1);
					panel_9_1.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Họ và tên");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_9_1.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
			}
			{
				JPanel panel_28 = new JPanel();
				panel_28.setBackground(UIManager.getColor("Button.background"));
				panel_TTNV.add(panel_28);
				panel_28.setLayout(new GridLayout(1, 0, 10, 0));
				{
					JPanel panel_29 = new JPanel();
					panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_28.add(panel_29);
					panel_29.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Chức vụ");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_29.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
				{
					JPanel panel_30 = new JPanel();
					panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_30.setBackground(UIManager.getColor("Button.background"));
					panel_28.add(panel_30);
					panel_30.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Tên người quản lý");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_30.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
			}
			{
				JPanel panel_row2 = new JPanel();
				panel_row2.setBackground(Color.WHITE);
				panel_TTNV.add(panel_row2);
				panel_row2.setLayout(new GridLayout(0, 2, 10, 0));
				{
					JPanel panel_26 = new JPanel();
					panel_26.setOpaque(false);
					panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_row2.add(panel_26);
					panel_26.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Giới tính");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_26.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
				{
					JPanel panel_12_1 = new JPanel();
					panel_12_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_12_1.setBackground(Color.WHITE);
					panel_row2.add(panel_12_1);
					panel_12_1.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("CCCD");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_12_1.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
			}
			{
				JPanel panel_17 = new JPanel();
				panel_TTNV.add(panel_17);
				panel_17.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_4 = new JLabel("Đại chỉ");
					lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_17.add(lblNewLabel_4, BorderLayout.WEST);
				}
			}
			{
				JPanel panel_row2_1_1 = new JPanel();
				panel_row2_1_1.setBackground(Color.WHITE);
				panel_TTNV.add(panel_row2_1_1);
				panel_row2_1_1.setLayout(new GridLayout(1, 0, 10, 0));
				{
					JPanel panel_26_1 = new JPanel();
					panel_26_1.setOpaque(false);
					panel_26_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_row2_1_1.add(panel_26_1);
					panel_26_1.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Số điện thoại");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_26_1.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
				{
					JPanel panel_27_1 = new JPanel();
					panel_27_1.setOpaque(false);
					panel_27_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_row2_1_1.add(panel_27_1);
					panel_27_1.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Tình trạng");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_27_1.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
			}
			{
				JPanel panel_row2_1_2 = new JPanel();
				panel_row2_1_2.setBackground(Color.WHITE);
				panel_TTNV.add(panel_row2_1_2);
				panel_row2_1_2.setLayout(new GridLayout(1, 0, 10, 0));
				{
					JPanel panel_26_2 = new JPanel();
					panel_26_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_row2_1_2.add(panel_26_2);
					panel_26_2.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Hệ số lương");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_26_2.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
				{
					JPanel panel_27_2 = new JPanel();
					panel_27_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_row2_1_2.add(panel_27_2);
					panel_27_2.setLayout(new BorderLayout(10, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("Ngày sinh");
						lblNewLabel_4.setPreferredSize(new Dimension(100, 13));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
						panel_27_2.add(lblNewLabel_4, BorderLayout.WEST);
					}
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
