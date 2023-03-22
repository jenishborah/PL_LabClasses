import javax.swing.*;
public class InheritanceApp extends JFrame{
        public static void main(String args[]){
        InheritanceApp x = new InheritanceApp();
        JButton b = new JButton("Submit");
        b.setBounds(130,100,100,40);
        x.add(b);
        x.setSize(400,500);
        x.setVisible(true);
        
}
}