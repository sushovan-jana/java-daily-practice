package com.kodewala.interf_day39.part01;

/**
 * <p>
 * Internally, {@code openAccount()} is {@code abstract void openAccount()};
 * It's a Single Abstract Method present in IAccount (I), so the interface is a FunctionalInterface.
 * We can write another methods except abstract method, still it will be considered as FunctionalInterface.
 * We can use annotation here, that came in java 8.
 * </p>
 * <p><b>Note </b>FunctionalInterface was introduced to enable lamda expression in java (Functional-Programming)</p>
 * 
 * @author Sushovan Jana
 * @since 1.8
 */
@FunctionalInterface // introduced in java 8
public interface IAccount //extends IAccountMgmt // If we try to extend another interface, if any abstract method present in that Parent interface then
// by default that abstract method also will be available in the child Interface, and if child also contains any abstract method then child interface 
// no more stays FunctionalInterface. IAccountMgmt contains void accountDetails(), and IAccount contains void openAccount(). IAccount extends IAccountMgmt
// then IAccount contains two abstract method. For the annotation @FunctionalInterface, compiler will rise error.

{
	/**
	 * @param no arg
	 * @return void
	 */
	void openAccount();
	/**
	 * It's a defender method
	 */
	default void addBeni() {
		System.out.println("IAccount.addBeni()");
	}
	static void printBankName() {
		System.out.println("IAccount.printBankName()");
	}
}
