/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 19, 2019
 */
package patterns.factory_pattern;

import common.Car;

public class PatternDemo
{

	public static void main(String[] args)
	{
		CarFactory cf = new CarFactory();
		Car car1 = cf.getCar("sedan");
		car1.drive();
		Car car2 = cf.getCar("truck");
		car2.drive();
	}

}
