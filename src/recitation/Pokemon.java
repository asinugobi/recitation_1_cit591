package recitation;


public class Pokemon {

	private String name; 
	private String type; 
	private int powerLevel; 
	private String specialAttack; 
	private String basicAttack;
	private int height; 
	
	
	public Pokemon(String name, String type, int powerLevel, String specialAttack, String basicAttack, int height){
		this.name = name; 
		this.type = type; 
		this.powerLevel = powerLevel; 
		this.specialAttack = specialAttack; 
		this.basicAttack = basicAttack; 
		this.height = height; 
	}


	public String getName() {
		return name;
	}


	public void setName(String newName) {
		name = newName;
	}


	public String getType() {
		return type;
	}


	public void setType(String newType) {
		type = newType;
	}


	public int getPowerLevel() {
		return powerLevel;
	}


	public void setPowerLevel(int newPowerLevel) {
		powerLevel = newPowerLevel;
	}


//	public String getSpecialAttack() {
//		return specialAttack;
//	}
//
//
////	public void setSpecialAttack(String newSpecialAttack) {
////		specialAttack = newSpecialAttack;
////	}
//
//
//	public String getBasicAttack() {
//		return basicAttack;
//	}


//	public void setBasicAttack(String newBasicAttack) {
//		basicAttack = newBasicAttack;
//	}
	
	public String attack(String userAttack){
		
		return name+" use "+userAttack; 
	}
	
	public static void main(String[] args){
		Pokemon pikachu = new Pokemon("Pikachu","Electric",99, "Thunderbolt", "tackle", 16); 
		Pokemon mewtwo = new Pokemon("Mewtwo","Psychic",680,"Mega Mewtwo X","Confusion", 79);
		System.out.println(pikachu.getName());
		System.out.println(mewtwo.getName());
		
		
		System.out.println(pikachu.attack("thunderbolt"));
		System.out.println(mewtwo.attack("confusion!"));
		
	}
	
}
