import javax.swing.*;
import java.awt.*;

public class Drawing implements Icon
{
   JFrame mainFrame;
   JPanel mainPanel;
   JLabel imageLabel;
   int height = 200;
   int width = 200;

   public Drawing()
   {
      mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainFrame.add(mainPanel);

      imageLabel = new JLabel(this);
      mainPanel.add(imageLabel);

      mainFrame.pack();
      mainFrame.setVisible(true);
   }


   @Override
   public int getIconHeight()
   {
      return this.height;
   }

   @Override
   public int getIconWidth()
   {
      return this.width;
   }

   @Override
   public void paintIcon(Component component, Graphics graphics, int x, int y)
   {
      System.out.println(component);
      graphics.setColor(Color.BLUE);
      graphics.fillRect(x, y, height, width);

      graphics.setColor(Color.WHITE);
      int diameter1 = this.height/8;
      int diameter2 = this.height/4;
      int diameter3 = this.height/2;

      graphics.fillOval(x, y, diameter1, diameter1);
      graphics.fillOval(x, y+diameter1, diameter2, diameter2);
      graphics.fillOval(x, y+diameter1+diameter2, diameter3, diameter3);
   }

   public static void main(String []args)
   {
      Drawing drawing = new Drawing();
   }
}
