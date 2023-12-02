package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.JTextComponent;

import constant.Types;
import dao.ChiTietHoaDon_Dao;
import dao.ChiTietPhieuDatPhong_Dao;
import dao.PhieuGoiMon_Dao;
import dao.Phong_Dao;
import entity.Phong;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class JDialogPhong_SuaDatPhong extends JDialog implements  ItemListener, ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lbl_TenP;
	private JLabel lbl_GiaPhongMoi;
	private JLabel lbl_chechLechGia;
	private JButton okButton;
	private JTextComponent txt_SoPhong;
	private JComboBox<String> cbb_TypeRoom;
	private JComboBox<String> cbb_ListRoom;
	private JComboBox<String> cbb_PeopleNum;
	private Phong room;
	private GD_Phong home;
	/**
	 * Create the dialog.
	 */
	public JDialogPhong_SuaDatPhong(GD_Phong home, Phong room) {
		this.room = room;
		this.home = home;
		
		setTitle("SỬA ĐẶT PHÒNG");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		Dimension screenSizr = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(screenSizr.width / 4, screenSizr.height / 4, screenSizr.width / 2, screenSizr.height / 2);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(4, 4));
		{
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setBackground(Color.BLACK);
			contentPanel.add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("SỬA ĐẶT PHÒNG");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
				panel.add(lblNewLabel);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(5, 5));
			{
				JPanel pnl_TitleWest = new JPanel();
				pnl_TitleWest.setBackground(Color.WHITE);
				pnl_TitleWest.setBorder(new LineBorder(new Color(0, 0, 0)));
				pnl_TitleWest.setPreferredSize(new Dimension(200, 10));
				panel.add(pnl_TitleWest, BorderLayout.WEST);
				pnl_TitleWest.setLayout(new GridLayout(0, 1, 0, 10));
				{
					JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Phòng hiện tại");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Loại phòng mới");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Số người");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Phòng đang trống");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Giá phòng mới");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Chênh lệch giá tiền");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					pnl_TitleWest.add(lblNewLabel_1);
				}
			}
			{
				JPanel pnl_ContentCenter = new JPanel();
				pnl_ContentCenter.setBackground(Color.WHITE);
				pnl_ContentCenter.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.add(pnl_ContentCenter, BorderLayout.CENTER);
				pnl_ContentCenter.setLayout(new GridLayout(0, 1, 0, 10));
				{
					JLabel lblNewLabel_2 = new JLabel("HD0123");
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
					pnl_ContentCenter.add(lblNewLabel_2);
				}
				{
					lbl_TenP = new JLabel(room.getTenPhong());
					lbl_TenP.setForeground(Color.BLUE);
					lbl_TenP.setHorizontalAlignment(SwingConstants.CENTER);
					lbl_TenP.setFont(new Font("Dialog", Font.BOLD, 14));
					pnl_ContentCenter.add(lbl_TenP);
				}
				{
					cbb_TypeRoom = new JComboBox<String>();
					cbb_TypeRoom.addItem("<Tất cả loại phòng>");
					cbb_TypeRoom.addItem(Types.ROOM_TYPE_VIP);
					cbb_TypeRoom.addItem(Types.ROOM_TYPE_NORMAL);
					cbb_TypeRoom.addItemListener(this);
					cbb_TypeRoom.setFont(new Font("Dialog", Font.BOLD, 14));
					pnl_ContentCenter.add(cbb_TypeRoom);
					
				}
				{
					cbb_PeopleNum = new JComboBox<String>();
					cbb_PeopleNum.addItem("<Tất cả kích cỡ>");
					cbb_PeopleNum.addItem(Types.ROOM_COUNT_PEOPLE_FIVE);
					cbb_PeopleNum.addItem(Types.ROOM_COUNT_PEOPLE_TEN);
					cbb_PeopleNum.addItem(Types.ROOM_COUNT_PEOPLE_TWENTY);
					cbb_PeopleNum.setFont(new Font("Dialog", Font.BOLD, 14));
					pnl_ContentCenter.add(cbb_PeopleNum);
					cbb_PeopleNum.addItemListener(this);
					
				}
				{
					cbb_ListRoom = new JComboBox<String>();
					cbb_ListRoom.addItem("Chọn phòng trống");
					cbb_ListRoom.setFont(new Font("Dialog", Font.BOLD, 14));
					cbb_ListRoom.addItemListener(this);
					cbb_ListRoom.addActionListener(this);
					pnl_ContentCenter.add(cbb_ListRoom);


				}
				{
					lbl_GiaPhongMoi = new JLabel("");
					lbl_GiaPhongMoi.setHorizontalAlignment(SwingConstants.CENTER);
					lbl_GiaPhongMoi.setFont(new Font("Dialog", Font.BOLD, 14));
					pnl_ContentCenter.add(lbl_GiaPhongMoi);
				}
				{
					lbl_chechLechGia = new JLabel("");
					lbl_chechLechGia.setForeground(Color.RED);
					lbl_chechLechGia.setHorizontalAlignment(SwingConstants.CENTER);
					lbl_chechLechGia.setFont(new Font("Dialog", Font.BOLD, 14));
					pnl_ContentCenter.add(lbl_chechLechGia);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("LƯU");
				okButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				okButton.setPreferredSize(new Dimension(150, 30));
				okButton.setActionCommand("OK");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.addActionListener(e -> {
					this.hide();
				});
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				cancelButton.setPreferredSize(new Dimension(150, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		setListRoomForCBB("Chọn phòng trống");
	}

	private String getGiaPhongCu() {
		return Phong_Dao.searchPhong(lbl_TenP.getText()).getGiaPhong()+"";
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object src = e.getSource();
		if (src.equals(cbb_TypeRoom))
			setListRoomForCBB(cbb_TypeRoom.getSelectedItem() + "");
		else if (src.equals(cbb_PeopleNum))
			setListRoomForCBB(cbb_TypeRoom.getSelectedItem() + "");
		else if(src.equals(cbb_ListRoom)) {
			if((cbb_ListRoom.getSelectedItem()+"").equals(room.getTenPhong())) {
				okButton.setEnabled(false);
			}else {
				okButton.setEnabled(true);
				if((cbb_ListRoom.getSelectedItem()+"").equalsIgnoreCase("Chọn phòng trống")) {
					lbl_GiaPhongMoi.setText("Chưa chọn phòng !");
					lbl_GiaPhongMoi.setForeground(Color.red);
				}else {
					Phong item = Phong_Dao.searchPhong(cbb_ListRoom.getSelectedItem()+"");
					if(item != null) {
						lbl_GiaPhongMoi.setText( ((int)item.getGiaPhong())+"");
						lbl_GiaPhongMoi.setForeground(Color.black);
					}
					else
						lbl_GiaPhongMoi.setText("");
				}
				
				if(lbl_GiaPhongMoi.getForeground() == Color.red) {
					
				}else {
					if(!lbl_GiaPhongMoi.getText().isEmpty()) {
						double chech = room.getGiaPhong() - Double.parseDouble(lbl_GiaPhongMoi.getText());
						if(chech > 0) {
							lbl_chechLechGia.setText("Khách nhận lại: "+ (int)chech+" VND !" );
							lbl_chechLechGia.setForeground(Color.green);
						}else if(chech == 0) {
							lbl_chechLechGia.setText("Giá không thay đổi !");
							lbl_chechLechGia.setForeground(Color.green);
						}else {
							lbl_chechLechGia.setText("Khách trả thêm: "+ (int)chech*-1 +" VND !" );
							lbl_chechLechGia.setForeground(Color.red);
						}
					}
				}
			}
		}
	}

	protected void setListRoomForCBB(String ttype) {
		ArrayList<Phong> list = null;
		if (ttype.equalsIgnoreCase(Types.ROOM_TYPE_VIP))
			list = Phong_Dao.getRoomTypeAndCount(Types.ROOM_TYPE_VIP, cbb_PeopleNum.getSelectedItem()+"");
		else if (ttype.equalsIgnoreCase("THƯỜNG")) // NORMAL
			list = Phong_Dao.getRoomTypeAndCount(Types.ROOM_TYPE_NORMAL, cbb_PeopleNum.getSelectedItem()+"");
		else
			list = Phong_Dao.getRoomTypeAndCount(Types.ROOM_TYPE_ALL, cbb_PeopleNum.getSelectedItem()+"");
		cbb_ListRoom.removeAllItems();
		cbb_ListRoom.addItem("Chọn phòng trống");
		for (Phong phong : list) {
			cbb_ListRoom.addItem(phong.getTenPhong());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(cbb_ListRoom.equals(e.getSource())) {
			if((cbb_ListRoom.getSelectedItem()+"").equals(room.getTenPhong())) {
				JOptionPane.showMessageDialog(null, "Thông báo không thể đổi sang phòng hiện tại !");
			}
		}else if(okButton.equals(e.getSource())) {
			String cu =  room.getMaPhong();
			Phong moi = Phong_Dao.searchPhong(cbb_ListRoom.getSelectedItem()+"");
			int choose = JOptionPane.showConfirmDialog(null, "Xác nhận chuyển "+cu+" sang "+ moi.getTenPhong(), "Thay đổi đặt phòng", JOptionPane.YES_NO_OPTION);
			if(choose == JOptionPane.YES_OPTION) {
				this.hide();
				Phong_Dao.updateStatusRoom(cu, "TRỐNG");
				Phong_Dao.updateStatusRoom(moi.getMaPhong(), "ĐANG SỬ DỤNG");
				ChiTietPhieuDatPhong_Dao.fixPDP(cu, moi.getMaPhong());
				ChiTietHoaDon_Dao.fixOrdersBookRoom(cu, moi.getMaPhong());
				PhieuGoiMon_Dao.fixPGM(cu, moi.getMaPhong());
				System.out.println(cu);
				this.home.updateViewBook(Phong_Dao.getAllRoomDB());
				JOptionPane.showMessageDialog(null, "CHUYỂN PHÒNG THÀNH CÔNG ! cu:" +cu+"moi: "+moi);
			}
		}
	}


}
