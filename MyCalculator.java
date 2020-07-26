package ru.geekbrains.Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class MyCalculator extends JFrame
{
    public MyCalculator()
    {
        setTitle("My Calculator");
        setLocation(650, 200);
        setSize(500, 500);
        GridLayout layout = new GridLayout(4, 4);
        JPanel btnPanel = new JPanel(layout);

        MyCalculator MyCalculator = new MyCalculator();
        add(btnPanel);
    }

    private JButton display;
    private JPanel btnPanel;
    private double result;
    private String lastCommand;
    private boolean start;

    {
        lastCommand = "=";
        start = true;
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        JTextArea text = new JTextArea(1, 10);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");

        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton mutliple = new JButton("*");
        JButton divide = new JButton("/");
        JButton equals = new JButton("=");

        JButton clear = new JButton("C");

        btnPanel.add(button0);
        btnPanel.add(button1);
        btnPanel.add(button2);
        btnPanel.add(button3);
        btnPanel.add(button4);
        btnPanel.add(button5);
        btnPanel.add(button6);
        btnPanel.add(button7);
        btnPanel.add(button8);
        btnPanel.add(button9);
        btnPanel.add(add);
        btnPanel.add(mutliple);
        btnPanel.add(subtract);
        btnPanel.add(divide);
        Component add1 = btnPanel.add(clear);
        btnPanel.add(equals);
    }

    ActionListener actionListener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Scanner x = new Scanner(System.in);

            public void calculate()
            {
                if (lastCommand.equals("+"))
                    return += x;
                else if (lastCommand.equals("-"))
                    result -= x;
                else if (lastCommand.equals("*"))
                    result *= x;
                else if (lastCommand.equals("/"))
                    result /= x;
                else if (lastCommand.equals("="))
                    result = x;
                display.setText("" + result);
            }

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
        };
    };
}
