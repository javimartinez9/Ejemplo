package pLista;

import teoria.Mipanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame{
    public static void main(String[] args) {
        new Mipanel();

    }

    private JLabel etq1224i14;
    private TextField t;
    private JButton b;
    private JLabel j;

    private DefaultListModel datos;
    private JList lista;
    private JScrollPane scroll;

    public MiPanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,500);
        setLayout(null);
        setVisible(true);

        t=new TextField();
        b=new JButton();
        etq=new JLabel();

        t.setBounds(20,80,100,30);
        etq.setBounds(20,100,100,30);
        b.setBounds(150,230,150,30);

        add(b);
        add(etq);
        add(t);

        datos=new DefaultListModel();
        lista=new JList(datos);
        scroll=new JScrollPane(lista);

        lista.setEnabled(true);
        scroll.setBounds(150,60,150,150);
        add(scroll);

        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==t){
                datos.addElement(t.getText());
                etq.setText("Total:"+datos.size());
                t.setText("");
            }
            if(e.getSource()==b){
                datos.removeAllElements();
                etq.setText("Total:0");
            }
        }
    }
}
