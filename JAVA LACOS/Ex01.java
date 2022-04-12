public class Ex01{
    public static void main(String[] args) {
        System.out.println("For");
        for(int i = 0; i < 100; i++){
            System.out.print(i+" ");
        }
        int i = 0;
        System.out.println("\n\nWhile");
        while(i < 100){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n\nDo While");
        i = 0;
        do{
            System.out.print(i+" ");
            i++;
        }while (i < 100);
    }
}