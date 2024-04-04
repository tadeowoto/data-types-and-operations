
public class main {

    public static void main(String[] args) {
        
        Pila p1 = new Pila(5);
        p1.push(3);
        p1.push(1);
        p1.push(4);
        
        p1.mostrarPila();
        
        p1.pop();
        p1.pop();
        p1.pop();
        p1.pop();
        
        p1.mostrarPila();
        
        p1.push(10);
        p1.push(40);
        p1.push(0);
        
        p1.mostrarPila();
        
        p1.verElemento();
        
        p1.pop();
        
        p1.verElemento();
        
        p1.mostrarPila();
        
        
    }
    
}
