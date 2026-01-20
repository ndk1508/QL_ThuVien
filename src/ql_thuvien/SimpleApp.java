/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ql_thuvien;
import javax.swing.*;
import java.awt.event.*;

public class SimpleApp {
    public static void main(String[] args) {
        // Tạo khung cửa sổ
        JFrame frame = new JFrame("Quản lý thư viện");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Hiển thị giữa màn hình

        // Tạo nút bấm
        JButton btn = new JButton("Nhấn vào đây!");
        btn.setBounds(80, 60, 120, 40);

        // Thêm sự kiện khi nhấn nút
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Chào mừng bạn đến với App Thư Viện!");
            }
        });

        // Thêm nút vào cửa sổ
        frame.setLayout(null);
        frame.add(btn);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}