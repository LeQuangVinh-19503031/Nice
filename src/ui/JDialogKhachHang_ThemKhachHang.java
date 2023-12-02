package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import entity.KhachHang;
import dao.KhachHang_Dao;
import ui.GD_KhachHang;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogKhachHang_ThemKhachHang extends JDialog {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private GD_KhachHang gd_KhachHang;
	private KhachHang khachHang;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblKhachHang_1;
	private JLabel lblKhachHang_2;
	private JLabel lblKhachHang_3;
	private JLabel lblKhachHang_5;
	private JLabel lblKhachHang_6;
	private JLabel lblKhachHang_7;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private JTextField txtDiaChi;
	private JLabel lblKhachHang_9;
	private JLabel lblKhachHang_10;
	private JPanel panel_4;
	private JPanel panel_3;
	private JLabel lblNewLabel_1;
	private JTextField txtHoTen;
	private JDateChooser dateChooser_2;
	private JTextField txtTinhTrang;

	/**
	 * Create the dialog.
	 */
	public JDialogKhachHang_ThemKhachHang(GD_KhachHang gd_KhachHang) {
		this.gd_KhachHang = gd_KhachHang;
		setTitle("KHÁCH HÀNG");
		setModal(true);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(size.width/3, size.height/9, size.width/3, size.height/9*7);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(4);
		borderLayout.setHgap(4);
		getContentPane().setLayout(borderLayout);
		{
			JPanel pnl_South = new JPanel();
			pnl_South.setBorder(new LineBorder(Color.WHITE));
			pnl_South.setBackground(Color.BLACK);
			getContentPane().add(pnl_South, BorderLayout.SOUTH);
			
			JButton btnNewButton = new JButton("THÊM");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
					String sdt = txtSDT.getText();
					String hoTenKH = txtHoTen.getText();
					Date ngaySinh = new Date(dateChooser_2.getDate().getTime());
					String diaChi = txtDiaChi.getText();
					String email = txtEmail.getText();
					String tinhTrang = txtTinhTrang.getText();
					
					if(sdt.isEmpty() || hoTenKH.isEmpty() || ngaySinh == null || diaChi.isEmpty() || email.isEmpty() || tinhTrang.isEmpty()) {
						JOptionPane.showMessageDialog(JDialogKhachHang_ThemKhachHang.this, "Vui lòng nhập đủ thông tin khách hàng!");
						return;
					}else {
						KhachHang khachHangNew = new KhachHang(sdt, hoTenKH, ngaySinh, diaChi, email,tinhTrang);
						KhachHang_Dao khachHang_Dao = new KhachHang_Dao();
						khachHang_Dao.addKhachHang(khachHangNew);
						
						List<KhachHang> khList = khachHang_Dao.getAllList();
						JOptionPane.showInternalMessageDialog(btnNewButton, "Thêm Thành công");
						
					}
				}
			});
			btnNewButton.setFocusable(false);
//			btnNewButton.setIcon(new ImageIcon(JDialogKhachHang_ThemKhachHang.class.getResource("/img_tacvu/them.png")));
			
			JButton btnNewButton_2 = new JButton("THOÁT");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_2.setFocusable(false);
//			btnNewButton_2.setIcon(new ImageIcon(JDialogKhachHang_ThemKhachHang.class.getResource("/img_tacvu/thoat.png")));
			pnl_South.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 5));
			pnl_South.add(btnNewButton);
			pnl_South.add(btnNewButton_2);
		}
		
		lblNewLabel = new JLabel("THÊM KHÁCH HÀNG");
		lblNewLabel.setBorder(new LineBorder(Color.WHITE));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setPreferredSize(new Dimension(200, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_4.setPreferredSize(new Dimension(300, 10));
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(4, 4));
		
		panel = new JPanel();
		panel_4.add(panel, BorderLayout.CENTER);
		panel.setPreferredSize(new Dimension(300, 300));
		panel.setLayout(new BorderLayout(4, 4));
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(150, 10));
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 10));
		
		lblKhachHang_1 = new JLabel("Số điện thoại");
		lblKhachHang_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_1);
		
		lblKhachHang_3 = new JLabel("Họ và tên");
		lblKhachHang_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_3);
		
		lblKhachHang_7 = new JLabel("Ngày sinh");
		lblKhachHang_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_7);
		
		lblKhachHang_6 = new JLabel("Địa chỉ");
		lblKhachHang_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_6);
		
		lblKhachHang_5 = new JLabel("Email");
		lblKhachHang_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_5);
		
		lblKhachHang_2 = new JLabel("Tình trạng");
		lblKhachHang_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblKhachHang_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_2);
		
		lblKhachHang_9 = new JLabel("");
		lblKhachHang_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblKhachHang_9);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 10));
		
		txtSDT = new JTextField(30);
		txtSDT.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSDT.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtSDT);
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(dateChooser_2);
		
		txtDiaChi = new JTextField(30);
		txtDiaChi.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDiaChi.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtDiaChi);
		
		txtEmail = new JTextField(30);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtEmail);
		
		txtTinhTrang = new JTextField(30);
		txtTinhTrang.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtTinhTrang.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtTinhTrang);
		
		lblKhachHang_10 = new JLabel("");
		lblKhachHang_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(lblKhachHang_10);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(10, 150));
		panel_4.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon(JDialogKhachHang_ThemKhachHang.class.getResource("/img_tacvu/KhachHang14.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, BorderLayout.CENTER);

	}

	public void setTextWhenRegisterNewCustomer(String sdt) {
		txtSDT.setText(sdt);
		txtTinhTrang.setText("KHÁCH HÀNG THÀNH VIÊN");
		
	}
}
