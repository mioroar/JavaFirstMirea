package ru.mirea.task5;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
public class Shape extends JFrame {

    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;

    Shape()
    {
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocation(600,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    void randomShapes(int shapes,Graphics2D g){
        for(int i =0;i<shapes;i++)
        {
            int choise = (int)(Math.random()*6);

            switch(choise){
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;


                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;


                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                    break;


                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;


                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100
                    );
                    break;

                default:
                    break;
            }
        }
    }
    public void paint(Graphics g2){
        Graphics2D g = (Graphics2D) g2;
        randomShapes(20,g);
    }

    public static void main(String[] args) {
        Shape app = new Shape();
    }



}
