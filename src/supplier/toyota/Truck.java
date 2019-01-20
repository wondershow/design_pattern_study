/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package supplier.toyota;

import common.Car;

public class Truck implements Car
{

	@Override
	public void drive()
	{
		System.out.println("Toyota Truck is running");
	}

}
