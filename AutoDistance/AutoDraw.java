import java.awt.*;
import java.text.*;

public class AutoDraw {  
  
   public AutoDraw( Auto a, double time, Graphics g ){
         
         double distanca = a.distance(time);
         g.setColor(Color.WHITE);
         g.fillRect(0, 0, 500, 500);
         g.setColor(Color.gray);
         g.fillArc( 75+(int)distanca ,35 ,20 ,30 ,45 ,-45 );
         g.fillArc( 113+(int)distanca ,35 ,20 ,30 ,135 ,45 );
         g.setColor(Color.darkGray);
         g.fillRect( 80+(int)distanca ,50 ,50 ,15 );
         g.fillRect( 92+(int)distanca ,39 ,25 ,11 );
         g.setColor(Color.gray);
         g.fillRect( 95+(int)distanca ,41 ,8 ,10 );
         g.fillRect( 106+(int)distanca ,41 ,8 ,10 );
         g.setColor(Color.black);
         g.fillOval( 85+(int)distanca ,60 ,10 ,10 );
         g.fillOval( 115+(int)distanca ,60 ,10 ,10 );
         
         g.drawString( distanca + " kilometra" + " per " + time + " ore " ,150+(int)distanca ,63 ); 
   }

}