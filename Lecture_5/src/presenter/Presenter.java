package presenter;

import model.Model;
import model.Oper;
import model.ProdModel;
import view.View;

public class Presenter {
    View view;
    Model model;

    public Presenter(ProdModel m, View v){
        model = m;
        view = v;
    }

    public void buttonClick(Oper oper) {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, oper);

    }

}
