public class Caneta {
    public String modelo;
    private String cor;
    private double ponta;

    private boolean tampada;


    public Caneta(String modelo, double ponta, boolean tampada){ // Este é o método construtor
        this.tampar();
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada =  true;
    }

    public void Descricao(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("cor: "+ cor);
        System.out.println("Tampada: "+ tampada);
    }
}
