import java.util.Scanner;

public class Hardware {
	
	public static void main(String[] args) {
		double lengthPackage;  
		double height;
		double width;
		double totalStrippingDoor;
		double packageQuant;
		double resultQuantPack;
		Door door1 = new Door();
		StrippingBrand package1 = new StrippingBrand();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter  door Height (cm): ");
		height = keyboard.nextDouble();
		
		System.out.println("Enter  door Width (cm): ");
		width = keyboard.nextDouble();
		
		System.out.println("Enter  package stripping lenght (cm): ");
		lengthPackage = keyboard.nextInt();
		
		door1.setHeight(height);
		door1.setWidth(width);
		package1.setBrand("Package A");
		package1.setAmountPackage(lengthPackage);
		
		
		
		
		//WeatherStripping ws = new WeatherStripping("Brand A", lengthPackage);
		
		totalStrippingDoor = door1.StrippingAmount();
		packageQuant = package1.getAmountPackage();
		resultQuantPack = Math.ceil(totalStrippingDoor/packageQuant);
		
		//packageQuant = ws.CalcPackage(totalFootage);
		
		System.out.println("Wather Stripping needed :  " + totalStrippingDoor + "cm");
		System.out.println("Packages needed: " + resultQuantPack);
		
	}

}
