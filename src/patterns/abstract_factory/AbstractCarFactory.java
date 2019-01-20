/**
 * Author: Lei Zhang
 * raymond.zhang.us@gmail.com
 * Jan 20, 2019
 */
package patterns.abstract_factory;
import common.Car;

public abstract class AbstractCarFactory
{
	public abstract Car getCarByModel(String model);
}
