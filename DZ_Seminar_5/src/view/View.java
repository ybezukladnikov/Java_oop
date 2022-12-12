package view;

import java.util.Scanner;
import model.Oper;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(double data, Oper title) {
        System.out.printf("%s => %.2f\n", title, data);
    }

}
