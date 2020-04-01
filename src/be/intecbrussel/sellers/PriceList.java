package be.intecbrussel.sellers;

public class PriceList {

	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;

	public PriceList() {

	}

	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice= magnumStandardPrice;
		}

	public void setBallPrice(double ballPrice){
		this.ballPrice = ballPrice;	
		}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice= rocketPrice;	
		}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice= magnumStandardPrice;
		}

	public double getBallPrice() {
		return this.ballPrice;
	}

	public double getRocketPrice() {
		return this.rocketPrice;	
		}

	public double getMagnumPrice(MagnumType) {
			return this.magnumStandardPrice;
		}//Hoe de Enum final te verdelen?
}
