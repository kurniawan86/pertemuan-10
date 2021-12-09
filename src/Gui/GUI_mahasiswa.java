package Gui;


import AllObject.AllObjectController;
import Gui.Komponen;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class GUI_mahasiswa extends Komponen {

    DefaultTableModel modelMhs;
    JScrollPane sp_Mhs = new JScrollPane();
    JTable tbl_Mhs = new JTable();
    Object a;

    public GUI_mahasiswa() {
        initComponent();
    }

    public void initComponent(){
        setSize(700 , 500);
        setLayout(null);
        setLocationRelativeTo(null);

        labelNpm.setBounds(20 , 30 , 70 , 30);
        labelNpm.setFont(new Font("Arial" , Font.BOLD,14));
        txtNpm.setBounds(90 , 34, 150 , 20);
        add(labelNpm);
        add(txtNpm);

        labelNama.setBounds(20 , 60 , 70 , 30);
        labelNama.setFont(new Font("Arial" , Font.BOLD,14));
        txtNama.setBounds(90 , 64, 150 , 20);
        add(labelNama);
        add(txtNama);

        labelNohp.setBounds(20 , 90 , 70 , 30);
        labelNohp.setFont(new Font("Arial" , Font.BOLD,14));
        txtNohp.setBounds(90 , 94, 150 , 20);
        add(labelNohp);
        add(txtNohp);

        sp_Mhs.setViewportView(tbl_Mhs);
        modelMhs = (DefaultTableModel) tbl_Mhs.getModel();
        tbl_Mhs.setDefaultEditor(Object.class, null);
        modelMhs.addColumn("Nama");
        modelMhs.addColumn("Npm");
        modelMhs.addColumn("No HP");
        sp_Mhs.setBounds(380 , 30 , 300 , 400);
        add(sp_Mhs);
        btnInsert.setBounds(20 , 180 , 200 , 30);
        add(btnInsert);

//        Cetak data dulu

        cetakMhs();
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    success((MouseEvent) a);
                    AllObjectController.mahasiswaController.insert(txtNama.getText(),txtNpm.getText(),txtNohp.getText());
                    cetakMhs();
                }catch (Exception ex){
                    failed((MouseEvent) a);
                }
            }
        });
    }

    public void cetakMhs(){
        modelMhs.setRowCount(0);
        try{
            ResultSet result = AllObjectController.mahasiswaController.getMahasiswa();
            while (result.next()){
                Object[] obj = new Object[3];
                obj[0] = result.getString("nama");
                obj[1] = result.getString("npm");
                obj[2] = result.getString("no_hp");
                modelMhs.addRow(obj);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
