/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 20, 2019
 */
package supplier.nissan;

import common.Car;

public class Sedan implements Car
{

	@Override
	public void drive()
	{
		System.out.println("Nissan sedan is running");
	}

}
