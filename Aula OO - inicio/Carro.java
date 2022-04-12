public class Carro {

    //POJO plain old java object = objeto que não tem uma definição especifica
    //atributo = variaveis de instancia
    private int yearManufacture;
    private String carModel;

    //construtores com sobrecarga    
    public Carro(int yearManufacture, String carModel){
        this.yearManufacture = yearManufacture;
        this.carModel = carModel;
    }
    public Carro(int yearManufacture){
        this.yearManufacture = yearManufacture;
    }
    public Carro(String carModel){
        this.carModel = carModel;
    }
    public Carro(){}

    public int getAnoFab(){
        return this.yearManufacture;
    }
    public String getModelo(){
        return this.carModel;
    }
    public void setAnoFab(int yearManufacture){
        this.yearManufacture = yearManufacture;
    }
    public void setModeloCarro(String carModel){
        this.carModel = carModel;
    }
    
}
