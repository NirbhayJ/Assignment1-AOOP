/**
 * @author Nirbhay Jadhav
 *@version 1.01
 */
public class Hero 
	{
		//define Private variables
		private int strength;
		private int speed;
		private int health;
	
		//define public variables
		public String name;
	
		
		//define Constructor
		public Hero(String name) 
		{
			this.name = name;
			generateAbilities();
		}
		
		//call method hitAttempt 
		public void fight() 
		{
			hitAttempt();
		}
		
		
		//call method abilities
	public void show() {
		System.out.println("Strength:" + this.strength);
		System.out.println("Speed:" + this.speed);
		System.out.println("health:" + this.health);
	}
	
	//private methods----------------------------------------------------
	
	//this methods will generate hero's abilities
	private void generateAbilities() {
		
		this.strength = (int)(Math.random()*100+1);
		this.speed = (int)(Math.random()*100+1);
		this.health = (int)(Math.random()*100+1);
	}
	
	//this method will determine is the hero's been hit or no
	private boolean hitAttempt() {
		int check = (int)(Math.random()*100+1);
		if(check > 1 && check < 21) { //to make it 20% chance of hit
			System.out.println("Hero has been hit.");
			hitDamage();
			return true;
		}
		else {
		return false;
		}
	}
	
	//if the hero's been hit, this method will calculate hero's damage
	private int hitDamage() {
		int damage = strength * (int)(Math.random()*6+1);
		System.out.println("The damage is " + damage);
		return damage;
	}
}
