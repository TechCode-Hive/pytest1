import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/*
 * Client based form
 * 
 * Jbutton used to create a clickable button
 * Jtext label used as a container for labels
 * Jtext field used to capture information from a user in a single line
 * Jcheckbox used to switch or consider an option true or false
 * Jpanel a container that provides a platform to put other components within
 * 
 * 
 */
public class client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Client Profile");
        JButton btn = new JButton("Submit");

        btn.setBounds(100,100,95,30);
        frame.add(btn);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

       // WindowConstants.EXIT_ON_CLOSE;
        System.out.println("BYE");
        System.exit(0);
    }
}
