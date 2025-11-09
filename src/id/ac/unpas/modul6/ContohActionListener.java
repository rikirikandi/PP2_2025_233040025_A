package id.ac.unpas.modul06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContohActionListener {
    public static void main(String[] args) {
        // 1. Buat JFrame
        JFrame frame = new JFrame("Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // 2. Buat komponen
        JLabel label = new JLabel("Klik tombol di bawah");
        JButton button = new JButton("Klik Saya!");

        // 3. Buat Event Listener
        // Kita gunakan "anonymous inner class" di sini
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 3. Logika yang dieksekusi saat event terjadi
                label.setText("Tombol telah diklik!");
            }
        };

        // 4. Daftarkan listener ke source
        button.addActionListener(listener);

        // 5. Tambahkan komponen ke frame
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}