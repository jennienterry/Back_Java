package sec06.ch07.starcraft;

public class StarcraftMain {

	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank (); //Bionic을 상속받지 않음
		
		System.out.println("medic2 - hp : " + medic2.getCurrentHP());
		System.out.println("marine - hp : " + marine.getCurrentHP());
		
		medic1.heal(medic1);
		medic1.heal(medic2); //다 들어가야한다면 타입은 Object일 확률 높음
		medic1.heal(marine);
		medic1.heal(tank); //Bionic으로 true가 안되기 때문에 치료 x
		
		System.out.println("medic2 - hp : " + medic2.getCurrentHP());
		System.out.println("marine - hp : " + marine.getCurrentHP());
		//치료된 상태
	}

}
