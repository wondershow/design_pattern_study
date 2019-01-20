/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 20, 2019
 */
package supplier.nissan;

import common.Car;

public class Truck implements Car
{

	@Override
	public void drive()
	{
		System.out.println("Nissan truck is running");
	}

}
