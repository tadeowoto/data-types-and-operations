
public class Pila {
 
    private int[] pilita;
    private int tope;
    private int tam;

    public Pila(int tam) {
        this.tam = tam;
        pilita= new int[tam];
        tope=-1;
    }
    
    // TODO
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

    public void push(int elemento){
        // 1- VERIFICAR SI ESTA LLENO
        // 2- INCREMENTAR EL TOPE
        // 3- push
        if (pilaLLena()) {
            System.out.println("No se puede añadir elemento, la pila esta llena");
        }
        else {
            System.out.println("Añadiendo elemento");
            tope ++;
            pilita[tope] = elemento;
        }

    }
    
    public void pop(){
        // 1- VERIFICAR SI ESTA VACIO
        // 2- DECREMENTAR EL TOPE
        if (pilaVacia()) {
            System.out.println("La pila esta vacía, no se puede eliminar ningún elemento");
        }
        else {
            System.out.println("Eliminando elemento");
            tope --;
        }
    }
    
    public void verElemento(){
        // 1- VERIFICAR SI ESTA VACIO
        // 2- MOSTRAR ELEMENTO SI NO ESTA VACIO    
        
        if(pilaVacia()){
            System.out.println("No se puede ver el elemento. La pila está vacía");
            
        }
        else{
            System.out.println(pilita[tope]);
        }
        
        
    }
    // metodo soporte para verificar en la consola NO TOMAR COMO PARTE DEL EJERCICIO
    public void mostrarPila(){
        
        if(pilaVacia()){
            System.out.println("La pila está vacía");
            
        }
        else{
            System.out.println("La pila va desde el  último insertado al primero");
            for (int i = tam; i >-1; i--) {
                System.out.println(pilita[i]);
            }
            if(pilaLLena())
                System.out.println("La Pila está llena :·3");
 
        }
        
        
    }
    
   
}
