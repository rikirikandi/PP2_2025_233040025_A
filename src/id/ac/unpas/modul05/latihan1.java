package id.ac.unpas.modul05;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class latihan1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Jendela Pertamaku");


                // 2. Atur ukuran jendela
                frame.setSize(400, 300);

                // 3.
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 4. buat jendela
                frame.setVisible(true);
            }
        });
    }
}
