/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package patterns.factory_pattern;

import common.Car;
import supplier.toyota.Sedan;
import supplier.toyota.Truck;

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
