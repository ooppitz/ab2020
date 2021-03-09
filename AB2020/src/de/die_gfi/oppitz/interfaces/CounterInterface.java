package de.die_gfi.oppitz.interfaces;

public interface CounterInterface {

	public int getCount();
	
	/**
	 * Sets the counter to a new value
	 * @param newValue
	 * @return returns the previous value
	 */
	public int setCount(int newValue);
	
}
