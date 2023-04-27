package pRadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mipanel extends JFrame {
    public static void main(String[] args) {
        new Mipanel();
    }

    private JButton b;
    private JRadioButton r1,r2,r3;
    private ButtonGroup g;

    public Mipanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,500);
        setLayout(null);

        b=new JButton("Mostrar");
        r1=new JRadioButton("A");
        r2=new JRadioButton("B");
        r3=new JRadioButton("C");

        b.setBounds(30,30,130,30);
        r1.setBounds(30,60,60,30);
        r2.setBounds(30,90,60,30);
        r3.setBounds(30,120,60,30);

        add(b);
        add(r1);
        add(r2);
        add(r3);

        g=new ButtonGroup();

        g.add(r1);
        g.add(r2);

        b.addActionListener(new Listener());
        setVisible(true);
    }
    public class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s=new String();
            if(r1.isSelected()) s+=r1.getText();
            if(r2.isSelected()) s+=r2.getText();
            if(r3.isSelected()) s+=r1.getText();
            if(s.isEmpty()) s="nada";

            JOptionPane.showMessageDialog(null,s);
        }
    }
}
