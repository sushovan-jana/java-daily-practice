package com.kodewala.interf_day36.part01;

/**
 * Defines the contract for discount-related operations and discount tax in
 * property
 * 
 * <p>
 * An interface can extend another interface : every implementing class has to
 * give implementation for both interface - IPropertyTaxDiscount & IDiscount
 * interfaces abstract methods. Otherwise, we'll get compile time error. In
 * IPropertyTaxDiscount interface {@code int MAX_VALUE = 1000} and
 * {@code int calculateDiscount(int amount, int rate)} and
 * {@code public abstract void calculateDiscountTax(int tax)}
 * is present.
 * </p>
 * 
 * <p>
 * <b>Note </b> IPropertyTaxDiscount interface having all the abstract methods
 * including variable inside it.
 * </p>
 * 
 * @author Sushovan Jana
 * @see com.kodewala.interf_day36.part01.IDiscount
 */
public interface IPropertyTaxDiscount extends IDiscount {
	/**
	 * This method is just to show the different operations how interface behaves
	 * while extending another interface
	 * 
	 * @param this method takes no parameter as argument
	 * @return return type is void, hence it returns nothing
	 */
	public abstract void calcualtePropDisc();
}
