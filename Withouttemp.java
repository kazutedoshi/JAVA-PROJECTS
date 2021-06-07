public class Withouttemp {
    public static void main(String[] args) {
        int x = 120, y = 220;
        System.out.println("Before x =" + x);
        System.out.println("Before y =" + y);
        x = x-y;
        y = x+y;
        x = x-y;
        System.out.println("After x = " + x);
        System.out.println("After y = " + y);
        
    }
    
}
