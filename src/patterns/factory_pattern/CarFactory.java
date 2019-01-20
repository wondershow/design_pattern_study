/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package patterns.factory_pattern;



public class CarFactory
{
	public static Car getCar(String model) {
		if (model.equalsIgnoreCase("sedan")) {
			return new Sedan();
		} else if (model.equalsIgnoreCase("truck")) {
			return new Truck();
		} else {
			return null;
		}
	}
}
