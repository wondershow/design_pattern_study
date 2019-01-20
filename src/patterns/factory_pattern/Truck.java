/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package patterns.factory_pattern;

public class Truck implements Car
{

	@Override
	public void drive()
	{
		System.out.println("Truck is running");
	}

}
