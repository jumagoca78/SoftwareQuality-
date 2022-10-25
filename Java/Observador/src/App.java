public class App {
    public static void main(String[] args) throws Exception {
       
        Ventana1 v1; 
        Ventana2 v2 = new Ventana2(v1);
        v1 = new Ventana1(v2);


    }
}
