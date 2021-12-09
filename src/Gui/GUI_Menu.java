package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Menu extends Komponen {

    public GUI_Menu() {
        initComponent();
    }

    public void initComponent(){
        setSize(300 , 280);
        setLayout(null);
        setLocationRelativeTo(null);

        btnAdmin.setBounds(5 , 10 , 275 , 100);
        btnAdmin.setFont(new Font("Arial" , Font.BOLD,17));
        add(btnAdmin);

        btnLogin.setBounds(4, 130 , 275 , 100);
        btnLogin.setFont(new Font("Arial" , Font.BOLD,17));
        add(btnLogin);

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GUI_admin().setVisible(true);
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//
            }
        });
    }
}
