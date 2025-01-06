import java.awt.*;

public class CheckBoxExample{
public static void main(String args[]){
Frame f = new Frame("Checkbox example");
TextField tf = new TextField("Choose:");
Checkbox cb1=new Checkbox("Java");
Checkbox cb2=new Checkbox("C++");

tf.setBounds(10, 100, 200, 30);
cb1.setBounds(10, 150, 250, 30);
cb2.setBounds(10, 200, 300,30);

f.add(tf);
f.add(cb1);
f.add(cb2);


f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
}
}