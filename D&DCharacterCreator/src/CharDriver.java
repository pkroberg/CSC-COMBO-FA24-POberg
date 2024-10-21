import java.util.Random;
import java.util.Scanner;

public class CharDriver {
	public static void main(String[] args) {
		Random rand = new Random();
		Character bilbo = new Character("Bilbo", "Hobbit", 200, 25);
		Character enemy = new Character("Jimmy", "Human", 300, 20);
		int dmg;		
		//bilbo = Character.createChar(bilbo);
		//enemy = Character.createChar(enemy);
		
		bilbo.setWeapon("Sting", 35);
		enemy.setWeapon("Claws", 20);
	
		System.out.println(bilbo);
		System.out.println();
		System.out.println(enemy);
		while(bilbo.getHealth() > 0 && enemy.getHealth() > 0) {
			int whoGoes = rand.nextInt(2);
			
			if(bilbo.getHealth() > 0 && whoGoes == 0) {
				dmg = bilbo.attack(bilbo.getStrength());
				enemy.damage(dmg);
				System.out.println("Damage done: " + dmg + "\n");
				System.out.println(enemy);				
			}
			if(enemy.getHealth() > 0 && whoGoes == 1) {
				dmg = enemy.attack(enemy.getStrength());
				bilbo.damage(dmg);
				System.out.println("Damage done: " + dmg + "\n");
				System.out.println(bilbo);				
			}
		}
	}
}
