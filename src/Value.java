import java.util.Scanner;
public class Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value:");
        double value1=sc.nextDouble();
        System.out.print("Enter value");
        double value2=sc.nextDouble();
        System.out.println("Adding values: "+(value1+value2));
    }
}
