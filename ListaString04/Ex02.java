import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        String senha = "", numeros = "0123456789";
        Boolean senhaPossivel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha\n");
        senha = sc.nextLine();

        if(senha.length() == 4){
            if(senha.substring(0, 1).equals("a") || senha.substring(0, 1).equals("A")){
                for(int i=1; i < 4; i++){
                    if(numeros.contains(senha.substring(i, i+1))){
                        if(Integer.parseInt(senha.substring(i, i+1)) % 2 == 1){
                            senhaPossivel = true;       
                        }
                    }
                }
            }
        }
        System.out.println(senhaPossivel ? "senha valida" : "senha invalida");

        sc.close();
    }
}