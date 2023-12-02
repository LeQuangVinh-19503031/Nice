package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogNhanVien_ChamCong extends JDialog {
    private JTextField textField;

    public JDialogNhanVien_ChamCong() {
    	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        setModal(true);
        setTitle("Chấm công nhân viên");
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(240, 240, 240));

        JLabel titleLabel = new JLabel("Chấm công nhân viên");
        titleLabel.setForeground(new Color(50, 50, 50));
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 2, 10, 10));
        inputPanel.setBackground(new Color(240, 240, 240));

        JLabel employeeIdLabel = new JLabel("Mã nhân viên:");
        employeeIdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        employeeIdLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        inputPanel.add(employeeIdLabel);
        inputPanel.add(textField);

        contentPanel.add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(240, 240, 240));

        JButton btnChamCong = new JButton("CHẤM CÔNG");
        btnChamCong.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnChamCong.setBackground(new Color(50, 50, 50));
        btnChamCong.setForeground(new Color(0, 0, 0));
        btnChamCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện chấm công
            }
        });

        buttonPanel.add(btnChamCong);

        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPanel);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JDialogNhanVien_ChamCong dialog = new JDialogNhanVien_ChamCong();
            dialog.setVisible(true);
        });
    }
}
