package teoria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mipanel2 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Mipanel2();
    }

    private JTextField t;

    private JButton[] b;

    public Mipanel2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 500);
        setLayout(null);
        setVisible(true);

        b = new JButton[16];
        int indice = 0;
        for (int x = 40; x <= 250; x += 70) {
            for (int y = 100; y <= 310; y += 70) {
                b[indice] = new JButton("" + indice);
                b[indice].setBounds(x, y, 50, 40);
                add(b[indice]);
                b[indice].addActionListener(this);
                indice++;
            }
        }

        t = new JTextField("");
        t.setBounds(120, 20, 100, 30);
        add(t);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 16; i++) {
            if (i < 10 && e.getSource() == b[i]) {
                t.setText(t.getText() + b[i].getText());
            }
        }
    }
}
