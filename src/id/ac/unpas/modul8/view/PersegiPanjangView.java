package id.ac.unpas.modul8.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PersegiPanjangView extends JFrame {
    // Komponen UI sebagai atribut
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    private JLabel lblHasilLuas = new JLabel("-");
    private JLabel lblHasilKeliling = new JLabel("-");
    private JButton btnHitungLuas = new JButton("Hitung Luas");
    private JButton btnHitungKeliling = new JButton("Hitung Keliling");
    private JButton btnReset = new JButton("Reset");

    public PersegiPanjangView() {
        // Inisialisasi UI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new GridLayout(8, 2, 10, 10)); // Grid 4 baris
        this.setTitle("MVC Kalkulator");

        this.add(new JLabel("Panjang:"));
        this.add(txtPanjang);
        this.add(new JLabel("Lebar:"));
        this.add(txtLebar);
        this.add(new JLabel("Hasil Luas:"));
        this.add(lblHasilLuas);
        this.add(new JLabel("Hasil Keliling:"));
        this.add(lblHasilKeliling);
        this.add(new JLabel(""));
        this.add(btnHitungLuas);
        this.add(new JLabel(""));
        this.add(btnHitungKeliling);
        this.add(new JLabel(""));
        this.add(btnReset);
    }
    // Mengambil nilai panjang dari Textfield
    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }

    // Mengambil nilai lebar dari Textfield
    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }

    // Menampilkan hasil ke Label
    public void setHasilLuas(double hasil) {
        lblHasilLuas.setText(String.valueOf(hasil));
    }

    // Menampilkan hasil keliling ke Label
    public void setHasilKeliling(double keliling) {
        lblHasilKeliling.setText(String.valueOf(keliling));
    }

    // Menampilkan pesan error (jika input bukan angka)
    public void tampilkanPesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    // Menambahkan listener untuk tombol hitung luas
    public void addHitungLuas(ActionListener listener) {
        btnHitungLuas.addActionListener(listener);
    }

    // Menambahkan listener untuk tombol hitung keliling
    public void addHitungKeliling(ActionListener listener) {
        btnHitungKeliling.addActionListener(listener);
    }

    // Menambahkan listener untuk tombol reset
    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }

    //Mengosongkan input dan mengatur ulang hasil
    public void resetForm() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasilLuas.setText("-");
        lblHasilKeliling.setText("-");
    }
}