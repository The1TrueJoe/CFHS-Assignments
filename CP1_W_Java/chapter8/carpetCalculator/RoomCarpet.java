package carpetCalculator;

public class RoomCarpet {

	public RoomDimension size;
	public double carpetCost;
	
	public RoomCarpet(RoomDimension dimension, double cost) {
		size = dimension;
		carpetCost = cost;
	}
	
	public double getTotalCost() { return size.getArea() * carpetCost;}
	
	public String toString() {
		return  size.toString() + "\nTotal Cost: " + getTotalCost() + "\nCost: " + carpetCost; 
	}
}
