

/**
 * MethodFactory
 */
public class MethodFactory {

    public Fabrica getCamisa(String nome){

            switch (nome) {
              case "brasil":
                return new Brasil(nome);
              case "flamengo":
               return new Flamengo(nome);
              case "botafogo":
                return new Botafogo(nome);
              case "fluminense":
                return new Fluminense(nome);
              case "vasco":
                return new Vasco(nome);
                default:
                    break;
            }
            
           // scan.close();
           return null;
           
        }
        
        
}