/**
 * Botafogo
 */
public class Botafogo extends Fabrica {
    
    Botafogo(String nome){
        System.out.println("camisa "+nome+ getPuma().getStatus());
     
    }
    Puma getPuma(){
        return new Puma();
    }

}