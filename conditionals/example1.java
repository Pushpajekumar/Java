import java.util.*;

public class example1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 1st Number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Operator: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
        
            default:
                break;
        }
    }
}
