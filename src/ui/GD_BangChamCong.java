package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GD_BangChamCong extends JPanel {
    private JTable table;

    public GD_BangChamCong() {
        setLayout(new BorderLayout(4, 4));
        setBackground(Color.WHITE);

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLACK);
        add(headerPanel, BorderLayout.NORTH);

        JLabel titleLabel = new JLabel("BẢNG GIỜ CÔNG NHÂN VIÊN");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(titleLabel);

        // Feature Panel
        JPanel featurePanel = new JPanel();
        featurePanel.setPreferredSize(new Dimension(10, 60));
        featurePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        featurePanel.setBackground(new Color(255, 140, 0));
        add(featurePanel, BorderLayout.SOUTH);
        featurePanel.setLayout(new BorderLayout(5, 0));

        JPanel listFeaturePanel = new JPanel();
        listFeaturePanel.setBackground(Color.WHITE);
        featurePanel.add(listFeaturePanel, BorderLayout.CENTER);
        listFeaturePanel.setLayout(new GridLayout(1, 1, 5, 0));

        JPanel featureButtonsPanel = new JPanel();
        listFeaturePanel.add(featureButtonsPanel);

        JButton printButton = new JButton("In");
        printButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        featureButtonsPanel.add(printButton);

        JButton cancelButton = new JButton("Hủy");
        cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        featureButtonsPanel.add(cancelButton);

        // Main Content Panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(0, 250, 154));
        add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(4, 4));

        // Info Panel
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPanel.add(infoPanel, BorderLayout.NORTH);
        infoPanel.setLayout(new BorderLayout(0, 0));

        JPanel infoLabelPanel = new JPanel();
        infoLabelPanel.setBackground(Color.BLACK);
        infoPanel.add(infoLabelPanel, BorderLayout.WEST);

        JLabel infoLabel = new JLabel("THÔNG TIN GIỜ CÔNG");
        infoLabel.setPreferredSize(new Dimension(200, 30));
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabelPanel.add(infoLabel);

        // Table Panel
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setOpaque(false);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "CHỨC VỤ", "SỐ NGÀY LÀM", "TỔNG GIỜ CÔNG"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(103);
        scrollPane.setViewportView(table);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.getContentPane().add(new GD_BangChamCong());
            frame.setVisible(true);
        });
    }
}
