package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import connect.ConnectDB;
import dao.ChiTietPhieuDatPhong_Dao;
import dao.NhanVien_Dao;
import dao.Phong_Dao;
import dao.TaiKhoan_Dao;
import entity.NhanVien;
import entity.TaiKhoan;

import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Insets;
import javax.swing.border.SoftBevelBorder;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.EmptyBorder;

public class GD_Chinh implements ComponentListener, ActionListener, WindowStateListener, MouseListener, KeyListener {

	private JFrame frame;
	private Dimension size;
	private JPanel pnl_Content;
	private JPanel pnl_Login;
	private GD_KhachHang pnl_KhachHang;
	private GD_NhanVien pnl_NhanVien;
	private GD_Phong pnl_Phong;
	private GD_BangChamCong pnl_BangPhanCong;
	private GD_DichVu pnl_DichVu;
	private GD_PhieuThuChi pnl_PhieuThuChi;
	private GD_HoaDon pnl_HoaDon;
	private JPanel pnl_ThongKe;
	private JPanel pnl_TitleAndTime;
	private JLabel dateNow;
	private JLabel timeNow;
	private JTextField txt_AccountID;
	private JPasswordField pwf_Account;
	private int widthScreen;
	private JMenuBar mnu;
	private JMenu mn_Room;
	private JMenu mnDchV;
	private JMenu mn_Orders;
	private JMenu mnNhnVin;
	private JMenu mnKhchHng;
	private JMenu mnThngK;
	private JMenu mnHThng;
	private JMenu mnTrGip;
	private JMenuItem mni_BookRoom;
	private JMenuItem mni_FixBookRoom;
	private JMenuItem mni_AddRoom;
	private JMenuItem mni_FixRoom;
	private JMenuItem mni_SearchRoom;
	private JMenuItem mni_BookFood;
	private JMenuItem mni_BookWater;
	private JMenuItem mni_FixBookService;
	private JMenuItem mni_SearchService;
	private JMenuItem mni_AddService;
	private JMenuItem mni_FixService;
	private JMenuItem mni_PaymentOrders;
	private JMenuItem mni_SearchOrders;
	private JMenuItem mni_AddStaff;
	private JMenuItem mni_FixStaff;
	private JMenuItem mni_SearchStaff;
	private JMenuItem mni_CheckInToday;
	private JMenuItem mni_Timesheet;
	private JMenuItem mni_AddCustomers;
	private JMenuItem mni_SearchCustomers;
	private JMenuItem mni_FixCustomers;
	private JMenuItem mni_BestSellFood;
	private JMenuItem mni_BestSellWater;
	private JMenuItem mni_RevenueStatistical;
	private JMenuItem mni_InforPersonal;
	private JMenuItem mni_UpdatePassword;
	private JMenuItem mni_SignUp;
	private JMenuItem mni_LogOut;
	private JMenuItem mni_HowUse;
	private JMenuItem mni_ContactManager;
	private JButton btnLogin;
	private JButton btnLogout;
	private JButton btn_CloseHome;
	private ImageIcon background;
	private static JLabel lbl_MaNV;
	private static JLabel lbl_MaNV_1;
	protected LocalDateTime now;
	protected DateTimeFormatter df;
	protected DateTimeFormatter dtf;
	private JPanel pnl_Windows;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				GD_Chinh window = new GD_Chinh();
				window.frame.addWindowStateListener(window);
				window.frame.setVisible(true);

			}
		});
	}

	/**
	 * Create the application.
	 */
	public GD_Chinh() {

		initialize();
		clock();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		lbl_MaNV = new JLabel();
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		frame = new JFrame();
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//		frame.setResizable(false);
//		frame.setMaximumSize(new Dimension(size.width, size.height));
//		frame.setMinimumSize(new Dimension(size.width, size.height));

		frame.setBackground(Color.WHITE);
		frame.setTitle("Karaoke Nice");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentListener(this);
		frame.getContentPane().setLayout(null);
//		pnl_Menu = create_Menu();
//		frame.getContentPane().add((JPanel) pnl_Menu);
		size = Toolkit.getDefaultToolkit().getScreenSize();
		pnl_Windows = new JPanel();
		pnl_Windows.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnl_Windows.setOpaque(false);
		pnl_Windows.setBounds(0, 0, size.width, size.height-74);
		frame.getContentPane().add(pnl_Windows);
		pnl_Windows.setLayout(new BorderLayout(4, 4));

		pnl_TitleAndTime = new JPanel();
		pnl_Windows.add(pnl_TitleAndTime, BorderLayout.NORTH);
		pnl_TitleAndTime.setPreferredSize(new Dimension(10, 50));
		pnl_TitleAndTime.setOpaque(false);
		pnl_TitleAndTime.setBackground(new Color(152, 251, 152));
		pnl_TitleAndTime.setLayout(new BorderLayout(10, 0));

		JLabel lblTitle = new JLabel("CHƯƠNG TRÌNH QUẢN LÝ KARAOKE NICE");
		lblTitle.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTitle.setForeground(new Color(245, 255, 250));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(Color.BLACK);
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		pnl_TitleAndTime.add(lblTitle);

		JPanel pnl_dateTime = new JPanel();
		pnl_dateTime.setPreferredSize(new Dimension(300, 50));
		pnl_dateTime.setOpaque(false);
		pnl_dateTime.setForeground(new Color(255, 255, 255));
		pnl_dateTime.setBackground(new Color(0, 0, 0));
		pnl_TitleAndTime.add(pnl_dateTime, BorderLayout.WEST);
		pnl_dateTime.setLayout(new GridLayout(0, 2, 4, 0));

		dateNow = new JLabel("date");
		dateNow.setBorder(new LineBorder(new Color(255, 255, 255)));
		dateNow.setBackground(new Color(0, 0, 0));
		dateNow.setOpaque(true);
		dateNow.setForeground(new Color(255, 255, 255));
		dateNow.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		dateNow.setPreferredSize(new Dimension(150, 28));
		pnl_dateTime.add(dateNow);
		dateNow.setHorizontalAlignment(SwingConstants.CENTER);

		timeNow = new JLabel("time");
		timeNow.setBorder(new LineBorder(new Color(255, 255, 255)));
		timeNow.setBackground(new Color(0, 0, 0));
		timeNow.setOpaque(true);
		timeNow.setForeground(new Color(255, 255, 255));
		timeNow.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		timeNow.setHorizontalAlignment(SwingConstants.CENTER);
		timeNow.setPreferredSize(new Dimension(150, 28));
		pnl_dateTime.add(timeNow);

		JPanel pnl_UserLogin = new JPanel();
		pnl_UserLogin.setOpaque(false);
		pnl_UserLogin.setBackground(Color.BLACK);
		pnl_UserLogin.setPreferredSize(new Dimension(350, 10));
		pnl_TitleAndTime.add(pnl_UserLogin, BorderLayout.EAST);
		pnl_UserLogin.setLayout(new GridLayout(0, 2, 4, 0));

		JLabel lblNewLabel_24 = new JLabel("NHÂN VIÊN:");
		lblNewLabel_24.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblNewLabel_24.setBackground(new Color(0, 0, 0));
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setPreferredSize(new Dimension(130, 13));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setForeground(Color.WHITE);
		lblNewLabel_24.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		pnl_UserLogin.add(lblNewLabel_24);

		JPanel panel_31 = new JPanel();
		panel_31.setOpaque(false);
		panel_31.setBackground(Color.BLACK);
		pnl_UserLogin.add(panel_31);
		panel_31.setLayout(new BorderLayout(4, 0));

		lbl_MaNV_1 = new JLabel("Chưa đăng nhập");
		lbl_MaNV_1.setBackground(new Color(0, 0, 0));
		lbl_MaNV_1.setOpaque(true);
		lbl_MaNV_1.setPreferredSize(new Dimension(100, 13));
		lbl_MaNV_1.setForeground(Color.WHITE);
		lbl_MaNV_1.setBorder(new LineBorder(Color.WHITE));
		lbl_MaNV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MaNV_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		panel_31.add(lbl_MaNV_1);

		btn_CloseHome = new JButton("");
		btn_CloseHome.setPreferredSize(new Dimension(40, 9));
		btn_CloseHome.addActionListener(this);
		btn_CloseHome.setIcon(new ImageIcon(GD_Chinh.class.getResource("/img/Logout.png")));
		btn_CloseHome.setFocusable(false);

		panel_31.add(btn_CloseHome, BorderLayout.EAST);

		pnl_Content = new JPanel();
		pnl_Windows.add(pnl_Content, BorderLayout.CENTER);
		pnl_Content.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_Content.setOpaque(false);
		pnl_Content.setLayout(new CardLayout(0, 0));

		pnl_Login = new JPanel(new BorderLayout());
		pnl_Login.setOpaque(false);
		pnl_Content.add(pnl_Login, "name_login");

		pnl_KhachHang = new GD_KhachHang();
		pnl_Content.add(pnl_KhachHang, "name_kh");

		pnl_NhanVien = new GD_NhanVien();
		pnl_Content.add(pnl_NhanVien, "name_nv");

		pnl_Phong = new GD_Phong();
		pnl_Content.add(pnl_Phong, "name_p");

		pnl_BangPhanCong = new GD_BangChamCong();
		pnl_Content.add(pnl_BangPhanCong, "name_bpc");

		pnl_DichVu = new GD_DichVu();
		pnl_Content.add(pnl_DichVu, "name_dv");

		pnl_PhieuThuChi = new GD_PhieuThuChi();
		pnl_Content.add(pnl_PhieuThuChi, "name_ptc");

		pnl_ThongKe = new JPanel();
		pnl_Content.add(pnl_ThongKe, "name_tk");

		pnl_HoaDon = new GD_HoaDon();
		pnl_Content.add(pnl_HoaDon, "name_hd");

		JPanel pnl_Log = new JPanel();
		pnl_Login.add(pnl_Log);
		pnl_Log.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		pnl_Log.setOpaque(false);
		pnl_Log.setLayout(new BorderLayout(0, 0));

		JPanel panelMain = new JPanel();
		panelMain.setOpaque(false);
		pnl_Log.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panelMain.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setVgap(55);
		flowLayout.setHgap(100);
		panel_5.setPreferredSize(new Dimension(150, 150));
		panel_4.add(panel_5, BorderLayout.SOUTH);

		btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(this);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setPreferredSize(new Dimension(200, 40));
		panel_5.add(btnLogin);

		btnLogout = new JButton("THOÁT");
		btnLogout.addActionListener(this);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setPreferredSize(new Dimension(200, 40));
		panel_5.add(btnLogout);

		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setPreferredSize(new Dimension(10, 250));
		panel_4.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("ĐĂNG NHẬP");
		lblNewLabel.setBorder(new EmptyBorder(70, 0, 0, 0));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_4.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_7.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BorderLayout(4, 0));

		JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_7.add(panel_9);
		panel_9.setLayout(new BorderLayout(4, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EmptyBorder(70, 100, 70, 90));
		panel_11.setOpaque(false);
		panel_9.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(new GridLayout(0, 1, 0, 30));

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new EmptyBorder(0, 100, 0, 100));
		panel_14.setOpaque(false);
		panel_11.add(panel_14);
		panel_14.setLayout(new BorderLayout(10, 0));

		JLabel lblNewLabel_1_1 = new JLabel("Tài khoản:");
		lblNewLabel_1_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setFocusable(false);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1_1.setOpaque(true);
		panel_14.add(lblNewLabel_1_1, BorderLayout.WEST);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setPreferredSize(new Dimension(150, 13));

		txt_AccountID = new JTextField();
		txt_AccountID.setText("0985189541");
		txt_AccountID.addKeyListener(this);
		txt_AccountID.setMargin(new Insets(2, 10, 2, 2));
		txt_AccountID.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_14.add(txt_AccountID, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new EmptyBorder(0, 100, 0, 100));
		panel_15.setOpaque(false);
		panel_11.add(panel_15);
		panel_15.setLayout(new BorderLayout(10, 0));

		JLabel lblNewLabel_1 = new JLabel("Mật khẩu:");
		lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_15.add(lblNewLabel_1, BorderLayout.WEST);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setPreferredSize(new Dimension(150, 13));

		pwf_Account = new JPasswordField();
		pwf_Account.setText("000AAA");
		pwf_Account.setMargin(new Insets(2, 10, 2, 2));
		pwf_Account.addKeyListener(this);
		pwf_Account.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_15.add(pwf_Account, BorderLayout.CENTER);

		mnu = new JMenuBar();
		mnu.setLayout(new GridLayout(1, 0, 0, 0));
		mnu.setPreferredSize(new Dimension(widthScreen, 50));
		frame.setJMenuBar(mnu);

		mn_Room = new JMenu("PHÒNG HÁT");
		mn_Room.addMouseListener(this);
		mn_Room.setForeground(new Color(0, 0, 0));
		mn_Room.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mn_Room.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mn_Room.setMnemonic('p');
		mn_Room.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mn_Room);

		mni_BookRoom = new JMenuItem("Thêm đặt phòng");
		mni_BookRoom.addActionListener(this);
		mn_Room.add(mni_BookRoom);

		mni_FixBookRoom = new JMenuItem("Sửa đặt phòng");
		mn_Room.add(mni_FixBookRoom);
		mni_FixBookRoom.addActionListener(this);

		JMenu mnNewMenu = new JMenu("Quản lý phòng");
		mn_Room.add(mnNewMenu);

		mni_AddRoom = new JMenuItem("Thêm phòng");
		mnNewMenu.add(mni_AddRoom);
		mni_AddRoom.addActionListener(this);

		mni_FixRoom = new JMenuItem("Sửa phòng");
		mnNewMenu.add(mni_FixRoom);
		mni_FixRoom.addActionListener(this);

		mni_SearchRoom = new JMenuItem("Tìm phòng");
		mnNewMenu.add(mni_SearchRoom);
		mni_SearchRoom.addActionListener(this);

		mnDchV = new JMenu("DỊCH VỤ");
		mnDchV.addMouseListener(this);
		mnDchV.setForeground(new Color(0, 0, 0));
		mnDchV.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnDchV.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnDchV.setMnemonic('d');
		mnDchV.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnDchV);

		mni_BookFood = new JMenuItem("Đặt dịch vụ đồ ăn");
		mni_BookFood.addActionListener(this);
		mnDchV.add(mni_BookFood);

		mni_BookWater = new JMenuItem("Đặt dịch vụ đồ uống");
		mni_BookWater.addActionListener(this);
		mnDchV.add(mni_BookWater);

		mni_FixBookService = new JMenuItem("Sửa đặt dịch vụ");
		mni_FixBookService.addActionListener(this);
		mnDchV.add(mni_FixBookService);

		JMenu mnNewMenu_3 = new JMenu("Quản lý dịch vụ");
		mnDchV.add(mnNewMenu_3);

		mni_AddService = new JMenuItem("Thêm dịch vụ");
		mni_AddService.addActionListener(this);
		mnNewMenu_3.add(mni_AddService);

		mni_FixService = new JMenuItem("Sửa dịch vụ");
		mni_FixService.addActionListener(this);
		mnNewMenu_3.add(mni_FixService);

		mni_SearchService = new JMenuItem("Tìm kiếm dịch vụ");
		mni_SearchService.addActionListener(this);
		mnNewMenu_3.add(mni_SearchService);

		mn_Orders = new JMenu("HÓA ĐƠN");
		mn_Orders.addMouseListener(this);
		mn_Orders.setForeground(new Color(0, 0, 0));
		mn_Orders.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mn_Orders.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mn_Orders.setMnemonic('h');
		mn_Orders.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mn_Orders);

		mni_PaymentOrders = new JMenuItem("Thanh toán hóa đơn");
		mni_PaymentOrders.addActionListener(this);
		mn_Orders.add(mni_PaymentOrders);

		mni_SearchOrders = new JMenuItem("Tìm kiếm hóa đơn");
		mni_SearchOrders.addActionListener(this);
		mn_Orders.add(mni_SearchOrders);

		mnNhnVin = new JMenu("NHÂN VIÊN");
		mnNhnVin.addMouseListener(this);
		mnNhnVin.setForeground(new Color(0, 0, 0));
		mnNhnVin.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNhnVin.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnNhnVin.setMnemonic('n');
		mnNhnVin.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnNhnVin);

		mni_AddStaff = new JMenuItem("Thêm nhân viên");
		mni_AddStaff.addActionListener(this);
		mnNhnVin.add(mni_AddStaff);

		mni_FixStaff = new JMenuItem("Sửa nhân viên");
		mni_FixStaff.addActionListener(this);
		mnNhnVin.add(mni_FixStaff);

		mni_SearchStaff = new JMenuItem("Tìm kiếm nhân viên");
		mni_SearchStaff.addActionListener(this);
		mnNhnVin.add(mni_SearchStaff);

		JMenu mnNewMenu_1 = new JMenu("Chấm công");
		mnNhnVin.add(mnNewMenu_1);

		mni_CheckInToday = new JMenuItem("Chấm công hôm nay");
		mni_CheckInToday.addActionListener(this);
		mnNewMenu_1.add(mni_CheckInToday);

		mni_Timesheet = new JMenuItem("Lập bảng chấm công");
		mni_Timesheet.addActionListener(this);
		mnNewMenu_1.add(mni_Timesheet);

		mnKhchHng = new JMenu("KHÁCH HÀNG");
		mnKhchHng.addMouseListener(this);
		mnKhchHng.setBackground(new Color(0, 191, 255));
		mnKhchHng.setHorizontalTextPosition(SwingConstants.CENTER);
		mnKhchHng.setForeground(new Color(0, 0, 0));
		mnKhchHng.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnKhchHng.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnKhchHng.setMnemonic('k');
		mnKhchHng.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnKhchHng);

		mni_AddCustomers = new JMenuItem("Thêm khách hàng");
		mni_AddCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) pnl_Content.getLayout();
				c.show(pnl_Content, "name_kh");
			}
		});
		mnKhchHng.add(mni_AddCustomers);

		mni_SearchCustomers = new JMenuItem("Tìm kiếm khách hàng");
		mnKhchHng.add(mni_SearchCustomers);

		mni_FixCustomers = new JMenuItem("Sửa khách hàng");
		mnKhchHng.add(mni_FixCustomers);

		mnThngK = new JMenu("THỐNG KÊ");
		mnThngK.addMouseListener(this);
		mnThngK.setForeground(new Color(0, 0, 0));
		mnThngK.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnThngK.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnThngK.setMnemonic('t');
		mnThngK.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnThngK);

		mni_BestSellFood = new JMenuItem("Thống kê đồ ăn bán chạy");
		mnThngK.add(mni_BestSellFood);

		mni_BestSellWater = new JMenuItem("Thống kê đồ uống bán chạy");
		mnThngK.add(mni_BestSellWater);

		mni_RevenueStatistical = new JMenuItem("Thống kê doanh thu");
		mni_RevenueStatistical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_ThongKeDoanhThu doanhThu = new GD_ThongKeDoanhThu();
				doanhThu.show();
			}
		});
		mnThngK.add(mni_RevenueStatistical);

		mnHThng = new JMenu("HỆ THỐNG");
		mnHThng.addMouseListener(this);
		mnHThng.setForeground(new Color(0, 0, 0));
		mnHThng.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnHThng.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnHThng.setMnemonic('h');
		mnHThng.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnHThng);

		mni_InforPersonal = new JMenuItem("Thông tin cá nhân");
		mni_InforPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdialogHeThong_ThongTinCaNhan caNhan = new JdialogHeThong_ThongTinCaNhan();
				caNhan.show();
			}
		});
		mnHThng.add(mni_InforPersonal);

		mni_UpdatePassword = new JMenuItem("Đổi mật khẩu");
		mni_UpdatePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialogDoiMatKhau matKhau = new JDialogDoiMatKhau();
				matKhau.show();
			}
		});
		mnHThng.add(mni_UpdatePassword);

		mni_SignUp = new JMenuItem("Đăng nhập");
		mnHThng.add(mni_SignUp);

		mni_LogOut = new JMenuItem("Đăng xuất");
		mni_LogOut.addActionListener(this);
		mnHThng.add(mni_LogOut);

		mnTrGip = new JMenu("TRỢ GIÚP");
		mnTrGip.addMouseListener(this);
		mnTrGip.setForeground(new Color(0, 0, 0));
		mnTrGip.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnTrGip.setPreferredSize(new Dimension(widthScreen / 10, 50));
		mnTrGip.setMnemonic('g');
		mnTrGip.setHorizontalAlignment(SwingConstants.CENTER);
		mnu.add(mnTrGip);

		mni_HowUse = new JMenuItem("Hướng dẫn sử dụng");
		mnTrGip.add(mni_HowUse);

		mni_ContactManager = new JMenuItem("Liên hệ quản lý");
		mni_ContactManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialogLienHeQuanLi heQuanLi = new JDialogLienHeQuanLi();
				heQuanLi.show();
			}
		});
		mnTrGip.add(mni_ContactManager);

		mnu.hide();

		JLabel lbl_Background = new JLabel("");
		lbl_Background.setOpaque(true);
		lbl_Background.setIcon(new ImageIcon(GD_Chinh.class.getResource("/img/SongNhac.jpg")));
		lbl_Background.setBounds(-50, -200, 2200, 1500);
		frame.getContentPane().add(lbl_Background);
	}

	protected void checkLogin(String string, String string2) {
		ConnectDB.connect();
		TaiKhoan_Dao dao = new TaiKhoan_Dao();
		JLabel notifical = new JLabel();
		notifical.setFont(new Font("Tahoma", Font.BOLD, 18));

		for (TaiKhoan a : dao.getList()) {
			if (a.getMaTK().equals(string))
				if (a.getMatKhau().equals(string2)) {

					mnu.show();
					CardLayout c = (CardLayout) (pnl_Content.getLayout());
					c.show(pnl_Content, "name_p");
					setBoundsForPanel();
					lbl_MaNV_1.setText(a.getMaNV());
					notifical.setText("Đăng nhập thành công !");
					Icon icon = new ImageIcon(GD_Chinh.class.getResource("/img/Ok.png"));
					JOptionPane.showMessageDialog(null, notifical, "Thông báo", JOptionPane.OK_CANCEL_OPTION, icon);
				} else {
					notifical.setText("Nhập sai mật khẩu !");
					JOptionPane.showInternalMessageDialog(null, notifical, "Thông báo", JOptionPane.OK_CANCEL_OPTION);
				}
			else {
				notifical.setText("Nhập sai tài khoản !");
				JOptionPane.showInternalMessageDialog(null, notifical, "Thông báo", JOptionPane.OK_CANCEL_OPTION);
			}
		}
		ConnectDB.disconect();
	}

	private void clock() {
		Thread clock = new Thread() {
			public void run() {
				for (;;) {
					now = LocalDateTime.now();
					df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					timeNow.setText(now.format(dtf));
					dateNow.setText(now.format(df));
				}
			}
		};
		clock.start();
	}

	@Override
	public void componentMoved(ComponentEvent e) {

	}

	@Override
	public void componentShown(ComponentEvent e) {

	}

	@Override
	public void componentHidden(ComponentEvent e) {

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src.equals(btnLogin)) {
			mnu.show();
			pnl_Content.setBounds(4, 44, 1528, 694);
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_p");
		} else if (src.equals(btnLogout))
			System.exit(1);
		else if (src.equals(mni_AddRoom) || src.equals(mni_BookRoom) || src.equals(mni_FixRoom)
				|| src.equals(mni_SearchRoom) || src.equals(mni_FixBookRoom) || src.equals(mni_SearchRoom)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_p");
			if (src.equals(mni_AddRoom)) {
				JDialogPhong_ThemPhong dialog = new JDialogPhong_ThemPhong(pnl_Phong);
				dialog.show();
			} else if (src.equals(mni_FixRoom)) {
				pnl_Phong.changeTitleWhenFixPhong();
			} else if (src.equals(mni_BookRoom)) {
				pnl_Phong.changeTitleWhenBookRoom();

			} else if (src.equals(mni_FixBookRoom)) {
				pnl_Phong.changeTitleWhenFixBookRoom();
			} else if (src.equals(mni_SearchRoom)) {
				pnl_Phong.changeTitleWhenSearch();
				JDialogPhong_TimPhong timPhong = new JDialogPhong_TimPhong();
				timPhong.show();
			}
		} else if (src.equals(mni_BookFood) || src.equals(mni_BookWater) || src.equals(mni_FixBookService)
				|| src.equals(mni_AddService) || src.equals(mni_SearchService) || src.equals(mni_FixService)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_dv");

			if (src.equals(mni_BookFood)) {
				pnl_DichVu.changeTitleWhenBookFood();
				pnl_DichVu.changeScreenBookService();
			} else if (src.equals(mni_BookWater)) {
				pnl_DichVu.changeTitleWhenBookWater();
				pnl_DichVu.changeScreenBookService();
			} else if (src.equals(mni_AddService)) {
				pnl_DichVu.changeTitleWhenAddService();
				pnl_DichVu.changeScreenManagentService();
				pnl_DichVu.setValueForComponentWhenAddService();
			} else if (src.equals(mni_FixBookService)) {
				System.out.println("Sửa");
				pnl_DichVu.changeTitleWhenFixBookService();
				pnl_DichVu.changeScreenBookService();
			} else if (src.equals(mni_SearchService)) {
				pnl_DichVu.changeTitleWhenSearchService();
				pnl_DichVu.changeScreenManagentService();
				JDialogDichVu_TimDichVu timDichVu = new JDialogDichVu_TimDichVu();
				timDichVu.show();
			} else if (src.equals(mni_FixService)) {
				pnl_DichVu.changeTitleWhenFixFood();
				pnl_DichVu.changeScreenManagentService();
			}
		} else if (src.equals(mni_PaymentOrders) || src.equals(mni_SearchOrders)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_hd");

			if (src.equals(mni_SearchOrders)) {
				pnl_HoaDon.changeTitleWhenSearchOrders();
				JDialogHoaDon_TimHoaDon timHoaDon = new JDialogHoaDon_TimHoaDon();
				timHoaDon.show();
			} else if (src.equals(mni_PaymentOrders)) {
				pnl_HoaDon.changeTitleWhenPaymentOrders();
			}
		} else if (src.equals(mni_AddStaff)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_nv");;
		} else if (src.equals(mni_FixStaff)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_nv");
			JDialogNhanVien_SuaNhanVien vien_SuaNhanVien = new JDialogNhanVien_SuaNhanVien();
			vien_SuaNhanVien.show();
		} else if (src.equals(mni_SearchStaff)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_nv");
			JDialogNhanVien_TimNhanVien vien = new JDialogNhanVien_TimNhanVien();
			vien.show();
		} else if (src.equals(mni_CheckInToday)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_nv");
			JDialogNhanVien_ChamCong chamCong = new JDialogNhanVien_ChamCong();
			chamCong.show();
		} else if (src.equals(mni_Timesheet)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_bpc");
		} else if (src.equals(mni_LogOut)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_login");
			lbl_MaNV_1.setText("Chưa đăng nhập");
			txt_AccountID.setText("");
			pwf_Account.setText("");
		} else if (src.equals(btn_CloseHome)) {
			CardLayout c = (CardLayout) (pnl_Content.getLayout());
			c.show(pnl_Content, "name_login");
			lbl_MaNV_1.setText("Chưa đăng nhập");
			txt_AccountID.setText("");
			pwf_Account.setText("");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
		JMenu cmd = (JMenu) e.getSource();
		setForegroundBlackForMenu();
		if (cmd.equals(mnDchV))
			setBgWhenHoverMenuDichVu();
		else if (cmd.equals(mn_Room))
			setBgWhenHoverMenuPhongHat();
		else if (cmd.equals(mn_Orders))
			setBgWhenHoverMenuHoaDon();
		else if (cmd.equals(mnNhnVin))
			setBgWhenHoverMenuNhanVien();
		else if (cmd.equals(mnKhchHng))
			setBgWhenHoverMenuKhachHang();
		else if (cmd.equals(mnThngK))
			setBgWhenHoverMenuThongKe();
		else if (cmd.equals(mnHThng))
			setBgWhenHoverMenuHeThong();
		else if (cmd.equals(mnTrGip))
			setBgWhenHoverMenuTroGiup();

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	private void setForegroundBlackForMenu() {
		mnDchV.setForeground(Color.black);
		mn_Orders.setForeground(Color.black);
		mnHThng.setForeground(Color.black);
		mnKhchHng.setForeground(Color.black);
		mnNhnVin.setForeground(Color.black);
		mnThngK.setForeground(Color.black);
		mnTrGip.setForeground(Color.black);
		mn_Room.setForeground(Color.black);
	}

	private void setBgWhenHoverMenuPhongHat() {

		mn_Room.setOpaque(true);
		mn_Room.setBackground(Color.black);
		mn_Room.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuDichVu() {

		mnDchV.setOpaque(true);
		mnDchV.setBackground(Color.black);
		mnDchV.setForeground(Color.white);

		mn_Room.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuTroGiup() {

		mnTrGip.setOpaque(true);
		mnTrGip.setBackground(Color.black);
		mnTrGip.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mn_Room.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);

	}

	private void setBgWhenHoverMenuHeThong() {
		mnHThng.setOpaque(true);
		mnHThng.setBackground(Color.black);
		mnHThng.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mn_Room.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuThongKe() {
		mnThngK.setOpaque(true);
		mnThngK.setBackground(Color.black);
		mnThngK.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mn_Room.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuKhachHang() {

		mnKhchHng.setOpaque(true);
		mnKhchHng.setBackground(Color.black);
		mnKhchHng.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mn_Room.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuNhanVien() {
		mnNhnVin.setOpaque(true);
		mnNhnVin.setBackground(Color.black);
		mnNhnVin.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Orders.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mn_Room.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	private void setBgWhenHoverMenuHoaDon() {

		mn_Orders.setOpaque(true);
		mn_Orders.setBackground(Color.black);
		mn_Orders.setForeground(Color.white);

		mnDchV.setOpaque(false);
		mn_Room.setOpaque(false);
		mnHThng.setOpaque(false);
		mnKhchHng.setOpaque(false);
		mnNhnVin.setOpaque(false);
		mnThngK.setOpaque(false);
		mnTrGip.setOpaque(false);

	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		size = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setPreferredSize(size);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		pnl_Windows.setBounds(0, 0, pnl_Windows.getWidth(), pnl_Windows.getHeight() - mnu.getPreferredSize().height + 50);
		frame.setResizable(false);
	}

	void setBoundsForPanel() {
		size = Toolkit.getDefaultToolkit().getScreenSize();
		pnl_Windows.setBounds(0, 0, pnl_Windows.getWidth(), pnl_Windows.getHeight() - mnu.getPreferredSize().height);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			checkLogin(txt_AccountID.getText(), pwf_Account.getText());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static String getNVWorking() {
		return lbl_MaNV_1.getText();
	}
}
