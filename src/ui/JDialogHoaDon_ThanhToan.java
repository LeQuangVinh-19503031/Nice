package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.ChiTietHoaDon_Dao;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;

public class JDialogHoaDon_ThanhToan extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public JDialogHoaDon_ThanhToan(String ten) {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setPreferredSize(new Dimension(200, 300));
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Thanh toán hóa đơn");
		setBounds(size.width/5, size.height/5, size.width/5*3, size.height/5*3);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 4));
		{
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setBackground(Color.BLACK);
			contentPanel.add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel_1 = new JLabel("THÔNG TIN THANH TOÁN");
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(10, 0));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setOpaque(false);
				panel_1.setPreferredSize(new Dimension(200, 10));
				panel.add(panel_1, BorderLayout.WEST);
				panel_1.setLayout(new GridLayout(0, 1, 0, 10));
				{
					JLabel lblNewLabel_2 = new JLabel("Mã hóa đơn");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Khách hàng");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Nhân viên lập");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Thời gian");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Phòng số");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Thời gian thuê phòng (phút)");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Tiền thuê phòng");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Tiền dịch vụ");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Giảm giá");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Tổng thanh toán");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setOpaque(false);
				panel_1.setPreferredSize(new Dimension(100, 10));
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new GridLayout(0, 1, 0, 10));
				{
					JLabel lblNewLabel_2 = new JLabel();
					lblNewLabel_2.setText("HD02");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("0985189541");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("NV1");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					LocalDateTime now = LocalDateTime.now();
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					JLabel lblNewLabel_2 = new JLabel(now.format(dtf));
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("PHÒNG "+ten);
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("180");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("220000");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("0");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("5 %");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("660000");
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setForeground(Color.BLUE);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_1.add(lblNewLabel_2);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.SOUTH);
			panel.setLayout(new BorderLayout(10, 0));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setPreferredSize(new Dimension(130, 10));
				panel_1.setBackground(Color.BLACK);
				panel.add(panel_1, BorderLayout.WEST);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_1 = new JLabel("SAU KHI GIẢM GIÁ");
					panel_1.add(lblNewLabel_1);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setForeground(Color.WHITE);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				}
			}
			{
				JLabel lblNewLabel = new JLabel("594.000");
				lblNewLabel.setForeground(Color.RED);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel, BorderLayout.CENTER);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("VND");
				lblNewLabel_2.setPreferredSize(new Dimension(70, 13));
				lblNewLabel_2.setSize(new Dimension(70, 0));
				lblNewLabel_2.setOpaque(true);
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel.add(lblNewLabel_2, BorderLayout.EAST);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EmptyBorder(5, 0, 5, 0));
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnInHan = new JButton("IN HÓA ĐƠN");
				btnInHan.setPreferredSize(new Dimension(100, 30));
				btnInHan.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnInHan.setActionCommand("OK");
				buttonPane.add(btnInHan);
			}
			{
				JButton okButton = new JButton("THANH TOÁN");
				okButton.setFont(new Font("Tahoma", Font.BOLD, 10));
				okButton.setPreferredSize(new Dimension(100, 30));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 10));
				cancelButton.setPreferredSize(new Dimension(100, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
