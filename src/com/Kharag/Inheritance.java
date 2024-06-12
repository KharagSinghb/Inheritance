package com.Kharag;
/**
 * @author kharag
 * date 04/02/2024
 * writing the second inheritance program
 */
public class Inheritance {
	/**
	 * test Inheritance
	 * @param args Main method
	 */
    public static void main(String[] args) {
        Hero hero = new Hero("Captain Courage", 30, Power.FLIGHT, "Adam Armstrong", 50);
        Villain villain = new Villain("Dr. Dread", 45, Power.TELEPORTATION, "Conquer the world", "Fire");
        System.out.println(hero.introduce());
        System.out.println(hero.usePower());
        System.out.println(hero.saveTheDay());

        System.out.println(villain.introduce());
        System.out.println(villain.usePower());
        System.out.println(villain.executeEvilPlan());
    }
    //start

}
/**
 * super powers
 */
enum Power {
    FLIGHT,
    STRENGTH,
    SPEED,
    TELEPORTATION,
    ONE_PUNCH
}

class Character {
	/**
	 * protected and private variables
	 */
	protected String name;
	protected Power power;
	private int age;
	
	/**
	 * default constructor
	 * @param name variable
	 * @param age variable
	 * @param power variable
	 */
	public Character(String name, int age, Power power) {
		this.name = name;
		this.age = age;
		this.power = power;
		
	}
	/**
	 * return string
	 * @return string
	 */
	public String introduce() {
		return "Hi, my name is " + this.name+"." + " I am " + this.age + " years old and my super power is " + this.power+"!";
		
	}
	/**
	 * return string
	 * @return string
	 */
	public String usePower() {
		return "I use " + this.power + " on you!";
	}
}
/**
 * hero class  extends character
 */
class Hero extends Character {
	/**
	 *  new variables
	 */
	private String secretIdentity;
	private int powerLevel;
	/**
	 * sets super variables in class hero
	 * @param name variable
	 * @param age variable
	 * @param power variable
	 * @param secretIdentity variable
	 * @param powerLevel variable
	 */
	public Hero(String name, int age, Power power, String secretIdentity, int powerLevel) {
		super(name, age, power);
		this.secretIdentity = secretIdentity;
		this.powerLevel = powerLevel;
		
		
				
	}
	/**
	 * return string
	 * @return string
	 */
	public String saveTheDay() {
		return super.name +" as " + secretIdentity + " has saved the day, using "+ super.power+"!";
	}

	
	/**
	 * return string
	 */
	public String saveTheDay(String name, String secretIdentity) {
		return super.name + " as " + secretIdentity + " has saved the day, using " +  super.power +"!";
	

		
		
	}


}
/**
 * villain extends character
 */
class Villain extends Character {
	private String evilPlan;
	private String weakness;
	/**
	 * sets variables for the class villain
	 * @param name variables
	 * @param age variables
	 * @param power variables
	 * @param evilPlan variables
	 * @param weakness variables
	 */
	public Villain(String name, int age, Power power, String evilPlan, String weakness) {
		super(name , age, power);
	

		this.evilPlan = evilPlan;
		this.weakness = weakness;
		
	}
	/**
	 * return string
	 * @return string
	 */
	public String executeEvilPlan() {
		return super.name+" executes evil plan: " +evilPlan+" using " +super.power+" knowing his weakness is "+ weakness+"!";
	}
}



//end
