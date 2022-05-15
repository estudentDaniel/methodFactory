public class Fluminense extends Fabrica {
    Fluminense(String nome){
        System.out.println("Camisa Fluminense e "+getUbo().getStatus());
    }
    Umbro getUbo(){
        return new Umbro();
    }
}
