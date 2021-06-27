package pkg;

public class Egg extends AdditiveDecorator {
	
	Ramyun ramyun;
	
	public Egg(Ramyun r){
		this.ramyun = r;
	}

	@Override
	public String getDescription() {
		return ramyun.getDescription() + " + Egg";
	}

}
