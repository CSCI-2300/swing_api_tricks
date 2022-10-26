import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing implements Icon, MouseListener
{
   protected JFrame mainFrame;
   protected JPanel mainPanel;
   protected JLabel imageLabel;
   protected int height = 200;
   protected int width = 200;
   protected boolean sayHello = false;


   public Drawing()
   {
      mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainFrame.add(mainPanel);

      imageLabel = new JLabel(this);
      imageLabel.addMouseListener(this);

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

      if (this.sayHello)
      {
         graphics.drawString("Hello!", x + diameter1, y+diameter1/2);
      }
   }

   @Override
   public void mouseEntered(MouseEvent event)
   {
      this.sayHello = true;
      System.out.println("Mouse entered");
      this.imageLabel.repaint();
   }
   @Override
   public void mouseExited(MouseEvent event)
   {
      this.sayHello = false;
      System.out.println("Mouse exited");
      this.imageLabel.repaint();
   }

   @Override 
   public void mousePressed(MouseEvent event){}
   @Override 
   public void mouseReleased(MouseEvent event){}
   @Override 
   public void mouseClicked(MouseEvent event){}


   public static void main(String []args)
   {
      Drawing drawing = new Drawing();
   }
}
