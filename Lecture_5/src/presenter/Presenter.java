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
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, oper);

    }

}
