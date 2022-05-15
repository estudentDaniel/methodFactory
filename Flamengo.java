public class Flamengo extends Fabrica {
    Flamengo(String nome){
        System.out.println("sua camisa e do flamengo e "+ getAds().getStatus());
     
    }
    Adidas getAds(){
        return new Adidas();
    }

}
