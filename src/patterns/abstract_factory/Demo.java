/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 20, 2019
 */
package patterns.abstract_factory;

import common.Car;

public class Demo
{

	public static void main(String[] args)
	{
		//These should come from a command line arg
		String whichBrand = "nissan";
		String whichModel = "truck";
				
				
		AbstractCarFactory acf = null;
		if (whichBrand.equalsIgnoreCase("nissan")) {
			acf = new NissanCarFactory();
		} else if (whichBrand.equalsIgnoreCase("toyota")) {
			acf = new ToyotaCarFactory();
		}
		
		if (acf != null) {
			Car car = acf.getCarByModel(whichModel);
			car.drive();
		}
	}

}
