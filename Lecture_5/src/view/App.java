package view;

import model.Oper;
import model.ProdModel;
import model.SumModel;
import presenter.Presenter;

import java.util.Scanner;

public class App {

    public static void ButtonClick() {
        System.out.println("What action do you want to take?");
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
//        View view = new NewConsoleView();
//        Presenter presenter = new Presenter(view, Config.pathDb);
//        presenter.LoadFromFile();
//
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prod\n  2 - sum");
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

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
    }

