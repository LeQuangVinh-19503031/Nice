package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import dao.ChiTietHoaDon_Dao;
import dao.ChiTietPhieuDatPhong_Dao;
import dao.HoaDon_Dao;
import dao.KhachHang_Dao;
import dao.PhieuDatPhong_Dao;
import dao.Phong_Dao;
import entity.ChiTietPhieuDP;
import entity.Phong;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class JDialogPhong_DatPhong extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final GD_Phong homeFrm;
	private JTextField txt_KH;
	private Phong room;

	/**
	 * Create the dialog.
	 */
	public JDialogPhong_DatPhong(GD_Phong homeFrm2, Phong room) {
		this.room = room;
		this.homeFrm = homeFrm2;
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		Point p = MouseInfo.getPointerInfo().getLocation();
		setTitle("ĐẶT PHÒNG");
		setBounds(size.width / 5 * 2, size.height / 3, 400, 500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(222, 184, 135));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBackground(new Color(255, 255, 255));
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(0, 2, 4, 4));
			{
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				JLabel lblThiGianVo = new JLabel(now.format(dtf).formatted(dtf));
				lblThiGianVo.setForeground(Color.WHITE);
				lblThiGianVo.setBackground(Color.BLACK);
				lblThiGianVo.setOpaque(true);
				lblThiGianVo.setHorizontalAlignment(SwingConstants.CENTER);
				lblThiGianVo.setFont(new Font("Dialog", Font.BOLD, 18));
				lblThiGianVo.setBorder(new LineBorder(Color.WHITE));
				panel.add(lblThiGianVo);
			}
			{
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				JLabel lblA = new JLabel(now.format(df));
				lblA.setForeground(Color.WHITE);
				lblA.setBackground(Color.BLACK);
				lblA.setOpaque(true);
				lblA.setHorizontalAlignment(SwingConstants.CENTER);
				lblA.setFont(new Font("Dialog", Font.BOLD, 18));
				lblA.setBorder(new LineBorder(Color.WHITE));
				panel.add(lblA);
			}
			{
				JLabel lblNewLabel = new JLabel("Tên Phòng");
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel = new JLabel(room.getTenPhong());
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel.add(lblNewLabel);
			}
			{
				JLabel lblLoiPhng = new JLabel("Loại Phòng");
				lblLoiPhng.setBackground(Color.WHITE);
				lblLoiPhng.setOpaque(true);
				lblLoiPhng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblLoiPhng.setHorizontalAlignment(SwingConstants.CENTER);
				lblLoiPhng.setFont(new Font("Dialog", Font.PLAIN, 15));
				panel.add(lblLoiPhng);
			}
			{
				JLabel lblNewLabel = new JLabel(room.getLoaiPhong());
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panel.add(lblNewLabel);
			}
			{
				JLabel lblSNgi = new JLabel("Số Người");
				lblSNgi.setBackground(Color.WHITE);
				lblSNgi.setOpaque(true);
				lblSNgi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblSNgi.setHorizontalAlignment(SwingConstants.CENTER);
				lblSNgi.setFont(new Font("Dialog", Font.PLAIN, 15));
				panel.add(lblSNgi);
			}
			{
				JLabel lblNewLabel = new JLabel(covertPriceToSizeRoom(room.getGiaPhong()));
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panel.add(lblNewLabel);
			}
			{
				JLabel lblGiPhng = new JLabel("Giá Phòng");
				lblGiPhng.setBackground(Color.WHITE);
				lblGiPhng.setOpaque(true);
				lblGiPhng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblGiPhng.setHorizontalAlignment(SwingConstants.CENTER);
				lblGiPhng.setFont(new Font("Dialog", Font.PLAIN, 15));
				panel.add(lblGiPhng);
			}
			{
				JLabel lblNewLabel = new JLabel(room.getGiaPhong() + "");
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panel.add(lblNewLabel);
			}
			{
				JLabel lblTnhTrng = new JLabel("Tình Trạng");
				lblTnhTrng.setBackground(Color.WHITE);
				lblTnhTrng.setOpaque(true);
				lblTnhTrng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblTnhTrng.setHorizontalAlignment(SwingConstants.CENTER);
				lblTnhTrng.setFont(new Font("Dialog", Font.PLAIN, 15));
				panel.add(lblTnhTrng);
			}
			{
				JLabel lblNewLabel = new JLabel(room.getTinhTrang());
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panel.add(lblNewLabel);
			}
			{
				JLabel lblSdtKhchHng = new JLabel("Sdt Khách Hàng");
				lblSdtKhchHng.setBackground(Color.WHITE);
				lblSdtKhchHng.setOpaque(true);
				lblSdtKhchHng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				lblSdtKhchHng.setForeground(new Color(178, 34, 34));
				lblSdtKhchHng.setHorizontalAlignment(SwingConstants.CENTER);
				lblSdtKhchHng.setFont(new Font("Dialog", Font.BOLD, 15));
				panel.add(lblSdtKhchHng);
			}
			{
				txt_KH = new JTextField();
				txt_KH.setBackground(Color.WHITE);
				txt_KH.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				txt_KH.setFont(new Font("Tahoma", Font.BOLD, 18));
				panel.add(txt_KH);
				txt_KH.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new LineBorder(new Color(0, 0, 0)));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Đặt phòng");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okDatPhong();
					}
				});
				okButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				okButton.setPreferredSize(new Dimension(100, 30));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Hủy");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelDatPhong();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setPreferredSize(new Dimension(100, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			getContentPane().add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel_1 = new JLabel("ĐẶT PHÒNG");
				lblNewLabel_1.setForeground(new Color(255, 250, 250));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				panel.add(lblNewLabel_1);
			}
		}
	}

	protected void cancelDatPhong() {
		this.setVisible(false);

	}

	public void okDatPhong() {
		if (!txt_KH.getText().matches("0[0-9]{9}")) {
			if (txt_KH.getText().length() < 10) {
				JOptionPane.showMessageDialog(null, "Số diện thoại khách hàng phải đủ 10 số");
			} else if (txt_KH.getText().length() > 10) {
				JOptionPane.showMessageDialog(null, "Số diện thoại khách hàng quá dài");
			} else
				JOptionPane.showMessageDialog(null, "Số điện thoại phải bắt đầu từ 0 !");
		} else {

			if (KhachHang_Dao.search(txt_KH.getText()) == null) {
				int khtv = JOptionPane.showConfirmDialog(null, "Đăng ký khách hàng thành viên", "Đăng ký thành viên",
						JOptionPane.YES_NO_OPTION);
				if (khtv == JOptionPane.NO_OPTION) {
					// khach hang vang lai
					KhachHang_Dao.add(txt_KH.getText());
				} else {
					// dang ky them khach hang thanh vien
					JDialogKhachHang_ThemKhachHang hang = new JDialogKhachHang_ThemKhachHang(null);
					hang.setTextWhenRegisterNewCustomer(txt_KH.getText());
					hang.show();
				}
			} else {
				int n = JOptionPane.showConfirmDialog(null, "ĐẶT " + room.getTenPhong() + " ?", "Xác nhận đặt phòng",
						JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					int size = PhieuDatPhong_Dao.getAllPDP().size();
					String maPDPLast = PhieuDatPhong_Dao.getAllPDP().get(size-1).getMaPhieuDP();
					Phong_Dao.updateStatusRoom(room.getTenPhong(), "ĐANG SỬ DỤNG");
					PhieuDatPhong_Dao.add(GD_Chinh.getNVWorking(), "CHƯA THANH TOÁN");
					ChiTietPhieuDatPhong_Dao.add(maPDPLast, room.getMaPhong());
					HoaDon_Dao.add(GD_Chinh.getNVWorking(), txt_KH.getText());
					int sizeOrder = HoaDon_Dao.getAllDB().size();
					ChiTietHoaDon_Dao.add("HD"+sizeOrder, maPDPLast, null, room.getMaPhong());
					homeFrm.setList(Phong_Dao.getAllRoomDB());
					homeFrm.updateViewBook(Phong_Dao.getAllRoomDB());
					JOptionPane.showMessageDialog(null, "Đặt " + room.getTenPhong() + " thành công !");
					this.setVisible(false);
				} else
					this.setVisible(false);
			}

		}
	}

	private String checkPhoneCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public String covertPriceToSizeRoom(double price) {
		if (price > 200000)
			return "20 NGƯỜI";
		else if (price > 100000)
			return "10 NGƯỜI";
		else
			return "5 NGƯỜI";
	}

	public static void main(String[] args) {
		for (ChiTietPhieuDP a : ChiTietPhieuDatPhong_Dao.getAllDB()) {
			System.out.println(a);
		}
	}

}
