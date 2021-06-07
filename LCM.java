public class LCM {
      public static void main(String[] args) {
          int x= 7, y=20, lcm=0;
          lcm =(x > y) ? x : y;
          while (true) {
                if (lcm % x == 0 && lcm % y == 0) {
                      System.out.println("The lcm of x and y is = " + lcm);
                      break;      
                }
                lcm++;

                
          }

      }

    
}
