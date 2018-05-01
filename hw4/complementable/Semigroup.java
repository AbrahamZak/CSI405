package edu.albany.complementable;

import java.util.Collection;

public abstract class Semigroup<T> {
	//operate method
	public abstract T operate(T a, T b);

	
	//Combine method
	@SuppressWarnings("unchecked")
	public static <T> T combine(Collection<T> list, int flag){
		//If its a Positive Integer, add the values using operate
		if (flag == 0) {
		Integer count = 0;
		for (T i : list) {
			PositiveInteger a = (PositiveInteger) i;
			count = a.operate(a.getA(), count);
			
		}
		//Return the result
		return (T) count;
		}
		//If its a RGB Color, average the values using operate
		else if (flag == 1) {
			Integer [] rgbcount = new Integer [3];
			rgbcount[0] = 0;
			rgbcount[1] = 0;
			rgbcount[2] = 0;
			Boolean firstTime = false;
			for (T i : list) {
				RGBColor a = (RGBColor) i;
				//If this is the first time, we don't operate. Instead we set the values of our
				//Integer array to the first set of RGBColor in the input arraylist
				if (firstTime == false) {
				rgbcount = a.getRGB();
				firstTime=true;
				continue;
				}
				rgbcount = a.operate(a.getRGB(), rgbcount);
			}
			System.out.print("Operate for RGBColor: ");
			for (Integer i : rgbcount) {
				System.out.print(i + " ");
			}
			//Return the result
			return (T) rgbcount;
		}
		return null;
	}
}