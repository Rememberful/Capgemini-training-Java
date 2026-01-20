package Classwork_17th_January;

abstract class Game {
	abstract void start();
	abstract void end();
	
	void play() {
		start();
		end();
	}
	
	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.play();
		Football f = new Football();
		f.play();
	}
}
