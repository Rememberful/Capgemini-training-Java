package Classwork_15th_january;

public class Wav3 {
	public void meta() {
		System.out.println("Meta AI");
	}
}

class Wav2 extends Wav3{
	public void status() {
		System.out.println("I am status");
	}
}

class Wav1 extends Wav2{
	public void chat() {
		System.out.println("Whatsapp Chat");
	}
}
