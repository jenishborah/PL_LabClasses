import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample implements ActionListener {
 JFrame f = new JFrame("Interest Rate Calculator");

 
 JTextField t,t2,t3,r,t4;
 JButton d,g;
 JLabel a,b,j,k,l;
 TextFieldExample(){
    a = new JLabel("Enter Your name:");
    a.setBounds(100, 100, 100, 40);
    t = new JTextField("");
    t.setBounds(220,100,200,50);

    b = new JLabel("Your Amout:");
    b.setBounds(100, 200, 100, 40);
    t2 = new JTextField("");
    t2.setBounds(220,200,200,50);

    j = new JLabel("Interest Rate:");
    j.setBounds(100, 300, 100, 40);
    r = new JTextField();
    r.setBounds(220,300,200,50);

    k = new JLabel("Time(Years):");
    k.setBounds(100, 400, 100, 40);
    t4 = new JTextField();
    t4.setBounds(220,400,200,50);

    l = new JLabel("Total Interest:");
    l.setBounds(100, 500, 100, 40);
    t3 = new JTextField();
    t3.setBounds(220,500,200,50);
    t3.setEditable(false);

     d = new JButton("Simple");
     d.setBounds(220, 640, 100, 40);

     g = new JButton("Compound");
     g.setBounds(340, 640, 100, 40);
 
 f.add(a);
 f.add(b);
 f.add(j);
 f.add(t);
 f.add(l);
 f.add(k);
 f.add(t4);
 f.add(t2);
 f.add(t3);
 f.add(d);
 f.add(g);
 f.add(r);
 d.addActionListener(this);
 g.addActionListener(this); 
 f.setSize(800,1000);
 f.setLayout(null);
 f.setVisible(true);
 
 }
 public void actionPerformed(ActionEvent e) {
    double x,y,z;
    try{
        String s1=t2.getText();
        x=Double.parseDouble(s1);
    }
    catch(NumberFormatException ex){
        t3.setText("Error");
        return;
    }
    
    try{
        String s2=t4.getText();
        y=Double.parseDouble(s2);
    }
    catch(NumberFormatException ex){
        t3.setText("Error");
        return;
    }

    try{
        String s3=r.getText();
        z=Double.parseDouble(s3);
    }
    catch(NumberFormatException ex){
        t3.setText("Error");
        return;
    }

    double c=0;
    if(e.getSource()==d){
    c=x*y*(z/100);
    }
    else if(e.getSource()==g){
    c= x*(Math.pow((1 + z / 100), y));
    }
    String result=String.valueOf(c);
    t3.setText(result);
    }
    
 
   public static void main(String[] args) {
    new TextFieldExample();
   } }