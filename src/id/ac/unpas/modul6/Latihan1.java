package id.ac.unpas.modul06;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Latihan1 {
    public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // 2. Buat layer dibagian atas menggunakan JTextField
        JTextField layar = new JTextField();
        frame.add(layar, BorderLayout.NORTH);


        // 3. Buat panel untuk tombol dengan gridlayout 4 baris 4 kolom
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4,4, 5, 5));

        // 4. Tambahkan 16 tombol (10 angka yaitu 0-9 dan 4 operator (+, -, *, /))
        panelTombol.add(new JButton("7"));
        panelTombol.add(new JButton("8"));
        panelTombol.add(new JButton("9"));
        panelTombol.add(new JButton("/"));
        panelTombol.add(new JButton("4"));
        panelTombol.add(new JButton("5"));
        panelTombol.add(new JButton("6"));
        panelTombol.add(new JButton("*"));
        panelTombol.add(new JButton("1"));
        panelTombol.add(new JButton("2"));
        panelTombol.add(new JButton("3"));
        panelTombol.add(new JButton("-"));
        panelTombol.add(new JButton("0"));
        panelTombol.add(new JButton("."));
        panelTombol.add(new JButton("="));
        panelTombol.add(new JButton("+"));

        // 5, Tambahkan panel ke frame dibagan center
        frame.add(panelTombol, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}