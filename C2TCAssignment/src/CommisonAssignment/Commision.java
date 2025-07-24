package CommisonAssignment;



import java.util.Objects;

public class Commision {
	private String name;
	private String phone;
	private String address;
	private int salesAmount;
	private Double commission;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalesAmount() {
		return salesAmount;
	}


	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}


	public Double getCommission() {
		return commission;
	}


	public void setCommission(Double commission) {
		this.commission = commission;
	}


	public void SaleCommission() {
		if(salesAmount>=100000) {
			commission= salesAmount * 0.10;
		}
		else if(salesAmount>=50000) {
			commission=salesAmount * 0.05;
		}
		else if (salesAmount>=30000) {
			commission=salesAmount *0.03;
		} 
		else {
			commission = null;
	}
		
		System.out.println("Enter the Name : " + name);
		System.out.println("Enter the Sales Amounnt : " + salesAmount);
		System.out.println("Enter the Commission : " + commission);
		
	}
	
	

}

}
