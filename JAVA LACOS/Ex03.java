import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para calcular o fatorial dele");
        int fat = sc.nextInt(), total = 1;
        for(int i = 1; i <= fat; i++){
            total *= i;
        }
        System.out.printf("fatorial de %d eh %d",fat,total);
        
        sc.close();
    }
}
