public class Brasil extends Fabrica {
    Brasil(String nome){
            System.out.println("Sua Camisa é do Brasil e  "+getNike().getStatus());     
    }
    Nike getNike(){
        return new Nike();
    }
}
