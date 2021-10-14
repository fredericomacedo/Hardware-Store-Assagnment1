
public class Door {
	private double height;
	private double width;
	
	public Door() {
		this(0,0);
		
	}
	public Door(double height, double width) {
		this.height = height;
		this.width = width;
		
	}
	
	
	public double StrippingAmount() {
		double amount;
		amount = (this.height * 2) + (this.width);
		return amount;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
}
