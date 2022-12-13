package view;

import java.util.Scanner;
import model.Oper;

public class View {


    public double getValue(String title) {
        System.out.printf("%s", title);
        double num = 0;
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                num = in.nextDouble();
                break;

            } catch (Exception e) {
                System.out.print("The number is not entered correctly. Try again => ");
            }
        }
        return num;
    }

    public void print(double data, Oper title) {
        System.out.printf("%s => %.2f\n", title, data);
    }
}



