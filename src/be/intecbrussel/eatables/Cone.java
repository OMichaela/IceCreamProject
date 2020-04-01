package be.intecbrussel.eatables;

import java.util.Arrays;

class Cone implements Eatable{
	
	private Flavor[]balls;

	public Cone() {

	}

	public Cone(Flavor[]balls){
	
		}

	@Override
	public void eat() {
		return;
	}

	public enum Flavor {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
	}
}
