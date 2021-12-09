package Gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_admin extends Komponen {

    public GUI_admin() {
        initComponent();
    }

    public void initComponent(){
        setSize(700 , 400);
        setLayout(null);
        setLocationRelativeTo(null);

        labelAdmin.setBounds(270 , 10 , 240 , 40);
        labelAdmin.setFont(new Font("Calibri", Font.BOLD,25));
        labelAdmin.setForeground(new Color(20,1,188));
        add(labelAdmin);

        btnMhs.setBounds(20 , 100 , 200 , 40);
        add(btnMhs);

        btnKeluar.setBounds(470 , 300 , 200 , 40);
        add(btnKeluar);

        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GUI_Menu().setVisible(true);
            }
        });

        btnMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_mahasiswa().setVisible(true);
            }
        });
    }
}
