import java.util.ArrayList;


public class PyC16_5 {
public ArrayList<Integer> pila;
int tope;

PyC16_5() {
        pila=new ArrayList<>();
        tope=-1;
    }
public void apilar(int i){
    pila.add(i);
    tope++;
    
}
public int Desapilar(){
    int c;
    if(Vacia()){
            System.out.println("Error");
            return -1;
            }
    else{
    c=pila.get(tope);
    System.out.println("Entre a desapilar: "+c);
    pila.remove(tope);
    tope--;
    return c;
    }
    
}
public boolean Vacia(){
    return pila.isEmpty();
}
public int Size(){
    return pila.size();
    
}
public int Peek(){
    Integer b;
    if(Vacia()){
        System.out.println("Pila Vacia");
        return -1;
    }
    else{
        b=pila.get(tope);
        return b;
    }
    
}
public void vaciar(){
         pila.clear();
    }
}