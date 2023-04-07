import javax.swing.*;
public class GAssignment{
    public static void main(String args[]){
        JFrame f = new JFrame("Student Details Database");


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

        
        JLabel h = new JLabel("Enter Your name:");
        h.setBounds(100, 400, 100, 40);
        JTextField t4 = new JTextField("");
        t4.setBounds(220,400,200,50);

        JLabel e = new JLabel("Enter Your Age:");
        e.setBounds(100, 500, 100, 40);
        JTextField t5 = new JTextField("");
        t5.setBounds(220,500,200,50);

       
        JLabel g = new JLabel("Enter Your Address:");
        g.setBounds(100, 600, 200, 50);
        JTextField t6 = new JTextField("");
        t6.setBounds(220,600,200,50);

        
        JButton d = new JButton("Submit");
        d.setBounds(220, 700, 100, 40);

        f.add(d);
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(h);
        f.add(e);
        f.add(g);
        f.add(t);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
}
}
