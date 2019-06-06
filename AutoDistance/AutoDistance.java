import javax.swing.*;
import java.awt.*;


public class AutoDistance extends JPanel {
   public double shpejtesia;
   public double nxitimi;
   public double koha;
   
   public AutoDistance(){
      String sh = JOptionPane.showInputDialog( "Sa eshte shpejtesia startuese ?" );
      double shpejtesia = new Double(sh).doubleValue();
      this.shpejtesia = shpejtesia;
      String n = JOptionPane.showInputDialog( "Sa eshte nxitimi ?" );
      double nxitimi = new Double(n).doubleValue();
      this.nxitimi = nxitimi;
      this.koha = 1;
      JFrame frame = new JFrame();
      int frame_width = 500;
      int frame_hight = 200;
      frame.setSize( frame_width , frame_hight );
      frame.setTitle( "Distanca e kaluar!" );
      frame.setVisible(true);
      frame.getContentPane().add(this);
      boolean running = true;
        while(running){
         String ans = JOptionPane.showInputDialog(null,"A deshironi te shikoni distancen pas nje ore ?");
         if(ans.equalsIgnoreCase("po")){
         koha++;
         repaint();
         
         }
         else{
            running = false;
         }
        }    
      }
   
   public void paintComponent(Graphics g){
         g.drawString( "Per " + koha + " ore, duke levizur me "+shpejtesia+" klm dhe "+nxitimi+" klm nxitim : " ,10 ,15 );
         Auto a = new Auto(shpejtesia, nxitimi);
         new AutoDraw( a , koha, g );
         g.drawString ("Distancat e kaluara te makines varesishte prej shpejtesise se ngasjes.", 40, 100); 
         
      }
  
   public static void main(String[] args){
      new AutoDistance();
   }
}