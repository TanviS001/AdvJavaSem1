import java.awt.*;
import java.awt.event.*;

public class Textfield{
public static void main(String args[]){
Frame f=new Frame("Button");
TextField tf=new TextField("Hey!");

tf.setBounds(100, 100, 100, 100);

f.add(tf);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);

}
}