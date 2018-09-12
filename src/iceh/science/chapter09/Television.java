package iceh.science.chapter09;

public class Television extends Product {
	private String description;

	public Television(String name, int price, int dicountRate, String description) {
		super(name, price, dicountRate);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
