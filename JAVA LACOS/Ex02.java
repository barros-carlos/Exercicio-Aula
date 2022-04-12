public class Ex02{
    public static void main(String[] args) {
        System.out.println("For");
        for(int i = 99; i >= 0; i--){
            System.out.print(i+" ");
        }
        int i = 99;
        System.out.println("\n\nWhile");
        while(i >=0){
            System.out.print(i+" ");
            i--;
        }
        System.out.println("\n\nDo While");
        i = 99;
        do{
            System.out.print(i+" ");
            i--;
        }while (i >= 0);
    }
}