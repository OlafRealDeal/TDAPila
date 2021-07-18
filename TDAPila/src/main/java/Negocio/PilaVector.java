package Negocio;

/**
 *
 * @author Olaf
 */
public class PilaVector {
        int P[];
        int cima;
        public PilaVector(int cant) {
            P = new int[cant];
            cima = -1;
        }
    
    public boolean Vacia(){
        return (cima == -1);
    }
   public boolean Llena(){
    return (cima ==P.length-1);   
   }
   public void ApilarV(int ele){
       if (Llena()){
           System.out.println("Error, Pila Llena");
           System.exit(1);
       }else{ cima++;
       P[cima]=ele;
       }
}
   public int Desapilar(){
       int x = P[cima];
       cima--;
       return x;
   }
  public int Get(){
     return (P[cima]);
  } 
}