package Negocio;

/**
 *
 * @author Olaf
 */
public class PilaVB {
       PilaVB P;
       int cima;
public PilaVB(int cant, int Nbits){
    P = new PilaVB (cant, Nbits);
    cima=0;
}
public boolean Vacia(){
    return cima == 0;
}
public boolean Llena(){
    return (cima==P.cantidad);
}
public void ApilarVB(int ele){
    if(Llena()){
        System.out.println("Error, Pila Llena");
        System.exit(1);
    }else{
        cima++;
        P.Insertar(ele,cima);
    }
}
public int Desapilar(){
    int x = P.sacar(cima);
    cima--;
    return x;
}
public int Get(){
    return (P.sacar(cima));
}

}
