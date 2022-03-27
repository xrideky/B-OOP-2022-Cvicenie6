package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);
        okno.setResizable(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("klikni");
        button.addActionListener(new MyPanel());
        okno.add(button);

        //okno.add(new MyCanvas());
        //okno.add(new MyPanel());

    }

}
