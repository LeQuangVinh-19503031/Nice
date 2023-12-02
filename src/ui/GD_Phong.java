package ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import dao.ChiTietPhieuDatPhong_Dao;
import dao.Phong_Dao;
import entity.ChiTietPhieuDP;
import entity.Phong;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.awt.CardLayout;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Rectangle;
import javax.swing.border.SoftBevelBorder;

import connect.ConnectDB;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;

public class GD_Phong extends JPanel implements MouseListener {

	private static JPanel pnl_ContainRooms;
	private JPanel pnl_33;
	private JPanel pnl_34;
	private JPanel pnl_35;
	private JLabel lbl_TitleMain;
	private JLabel lbl_Title;
	private JButton btnNewButton;
	private JButton btnPhngangHt;
	private JLabel lblNewLabel_49;
	private JComboBox<String> ccb_numberPeople;
	private JTextField txt_SearchIdRoom;
	private JButton btnNewButton_1;
	private JButton btnPhngangBo;
	private JLabel lblNewLabel_51;
	private static ArrayList<Phong> list;
	private ArrayList<Rectangle> listIndex;
	private int indexRoom;
	private JDialogPhong_DatPhong dialog_DatPhong;
	private JButton btnNewButton_3;
	private JPanel panel;
	private JPanel panel_1;
	private JCheckBox ckb_RoomAll;
	private JCheckBox ckb_RoomVip;
	private JCheckBox ckb_RoomNormal;
	private JPanel pnl_SearchAndListRoom;
	private JScrollPane scr_ListRoom;
	private Container pnl_Rooms;
	private JPanel pnl_Center;
	private JPanel pnl_Main;
	private JPanel res;
	private JPanel pnl_Status;
	private JLabel lbl_Message;

	public ArrayList<Phong> getList() {
		return list;
	}

	public void setList(ArrayList<Phong> list) {
		this.list = list;
	}

	/**
	 * Create the panel.
	 */
	public GD_Phong() {
		setSize(new Dimension(1528, 746));
		setMinimumSize(new Dimension(1528, 746));
		setPreferredSize(new Dimension(1528, 746));
		setBounds(new Rectangle(0, 0, 1528, 746));
		listIndex = new ArrayList<>();
		list = new ArrayList<Phong>();
		ConnectDB.connect();
		list = Phong_Dao.getAllRoomDB();
		ConnectDB.disconect();

		setOpaque(false);
		setLayout(new BorderLayout(0, 4));

		pnl_Main = new JPanel();
		pnl_Main.setBorder(null);
		pnl_Main.setPreferredSize(new Dimension(300, 10));
		pnl_Main.setOpaque(false);
		add(pnl_Main, BorderLayout.CENTER);
		pnl_Main.setLayout(new BorderLayout(4, 4));

		pnl_SearchAndListRoom = new JPanel();
		pnl_Main.add(pnl_SearchAndListRoom, BorderLayout.CENTER);
		pnl_SearchAndListRoom.setOpaque(false);
		pnl_SearchAndListRoom.setBackground(Color.WHITE);
		pnl_SearchAndListRoom.setPreferredSize(new Dimension(10, 350));
		pnl_SearchAndListRoom.setLayout(new BorderLayout(4, 4));

		pnl_Center = new JPanel();
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

		lbl_Title = new JLabel("DANH SÁCH PHÒNG");
		lbl_Title.setBorder(new LineBorder(Color.WHITE));
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_Title.setForeground(Color.WHITE);
		pnl_8.add(lbl_Title);
		
		lbl_Message = new JLabel("");
		lbl_Message.setPreferredSize(new Dimension(200, 0));
		lbl_Message.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Message.setFont(new Font("Tahoma", Font.BOLD, 14));
		pnl_TitleListRoom.add(lbl_Message, BorderLayout.EAST);

		pnl_Rooms = new JPanel();
		((JComponent) pnl_Rooms).setOpaque(false);
		pnl_Center.add(pnl_Rooms, BorderLayout.CENTER);
		pnl_Rooms.setLayout(new BorderLayout(0, 0));

		scr_ListRoom = new JScrollPane();
		scr_ListRoom.setOpaque(false);
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
		pnl_North.setBackground(new Color(255, 255, 255));
		pnl_North.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_North.setPreferredSize(new Dimension(10, 80));
		pnl_SearchAndListRoom.add(pnl_North, BorderLayout.NORTH);
		pnl_North.setLayout(new GridLayout(2, 1, 0, 4));

		JPanel pnl_Search = new JPanel();
		pnl_Search.setOpaque(false);
		pnl_Search.setBackground(Color.WHITE);
		pnl_North.add(pnl_Search);
		pnl_Search.setLayout(new GridLayout(0, 2, 10, 0));

		JPanel pnl_32 = new JPanel();
		pnl_32.setOpaque(false);
		pnl_32.setPreferredSize(new Dimension(250, 30));
		pnl_Search.add(pnl_32);
		pnl_32.setLayout(new BorderLayout(5, 0));

		lblNewLabel_49 = new JLabel("Số người");
		lblNewLabel_49.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_49.setBackground(new Color(255, 140, 0));
		lblNewLabel_49.setOpaque(true);
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_49.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_49.setPreferredSize(new Dimension(120, 0));
		pnl_32.add(lblNewLabel_49, BorderLayout.WEST);

		ccb_numberPeople = new JComboBox();
		ccb_numberPeople.setFont(new Font("Dialog", Font.BOLD, 16));
		ccb_numberPeople
				.setModel(new DefaultComboBoxModel(new String[] { "Tất cả", "5 người", "10 người", "20 người\t" }));
		ccb_numberPeople.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnl_32.add(ccb_numberPeople, BorderLayout.CENTER);

		pnl_33 = new JPanel();
		pnl_33.setOpaque(false);
		pnl_33.setBackground(new Color(255, 255, 255));
		pnl_33.setPreferredSize(new Dimension(250, 30));
		pnl_Search.add(pnl_33);
		pnl_33.setLayout(new BorderLayout(5, 0));

		JLabel lblNewLabel_50 = new JLabel("Phòng số");
		lblNewLabel_50.setBackground(new Color(255, 140, 0));
		lblNewLabel_50.setOpaque(true);
		lblNewLabel_50.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_50.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_50.setPreferredSize(new Dimension(120, 0));
		pnl_33.add(lblNewLabel_50, BorderLayout.WEST);

		txt_SearchIdRoom = new JTextField();
		txt_SearchIdRoom.setBorder(new LineBorder(new Color(171, 173, 179)));
		txt_SearchIdRoom.setHorizontalAlignment(SwingConstants.CENTER);
		txt_SearchIdRoom.setFont(new Font("Dialog", Font.BOLD, 16));
		pnl_33.add(txt_SearchIdRoom, BorderLayout.CENTER);
		txt_SearchIdRoom.setColumns(10);

		btnNewButton_1 = new JButton("Tìm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_SearchIdRoom.getText().length() <= 0)
					JOptionPane.showConfirmDialog(null, "Không tìm thấy phòng số: \"" + txt_SearchIdRoom.getText() + "\" !", "Tìm mã phòng",
							JOptionPane.OK_CANCEL_OPTION);
				else {
					ArrayList<Phong> list = searchRoom(txt_SearchIdRoom.getText());
					updateViewBook(list);
				}
			}
		});
		pnl_33.add(btnNewButton_1, BorderLayout.EAST);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.setPreferredSize(new Dimension(100, 30));

		JPanel pnl_Filter = new JPanel();
		pnl_Filter.setOpaque(false);
		pnl_Filter.setBackground(Color.WHITE);
		pnl_North.add(pnl_Filter);
		pnl_Filter.setLayout(new GridLayout(1, 4, 10, 0));

		panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 255, 255));
		pnl_Filter.add(panel);
		panel.setLayout(new GridLayout(1, 3, 10, 0));

		btnNewButton = new JButton("PHÒNG TRỐNG");
		btnNewButton.setIcon(new ImageIcon(GD_Phong.class.getResource("/img/xanh_mini.png")));
		btnNewButton.setForeground(new Color(0, 191, 255));
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setPreferredSize(new Dimension(250, 30));

		btnPhngangHt = new JButton("PHÒNG ĐANG SỬ DỤNG");
		btnPhngangHt.setIcon(new ImageIcon(GD_Phong.class.getResource("/img/vang_mini.png")));
		btnPhngangHt.setForeground(new Color(255, 69, 0));
		panel.add(btnPhngangHt);
		btnPhngangHt.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPhngangHt.setBorder(new LineBorder(Color.ORANGE, 2, true));
		btnPhngangHt.setPreferredSize(new Dimension(250, 30));

		btnPhngangBo = new JButton("PHÒNG ĐANG BẢO TRÌ");
		btnPhngangBo.setIcon(new ImageIcon(GD_Phong.class.getResource("/img/do_mini.png")));
		btnPhngangBo.setForeground(new Color(255, 0, 0));
		panel.add(btnPhngangBo);
		btnPhngangBo.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPhngangBo.setPreferredSize(new Dimension(250, 30));
		btnPhngangBo.setBorder(new LineBorder(Color.RED, 2, true));
		btnPhngangBo.setBackground(Color.WHITE);

		pnl_34 = new JPanel();
		pnl_34.setOpaque(false);
		pnl_34.setBackground(new Color(255, 255, 255));
		pnl_34.setPreferredSize(new Dimension(400, 30));
		pnl_Filter.add(pnl_34);
		pnl_34.setLayout(new BorderLayout(5, 0));

		lblNewLabel_51 = new JLabel("Loại phòng");
		lblNewLabel_51.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_51.setBackground(new Color(255, 140, 0));
		lblNewLabel_51.setOpaque(true);
		lblNewLabel_51.setPreferredSize(new Dimension(120, 0));
		lblNewLabel_51.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		pnl_34.add(lblNewLabel_51, BorderLayout.WEST);

		pnl_35 = new JPanel();
		pnl_35.setOpaque(false);
		pnl_34.add(pnl_35, BorderLayout.CENTER);
		pnl_35.setLayout(new GridLayout(1, 0, 0, 0));

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_35.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 4, 0));

		ckb_RoomAll = new JCheckBox("Tất cả");
		ckb_RoomAll.setSelected(true);
		ckb_RoomAll.setBorder(new LineBorder(new Color(0, 0, 0)));
		ckb_RoomAll.setBackground(new Color(255, 255, 255));
		ckb_RoomAll.setHorizontalAlignment(SwingConstants.CENTER);
		ckb_RoomAll.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_1.add(ckb_RoomAll);

		ckb_RoomVip = new JCheckBox("Vip");
		ckb_RoomVip.setBorder(new LineBorder(new Color(0, 0, 0)));
		ckb_RoomVip.setHorizontalAlignment(SwingConstants.CENTER);
		ckb_RoomVip.setFont(new Font("Dialog", Font.BOLD, 16));
		ckb_RoomVip.setBackground(Color.WHITE);
		panel_1.add(ckb_RoomVip);

		ckb_RoomNormal = new JCheckBox("Thường");
		ckb_RoomNormal.setBorder(new LineBorder(new Color(0, 0, 0)));
		ckb_RoomNormal.setHorizontalAlignment(SwingConstants.CENTER);
		ckb_RoomNormal.setFont(new Font("Dialog", Font.BOLD, 16));
		ckb_RoomNormal.setBackground(Color.WHITE);
		panel_1.add(ckb_RoomNormal);

		btnNewButton_3 = new JButton("Làm mới");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ccb_numberPeople.setSelectedIndex(0);
				txt_SearchIdRoom.setText("");
				ckb_RoomAll.setSelected(true);
				ckb_RoomVip.setSelected(false);
				ckb_RoomNormal.setSelected(false);
				updateViewBook(Phong_Dao.getAllRoomDB());
				closeMessAfterNotifi("Làm mới thành công !");
				
			}
		});
		pnl_34.add(btnNewButton_3, BorderLayout.EAST);
		btnNewButton_3.setPreferredSize(new Dimension(100, 30));
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 16));

		lbl_TitleMain = new JLabel("ĐẶT PHÒNG");
		lbl_TitleMain.setBackground(new Color(0, 0, 0));
		lbl_TitleMain.setPreferredSize(new Dimension(58, 40));
		lbl_TitleMain.setOpaque(true);
		pnl_Main.add(lbl_TitleMain, BorderLayout.NORTH);
		lbl_TitleMain.setBorder(new LineBorder(new Color(255, 255, 255)));
		lbl_TitleMain.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TitleMain.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_TitleMain.setForeground(Color.WHITE);
		updateViewBook(Phong_Dao.getAllRoomDB());
	}

//	protected void updateRoomFromBookRoomDetail() {
//
//		pnl_ContainRooms.removeAll();
//		pnl_ContainRooms.setPreferredSize(new Dimension(70, 230 * (list.size() / 6) + 270));
//		pnl_ContainRooms.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
//		ChiTietPhieuDatPhong_Dao.changeStatusRoomsBooked();
//		list = Phong_Dao.getAllRoomDB();
//	}

	protected ArrayList<Phong> searchRoom(String maP) {
		ArrayList<Phong> listResult = new ArrayList<Phong>();
		for (Phong phong : list) {
			if(phong.getMaPhong().toUpperCase().contains(maP.toUpperCase()))
				listResult.add(phong);
			else if(phong.getMaPhong().toUpperCase().contains(maP.toUpperCase()))
				listResult.add(phong);
		}
		return listResult;
	}

	public void changeTitleWhenSearch() {
		lbl_Title.setText("NHẬP THÔNG TIN CẦN TÌM");
//		//lbl_ListRoom.setText("DANH SÁCH KẾT QUẢ");
		lbl_TitleMain.setText("TÌM PHÒNG");
	}

	public void changeLayoutWhenBookRoom() {
		// TODO Auto-generated method stub

	}

	public void changeTitleWhenBookRoom() {
		lbl_TitleMain.setText("ĐẶT PHÒNG");
		lbl_Title.setText("DANH SÁCH PHÒNG");

	}

	public void changeTitleWhenFixPhong() {
		lbl_TitleMain.setText("SỬA PHÒNG");
		lbl_Title.setText("DANH SÁCH PHÒNG");
		// lbl_ListRoom.setText("DANH SÁCH PHÒNG");

	}

	public void changeLayoutWhenBookFood() {
		// TODO Auto-generated method stub

	}

	public void changeTitleWhenBookFood() {
		lbl_TitleMain.setText("ĐẶT ĐỒ ĂN");
		lbl_Title.setText("NHẬP THÔNG TIN ĐẶT ĐỒ ĂN");
		// lbl_ListRoom.setText("CHỌN PHÒNG ĐẶT ĐỒ ĂN");

	}

	public void changeTitleWhenBookWater() {
		lbl_TitleMain.setText("ĐẶT ĐỒ UỐNG");
		lbl_Title.setText("NHẬP THÔNG TIN ĐẶT ĐỒ UỐNG");
		// lbl_ListRoom.setText("CHỌN PHÒNG ĐẶT ĐỒ UỐNG");

	}

	public static String convertPriceToSizeRoom(double price) {
		if (price >= 200000.0)
			return "20 NGƯỜI";
		else if (price >= 100000.0)
			return "10 NGƯỜI";
		else
			return "5 NGƯỜI";
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		list = Phong_Dao.getAllRoomDB();
		Rectangle rect = ((JPanel) e.getSource()).getBounds();
//		System.out.println(rect.x + ", " + rect.y + ", " + rect.width + ", " + rect.height);
		// create grid index room
		int hang = list.size() / 6;
		for (int i = 1; i <= hang; i++) {
			for (int y = 1; y <= 6; y++) {
				Rectangle a = new Rectangle(50 + (y - 1) * 250, 20 + (i - 1) * 240, 200, 220);
				listIndex.add(a);
			}
			if (i == hang) {
				for (int s = 1; s <= list.size() % 6; s++) {
					Rectangle a = new Rectangle(50 + (s - 1) * 250, 20 + (hang) * 240, 200, 220);
					listIndex.add(a);
				}
			}
		}

		Rectangle src = ((JPanel) e.getSource()).getBounds();
		indexRoom = listIndex.indexOf(src) + 1;
		Phong a = Phong_Dao.searchPhong("PHÒNG " + indexRoom);
		if (lbl_TitleMain.getText().equalsIgnoreCase("ĐẶT PHÒNG")) {

			if (a.getTinhTrang().trim().equalsIgnoreCase("Đang sử dụng"))
				JOptionPane.showMessageDialog(null, "Phòng đang sử dụng !");
			else if (a.getTinhTrang().trim().equalsIgnoreCase("Bảo trì"))
				JOptionPane.showMessageDialog(null, "Phòng đang bảo trì !");
			else {
				dialog_DatPhong = new JDialogPhong_DatPhong(this, a);
				System.out.println(a);
				dialog_DatPhong.show();
			}

		} else if (lbl_TitleMain.getText().equalsIgnoreCase("SỬA PHÒNG")) {
			if (a.getTinhTrang().equalsIgnoreCase("ĐANG SỬ DỤNG")) {
				JOptionPane.showMessageDialog(null, "Không thể sửa phòng " + indexRoom + " vì đang sử dụng !");
			} else {
				JDialogPhong_SuaPhong suaPhong = new JDialogPhong_SuaPhong(this, a);
				suaPhong.show();
			}
		} else if (lbl_TitleMain.getText().equalsIgnoreCase("SỬA ĐẶT PHÒNG")) {
			if (a.getTinhTrang().equalsIgnoreCase("ĐANG SỬ DỤNG")) {
				JDialogPhong_SuaDatPhong suaDatPhong = new JDialogPhong_SuaDatPhong(this, a);
				suaDatPhong.show();
			} else {
				JOptionPane.showMessageDialog(null, "Không thể thay đổi đặt phòng " + indexRoom + " vì phòng đang trống !");
			}
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

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void updateList(ArrayList<Phong> list2) {
		list = list2;
	}

	public void changeTitleWhenFixBookRoom() {
		lbl_TitleMain.setText("SỬA ĐẶT PHÒNG");

	}

	public void updateViewBook(ArrayList<Phong> list) {
		
		pnl_ContainRooms.removeAll();
		pnl_ContainRooms.setPreferredSize(new Dimension(70, 230 * (list.size() / 6) + 270));
		pnl_ContainRooms.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));

		Collections.sort(list, (o1, o2) -> (Integer.parseInt(o1.getMaPhong(), 1, o1.getMaPhong().length(), 10)
				- Integer.parseInt(o2.getMaPhong(), 1, o2.getMaPhong().length(), 10)));

		for (Phong items : list) {
			JPanel panelItems = new JPanel(new BorderLayout());
			panelItems.setOpaque(false);
			panelItems.setPreferredSize(new Dimension(200, 220));
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
		lbl_Xanh.setIcon(new ImageIcon(GD_Phong.class.getResource("/img/xanh.png")));
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

		if (tt.trim().equalsIgnoreCase("ĐANG SỬ DỤNG")) {
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_vang");
		} else if (tt.trim().equalsIgnoreCase("TRỐNG")) {
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_xanh");
		} else {
			CardLayout c = (CardLayout) pnl_Status.getLayout();
			c.show(pnl_Status, "name_do");
		}

		return res;
	}
	
	private void closeMessAfterNotifi(String mess) {
		new Thread(new Runnable() {
//			thông báo
			@Override
			public void run() {
				try {
					lbl_Message.setText(mess);
					Thread.sleep(3000);
					lbl_Message.setText("");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
	}
	
}
