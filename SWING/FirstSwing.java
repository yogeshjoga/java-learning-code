import javax.swing.*;  
public class FirstSwing {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
String myText = "Hello yogesh this is your first swing programming in java swing";
JTextArea text1 = new JTextArea(myText);
text1.setBounds(600,200,600,200);
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,130,100);//x axis, y axis, width, height  

f.add(b);//adding button in JFrame  
f.add(text1);

f.setSize(900,1100);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  
