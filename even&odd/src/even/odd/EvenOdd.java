package even.odd;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class EvenOdd {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
    Scanner input = new Scanner(System.in);
    String b = JOptionPane.showInputDialog("Enter an Integer number:");
   int num = Integer.parseInt(b);
    if ( num % 2 == 0 )
        JOptionPane.showMessageDialog(null,"Entered number is even" );      
     else
        JOptionPane.showMessageDialog(null,"Entered number is odd" );  
   JFrame frame = new JFrame();
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(frame, message);
    if (answer== JOptionPane.YES_OPTION){}
    else if(answer==JOptionPane.NO_OPTION){System.exit(0);}
    else if (answer==JOptionPane.CANCEL_OPTION){System.exit(0);}
        }}}
