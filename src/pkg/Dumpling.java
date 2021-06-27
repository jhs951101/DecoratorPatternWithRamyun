package pkg;

public class Dumpling extends AdditiveDecorator {
	
	Ramyun ramyun;
	
	public Dumpling(Ramyun r){
		this.ramyun = r;
	}

	@Override
	public String getDescription() {
		return ramyun.getDescription() + " + Dumpling";
	}
}
