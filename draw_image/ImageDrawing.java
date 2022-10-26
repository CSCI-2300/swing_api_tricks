import javax.swing.*;
import java.awt.*;

public class ImageDrawing
{
   JFrame mainFrame;
   JPanel mainPanel;
   ImageIcon icon;
   JLabel imageLabel;

   public ImageDrawing()
   {
      mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainFrame.add(mainPanel);

      icon = new ImageIcon("snowman.png");
      imageLabel = new JLabel(icon);
      mainPanel.add(imageLabel);

      mainFrame.pack();
      mainFrame.setVisible(true);
   }

   public void resize(double scale)
   {
      int height = icon.getIconHeight();
      int width = icon.getIconWidth();
      
      height = (int)(height * scale);
      width = (int)(width * scale);
      Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
      icon.setImage(image);
      //mainFrame.pack();
   }

   public static void main(String []args)
   {
      ImageDrawing drawing = new ImageDrawing();
      drawing.resize(0.5);
   }
}
