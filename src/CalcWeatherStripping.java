import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * 	Start 
		Declarations   			//declaration of variables
		num lengthPackage 		//User input lenght package
		num hightDoor  		//user inut hight door
		num widghtDoor 		//user input width door
		num totalFootage 		//storage result calc total stripping
		num packageQuant 		//storage result package quantity
		HardwareStore hs = new HardwareStore()	 //new object
		//input variables
		output “Enter  door height (cm): ”
		input heightDoor
		output “Enter door width (cm): ” 
		input heidthDoor
		output  “Enter package stripping lenght: ”
		input lenghtPackage
		
		//call methods set
		hs.setBrand(“A”)
		hs.setPackageQuant(width)
		hs.setLenght(lenghtPackage)
		
		//call methods calcStripping(), calcPackage() store in variable to output
		totalFootage = hs.calcStripping(widghtDoor, hightDoor)
		packageQuant = hs.calcPackage(totalFootage)
		
		// output with results
		output ("Wather Stripping needed :  " + totalFootage + " cm")
		output ("Packages needed: " + packageQuant)
		output ("Porgram by Frederico Macedo")		
		
	Stop

 * 		
 */
public class CalcWeatherStripping {
	
	public static void main(String[] args) {
		//Declarations
		double lengthPackage; //User input lenght package
		double hightDoor;  //user inut hight door
		double widghtDoor; //user input width door
		double totalFootage; //storage result calc total stripping
		double packageQuant; //storage result package quantity
		DecimalFormat df = new DecimalFormat("###.##"); //decimal point configuration
		HardwareStore hs = new HardwareStore(); //new object 
		Scanner keyboard = new Scanner(System.in);
		
		//Input user
		System.out.println("Enter  door Height (cm): ");
		hightDoor = keyboard.nextDouble();
		
		System.out.println("Enter  door Width (cm): ");
		widghtDoor = keyboard.nextDouble();
		
		System.out.println("Enter  package stripping lenght: ");
		lengthPackage = keyboard.nextDouble();
		
		//call method setBrand(), setPackage on entity hs HardwareStore 
		hs.setBrand("A");
		hs.setPackageQuant(lengthPackage);
		
		//call methods CalcStripping(), CalcPackage()
		totalFootage =  hs.calcStripping(widghtDoor, hightDoor);
	
		packageQuant = hs.calcPackage(totalFootage);
		
		System.out.println("Weather Stripping needed :  " + df.format(totalFootage)+ " cm");
		System.out.println("Packages needed: " + packageQuant);
		System.out.println("Porgram by Frederico Macedo");
		
	}

}
