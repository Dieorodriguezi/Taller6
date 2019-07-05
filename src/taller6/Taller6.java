public class Taller6 {

    public static void hilolargo(){
    try{
        Thread.sleep(2000);
    }
    catch (InterruptedException e){
        System.out.println("Hola Mundo");
    }
} 
public static double div(int a, int b){
        if (b==0){
            throw new ArithmeticException("division por cero");
        }
        double c=a/b;
        return c;
    }

    
}