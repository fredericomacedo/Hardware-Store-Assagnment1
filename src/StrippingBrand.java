
public class StrippingBrand {

		private String brand;
		private double amountPackage;
		
		
		public StrippingBrand() {
			this("",0);
		}
		public StrippingBrand(String brand, double amountPackage) {
			this.brand = brand;
			this.amountPackage = amountPackage;
		}
		
		
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getAmountPackage() {
			return amountPackage;
		}
		public void setAmountPackage(double amountPackage) {
			this.amountPackage = amountPackage;
		}
		
		
		
}
