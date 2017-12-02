
public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human man = new Human("The evil vdcgfvcbnvgfffffffff");
		//2. create a new Robot army of good and evil robots.
	Robot ro = new Robot("oof", true);
	Robot ng = new Robot("nub", true);
	Robot br = new Robot("lel", false);
	Robot xD = new Robot("asdf", true);
	Robot ie = new Robot("Guest 666", true);
	Robot as = new Robot("whump", false);
		//3. command your robot army to destroy a human
	ie.destroy(man);
	as.destroy(man);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}