public class HorizontalTarget extends Target
{
    // instance variables - replace the example below with your own
      
    HorizontalTarget (double x, double y, double v, double theta) {
        this.x=x;
        this.y=y;
        this.v=v;
        this.theta=theta;
    }

    public void move(){
       x=x+30;
       if (x>500)
        x=0;
    
    }
    
}
