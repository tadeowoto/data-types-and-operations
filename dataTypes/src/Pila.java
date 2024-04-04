
public class Pila {
 
    private int[] pilita;
    private int tope;
    private int tam;

    public Pila(int tam) {
        this.tam = tam;
        pilita= new int[tam];
        tope=-1;
    }
    
    
    //Metodo pilaLLena, verifica si la pila esta llena :)
    
    
    public boolean pilaLLena(){
        
        if (tam==tope) {
            return true;
        }else{
            return false;
        } 
    }
    
        public boolean pilaVacia(){
        
        if (tope==-1) {
            return true;
        }else{
            return false;
        } 
    }
    
    
    
    
    
    
    public void Push(){
        
    }
    
   
}
