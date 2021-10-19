package entitiesProduct;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity; // o this mostra que você quer acessar o atributo da classe (public int quantity;  (linha 6)) e NÃO o atributo que está na função (int quantity  (linha 12))
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price) //formatação do price com 2 casas decimais
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock()); //formatação do TotalValuesInStock com 2 casas decimais;
	}
}
