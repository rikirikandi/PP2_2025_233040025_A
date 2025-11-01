package id.ac.unpas.modul05;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Label ada di Atas (NORTH)");

                // Tombol-tombol dengan posisi berbeda
                JButton buttonSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                JButton buttonWest = new JButton("WEST");
                JButton buttonCenter = new JButton("CENTER");
                JButton buttonEast = new JButton("EAST");

                // Tambahkan aksi ke masing-masing tombol
                buttonSouth.addActionListener(e -> label.setText("Tombol di SOUTH diklik!"));
                buttonWest.addActionListener(e -> label.setText("Tombol di WEST diklik!"));
                buttonEast.addActionListener(e -> label.setText("Tombol di EAST diklik!"));
                buttonCenter.addActionListener(e -> label.setText("Tombol di CENTER diklik!"));

                // Tambahkan komponen ke frame
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}