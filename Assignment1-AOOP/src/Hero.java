/**
 * @author Nirbhay Jadhav
 * Date :- 29 JAN 2015
 * program build to calculate the hero's strength,speed,health,damage and hit using constroctor and private,public method.
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
		public void show() 
		{
			System.out.println("Strength:" + this.strength);
			System.out.println("Speed:" + this.speed);
			System.out.println("health:" + this.health);
		}
	
		//call method abilities
		private void generateAbilities() 
		{
			this.strength = (int)(Math.random()*100+1);
			this.speed = (int)(Math.random()*100+1);
			this.health = (int)(Math.random()*100+1);
		}
	
		// call method hit attempt
		private boolean hitAttempt()
		{
			int check = (int)(Math.random()*100+1);
			if(check > 1 && check < 21) 
			{ 
				System.out.println("-->Hero has been hit");
				hitDamage();
				return true;
			}
			else 
				{
					System.out.println("-->Hero not has been hit.");
					return false;
				}
		}
	
	//call method hit damage
	private int hitDamage() 
	{
		int damage = strength * (int)(Math.random()*6+1);
		System.out.println("The damage = " + damage);
		return damage;
	}
}
