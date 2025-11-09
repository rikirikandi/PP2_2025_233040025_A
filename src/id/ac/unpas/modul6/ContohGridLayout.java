package id.ac.unpas.modul06;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ContohGridLayout {
    public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Contoh GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 2. Atur layout frame menjadi GridLayout 3 baris, 2 kolom
        // Kita juga bisa mengatur jarak antar komponen
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 baris, 2 kolom, 5px h-gap, 5px v-gap

        // 3. Tambahkan 6 Komponen (3 * 2 = 6)
        frame.add(new JLabel("Label1"));
        frame.add(new JTextField());
        frame.add(new JLabel("Label2"));
        frame.add(new JPasswordField());
        frame.add(new JButton("Login"));
        frame.add(new JButton("Batal"));

        // 4. Tampilkan frame
        frame.setVisible(true);
    }
}