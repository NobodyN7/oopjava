package hu.iit.uni.miskolc.hu.oop.geometry.array;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Prism;

public class PrismArray {
	
	Prism[] prismArray;
	
	public PrismArray(int size) {
		prismArray = new Prism[size];
	}
	
	public void setPrism(int index, Prism prism){
		prismArray[index] = prism;
	}
	
	public int getArraySize() {
		return prismArray.length;
	}
	
	public Prism getPrism(int index) {
		return prismArray[index];
	}
	
	public int getNoNull() {
		int count = 0;
		for (Prism prism : prismArray) {
			if(prism != null){
				count++;
			}
		}
		return count;
	}
	
	public double getAverageVolume(){
		double average = 0;
		for(Prism prism : prismArray){
			if(prism != null){
				average += prism.getVolume();
			}
		}
		average = average / getNoNull();
		return average;
	}
	
	public int getBarrelCount() {
		int count = 0;
		for (Prism prism: prismArray){
			if(prism instanceof Barrel) {
				count++;
			}
		}
		return count;
	}

}
