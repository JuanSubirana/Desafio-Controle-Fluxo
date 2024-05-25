import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        ParametrosInvalidosException parametro = new ParametrosInvalidosException();
       System.out.println("entre com os valores");
         try {
            parametro.contar(scanner.nextInt(),scanner.nextInt());
            
         
         }catch(Exception e){
            System.out.println("O parametro dois deve ser maior que o Parametro um");
         }
         scanner.close();
    }
}
