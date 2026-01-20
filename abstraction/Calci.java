package abstraction;

interface Calci {
	public abstract void add(int a, int b); // or just void add(int a, int b); // by default public abstract is added.
	void multi(int a, int b);
	void sub(int a, int b);
	//Protected void m1(); -> protected modifier is not allowed protected in interface.
	//Abstract void m1(); -> abstract modifier is not allowed protected in interface.
	
	
}
