package pojoclasses_Java;



/*
 * pojo class means plane old java object..
 * variables declare private keyword..
 * variables able to declare getter and setters..
 * 
 *  can't assign values in any data type..
 */

class custamor{
	private String coustName;
	private String gender;
    private String age;
    
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCoustName() {
		return coustName;
	}
	public void setCoustName(String coustName) {
		this.coustName = coustName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
class order{
	private String productName;
	private String productPrice;
	private String productSize;
	private String productQuality;
	private String productType;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getProductQuality() {
		return productQuality;
	}
	public void setProductQuality(String productQuality) {
		this.productQuality = productQuality;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
}
public class Pojo_plane {

	public static void main(String[] args) {
		System.out.println("pojo class as plane old java object!");

	}
}
