import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();

		Random random = new Random();
		Flower flower = new Flower();
		for (int i = 0; i < 79; i++) {

			Location local3 = new Location(random.nextInt(10), random.nextInt(10));
			Color red = new Color(200, 0, 13);
			flower.setColor(red);
			world.add(local3, flower);
		}

		Bug bug = new Bug();
		Location local = new Location(6, 3);
		world.add(local, bug);
		Bug bug1 = new Bug();
		Color blue = new Color(2, 15, 199);
		bug1.setColor(blue);
		Location local1 = new Location(8, 2);
		world.add(local1, bug1);
		bug1.turn();
		bug1.turn();

	}
}
