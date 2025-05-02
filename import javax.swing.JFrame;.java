import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Dimension;
public class Main extends JFrame {
public static void main(String[] args){
new Main().display();
}
private void display(){
setSize(new Dimension(400, 300));
Container c = getContentPane();
JLabel label1 = new JLabel("Hello");
c.add(label1);
setVisible(true);
}
}
