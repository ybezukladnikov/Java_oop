import model.Oper;
import model.ProdModel;
import presenter.Presenter;
import view.View;

public class Main  {
    public static void main(String[] args) {


//        presenter.Presenter p = new presenter.Presenter(new model.SumModel(), new view.View());
//
//        p.buttonClick();

        Presenter p = new Presenter(new ProdModel(), new View());

        p.buttonClick(Oper.Prod);


    }
}
