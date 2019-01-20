/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 20, 2019
 */
package patterns.abstract_factory;

import common.Car;
import supplier.toyota.*;

public class ToyotaCarFactory extends AbstractCarFactory
{

	@Override
	public Car getCarByModel(String model)
	{
		if (model.equalsIgnoreCase("sedan")) {
			return new Sedan();
		} 
		if (model.equalsIgnoreCase("truck")) {
			return new Truck();
		} 
		return null;
	}

}
