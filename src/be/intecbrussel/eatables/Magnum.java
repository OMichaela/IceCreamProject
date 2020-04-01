package be.intecbrussel.eatables;

class Magnum implements Eatable{

	private MagnumType type;

	public Magnum() {
	}

	public Magnum(MagnumType type){
		
	}

	@Override
	public void eat() {
		return;
	}

	public MagnumType getType() {
	return this.type;
	}

	public enum MagnumType {
		MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES;
	}
}
