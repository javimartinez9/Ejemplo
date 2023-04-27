package PradioButton2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mipanel extends JFrame {
    public static void main(String[] args) {
        new Mipanel();
    }

    private JButton b;
    private JRadioButton[] v;
    private ButtonGroup g;

    public Mipanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,500);
        setLayout(null);

        b=new JButton("Mostrar");
        b.setBounds(30,30,130,30);
        add(b);

        int y=30;


        v=new JRadioButton[3];
        for (int i = 0; i < v.length; i++) {
            v[i]=new JRadioButton(""+i);
            v[i].setBounds(30,y,100,30);
            add(v[i]);
        }

        g=new ButtonGroup();

        b.addActionListener(new Listener());
        setVisible(true);
    }
    public class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s=new String();
            for (int i = 0; i < v.length; i++) {
                if(v[i].isSelected()){
                    s+=v[i].getText();
                }
            }
            if(s.isEmpty()) s="nada";

            JOptionPane.showMessageDialog(null,s);
        }
    }
}

