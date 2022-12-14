package presenter;

import model.CalcModel;
import model.Model;
import model.Oper;
import model.ProdModel;
import view.View;

public class Presenter {
    View view;
    Model model;

    public Presenter(CalcModel m, View v){
        model = m;
        view = v;
    }

    public void prodClick(Oper oper) {
        double a = view.getValue("Enter the first number: ");
        double b = view.getValue("Enter the second number: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        view.print(result, oper);

    }

}
