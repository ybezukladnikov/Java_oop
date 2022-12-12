package view;

import model.Oper;
import model.ProdModel;
import model.SumModel;
import presenter.Presenter;

import java.util.Scanner;

public class App {

    public static void ButtonClick() {

        System.out.print("\033[H\033[J");

        try (Scanner in = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.println("What action do you want to take?");
                System.out.println(" 1 - Multiplication\n 2 - Addition\n 3 - exit");
                System.out.print("Enter menu item => ");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        Presenter p1 = new Presenter(new ProdModel(), new View());
                        p1.prodClick(Oper.Prod);
                        break;
                    case "2":
                        Presenter p2 = new Presenter(new SumModel(), new View());
                        p2.prodClick(Oper.Sum);
                        break;

                    case "3":
                        flag = false;
                        System.out.println("Good day!");

                    default:
                        if (flag) System.out.println("There is no such command, please try again.");
                        break;
                }

            }
        }

    }
    }

