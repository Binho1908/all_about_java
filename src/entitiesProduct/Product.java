package entitiesProduct;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity; // o this mostra que voc� quer acessar o atributo da classe (public int quantity;  (linha 6)) e N�O o atributo que est� na fun��o (int quantity  (linha 12))
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price) //formata��o do price com 2 casas decimais
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock()); //formata��o do TotalValuesInStock com 2 casas decimais;
	}
}
