import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        String nomeCompleto = "", nomeInicial = "", nomeFinal = "", letra ="";

        System.out.println("Digite seu nome Completo");
        Scanner sc = new Scanner(System.in);
        nomeCompleto = sc.nextLine();
        if(nomeCompleto.length() > 0){
            if(nomeCompleto.contains(" ")){ 
                nomeInicial = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
                for(int i = 0; i < nomeCompleto.length(); i++){
                    letra = nomeCompleto.substring(i,i+1);
                    if(letra.equals(" ")){
                        nomeFinal = nomeCompleto.substring(i+1,nomeCompleto.length());
                        if(nomeFinal.equals("")){
                            nomeFinal = ".";
                        }
                    }
                }
                
            }else{
                nomeInicial = nomeCompleto.substring(0, nomeCompleto.length());
                nomeFinal = ".";
            }
        }
        else{
            nomeInicial = ".";
            nomeFinal = ".";
        }

        System.out.printf("ola %s. seu sobre nome %s", nomeInicial, nomeFinal);
        sc.close();
    }
}
