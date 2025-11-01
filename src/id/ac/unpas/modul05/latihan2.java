package id.ac.unpas.modul05;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class latihan2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Jendela Dengan Label");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 1. buat komponen JLabel
                JLabel label = new JLabel("Ini adalah JLabel.");

                // 2. Tambahkan JLabel ke JFrame
                // secara default, JFrame menggunakan BorderLayout,
                // dan .add() akan menambahkan ke bagian tengah (center).
                frame.add(label);

                frame.setVisible(true);
            }
        });
    }
}
