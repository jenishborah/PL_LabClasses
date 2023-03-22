import javax.swing.*;
public class FirstWork{
    public static void main(String args[]){
        JFrame f = new JFrame("Data Entry Form");


        JLabel a = new JLabel("Enter Your name:");
        a.setBounds(100, 100, 100, 40);
        JTextField t = new JTextField("");
        t.setBounds(220,100,200,50);

        JLabel b = new JLabel("Enter Your Age:");
        b.setBounds(100, 200, 100, 40);
        JTextField t2 = new JTextField("");
        t2.setBounds(220,200,200,50);

       
        JLabel c = new JLabel("Enter Your Address:");
        c.setBounds(100, 300, 200, 50);
        JTextField t3 = new JTextField("");
        t3.setBounds(220,300,200,50);

        
        JButton d = new JButton("Submit");
        d.setBounds(220, 440, 100, 40);

        f.add(d);
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(t);
        f.add(t2);
        f.add(t3);
        
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
}
}
