

package homework2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//it is just example
public class Homework2 {

 
    
    
    
    public static void main(String[] args) {
    checkbox bo =new checkbox();
    
        new checkbox();
        
  Frame f= new Frame("TextField Example");  
    TextField t1,t2;  
    t1=new TextField("Welcome to Javatpoint.");  
    t1.setBounds(50,100, 200,30);  
    t2=new TextField("AWT Tutorial");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    
    
    
     
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("it wonot run ");  
    }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
    }
    

