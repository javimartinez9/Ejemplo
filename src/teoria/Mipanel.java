package teoria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mipanel extends JFrame {
    public static void main(String[] args) {
        new Mipanel();
    }
    private JTextField t1,t2;
    private int suma;

    private JButton b;

    public Mipanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,500);
        setLayout(null);
        setVisible(true);

        b=new JButton("Pulsar");
        b.setBounds(180,50,100,30);
        add(b);

        t1=new JTextField("");
        t1.setBounds(120,20,100,30);
        add(t1);

        t2=new JTextField("");
        t2.setBounds(50,40,100,30);
        add(t2);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1=t1.getText();
                String s2=t2.getText();
                try {
                    int x = Integer.parseInt(s1);
                    int y = Integer.parseInt(s2);


                    JOptionPane.showMessageDialog(null, x + y);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"error"+ex.getMessage());
                }
            }
        });


    }
}
