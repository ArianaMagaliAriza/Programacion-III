package ej5;
	
public class Resultado {
	private int max;
	private int min;
	private int prom;
	
	public Resultado(int max, int min, int prom) {
		this.max = max;
		this.min = min;
		this.prom = prom;
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getProm() {
		return prom;
	}
	public void setProm(int prom) {
		this.prom = prom;
	}
	
}