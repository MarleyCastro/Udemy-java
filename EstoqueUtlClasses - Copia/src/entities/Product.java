package entities;

public class Product {
    public String name; //atributos
    public double Price;
    public int Quantity;

    public  double totalValueInStock(){ //operação ou ação
        return Price * Quantity;
    }

    public void AddProducts(int Quantity){
        this.Quantity += Quantity; //acessar o atributo da classe
    }

    public void RemoveProducts(int Quantity){
        this.Quantity -= Quantity;
    }

    public String toString(){

    }
}
