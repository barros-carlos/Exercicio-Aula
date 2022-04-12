import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma vlor para verificar se eh primo:");
        int num = sc.nextInt(),i = 2;
        boolean primo = true; 
        while (primo && i < num){
            if(num % i == 0){
                primo = false;
            }
            i++;
        }
        
        System.out.println(primo ? num + " eh primo": num + " nao eh primo");

        sc.close();
    }
}
