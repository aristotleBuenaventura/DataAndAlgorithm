package groupThree_FinalProj;

/* 
 * EmployeeDto
 * 
 * This class is used to store table attributes in an ArrayList 
 * using a Data Transfer Object so that the Quick Sort algorithm
 * can be used.
 * 
 */

public class EmployeeDto {
	
	//To store in ArrayList through Data Transfer Object
	private String id;
	private String name;
	private String field;
	private String workingHours;
	private String basicPay;
	private String otp;
	private String philHealth;
	private String pagIbig;
	private String sss;
	private String tax;
	private String gross;
	private String deduction;
	private String net;
	
	//getters and setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public String getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	
	public String getBasicPay() {
		return basicPay;
	}
	
	public void setBasicPay(String basicPay) {
		this.basicPay = basicPay;
	}
	
	public String getOtp() {
		return otp;
	}
	
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	public String getPhilHealth() {
		return philHealth;
	}
	
	public void setPhilHealth(String philHealth) {
		this.philHealth = philHealth;
	}
	
	public String getPagIbig() {
		return pagIbig;
	}
	
	public void setPagIbig(String pagIbig) {
		this.pagIbig = pagIbig;
	}
	
	public String getSss() {
		return sss;
	}
	
	public void setSss(String sss) {
		this.sss = sss;
	}
	
	public String getTax() {
		return tax;
	}
	
	public void setTax(String tax) {
		this.tax = tax;
	}
	
	public String getGross() {
		return gross;
	}
	
	public void setGross(String gross) {
		this.gross = gross;
	}
	
	public String getDeduction() {
		return deduction;
	}
	
	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}
	
	public String getNet() {
		return net;
	}
	
	public void setNet(String net) {
		this.net = net;
	}
	
	//for sorting
	public String getSortBy(String query) {
		switch(query) {
			case "ID":
				return getId();
			case "Name":
				return getName();
			case "Field":
				return getField();
			case "Working Hours":
				return getWorkingHours();
			case "Basic Pay":
				return getBasicPay();
			case "OTP":
				return getOtp();
			case "PhilHealth":
				return getPhilHealth();
			case "Pag-ibig":
				return getPagIbig();
			case "SSS":
				return getSss();
			case "Tax":
				return getTax();
			case "Gross":
				return getGross();
			case "Deduction":
				return getDeduction();
			case "Net":
				return getNet();
			default:
				return getName();
		}
		
	}
}
