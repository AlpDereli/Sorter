import java.util.Scanner;
public class Sorter {
    public static void main(String[] args) {
        int i1,i2,i3;
        System.out.println("Please enter the first integer: ");
        Scanner take = new Scanner(System.in);
        i1 = take.nextInt();
        System.out.println("Please enter the second integer: ");
        i2 = take.nextInt();
        System.out.println("Please enter the third integer: ");
        i3 = take.nextInt();
        if (i1 >= i2 && i1 >= i3)
        {
            if (i2 >= i3)
            {
                System.out.println(i1+">"+i2+">"+i3);
            }
            else
            {
                System.out.println(i1+">"+i3+">"+i2);
            }
        }
        if (i2 >= i1 && i2 >= i3)
        {
            if (i1 >= i3)
            {
                System.out.println(i2+">"+i1+">"+i3);
            }
            else
            {
                System.out.println(i2+">"+i3+">"+i1);
            }
        }
        if (i3 >= i2 && i3 >= i1)
        {
            if (i2 >= i1)
            {
                System.out.println(i3+">"+i2+">"+i1);
            }
            else
            {
                System.out.println(i3+">"+i1+">"+i2);
            }
        }
    }
}
