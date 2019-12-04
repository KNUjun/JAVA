public class TestBuyer{
	public static void main(String args[]){
		Buyer b = new Buyer(1000);
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.print_summary();
	}
}

abstract class Product{
	private int price;
	protected Product(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		return this.getClass().getName();
	}
}

class Tv extends Product{
	public Tv(){
		super(100);
	}
}
class Computer extends Product{
	public Computer(){
		super(200);
	}
}
class Audio extends Product{
	public Audio(){
		super(50);
	}
}

class Buyer{
	private int money = 0;
	private Product[] cart;
	private int nitems;
	
	public Buyer(int money){
		this.money = money;
		this.nitems = 0;
	}
	public void buy(Product p){
		if( this.money >= p.getPrice() ){
			this.money -= p.getPrice();
			this.nitems++;
			add(p);
		}
		else{
			int not_enough_m = p.getPrice()-this.money;
			System.out.println("NOT_ENOUGH_MONEY_"+not_enough_m);
		}
	}
	private void add(Product p){
		if( this.cart == null )
			this.cart = new Product[1];
		if( this.cart.length == nitems ){
			Product[] temp = this.cart;
			this.cart = new Product[this.cart.length*2];
			for(int i=0; i<temp.length; i++)
				this.cart[i] = temp[i];
		}
		this.cart[this.nitems-1] = p;
	}
	public void print_summary(){
		int Used_money = 0;
		for(int i=0; i<nitems; i++){
			System.out.print(this.cart[i]+" ");
			Used_money += this.cart[i].getPrice();
		}
		System.out.println("\nUsed money: " + Used_money);
		System.out.println("Remaining money: " + this.money);
	}
}