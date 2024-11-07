/*
1. Add element
2. Remove element
3. Print element
4. Exit
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("1. Add element\n" +
                    "2. Remove element\n" +
                    "3. Print element \n" +
                    "4. Exit");
            int opt = in.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Enter a number");
                    list.add(in.nextInt());
                    System.out.println("Element added");
                    break;
                case 2:
                    System.out.println("Enter a number to be deleted");
                    int element = in.nextInt();
                    if(!list.contains(element)){
                        System.out.println("Element not found");
                        break;
                    }
                    list.remove((Integer)element);
                    System.out.println("Element removed");
                    break;
                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    return;
            }
        }
    }
}