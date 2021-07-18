package Negocio;
/**
 *
 * @author Olaf
 */
public class PilaL {
       Nodo cima;
       int cant;
 public PilaL(){
     cima =null;
     cant=0;
 }
 public boolean Vacia(){
     return cima==null;
 }
 public void Llena(int ele){
     Nodo P=new Nodo(ele);
     P.setEnlace(cima);
     cima=P;
     cant++;
 }
 public int Desapilar(){
     int x = cima.getDato();
     cima = cima.getEnlace();
     cant --;
     return x;
 }
 public int Get(){
     return (cima.getDato());
 }
}
