package edu.albany.complementable;

//RGBColor extends semigroup with Integer[] and implements an RGBColor of Complementable
public class RGBColor extends Semigroup<Integer[]> implements Complementable<RGBColor> {

	private Integer [] RGB = new Integer[3];
	
	public RGBColor(Integer r, Integer g, Integer b) {
		RGB[0] = r;
		RGB[1] = g;
		RGB[2] = b;
	}

	//Compliment returns a new RGBColor object with 255-components
	@Override
	public RGBColor complement() {
		RGBColor comp = new RGBColor (255-RGB[0], 255-RGB[1], 255-RGB[2]);
		return comp;
	}

	//Operate returns the average
	@Override
	public Integer[] operate(Integer [] a, Integer [] b) {
		Integer[] RGBOperate = new Integer [3];
		for (int i=0; i<3; i++) {
			RGBOperate[i] =((a[i]+b[i])/2);
		}
		return RGBOperate;
	}

	//Getters and setters
	public Integer[] getRGB() {
		return RGB;
	}

	public void setRGB(Integer[] rGB) {
		RGB = rGB;
	}	
	}

	