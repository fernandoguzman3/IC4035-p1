package Classes;

public class Order {
	
	private int CustomerID;
	private int timeToPrepare;
	private double cost;
	private int levelOfPatience;
	
	public Order(int ID, int time, double cost,int patience) {
		CustomerID = ID;
		timeToPrepare = time;
		this.cost = cost;
		levelOfPatience = patience;
	}
	
	public double getCost() {
		return cost;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public int getLevelOfPatience() {
		return levelOfPatience;
	}
	public int getTimeToPrepare() {
		return timeToPrepare;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public void setLevelOfPatience(int levelOfPatience) {
		this.levelOfPatience = levelOfPatience;
	}
	public void setTimeToPrepare(int timeToPrepare) {
		this.timeToPrepare = timeToPrepare;
	}
	
	public String toString() {
		return " Customer ID:" + getCustomerID() +
				" Time to Prepare: " + getTimeToPrepare() +
				" Cost: " + getCost() +
				" Level of Patience: " + getLevelOfPatience() + "\n";
				
	}





}
