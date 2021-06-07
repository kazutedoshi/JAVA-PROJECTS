public class Swapping {
    public static void main(String[] args) {
        int x = 10, y= 5;
        System.out.println("Before x ="+ x);
        System.out.println("Before y = " + y);
        int temp= x;
        x = y;
        y = temp;
        System.out.println("After x = " + x);
        System.out.println("After y = " + y);
    }
}
