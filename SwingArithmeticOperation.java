package SwingArithmeticOperation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleCalculate {

	public static void main(String[] args) {
		JFrame f=new JFrame();
        f.setLayout(null);
        JLabel lab1=new JLabel("Enter Number 1: ");
        JLabel lab2=new JLabel("Enter Number 2: ");
        JLabel lab3=new JLabel("Result: ");

        final JTextField text1=new JTextField(20);
        final JTextField text2=new JTextField(20);
        final JTextField text3=new JTextField(20);

        JButton b1=new JButton("Add");
        JButton b2=new JButton("Subtract");
        JButton b3=new JButton("Multiply");
        JButton b4=new JButton("Division");

        lab1.setBounds(20,20,100,20);
        text1.setBounds(140,20,100,20);

        lab2.setBounds(20,50,100,20);
        text2.setBounds(140,50,100,20);

        lab3.setBounds(20,80,100,20);
        text3.setBounds(140,80,100,20);

        b1.setBounds(260,80,80,20);
        b2.setBounds(360,80,80,20);

        b3.setBounds(460,80,80,20);
        b4.setBounds(560,80,80,20);

        b1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
                 int n1=Integer.parseInt(text1.getText());
                 int n2=Integer.parseInt(text2.getText());
                 int cal=n1+n2;
                 text3.setText(Integer.toString(cal));
             }
        });
         b2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
                 int n1=Integer.parseInt(text1.getText());
                 int n2=Integer.parseInt(text2.getText());
                 int cal=0;
                 if(n1>n2){
                 cal=n1-n2;
                 }
                 else if(n2>n1){
                     cal=n2-n1;
                 }
                 text3.setText(Integer.toString(cal));
             }
        });
         b3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
                 int n1=Integer.parseInt(text1.getText());
                 int n2=Integer.parseInt(text2.getText());
                 int cal=n1*n2;
                 text3.setText(Integer.toString(cal));
             }
        });
         b4.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
                  int n1=Integer.parseInt(text1.getText());
                 int n2=Integer.parseInt(text2.getText());
                 int cal=0;
                 if(n1>n2){
                 cal=n1/n2;
                 }
                 else if(n2>n1){
                     cal=n2/n1;
                 }
                 text3.setText(Integer.toString(cal));
             }
        });

        f.add(lab1);
        f.add(text1);
        f.add(lab2);    
        f.add(text2);
        f.add(lab3);    
        f.add(text3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setVisible(true);
        f.setSize(700,250);
    }
	}

