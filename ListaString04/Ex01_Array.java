import java.util.Scanner;

public class Ex01_Array{
    //codigo usando array para
    public static void main(String[] args) {
        String nomeCompleto, nomeInicial, nomeFinal;
        String[] nomeSeparado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome completo:\n");
        nomeCompleto = sc.nextLine();
        if(nomeCompleto.length() > 0){
            if(nomeCompleto.contains(" ")){
                nomeSeparado = nomeCompleto.split(" ");
                nomeInicial = nomeSeparado[0];
                nomeFinal = nomeSeparado[nomeSeparado.length-1];
                if(nomeSeparado.length == 1){
                    nomeFinal = ".";
                }
            }
            else{
                nomeInicial = nomeCompleto;
                nomeFinal = ".";
            }
        }
        else{
            nomeInicial = ".";
            nomeFinal = ".";
        }

        System.out.printf("Ola, %s. Seu sobrenome eh %s",nomeInicial, nomeFinal);
        sc.close();
    }
}