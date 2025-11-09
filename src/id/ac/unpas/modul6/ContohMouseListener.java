package id.ac.unpas.modul06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContohMouseListener {
    // author class
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 200));

        // 2. Mouse Event Listener (menggunakan MouseAdapter)
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Saat mouse menekan, ubah warna jadi biru
                panel.setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Saat mouse keluar, kembalikan warna
                panel.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Saat diklik, tampilkan koordinat titik
                System.out.println("Mouse diklik di: x=" + e.getX() + ", y=" + e.getY());
            }
        };

        panel.addMouseListener(adapter);

        frame.add(panel);
        frame.setVisible(true);
    }
}