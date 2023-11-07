package hw;

import java.util.Random;

public class NightSky {

	private int starsInLastPrint;
	private double density;
	private int width;
	private int height;
	
	
	public NightSky(double density) {
		this.density = density;
	}
	public NightSky(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public NightSky(double density, int width, int height) {
		
		this.density = density;
		this.width = width;
		this.height = height;
	}
	
	
	public int starsInLastPrint() {
		
		return starsInLastPrint;
	}
	
	
	
	public void print() {
		
		for(int i = 0; i < this.height ; i++) {
			printLine();
			System.out.println();
			
		}
		
	}
	
	
	
	public void printLine() {
		
		Random random = new Random();
		
		for(int i = 0; i < this.width; i++) {
			if(random.nextDouble(1) < this.density) {
				System.out.print("*");
				starsInLastPrint++;
			}
			else {
				System.out.print(" ");
			}
		}
	}
}
