package pkg;

public class Scallion extends AdditiveDecorator {
	
	Ramyun ramyun;
	
	public Scallion(Ramyun r){
		this.ramyun = r;
	}

	@Override
	public String getDescription() {
		return ramyun.getDescription() + " + Scallion";
	}
}
