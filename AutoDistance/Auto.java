public class Auto{
   public double velocity;
   public double acceleration;
   public Auto(double velocity, double acceleration){
      this.velocity = velocity;
      this.acceleration = acceleration;
   }
   public double distance(double time){
      return velocity*time+(1/2)*acceleration*time*time;
   }
}