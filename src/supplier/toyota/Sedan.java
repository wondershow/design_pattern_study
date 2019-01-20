/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package supplier.toyota;

import common.Car;

public class Sedan implements Car
{

	@Override
	public void drive()
	{
		System.out.println("Toyota sedan car is running");
	}

}
