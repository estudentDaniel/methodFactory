public class Vasco extends Fabrica{
    Vasco(String nome){
        System.out.println("Camisa Vasco "+getKpa().getStatus());
    }
    Kappa getKpa(){
        return new Kappa();
    }
}
