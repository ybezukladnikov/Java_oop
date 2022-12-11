public class Main  {
    public static void main(String[] args) {


//        Presenter p = new Presenter(new SumModel(), new View());
//
//        p.buttonClick();

        Presenter p = new Presenter(new ProdModel(), new View());

        p.buttonClick(Oper.Prod);


    }
}
