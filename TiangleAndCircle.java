class TiangleAndCircle{
        //L1 is the side to the Hight
        double L1,L2,L3,H;
        
        public triangle(int a, int b, int c, int d){
        L1=a;
        L2=b;
        L3=c;
        H=d;
        
        }

        void setLengths(double a, double b, double c){
        L1 = a;
        L2 = b;
        L3 = c;

        }

        void setHight(double k){
        H=k;
        }
        
        double[] getLength(){
            double[] result = {L1, L2, L3};
            return result;
        }
        
        double getHight(){
        return H;
        }
        
        double area(){
        double result = H*L1;
        return result;
        }
        
        double circumference(){
        double result = L1+L2+L3;
        return result;
        }


}

  class  circle{
        //L1 is the side to the Hight

        double radius, pi=3.14;

        public circle(int a){
        radius =a;
        }
        void setRadius(double a){
        radius= a;

        }

                
        double getRadius(){
            
            return radius;
        }
        
        
        
        double area(){
        double result = pi*radius*radius;
        return result;
        }
        
        double circumference(){
        double result = 2*pi*radius;
        return result;
        }


                    }

public class Shapes {
    
    public static void main (String [] args){
    triangle t1 = new triangle(1,2,3,4);
    circle c1 = new circle(5);
        System.out.println("");
    }
    
}




