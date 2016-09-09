package recitation;

public class Macbook {

	private String macType; 
	private int macSize; //could have been initialized with a double to be more specific
	private String macColor; 
	private double macPrice; // could have been initialized as an int to be less specific 
	private String macProcessor; 
	private String macCountry; 
	
	public Macbook(String macType, String macColor, int macSize, double macPrice, String macProcessor, String macCountry){
		this.macColor = macColor; 
		this.macType = macType; 
		this.macPrice = macPrice; 
		this.macProcessor = macProcessor; 
		this.macCountry = macCountry; 
		this.macSize = macSize; 
	}
	
	public String getMacType(){
		return macType; 
	}
	
	public void setMacType(String newMacType) {
		macType = newMacType;
	}
	
	public String getMacColor(){
		return macColor; 
	}
	
	public void setMacColor(String newMacColor) {
		macColor = newMacColor;
	}
	
	
	public String getMacProcessor(){
		return macProcessor; 
	}
	
	public void setMacProcessor(String newMacProcessor) {
		macProcessor = newMacProcessor;
	}
	
	
	public String getMacCountry(){
		return macCountry; 
	}
	
	public void setMacCountry(String newMacCountry) {
		macCountry = newMacCountry;
	}
	
	
	public int getMacSize(){
		return macSize; 
	}
	
	public void setMacSize(int newMacSize) {
		macSize = newMacSize;
	}
	
	
	public double getMacPrice(){
		return macPrice; 
	}
	
	public void setMacPrice(double newMacPrice) {
		macPrice = newMacPrice;
	}
	

}
