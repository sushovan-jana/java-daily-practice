package com.kodewala.interf_day36.part01;

/**
 * Defines the contract for discount-related operations.
 *
 * <p>An interface acts as a central controller: every implementing class is
 * required to provide concrete implementations of the abstract methods declared
 * here. This allows callers to depend on the contract rather than on any
 * specific implementation.</p>
 *
 * <p><b>Note (Java 7 and earlier):</b> every method declared in an interface is
 * implicitly {@code public abstract}, whether or not those modifiers are
 * written. For example, the declaration
 * {@code int calculateDiscount(int amount, int rate);} is equivalent to
 * {@code public abstract int calculateDiscount(int amount, int rate);}.</p>
 *
 * @author Sushovan Jana
 */
public interface IDiscount {
	
	int MAX_VALUE = 1000; // public static final --> constant

	/**
	 * Calculates the discount for the given amount at the given rate.
	 *
	 * @param amount the base amount on which the discount is applied
	 * @param rate   the discount rate to apply
	 * @return the calculated discount value
	 */
	int calculateDiscount(int amount, int rate);

	/**
	 * Calculates the tax applicable to a discounted transaction.
	 *
	 * @param tax the tax value or rate to be applied
	 */
	public abstract void calculateDiscountTax(int tax);
}


