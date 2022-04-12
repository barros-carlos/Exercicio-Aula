public class ExibirCarros{
    public static void main(String[] args) {
        Carro carro = new Carro(2004,"Honda Civic");   
        Carro carro2 = new Carro();

        carro2.setAnoFab(2010);
        carro2.setModeloCarro("Nissan Versa");

        System.out.println(carro.getModelo() + " - " + carro.getAnoFab());
        System.out.println(carro2.getModelo() + " - " + carro2.getAnoFab());
    }
}