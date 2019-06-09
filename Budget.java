import java.awt.*;
public class Budget {
   public static void main(String[] args) {
      PieChartWritter p = new PieChartWritter();
      p.setTitle("Si e ndaj bugjetin mujor");
      p.setSlice1("Ushqim", 50, Color.red);
      p.setSlice2("Veshmbathje", 15, Color.blue);
      p.setSlice3("Universitet", 45, Color.orange);
      p.setSlice4("Dalje me shoqeri", 25, Color.gray);
   }
}
