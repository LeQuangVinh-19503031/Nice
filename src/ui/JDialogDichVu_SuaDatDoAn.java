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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.border.MatteBorder;

public class JDialogDichVu_SuaDatDoAn extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GD_DichVu home;
	private JTable table;
	private JScrollBar scrollBar;
	private JLabel lbl_CountFood;
	private String ten;

	/**
	 * Create the dialog.
	 * 
	 * @param ten
	 * @param gd_DichVu
	 */
	public JDialogDichVu_SuaDatDoAn(GD_DichVu gd_DichVu, String ten) {
		this.ten = ten;
		this.home = gd_DichVu;
		setTitle("ĐẶT ĐỒ ĂN");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		Point p = MouseInfo.getPointerInfo().getLocation();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(screen.width / 6, screen.height / 6 - 30, screen.width * 2 / 3, screen.height * 2 / 3);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(222, 184, 135));
		contentPanel.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(new Color(0, 0, 0))));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(4, 4));
		{
			JPanel pnl_TitleBookFood = new JPanel();
			pnl_TitleBookFood.setBackground(Color.BLACK);
			pnl_TitleBookFood.setPreferredSize(new Dimension(10, 30));
			pnl_TitleBookFood.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPanel.add(pnl_TitleBookFood, BorderLayout.NORTH);
			pnl_TitleBookFood.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("SỬA MÓN ĂN");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				pnl_TitleBookFood.add(lblNewLabel);
			}
		}
		{
			JPanel panel_ListBookFood = new JPanel();
			panel_ListBookFood.setOpaque(false);
			panel_ListBookFood.setBackground(Color.WHITE);
			contentPanel.add(panel_ListBookFood, BorderLayout.WEST);
			panel_ListBookFood.setLayout(new BorderLayout(4, 0));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setPreferredSize(new Dimension(100, 10));
				panel_ListBookFood.add(panel_1, BorderLayout.EAST);
				panel_1.setLayout(new BorderLayout(0, 4));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_2.setPreferredSize(new Dimension(10, 120));
					panel_1.add(panel_2, BorderLayout.NORTH);
					panel_2.setLayout(new GridLayout(0, 1, 0, 0));
					{
						JLabel lblNewLabel_4 = new JLabel("SỬA MÓN ĂN");
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						panel_2.add(lblNewLabel_4);
					}
					{
						JLabel lblNewLabel_4 = new JLabel("PHÒNG");
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						panel_2.add(lblNewLabel_4);
					}
					{
						JLabel lblNewLabel_4 = new JLabel(ten);
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_2.add(lblNewLabel_4);
					}
				}
				{
					{
						JPanel panel_2 = new JPanel();
						panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
						panel_2.setPreferredSize(new Dimension(10, 200));
						panel_1.add(panel_2, BorderLayout.SOUTH);
						panel_2.setLayout(new GridLayout(0, 1, 0, 0));
						{
							JLabel lblNewLabel_4 = new JLabel("SỐ LƯỢNG");
							lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
							lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
							panel_2.add(lblNewLabel_4);
						}
						{
							scrollBar = new JScrollBar();
							scrollBar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
							scrollBar.setOrientation(JScrollBar.HORIZONTAL);
							scrollBar.addAdjustmentListener(new AdjustmentListener() {
								public void adjustmentValueChanged(AdjustmentEvent e) {
									changeValueCountFood();
								}
							});
							lbl_CountFood = new JLabel("1");
							lbl_CountFood.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
							lbl_CountFood.setForeground(Color.BLUE);
							lbl_CountFood.setHorizontalAlignment(SwingConstants.CENTER);
							lbl_CountFood.setFont(new Font("Tahoma", Font.BOLD, 13));
							panel_2.add(lbl_CountFood);
						}
						{
							scrollBar.setMaximum(1000);
							scrollBar.setMinimum(1);
							scrollBar.setValue(1);
							scrollBar.setBlockIncrement(1);
							panel_2.add(scrollBar);
						}
						JButton btnNewButton = new JButton("BỚT");
						btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
						panel_2.add(btnNewButton);
						{
							JButton btnNewButton_1 = new JButton("THÊM");
							btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
							panel_2.add(btnNewButton_1);
						}
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_ListBookFood.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 4));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_1.add(panel_2, BorderLayout.NORTH);
					panel_2.setLayout(new BorderLayout(0, 0));
					{
						JPanel panel_3 = new JPanel();
						panel_3.setBackground(Color.BLACK);
						panel_3.setPreferredSize(new Dimension(10, 30));
						panel_2.add(panel_3);
						panel_3.setLayout(new BorderLayout(0, 0));
						{
							JLabel lblNewLabel_2 = new JLabel("CÁC MÓN ĐÃ GỌI");
							lblNewLabel_2.setForeground(Color.WHITE);
							lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
							lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
							panel_3.add(lblNewLabel_2);
						}
					}
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						table = new JTable();
						table.setModel(new DefaultTableModel(new Object[][] {},
								new String[] { "LO\u1EA0I S\u1EA2N PH\u1EA8M", "T\u00CAN \u0110\u1ED2 \u0102N",
										"S\u1ED0 L\u01AF\u1EE2NG", "GI\u00C1 TI\u1EC0N", "T\u00CCNH TR\u1EA0NG" }));
						scrollPane.setViewportView(table);
					}
				}
			}
		}
		{
			JPanel pnl_ListProduct = new JPanel();
			pnl_ListProduct.setPreferredSize(new Dimension(300, 10));
			contentPanel.add(pnl_ListProduct, BorderLayout.CENTER);
			pnl_ListProduct.setLayout(new BorderLayout(4, 4));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				pnl_ListProduct.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(Color.BLACK);
					panel_2.setPreferredSize(new Dimension(10, 30));
					panel_1.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					{
						JLabel lblNewLabel_1 = new JLabel("MÓN ĂN HIỆN CÓ");
						lblNewLabel_1.setForeground(Color.WHITE);
						lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
						panel_2.add(lblNewLabel_1);
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				pnl_ListProduct.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 4));
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(Color.BLACK);
					panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					panel_1.add(panel_2, BorderLayout.NORTH);
					panel_2.setLayout(new BorderLayout(5, 0));
					{
						JLabel lblNewLabel_3 = new JLabel("LOẠI ĐỒ ĂN");
						lblNewLabel_3.setForeground(Color.WHITE);
						lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
						lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_3.setPreferredSize(new Dimension(100, 30));
						panel_2.add(lblNewLabel_3, BorderLayout.WEST);
					}
					{
						JComboBox comboBox = new JComboBox();
						comboBox.setPreferredSize(new Dimension(100, 30));
						panel_2.add(comboBox);
					}
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						JList list = new JList();
						list.setFont(new Font("Tahoma", Font.PLAIN, 14));
						scrollPane.setViewportView(list);
						list.setModel(new AbstractListModel() {
							String[] values = new String[] { "A", "B", "23", "123", "123", "123", "12", "A", "B", "23",
									"123", "123", "123", "12A", "B", "23", "123", "123", "123", "12", "A", "B", "23",
									"123", "123", "123", "12A", "B", "23", "123", "123", "123", "12", "A", "B", "23",
									"123", "123", "123", "12" };

							public int getSize() {
								return values.length;
							}

							public Object getElementAt(int index) {
								return values[index];
							}
						});
					}
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setVgap(10);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("LƯU");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addBookService();
					}
				});
				okButton.setPreferredSize(new Dimension(300, 30));
				okButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("HỦY");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						closeDialog();
					}
				});
				cancelButton.setPreferredSize(new Dimension(150, 30));
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void closeDialog() {
		this.setVisible(false);

	}

	protected void addBookService() {
		int n = JOptionPane.showConfirmDialog(null, "Xác nhận sửa món ăn " + ten + " ?", "Xác nhận sửa món ăn",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			this.setVisible(false);
		} else if (n == JOptionPane.CANCEL_OPTION)
			;
		else
			this.setVisible(false);

	}

	protected void changeValueCountFood() {
		lbl_CountFood.setText(scrollBar.getValue() + "");

	}

}
