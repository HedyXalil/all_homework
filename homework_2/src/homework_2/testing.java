/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hedy
 */
public class testing extends JFrame implements ActionListener {


    public void actionPerformed(ActionEvent ae) {
        setTitle("we working on it");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        setBounds(200, 250, 310, 250);
        Container p = getContentPane();
        setLayout(null);
        JButton u = new JButton("good");
        u.setBounds(30, 100, 70, 30);
        p.add(u);
    }
    
}
