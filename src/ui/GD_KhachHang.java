package ui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import dao.KhachHang_Dao;
import entity.KhachHang;
import entity.Phong;
import java.awt.ScrollPane;
import javax.swing.GroupLayout.Alignment;
import java.awt.ComponentOrientation;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Component;
import java.awt.TextField;
import datechooser.beans.DateChooserCombo;

public class GD_KhachHang extends JPanel implements ActionListener {
	private ArrayList<Phong> list;
	private ArrayList<Rectangle> listIndex;
	private int indexRoom;
	private JPanel panelItems;
	private JDialogPhong_DatPhong dialog_DatPhong;
	private JPanel panel_Logo;
	private JPanel pnl_South;
	private JLabel lbl_TitleMain;
	private JButton btn_Feature;
	private JButton btn_Save;
	private JButton btn_Exit;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel pnl_Search;
	private JPanel pnl;
	private JPanel pnl_1;
	private JPanel pnl_Filter;
	private JPanel panel_2;
	private JPanel pnl_2;
	private JLabel lblNewLabel;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblHVTn;
	private JLabel lblTrnhTrng;
	private JTextField txtHoTen;
	private JComboBox ccb_numberPeople_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lbl_TitleMain_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblaCh;
	private JTextField txtDiaChi;
	private JTextField txtSDT;

	/**
	 * Create the panel.
	 */
	public GD_KhachHang() {
		setOpaque(false);
		setSize(new Dimension(1528, 746));
		setMinimumSize(new Dimension(1528, 746));
		setPreferredSize(new Dimension(1528, 746));
		setBounds(new Rectangle(0, 0, 1528, 746));
		listIndex = new ArrayList<>();
		list = Phong.nhapCung(100);
		setLayout(new BorderLayout(4, 4));
		
		pnl_South = new JPanel();
		pnl_South.setBorder(new LineBorder(Color.WHITE));
		pnl_South.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) pnl_South.getLayout();
		flowLayout.setHgap(30);
		pnl_South.setBackground(Color.WHITE);
		pnl_South.setForeground(Color.WHITE);
		add(pnl_South, BorderLayout.SOUTH);
		
		btn_Feature = new JButton("THÊM KHÁCH HÀNG");
		btn_Feature.setFocusable(false);
		btn_Feature.addActionListener(this);
		btn_Feature.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btn_Feature.setIcon(new ImageIcon(GD_KhachHang.class.getResource("/img_tacvu/them.png")));
		btn_Feature.setBorderPainted(false);
		btn_Feature.setPreferredSize(new Dimension(300, 40));
		btn_Feature.setBackground(Color.CYAN);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String maKH = txtMa.getText();
//				String hoTen = txtKhachHang.getText();
//				String tinhTrang = txtTinhTrang.getText();
//				String email = txtEmail.getText();
//				int cMND = Integer.parseInt(txtCM.getText());
//				String sdt = txtSDT.getText();
//				String diaChi = txtdiaChi.getText();
//				
//				KhachHang khachHangNew = new KhachHang(maKH, hoTen, tinhTrang, ngaySinh, email, cMND, sdt, diaChi);
//				
//				KhachHang_Dao khDAO = new KhachHang_Dao();
//				khDAO.addKhachHang(khachHangNew);
//				
//			}
//			
//		});
		
		pnl_South.add(btn_Feature);
		
		btn_Save = new JButton("LƯU THÔNG TIN");
		btn_Save.setFocusable(false);
		btn_Save.addActionListener(this);
		btn_Save.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btn_Save.setIcon(new ImageIcon(GD_KhachHang.class.getResource("/img_tacvu/sua.png")));
		btn_Save.setBorderPainted(false);
		btn_Save.setPreferredSize(new Dimension(320, 40));
		btn_Save.setBackground(Color.YELLOW);
		pnl_South.add(btn_Save);
		
		btn_Exit = new JButton("THOÁT");
		btn_Exit.setFocusable(false);
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn_Exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btn_Exit.setIcon(new ImageIcon(GD_KhachHang.class.getResource("/img_tacvu/thoat.png")));
		btn_Exit.setBorderPainted(false);
		btn_Exit.setPreferredSize(new Dimension(200, 40));
		btn_Exit.setBackground(Color.RED);
		pnl_South.add(btn_Exit);
		
		lbl_TitleMain = new JLabel("QUẢN LÍ KHÁCH HÀNG");
		lbl_TitleMain.setBorder(new LineBorder(Color.WHITE));
		lbl_TitleMain.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TitleMain.setPreferredSize(new Dimension(109, 30));
		add(lbl_TitleMain, BorderLayout.NORTH);
		lbl_TitleMain.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_TitleMain.setMinimumSize(new Dimension(111, 13));
		lbl_TitleMain.setMaximumSize(new Dimension(111, 13));
		lbl_TitleMain.setOpaque(true);
		lbl_TitleMain.setForeground(Color.WHITE);
		lbl_TitleMain.setBackground(Color.BLACK);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 108));
		panel.setOpaque(false);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(4, 4));
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(10, 108));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 4));
		
		pnl_Search = new JPanel();
		pnl_Search.setOpaque(false);
		pnl_Search.setBackground(Color.WHITE);
		panel_1.add(pnl_Search);
		pnl_Search.setLayout(new GridLayout(0, 2, 10, 0));
		
		pnl = new JPanel();
		pnl.setOpaque(false);
		pnl_Search.add(pnl);
		pnl.setLayout(new BorderLayout(5, 0));
		
		lblNewLabel = new JLabel("SĐT");
		lblNewLabel.setPreferredSize(new Dimension(120, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setBackground(new Color(255, 140, 0));
		pnl.add(lblNewLabel, BorderLayout.WEST);
		
		txtSDT = new JTextField();
		txtSDT.setHorizontalAlignment(SwingConstants.CENTER);
		txtSDT.setFont(new Font("Dialog", Font.BOLD, 16));
		txtSDT.setColumns(10);
		txtSDT.setBorder(new LineBorder(Color.GRAY));
		pnl.add(txtSDT, BorderLayout.CENTER);
		
		pnl_1 = new JPanel();
		pnl_1.setPreferredSize(new Dimension(250, 30));
		pnl_1.setOpaque(false);
		pnl_1.setBackground(Color.WHITE);
		pnl_Search.add(pnl_1);
		pnl_1.setLayout(new BorderLayout(5, 0));
		
		btnNewButton_4 = new JButton("TÌM KIẾM");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sdt = txtSDT.getText();
				String hoTen = txtHoTen.getText();
				String diaChi = txtDiaChi.getText();
				String tinhTrang = (String) ccb_numberPeople_1.getSelectedItem();
				if(sdt.isEmpty()&& hoTen.isEmpty() && diaChi.isEmpty() && tinhTrang.isEmpty()){
					 
					JOptionPane.showMessageDialog(null, "Vui Lòng nhập thông tin cần tìm kiếm!");
					return;
					
				}else{
					
					//Tìm kiếm theo trường dữ kiệu nhập vào 
					
					KhachHang_Dao khachHang_Dao = new KhachHang_Dao();
					List<KhachHang> resultList = khachHang_Dao.getAllList();
					if( !sdt.isEmpty()) {
						resultList = resultList.stream()
								.filter(khachHang  -> khachHang.getSdt().contains(sdt))
								.collect(Collectors.toList());
					}if(!hoTen.isEmpty()) {
						resultList = resultList.stream()
								.filter(khachHang -> khachHang.getHoTenKH().toLowerCase().contains(hoTen.toLowerCase()))
								.collect(Collectors.toList());
					}if(!diaChi.isEmpty()) {
						resultList = resultList.stream()
								.filter(khachHang -> khachHang.getDiaChi().toLowerCase().contains(diaChi.toLowerCase()))
								.collect(Collectors.toList());
					}if(!tinhTrang.isEmpty()) {
						resultList = resultList.stream()
								.filter(khachHang ->khachHang.getTinhTrang() != null && khachHang.getTinhTrang().equalsIgnoreCase(tinhTrang))
								.collect(Collectors.toList());
					}
					
					//Hiển thị kết quả tìm được
					displayDataInTable(resultList);
					
				}
			}
		});
		btnNewButton_4.setFocusable(false);
//		btnNewButton_4.setIcon(new ImageIcon(GD_KhachHang.class.getResource("/img_tacvu/search11.png")));
		btnNewButton_4.setPreferredSize(new Dimension(150, 30));
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_1.add(btnNewButton_4, BorderLayout.EAST);
		
		lblHVTn = new JLabel("HỌ VÀ TÊN");
		lblHVTn.setPreferredSize(new Dimension(120, 0));
		lblHVTn.setOpaque(true);
		lblHVTn.setHorizontalAlignment(SwingConstants.CENTER);
		lblHVTn.setFont(new Font("Dialog", Font.BOLD, 16));
		lblHVTn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHVTn.setBackground(new Color(255, 140, 0));
		pnl_1.add(lblHVTn, BorderLayout.WEST);
		
		txtHoTen = new JTextField();
		txtHoTen.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoTen.setFont(new Font("Dialog", Font.BOLD, 16));
		txtHoTen.setColumns(10);
		txtHoTen.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnl_1.add(txtHoTen, BorderLayout.CENTER);
		
		pnl_Filter = new JPanel();
		pnl_Filter.setOpaque(false);
		pnl_Filter.setBackground(Color.WHITE);
		panel_1.add(pnl_Filter);
		pnl_Filter.setLayout(new GridLayout(1, 4, 10, 0));
		
		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBackground(Color.WHITE);
		pnl_Filter.add(panel_2);
		panel_2.setLayout(new BorderLayout(4, 4));
		
		lblaCh = new JLabel("ĐỊA CHỈ");
		lblaCh.setPreferredSize(new Dimension(120, 0));
		lblaCh.setOpaque(true);
		lblaCh.setHorizontalAlignment(SwingConstants.CENTER);
		lblaCh.setFont(new Font("Dialog", Font.BOLD, 16));
		lblaCh.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblaCh.setBackground(new Color(255, 140, 0));
		panel_2.add(lblaCh, BorderLayout.WEST);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiaChi.setFont(new Font("Dialog", Font.BOLD, 16));
		txtDiaChi.setColumns(10);
		txtDiaChi.setBorder(new LineBorder(Color.GRAY));
		panel_2.add(txtDiaChi, BorderLayout.CENTER);
		
		pnl_2 = new JPanel();
		pnl_2.setPreferredSize(new Dimension(400, 30));
		pnl_2.setOpaque(false);
		pnl_2.setBackground(Color.WHITE);
		pnl_Filter.add(pnl_2);
		pnl_2.setLayout(new BorderLayout(5, 0));
		
		btnNewButton_5 = new JButton("LÀM MỚI");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSDT.setText("");
				txtHoTen.setText("");
				txtDiaChi.setText("");
				ccb_numberPeople_1.setSelectedItem(null);
				txtSDT.requestFocus();
				
				loadDataFromDatabase();
			}
		});
		btnNewButton_5.setFocusable(false);
//		btnNewButton_5.setIcon(new ImageIcon(GD_KhachHang.class.getResource("/img_tacvu/quaylai.png")));
		btnNewButton_5.setPreferredSize(new Dimension(150, 30));
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_2.add(btnNewButton_5, BorderLayout.EAST);
		
		lblTrnhTrng = new JLabel("TÌNH TRẠNG");
		lblTrnhTrng.setPreferredSize(new Dimension(120, 0));
		lblTrnhTrng.setOpaque(true);
		lblTrnhTrng.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrnhTrng.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTrnhTrng.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTrnhTrng.setBackground(new Color(255, 140, 0));
		pnl_2.add(lblTrnhTrng, BorderLayout.WEST);
		
		ccb_numberPeople_1 = new JComboBox();
		ccb_numberPeople_1.setEditable(true);
		ccb_numberPeople_1.setFocusable(false);
		ccb_numberPeople_1.setModel(new DefaultComboBoxModel(new String[] {"", "KHÁCH HÀNG THÀNH VIÊN ", "KHÁCH HÀNG CHƯA ĐĂNG KÍ", "KHÁCH HÀNG HẠN CHẾ"}));
		ccb_numberPeople_1.setToolTipText("");
		ccb_numberPeople_1.setFont(new Font("Dialog", Font.BOLD, 16));
		ccb_numberPeople_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnl_2.add(ccb_numberPeople_1, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(4, 4));
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lbl_TitleMain_1 = new JLabel("DANH SÁCH KHÁCH HÀNG");
		lbl_TitleMain_1.setBorder(new LineBorder(Color.WHITE));
		lbl_TitleMain_1.setPreferredSize(new Dimension(350, 30));
		lbl_TitleMain_1.setOpaque(true);
		lbl_TitleMain_1.setMinimumSize(new Dimension(111, 13));
		lbl_TitleMain_1.setMaximumSize(new Dimension(111, 13));
		lbl_TitleMain_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TitleMain_1.setForeground(Color.WHITE);
		lbl_TitleMain_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_TitleMain_1.setBackground(Color.BLACK);
		panel_4.add(lbl_TitleMain_1, BorderLayout.WEST);
		
		scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setRowHeight(22);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"SỐ ĐIỆN THOẠI", "HỌ VÀ TÊN", "NGÀY SINH", "ĐỊA CHỈ", "EMAIL", "TÌNH TRẠNG"
			}
		));
		scrollPane.setViewportView(table);
		
		//Load dữ liệu lên data
		loadDataFromDatabase();
	}

	public void changeTitleWhenAdd() {
		lbl_TitleMain.setText("THÊM KHÁCH HÀNG");
		btn_Feature.setText("THÊM MỚI");
		
	}
	
	public void changeTitleWhenFix() {
		lbl_TitleMain.setText("SỬA KHÁCH HÀNG");
		btn_Feature.setText("SỬA");
	}
	// Hàm LoadData
	public void loadDataFromDatabase() {
		KhachHang_Dao khachHang_Dao = new KhachHang_Dao();
		List<KhachHang> khList = khachHang_Dao.getAllList();
		
		//Hiển thị dữ liệu vào bảng
		displayDataInTable(khList);
	}
	//Hàm tìm kiếm khách hàng theo trường dữ liệu đầu vào
//	public List<KhachHang> searchKhachHang(String sdt, String hoTen, String diaChi, String tinhTrang) {
//		KhachHang_Dao khachHang_Dao = new KhachHang_Dao();
//		List<KhachHang> khList = khachHang_Dao.getAllList();
//		List<KhachHang> resultKHList =   new ArrayList<>();
//		
//		for (KhachHang khachHang : resultKHList) {
//			if((sdt.isEmpty() || sdt.equals(sdt)) 
//			    && (hoTen.isEmpty() || hoTen.equals(hoTen))
//			    &&(diaChi.isEmpty() || diaChi.equals(diaChi))
//			    &&(tinhTrang.isEmpty() || tinhTrang.equals(tinhTrang))){
//				
//				resultKHList.add(khachHang);
//			}
//		}
//		return resultKHList;
//	}
	//Hàm hiển thị dữ liệu vào bảng
	public void displayDataInTable(List<KhachHang> khList) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		for (KhachHang khachHang : khList) {
			if(khachHang.getNgaySinh() != null) {
				model.addRow(new Object[] {
						khachHang.getSdt(),
						khachHang.getHoTenKH(),
						dateFormat.format(khachHang.getNgaySinh()),
						khachHang.getDiaChi(),
						khachHang.getEmail(),
						khachHang.getTinhTrang()
				});
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equalsIgnoreCase("THÊM KHÁCH HÀNG")) {
			JDialogKhachHang_ThemKhachHang hang = new JDialogKhachHang_ThemKhachHang(this);
			hang.show();
		}else if(cmd.equalsIgnoreCase("SỬA")) {
//			JOptionPane.showMessageDialog(null, "");
		}else if(cmd.equalsIgnoreCase("LƯU THÔNG TIN")) {

		}
		
	}
}
