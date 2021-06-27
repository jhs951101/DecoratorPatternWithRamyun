package pkg;

public class Main {

	public static void main(String[] args) {
		
		Ramyun samyangramyun = new SamyangRamyun();
		System.out.println(samyangramyun.getDescription());
		
		Ramyun Shinramyun = new ShinRamyun();
		Shinramyun = new Scallion(Shinramyun);
		Shinramyun = new Egg(Shinramyun);
		Shinramyun = new Egg(Shinramyun);
		Shinramyun = new Dumpling(Shinramyun);
		System.out.println(Shinramyun.getDescription());
		
	}
}
