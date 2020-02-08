
package homework_2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hedy
 */
public class homework_2 extends JFrame {
 JButton b1 = new JButton("buy");
          JButton b2 = new JButton("cancel");
    
          JLabel s =new JLabel("your name");
          JLabel s1=new JLabel("input $ you have");
          JLabel s2=new JLabel("where live");
          JLabel s3=new JLabel("type you like");          
          
          JTextField name =new JTextField();
          JTextField in_m =new JTextField();
          JTextField loc =new JTextField();
                    
          String[] AL={"GPU","CORI"};
          JComboBox com =new JComboBox (AL);
          public homework_2 (){
          setTitle("buy pc online");
          Container p=getContentPane();
              setBounds(400, 400, 400, 400);
              
            s.setBounds(50, 10, 150, 100);             name.setBounds(170, 50, 100, 30);
            
            s1.setBounds(50, 50, 150, 100);                in_m.setBounds(170, 90, 100, 30);

             s2.setBounds(50, 90, 150, 100);                     loc.setBounds(170, 140, 100, 30);

             s3.setBounds(50, 130, 150, 100);               com.setBounds(170, 170, 100, 30);
             
         
                  b1.setBackground(Color.blue);
                  b2.setBackground(Color.red);
          
                    
           b1.setBounds(130, 300, 70, 30);
          b2.setBounds(220,300, 70, 30);
              setLayout(null);
              
              p.add(s);
              p.add(s1);
              p.add(s2);
              p.add(s3);
              p.add(com);
              p.add(name);
              p.add(in_m);
              p.add(loc);
              p.add(b1);
              p.add(b2);
              p.add(com);
          b1.addActionListener(new testing());
              
          }
          
    public static void main(String[] args) {
        
        homework_2 ob = new homework_2();
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setVisible(true);
    }
    
}
