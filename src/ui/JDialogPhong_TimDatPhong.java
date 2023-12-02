package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDialogPhong_TimDatPhong extends JDialog{

	private final JPanel contentPanel = new JPanel();
	private final GD_Phong homeFrm;
	private JTextField textField;
	private String ten;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_3;
	/**
	 * Create the dialog.
	 */
	public JDialogPhong_TimDatPhong(GD_Phong homeFrm2, String ten) {
		this.ten = ten;
		this.homeFrm = homeFrm2;
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		Point p =  MouseInfo.getPointerInfo().getLocation();
		setTitle("TÌM ĐẶT PHÒNG");
		setBounds(size.width/5, size.height/3, size.width/5*3, size.height/3*2);
		setLocationRelativeTo(null);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(4);
		borderLayout.setHgap(4);
		getContentPane().setLayout(borderLayout);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new LineBorder(new Color(0, 0, 0)));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setHgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Tìm");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okTimDatPhong();
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
						cancelTimDatPhong();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setPreferredSize(new Dimension(100, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel_Title = new JPanel();
			panel_Title.setBackground(new Color(0, 0, 0));
			getContentPane().add(panel_Title, BorderLayout.NORTH);
			{
				JLabel lblNewLabel_1 = new JLabel("TÌM ĐẶT PHÒNG");
				lblNewLabel_1.setForeground(new Color(255, 250, 250));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				panel_Title.add(lblNewLabel_1);
			}
		}
		{
			JPanel panel_Input = new JPanel();
			panel_Input.setPreferredSize(new Dimension(300, 10));
			getContentPane().add(panel_Input, BorderLayout.WEST);
			panel_Input.setLayout(new BorderLayout(0, 0));
			contentPanel.setPreferredSize(new Dimension(300, 10));
			panel_Input.add(contentPanel, BorderLayout.CENTER);
			contentPanel.setBackground(new Color(222, 184, 135));
			contentPanel.setLayout(new BorderLayout(4, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(255, 255, 255));
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				contentPanel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new GridLayout(0, 2, 4, 4));
				{
					JLabel lblNewLabel = new JLabel("Mã hóa đơn");
					lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(lblNewLabel);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Dialog", Font.BOLD, 14));
					textField_1.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					JLabel lblLoiPhng = new JLabel("Số phòng");
					lblLoiPhng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					lblLoiPhng.setHorizontalAlignment(SwingConstants.CENTER);
					lblLoiPhng.setFont(new Font("Dialog", Font.BOLD, 16));
					panel_1.add(lblLoiPhng);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Dialog", Font.BOLD, 14));
					textField_2.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					JLabel lblLoiPhng_1 = new JLabel("Loại phòng");
					lblLoiPhng_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblLoiPhng_1.setFont(new Font("Dialog", Font.BOLD, 16));
					lblLoiPhng_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_1.add(lblLoiPhng_1);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Vip", "Thường"}));
					panel_1.add(comboBox);
				}
				{
					JLabel lblNgyLp = new JLabel("Ngày lập");
					lblNgyLp.setHorizontalAlignment(SwingConstants.CENTER);
					lblNgyLp.setFont(new Font("Dialog", Font.BOLD, 16));
					lblNgyLp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_1.add(lblNgyLp);
				}
				{
					textField_3 = new JTextField();
					textField_3.setHorizontalAlignment(SwingConstants.CENTER);
					textField_3.setFont(new Font("Dialog", Font.BOLD, 14));
					textField_3.setColumns(10);
					textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_1.add(textField_3);
				}
				{
					JLabel lblGiPhng = new JLabel("Giờ vào");
					lblGiPhng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					lblGiPhng.setHorizontalAlignment(SwingConstants.CENTER);
					lblGiPhng.setFont(new Font("Dialog", Font.BOLD, 16));
					panel_1.add(lblGiPhng);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
					panel_1.add(comboBox);
				}
				{
					JLabel lblGiRa = new JLabel("Giờ ra");
					lblGiRa.setHorizontalAlignment(SwingConstants.CENTER);
					lblGiRa.setFont(new Font("Dialog", Font.BOLD, 16));
					lblGiRa.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_1.add(lblGiRa);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
					panel_1.add(comboBox);
				}
				{
					JLabel lblTnhTrng = new JLabel("Tình Trạng");
					lblTnhTrng.setHorizontalAlignment(SwingConstants.CENTER);
					lblTnhTrng.setFont(new Font("Dialog", Font.BOLD, 16));
					lblTnhTrng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					panel_1.add(lblTnhTrng);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Đang sử dụng", "Đã thanh toán"}));
					panel_1.add(comboBox);
				}
				{
					JLabel lblTnhTrng = new JLabel("Nhân viên lập");
					lblTnhTrng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					lblTnhTrng.setHorizontalAlignment(SwingConstants.CENTER);
					lblTnhTrng.setFont(new Font("Dialog", Font.BOLD, 16));
					panel_1.add(lblTnhTrng);
				}
				{
					textField = new JTextField();
					textField.setHorizontalAlignment(SwingConstants.CENTER);
					textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					textField.setFont(new Font("Dialog", Font.BOLD, 14));
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					JLabel lblSdtKhchHng = new JLabel("Sdt Khách Hàng");
					lblSdtKhchHng.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
					lblSdtKhchHng.setForeground(new Color(178, 34, 34));
					lblSdtKhchHng.setHorizontalAlignment(SwingConstants.CENTER);
					lblSdtKhchHng.setFont(new Font("Dialog", Font.BOLD, 16));
					panel_1.add(lblSdtKhchHng);
				}
				{
					textField_5 = new JTextField();
					textField_5.setFont(new Font("Dialog", Font.BOLD, 14));
					textField_5.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(textField_5);
					textField_5.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setPreferredSize(new Dimension(50, 30));
				contentPanel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_2 = new JLabel("NHẬP THÔNG TIN CẦN TÌM");
					lblNewLabel_2.setForeground(Color.WHITE);
					lblNewLabel_2.setBorder(new LineBorder(Color.WHITE));
					lblNewLabel_2.setBackground(Color.BLACK);
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setPreferredSize(new Dimension(43, 30));
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
					panel_1.add(lblNewLabel_2);
				}
			}
		}
		{
			JPanel panel_Result = new JPanel();
			getContentPane().add(panel_Result, BorderLayout.CENTER);
			panel_Result.setLayout(new BorderLayout(4, 4));
			{
				JPanel panel = new JPanel();
				panel_Result.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_2 = new JLabel("KẾT QUẢ");
					lblNewLabel_2.setPreferredSize(new Dimension(43, 30));
					lblNewLabel_2.setOpaque(true);
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setForeground(Color.WHITE);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
					lblNewLabel_2.setBorder(new LineBorder(Color.WHITE));
					lblNewLabel_2.setBackground(Color.BLACK);
					panel.add(lblNewLabel_2);
				}
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel_Result.add(scrollPane, BorderLayout.CENTER);
				{
					table = new JTable();
					table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Mã hóa đơn", "Sdt khách", "Giờ vào", "Giờ ra", "Ngày", "Nhân viên lập", "Tình trạng"
						}
					));
					scrollPane.setViewportView(table);
				}
			}
		}
	}
	
	public void cancelTimDatPhong() {
		this.setVisible(false);
		
	}
	public void okTimDatPhong() {
		
	}

}
