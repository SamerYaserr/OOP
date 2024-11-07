// Create a list of distinct elements taken from the user
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            int n = in.nextInt();
            if(!list.contains(n))
                list.add(n);
        }
        System.out.println(list);
    }
}