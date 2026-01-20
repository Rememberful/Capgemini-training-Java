package Classwork_16th_January;

public class Mapv3 {
	public void bookCab() {
		
	}
	class Mapv2 extends Mapv1{
		String duration;
		String direction;
		public void route(String dir, String dur) {
			this.direction = dir;
			this.duration = dur;
		}
	}
	class Mapv1{
		String dir;
		public void route(String dir) {
			this.dir = dir;
		}
	}
}
