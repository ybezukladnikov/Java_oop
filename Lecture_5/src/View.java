import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title){
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(int data, Oper title) {
        System.out.printf("%s => %d", title, data);
    }

}
