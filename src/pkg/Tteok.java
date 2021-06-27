package pkg;

public class Tteok extends AdditiveDecorator {
	
	Ramyun ramyun;
	
	public Tteok(Ramyun r){
		this.ramyun = r;
	}

	@Override
	public String getDescription() {
		return ramyun.getDescription() + " + Tteok";
	}
}
