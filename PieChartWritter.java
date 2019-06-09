import javax.swing.*;
import java.awt.*;
 public class PieChartWritter extends JPanel {
  JFrame frame ;
  private int x = 60;
  private int y = 60;
  private int diametri = 200;
  private int f_width = diametri * 3 ;
  private int f_height = diametri + 100;
  private String label1 = "";
  private String label2 = "";
  private String label3 = "";
  private String label4 = "";
  private String label5 = "";
  private String label6 = "";
  private double amount1;
  private double amount2;
  private double amount3;
  private double amount4;
  private double amount5;
  private double amount6;
  private Color c1;
  private Color c2;
  private Color c3;
  private Color c4;
  private Color c5;
  private Color c6;
 
 public PieChartWritter() {
  frame = new JFrame();
  frame.getContentPane().add(this);
  frame.setSize(f_width , f_height);
  frame.setVisible(true);
  }

 public void paintComponent(Graphics g) {
 Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
  g.setFont(font);
 int x_of_label = x + diametri + x ;
 int y_of_label = y + 20;
 int line_space = 30;
 int Start = 0;
  
 g.setColor(c1);
 g.fillArc(x , y , diametri, diametri, Start, calculateAngle(amount1));
 g.drawString(label1, x_of_label, y_of_label);
 
 g.setColor(c2);
 Start =Start + calculateAngle(amount1);
 g.fillArc(x , y , diametri , diametri , Start , calculateAngle(amount2));
 y_of_label = y_of_label + line_space;
 g.drawString(label2 , x_of_label , y_of_label );
 
 g.setColor(c3);
 Start = Start + calculateAngle(amount2);
 g.fillArc(x , y , diametri , diametri , Start , calculateAngle(amount3));
 y_of_label = y_of_label + line_space;
 g.drawString(label3 , x_of_label , y_of_label );
 
 g.setColor(c4);
 Start = Start + calculateAngle(amount3);
 g.fillArc(x , y , diametri , diametri , Start , calculateAngle(amount4));
 y_of_label = y_of_label + line_space;
 g.drawString(label4 , x_of_label , y_of_label );
 
 g.setColor(c5);
 Start = Start + calculateAngle(amount4);
 g.fillArc(x ,y , diametri ,diametri, Start , calculateAngle(amount5));
 y_of_label = y_of_label + line_space;
 g.drawString(label5 , x_of_label , y_of_label);
 
 g.setColor(c6);
 Start = Start + calculateAngle(amount5);
 g.fillArc(x , y , diametri , diametri , Start , calculateAngle(amount6));
 y_of_label = y_of_label + line_space;
 g.drawString(label6 , x_of_label , y_of_label);
 }
 public void setTitle(String title) {
  frame.setTitle(title);
 }
 public int calculateAngle(double amount) {
      double total_amount = amount1 + amount2 + amount3 + amount4 + amount5 + amount6;
      return (int)Math.round((360 * amount) / total_amount);
 }
  public void setSlice1(String label, double amount, Color c) {
  label1 = label;
  amount1 = amount;
  c1 = c;}
 public void setSlice2(String label , double amount , Color c){
  label2 = label;
  amount2 = amount;
  c2 = c; }
 public void setSlice3(String label , double amount , Color c){
  label3 = label;
  amount3 = amount;
  c3 = c;}
 public void setSlice4(String label , double amount , Color c){
  label4 = label;
  amount4 = amount;
  c4 = c;}
 public void setSlice5(String label , double amount ,  Color c){
  label5 = label;
  amount5 = amount;
  c5 = c;}
 public void setSlice6(String label , double amount , Color c){
  label6 = label;
  amount6 = amount; 
  c6 = c;}
  } 

 
 
 
