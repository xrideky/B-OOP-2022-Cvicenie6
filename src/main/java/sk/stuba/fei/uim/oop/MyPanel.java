package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    @Override
    protected void paintComponent(Graphics g) {
        this.vlastnyPaint(g);
    }

    private void vlastnyPaint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(100,100,100 ,100);
        g.setColor(Color.BLACK);
        g.drawRect(100,100,100,100);

        g.setColor(Color.RED);
        g.fillPolygon(new int[] {80,220,150}, new int[] {100,100,50}, 3);

        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                g.setColor(Color.cyan);
                g.fillRect(110 + 45 * x, 110 + 45 * y, 35, 35);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("klikol si");
    }
}
