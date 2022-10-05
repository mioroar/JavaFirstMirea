package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGui {
    public static void main(String[] args){
        JFrame frame = new JFrame("My First Gui") ;//создаем окно с названием
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);//размер окна
        JButton button1 = new JButton("AC Milan");// создаем кнопку с надписью на ней
        JButton button2 = new JButton("Real Madrid");// создаем кнопку с надписью на ней
        //frame.getContentPane().add(button);//добавляем кнопку на окно
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(500,400));
        panel.add(button1);
        panel.add(button2);
        JLabel label1 = new JLabel("Result: 0 X 0 ",JLabel.LEFT);
        JLabel label2 = new JLabel("Last Scorer: N/A ",JLabel.CENTER);
        JLabel label3 = new JLabel("Winner DRAW ",JLabel.RIGHT);
        frame.setPreferredSize(new Dimension(500,600));
        panel.add(label1,JLabel.VERTICAL);
        panel.add(label2,JLabel.VERTICAL);
        panel.add(label3,JLabel.VERTICAL);

        frame.getContentPane().add(panel);
        frame.pack();
        int i=0;
        //button1.addActionListener(() -> {
         //   i++;
        //});
        frame.setVisible(true);



    }
}
