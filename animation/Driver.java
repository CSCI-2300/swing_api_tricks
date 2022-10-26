import javax.swing.Timer;
import java.awt.event.*;

public class Driver implements ActionListener
{
   public static final int UPDATE_INTERVAL = 100;

   protected Timer timer;
   protected Animation animation;

   public Driver()
   {
      animation = new Animation();
      timer = new Timer(UPDATE_INTERVAL, this);
      timer.start();
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      animation.nextFrame();
   }

   public static void main(String []args)
   {
      Driver driver = new Driver();
   }
}
