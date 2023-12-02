package ui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entity.Phong;

import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Rectangle;

public class GD_PhieuDatPhong extends JPanel implements MouseListener {
	private JTable table_1;
	private ArrayList listIndex;
	private ArrayList<Phong> list;
	private JButton btnNewButton;
	private JButton btnPhngangHt;
	private JPanel panel_Logo;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GD_PhieuDatPhong() {
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
		pnl_Main.add(pnl_TitleMain, BorderLayout.NORTH);
		pnl_TitleMain.setBackground(Color.WHITE);
		pnl_TitleMain.setLayout(new GridLayout(0, 1, 0, 4));

		JPanel pnl_1 = new JPanel();
		pnl_1.setPreferredSize(new Dimension(10, 30));
		pnl_1.setBackground(Color.BLACK);
		pnl_TitleMain.add(pnl_1);
		pnl_1.setLayout(new BorderLayout(0, 4));

		JLabel lbl_TitleMain = new JLabel("HÓA ĐƠN ĐẶT PHÒNG");
		lbl_TitleMain.setHorizontalAlignment(SwingConstants.CENTER);
		pnl_1.add(lbl_TitleMain);
		lbl_TitleMain.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TitleMain.setForeground(Color.WHITE);

		JPanel pnl_SearchAndListRoom = new JPanel();
		pnl_Main.add(pnl_SearchAndListRoom, BorderLayout.CENTER);
		pnl_SearchAndListRoom.setOpaque(false);
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
		pnl_TitleListRoom.setPreferredSize(new Dimension(10, 30));
		pnl_TitleListRoom.setBackground(Color.WHITE);
		pnl_Center.add(pnl_TitleListRoom, BorderLayout.NORTH);
		pnl_TitleListRoom.setLayout(new BorderLayout(4, 0));

		JPanel pnl_8 = new JPanel();
		pnl_8.setPreferredSize(new Dimension(300, 10));
		pnl_8.setBackground(Color.BLACK);
		pnl_TitleListRoom.add(pnl_8, BorderLayout.WEST);
		pnl_8.setLayout(new BorderLayout(0, 0));

		JLabel lbl_Title = new JLabel("DANH SÁCH HÓA ĐƠN ĐẶT PHÒNG");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Title.setForeground(Color.WHITE);
		pnl_8.add(lbl_Title);
		
		JScrollPane scrollPane = new JScrollPane();
		pnl_Center.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00C3 H\u00D3A \u0110\u01A0N", "M\u00C3 NH\u00C2N VI\u00CAN", "GI\u00C1 PH\u00D2NG", "T\u00CAN PH\u00D2NG", "LO\u1EA0I PH\u00D2NG", "GI\u1EDC V\u00C0O", "GI\u1EDC RA", "NG\u00C0Y"
			}
		));
		table.setRowHeight(24);
		scrollPane.setViewportView(table);

	}

//	private void updateRoomsDataBaseInView() {
//
//		for (Phong items : list) {
//			JPanel panelItems = new JPanel();
//			panelItems.setOpaque(false);
//			panelItems.setPreferredSize(new Dimension(200, 220));
//			if (list.indexOf(items) == list.size() - 1) {
//				panelItems.setLayout(new BorderLayout());
//
//				pnl_ContainRooms.add(panelItems);
//
//				panel_Logo = new JPanel(new BorderLayout(4, 4));
//				panelItems.add(panel_Logo, BorderLayout.CENTER);
//				JButton btn_AddRoom = new JButton(new ImageIcon(GD_Phong.class.getResource("/img/Add.png")));
//				panel_Logo.add(btn_AddRoom, BorderLayout.CENTER);
//				btn_AddRoom.setHorizontalAlignment(SwingConstants.CENTER);
//				btn_AddRoom.setFont(new Font("Tahoma", Font.BOLD, 12));
//				btn_AddRoom.setBorder(new LineBorder(Color.black));
//
//				panelItems.addMouseListener(this);
//			} else {
//				panelItems.setLayout(new CardLayout(0, 0));
//
//				pnl_ContainRooms.add(panelItems);
//
//				panel_Logo = new JPanel(new BorderLayout(4, 4));
//				panel_Logo.setOpaque(false);
//				panelItems.add(panel_Logo, "name_R" + items.toString());
//				JLabel lbl_TitleIndexRoom = new JLabel(items.getTenPhong());
//				panel_Logo.add(lbl_TitleIndexRoom, BorderLayout.NORTH);
//				lbl_TitleIndexRoom.setHorizontalAlignment(SwingConstants.CENTER);
//				lbl_TitleIndexRoom.setFont(new Font("Tahoma", Font.BOLD, 12));
//				lbl_TitleIndexRoom.setBorder(new LineBorder(Color.black));
//				JLabel lblNewLabel;
//				if (items.getTinhTrang().equals("Trống"))
//					lblNewLabel = new JLabelCreate("xanh");
//				else
//					lblNewLabel = new JLabelCreate("vang");
//				panel_Logo.add(lblNewLabel, BorderLayout.CENTER);
//				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//
//				JPanel panel_2 = new JPanelCreateRoomDetail(items.getTenPhong(), "", "", items.getTinhTrang(), "");
//				panel_2.setOpaque(false);
//				panelItems.add(panel_2, "name_InforR" + items.toString());
//
//				panelItems.addMouseListener(this);
//
//			}
//		}
//		
//	}

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
