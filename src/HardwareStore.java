
import java.math.*;

public class HardwareStore {
	
	//Declaration
	private String brand; //brand of weather stripping
	private double packageQuant; //quantiti packeage 
	
	
	//construtors
	public HardwareStore() {  
		this("",0);
	}

	public HardwareStore(String brand, double packeageQuant) {  
		
		this.brand = brand;
		this.packageQuant = packeageQuant;
	}
	
	//method calculate total stripping
	public double calcStripping (double width, double height) {
		double totalfootage; 	//store total  door footage in centimeters
		totalfootage = (width + (height*2));
		return totalfootage;
		
	}
	
	//method calculate quantiti package
	public double calcPackage(double totalfoot) {
		double amountPack; //store result round up calc package
		amountPack = Math.ceil(totalfoot / packageQuant);
		return amountPack;
		
	}
	
	//Get and Set
	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public double getPackageQuant() {
		return packageQuant;
	}



	public void setPackageQuant(double packageQuant) {
		this.packageQuant = packageQuant;
	}
	
	
	
	
}
