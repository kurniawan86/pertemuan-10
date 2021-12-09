package Gui;

import javax.swing.*;

public class Komponen extends JFrame {

    //Jlabel
    protected JLabel labelAdmin = new JLabel("=== Admin ===");

    protected JLabel labelNpm = new JLabel("NPM : ");
    protected JLabel labelNohp = new JLabel("No HP : ");
    protected JLabel labelNama = new JLabel("Nama : ");

    //JtextFIeld
    protected JTextField txtNpm = new JTextField();
    protected JTextField txtNohp = new JTextField();
    protected JTextField txtNama = new JTextField();

    //Jbutton
    protected JButton btnAdmin = new JButton("Admin");
    protected JButton btnLogin = new JButton("Login(Belum)");
    protected JButton btnMhs = new JButton("Mahasiswa");
    protected JButton btnKeluar = new JButton("Keluar");
    protected JButton btnInsert = new JButton("Insert");

    public void success(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Sukses Tambah Data !!");
    }
    public void failed(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Gagal Tambah Data !!");
    }
    public void error(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Error !!");
    }
}
