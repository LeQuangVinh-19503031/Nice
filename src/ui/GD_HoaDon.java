package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.ChiTietPhieuDatPhong_Dao;
import dao.Phong_Dao;
import entity.Phong;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class GD_HoaDon extends JPanel implements MouseListener {
	private JTable table_1;
	private ArrayList listIndex;
	private ArrayList<Phong> list;
	private JButton btnNewButton;
	private JButton btnPhngangHt;
	private JRadioButton rdbtnTtC;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_Logo;
	private JTextField textField;
	private JPanel pnl_ContainRooms;
	private int indexRoom;
	private JDialogHoaDon_ThanhToan thanhToan;
	private JDialogHoaDon_TimHoaDon timKiem;
	private JLabel lbl_Title;
	private JPanel res;
	private JPanel pnl_Status;
	private JLabel lbl_TitleMain;

	/**
	 * Create the panel.
	 */
	public GD_HoaDon() {
		listIndex = new ArrayList<>();
		list = Phong.nhapCung(100);

		setOpaque(false);
		setLayout(new BorderLayout(0, 4));

		JPanel pnl_Main = new JPanel();
		pnl_Main.setPreferredSize(new Dimension(300, 10));
		pnl_Main.setOpaque(false);
		add(pnl_Main, BorderLayout.CENTER);
		pnl_Main.setLayout(new BorderLayout(4, 4));

		JPanel pnl_TitleMain = new JPanel();
		pnl_TitleMain.setOpaque(false);
		pnl_Main.add(pnl_TitleMain, BorderLayout.NORTH);
		pnl_TitleMain.setBackground(Color.WHITE);
		pnl_TitleMain.setLayout(new GridLayout(0, 1, 0, 4));
		
		lbl_TitleMain = new JLabel("THANH TOÁN HÓA ĐƠN");
		lbl_TitleMain.setBackground(new Color(0, 0, 0));
		lbl_TitleMain.setOpaque(true);
		lbl_TitleMain.setPreferredSize(new Dimension(115, 40));
		lbl_TitleMain.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TitleMain.setForeground(Color.WHITE);
		lbl_TitleMain.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_TitleMain.setBorder(new LineBorder(new Color(255, 255, 255)));
		pnl_TitleMain.add(lbl_TitleMain);

		JPanel pnl_SearchAndListRoom = new JPanel();
		pnl_SearchAndListRoom.setOpaque(false);
		pnl_Main.add(pnl_SearchAndListRoom, BorderLayout.CENTER);
		pnl_SearchAndListRoom.setBackground(Color.WHITE);
		pnl_SearchAndListRoom.setPreferredSize(new Dimension(10, 350));
		pnl_SearchAndListRoom.setLayout(new BorderLayout(4, 4));

		JPanel pnl_Center = new JPanel();
		pnl_Center.setOpaque(false);
		pnl_Center.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Center.setBackground(new Color(0, 255, 127));
		pnl_SearchAndListRoom.add(pnl_Center, BorderLayout.CENTER);
		pnl_Center.setLayout(new BorderLayout(4, 4));

		JPanel pnl_TitleListRoom = new JPanel();
		pnl_TitleListRoom.setPreferredSize(new Dimension(10, 40));
		pnl_TitleListRoom.setBackground(Color.WHITE);
		pnl_Center.add(pnl_TitleListRoom, BorderLayout.NORTH);
		pnl_TitleListRoom.setLayout(new BorderLayout(4, 0));

		JPanel pnl_8 = new JPanel();
		pnl_8.setPreferredSize(new Dimension(400, 10));
		pnl_8.setBackground(Color.BLACK);
		pnl_TitleListRoom.add(pnl_8, BorderLayout.WEST);
		pnl_8.setLayout(new BorderLayout(0, 0));

		lbl_Title = new JLabel("DANH SÁCH PHÒNG ĐANG SỬ DỤNG");
		lbl_Title.setBorder(new LineBorder(new Color(255, 255, 255)));
		lbl_Title.setPreferredSize(new Dimension(400, 13));
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_Title.setForeground(Color.WHITE);
		pnl_8.add(lbl_Title);

		JPanel pnl_Rooms = new JPanel();
		pnl_Rooms.setOpaque(false);
		pnl_Center.add(pnl_Rooms, BorderLayout.CENTER);
		pnl_Rooms.setLayout(new BorderLayout(0, 0));

		JScrollPane scr_ListRoom = new JScrollPane();
		scr_ListRoom.setOpaque(false);
		scr_ListRoom.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scr_ListRoom.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scr_ListRoom.setPreferredSize(new Dimension(660, 764));
		pnl_Rooms.add(scr_ListRoom, BorderLayout.CENTER);

		pnl_ContainRooms = new JPanel();
		pnl_ContainRooms.setBackground(new Color(224, 255, 255));
		scr_ListRoom.setViewportView(pnl_ContainRooms);
		pnl_ContainRooms.setPreferredSize(new Dimension(70, 230 * (list.size() / 6) + 220));
		pnl_ContainRooms.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));

//////////

//////////
		JPanel pnl_North = new JPanel();
		pnl_North.setOpaque(false);
		pnl_North.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_North.setPreferredSize(new Dimension(10, 80));
		pnl_SearchAndListRoom.add(pnl_North, BorderLayout.NORTH);
		pnl_North.setLayout(new GridLayout(2, 1, 0, 4));

		JPanel pnl_Search = new JPanel();
		pnl_Search.setOpaque(false);
		pnl_Search.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Search.setBackground(new Color(255, 140, 0));
		pnl_North.add(pnl_Search);
		pnl_Search.setLayout(new BorderLayout(5, 0));

		JPanel pnl_32 = new JPanel();
		pnl_32.setOpaque(false);
		pnl_32.setPreferredSize(new Dimension(250, 30));
		pnl_Search.add(pnl_32, BorderLayout.CENTER);
		pnl_32.setLayout(new BorderLayout(4, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("Tình trạng");
		lblNewLabel_1_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setBackground(new Color(255, 140, 0));
		pnl_32.add(lblNewLabel_1_1, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		pnl_32.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 4, 0));
		
		JButton btnNewButton_1_1 = new JButton("PHÒNG TRỐNG");
		btnNewButton_1_1.setIcon(new ImageIcon(GD_HoaDon.class.getResource("/img/xanh_mini.png")));
		btnNewButton_1_1.setPreferredSize(new Dimension(250, 30));
		btnNewButton_1_1.setForeground(new Color(0, 191, 255));
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnPhngangHt_1 = new JButton("PHÒNG ĐANG SỬ DỤNG");
		btnPhngangHt_1.setIcon(new ImageIcon(GD_HoaDon.class.getResource("/img/vang_mini.png")));
		btnPhngangHt_1.setPreferredSize(new Dimension(250, 30));
		btnPhngangHt_1.setForeground(new Color(255, 69, 0));
		btnPhngangHt_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPhngangHt_1.setBorder(new LineBorder(Color.ORANGE, 2, true));
		panel_1.add(btnPhngangHt_1);
		
		JButton btnPhngangBo = new JButton("PHÒNG ĐANG BẢO TRÌ");
		btnPhngangBo.setIcon(new ImageIcon(GD_HoaDon.class.getResource("/img/do_mini.png")));
		btnPhngangBo.setPreferredSize(new Dimension(250, 30));
		btnPhngangBo.setForeground(Color.RED);
		btnPhngangBo.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPhngangBo.setBorder(new LineBorder(Color.RED, 2, true));
		btnPhngangBo.setBackground(Color.WHITE);
		panel_1.add(btnPhngangBo);
		
				JPanel panel = new JPanel();
				panel.setPreferredSize(new Dimension(500, 10));
				pnl_Search.add(panel, BorderLayout.EAST);
				panel.setOpaque(false);
				panel.setLayout(new BorderLayout(4, 0));
				
						JLabel lblNewLabel_1 = new JLabel("Số phòng");
						lblNewLabel_1.setOpaque(true);
						lblNewLabel_1.setBackground(new Color(255, 140, 0));
						lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
						lblNewLabel_1.setPreferredSize(new Dimension(100, 30));
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
						panel.add(lblNewLabel_1, BorderLayout.WEST);
						
								textField = new JTextField();
								textField.setPreferredSize(new Dimension(500, 30));
								textField.setHorizontalAlignment(SwingConstants.CENTER);
								textField.setFont(new Font("Dialog", Font.BOLD, 16));
								panel.add(textField, BorderLayout.CENTER);
								textField.setColumns(10);
								
										JButton btnNewButton_1 = new JButton("Tìm kiếm");
										panel.add(btnNewButton_1, BorderLayout.EAST);
										btnNewButton_1.setBackground(new Color(240, 248, 255));
										btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
										btnNewButton_1.setPreferredSize(new Dimension(100, 0));

		JPanel pnl_Filter = new JPanel();
		pnl_Filter.setOpaque(false);
		pnl_Filter.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Filter.setBackground(new Color(255, 140, 0));
		pnl_North.add(pnl_Filter);
		pnl_Filter.setLayout(new BorderLayout(5, 0));

		btnNewButton_2 = new JButton("Làm mới");
		btnNewButton_2.setBackground(new Color(240, 248, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_2.setPreferredSize(new Dimension(100, 0));
		pnl_Filter.add(btnNewButton_2, BorderLayout.EAST);

		JPanel pnl_34 = new JPanel();
		pnl_34.setOpaque(false);
		pnl_34.setPreferredSize(new Dimension(400, 30));
		pnl_Filter.add(pnl_34, BorderLayout.CENTER);
		pnl_34.setLayout(new GridLayout(0, 2, 5, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		pnl_34.add(panel_3);
		panel_3.setLayout(new BorderLayout(4, 0));

		JLabel lblNewLabel_3_2 = new JLabel("Loại phòng");
		lblNewLabel_3_2.setOpaque(true);
		lblNewLabel_3_2.setBackground(new Color(255, 140, 0));
		lblNewLabel_3_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_3_2.setPreferredSize(new Dimension(100, 13));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_3.add(lblNewLabel_3_2, BorderLayout.WEST);

		JPanel pnl_35 = new JPanel();
		pnl_35.setOpaque(false);
		pnl_35.setBackground(Color.WHITE);
		panel_3.add(pnl_35, BorderLayout.CENTER);
		pnl_35.setLayout(new GridLayout(1, 0, 4, 4));

		rdbtnTtC = new JRadioButton("Tất cả");
		rdbtnTtC.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnTtC.setBackground(Color.WHITE);
		rdbtnTtC.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTtC.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_35.add(rdbtnTtC);

		rdbtnNewRadioButton = new JRadioButton("VIP");
		rdbtnNewRadioButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_35.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("Thường");
		rdbtnNewRadioButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_35.add(rdbtnNewRadioButton_1);

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		pnl_34.add(panel_4);
		panel_4.setLayout(new BorderLayout(4, 0));

		JLabel lblNewLabel_3_1 = new JLabel("Số người");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_3_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_3_1.setPreferredSize(new Dimension(100, 13));
		panel_4.add(lblNewLabel_3_1, BorderLayout.WEST);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 16));

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(Color.WHITE);
		panel_4.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(1, 1, 4, 0));

		JRadioButton rdbtnNgi = new JRadioButton("5 người");
		rdbtnNgi.setBackground(new Color(255, 255, 255));
		rdbtnNgi.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNgi.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_2.add(rdbtnNgi);

		JRadioButton rdbtnNgi_1 = new JRadioButton("10 người");
		rdbtnNgi_1.setBackground(new Color(255, 255, 255));
		rdbtnNgi_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNgi_1.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_2.add(rdbtnNgi_1);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("20 người");
		rdbtnNewRadioButton_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_2.add(rdbtnNewRadioButton_1_1);

		updateRoomsDataBaseInView();
	}

	public void updateRoomsDataBaseInView() {

		list = Phong_Dao.getAllRoomDB();
		ChiTietPhieuDatPhong_Dao.changeStatusRoomsBooked();
		pnl_ContainRooms.removeAll();
		pnl_ContainRooms.setPreferredSize(new Dimension(70, 230 * (list.size() / 6) + 270 ));
		pnl_ContainRooms.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
		
		Collections.sort(list, (o1, o2) -> (
				Integer.parseInt(o1.getMaPhong(), 1, o1.getMaPhong().length(), 10) -
				Integer.parseInt(o2.getMaPhong(), 1, o2.getMaPhong().length(), 10) 
				));

		for (Phong items : list) {
			JPanel panelItems = new JPanel(new BorderLayout());
			panelItems.setOpaque(false);
			panelItems.setPreferredSize(new Dimension(200, 220));
//			System.out.println(items);
			panelItems.add(createViewRoom(items, items.getTinhTrang()));
			pnl_ContainRooms.add(panelItems);
			panelItems.addMouseListener(this);

		}
	}
	
	public JPanel createViewRoom(Phong items, String tt) {
		res = new JPanel();
		res.setOpaque(false);
		res.setLayout(new BorderLayout(4, 4));

		JPanel pnl_Name = new JPanel();
		res.add(pnl_Name, BorderLayout.NORTH);
		pnl_Name.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(items.getTenPhong());
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setPreferredSize(new Dimension(35, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.GRAY);
		pnl_Name.add(lblNewLabel);

		JPanel pnl_Price = new JPanel();
		pnl_Price.setOpaque(false);
		res.add(pnl_Price, BorderLayout.SOUTH);
		pnl_Price.setLayout(new GridLayout(0, 2, 4, 0));

		JLabel lblGiPhng = new JLabel("GIÁ PHÒNG");
		lblGiPhng.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblGiPhng.setPreferredSize(new Dimension(35, 30));
		lblGiPhng.setOpaque(true);
		lblGiPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiPhng.setForeground(Color.WHITE);
		lblGiPhng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGiPhng.setBackground(Color.GRAY);
		pnl_Price.add(lblGiPhng);

		JLabel lblGiPhng_1 = new JLabel(items.getGiaPhong() + "");
		lblGiPhng_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblGiPhng_1.setPreferredSize(new Dimension(35, 30));
		lblGiPhng_1.setOpaque(true);
		lblGiPhng_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiPhng_1.setForeground(Color.WHITE);
		lblGiPhng_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGiPhng_1.setBackground(Color.GRAY);
		pnl_Price.add(lblGiPhng_1);

		pnl_Status = new JPanel();
		res.add(pnl_Status, BorderLayout.CENTER);
		pnl_Status.setLayout(new CardLayout(0, 0));

		JLabel lbl_Xanh = new JLabel("");
		lbl_Xanh.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbl_Xanh.setBackground(Color.WHITE);
		lbl_Xanh.setOpaque(true);
		lbl_Xanh.setIcon(new ImageIcon(TEST.class.getResource("/img/xanh.png")));
		lbl_Xanh.setHorizontalAlignment(SwingConstants.CENTER);
		pnl_Status.add(lbl_Xanh, "name_xanh");

		JLabel lbl_Đo = new JLabel("");
		lbl_Đo.setIcon(new ImageIcon(TEST.class.getResource("/img/do.png")));
		lbl_Đo.setOpaque(true);
		lbl_Đo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Đo.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbl_Đo.setBackground(Color.WHITE);
		pnl_Status.add(lbl_Đo, "name_do");

		JLabel lbl_Vang = new JLabel("");
		lbl_Vang.setIcon(new ImageIcon(TEST.class.getResource("/img/vang.png")));
		lbl_Vang.setOpaque(true);
		lbl_Vang.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Vang.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbl_Vang.setBackground(Color.WHITE);
		pnl_Status.add(lbl_Vang, "name_vang");

		if (tt.equalsIgnoreCase("Đang sử dụng")) {
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_vang");
		} else if (tt.equalsIgnoreCase("Trống")) {
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_xanh");
		} else if (tt.equalsIgnoreCase("BẢO TRÌ")){
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_do");
		}

		return res;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Rectangle rect = ((JPanel) e.getSource()).getBounds();
//		System.out.println(rect.x+", "+rect.y+", "+rect.width+", "+rect.height);
		// create grid index room
		for (int cot = 1; cot <= (int) list.size() / 6; cot++) {
			for (int hang = 1; hang <= 6; hang++) {
				Rectangle a = new Rectangle(50 + (hang - 1) * 250, 20 + (cot - 1) * 240, 200, 220);
//				System.out.println(a.x+", "+ a.y+", "+ a.width+", "+ a.height);
				listIndex.add(a);
			}
		}
		Rectangle src = ((JPanel) e.getSource()).getBounds();
		indexRoom = listIndex.indexOf(src) + 1;

		if (lbl_TitleMain.getText().equals("THANH TOÁN HÓA ĐƠN")) {
			if (thanhToan != null)
				thanhToan.hide();
			thanhToan = new JDialogHoaDon_ThanhToan(indexRoom+"");
			thanhToan.show();
		}else if(lbl_TitleMain.getText().equals("TÌM KIẾM HÓA ĐƠN ĐẶT PHÒNG")){
			if (timKiem != null)
				timKiem.show();
			else {
				timKiem = new JDialogHoaDon_TimHoaDon();
				timKiem.show();
			}
			if (thanhToan != null)
				thanhToan.hide();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void usingFeaturePaymentOrders() {
		changeTitleWhenPaymentOrders();

	}

	public void changeTitleWhenPaymentOrders() {
		lbl_TitleMain.setText("THANH TOÁN HÓA ĐƠN");

	}

	public void changeTitleWhenSearchOrders() {
		lbl_TitleMain.setText("TÌM KIẾM HÓA ĐƠN");
	}

	@SuppressWarnings("deprecation")
	public void usingFeatureSearchORders() {
		changeTitleWhenSearchOrders();
		if (timKiem != null)
			timKiem.show();
		else {
			timKiem = new JDialogHoaDon_TimHoaDon();
			timKiem.show();
		}
		if (thanhToan != null)
			thanhToan.hide();
	}

	public void usingFeatureFixOrdersBookRoom() {
		lbl_TitleMain.setText("SỬA HÓA ĐƠN ĐẶT PHÒNG");
		lbl_Title.setText("DANH SÁCH PHÒNG");
	}

}
