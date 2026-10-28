package com.sushovan.interf_day36.part01;

public class AccountDriver implements Account, PersonalAccount, PrivateAccount {
	static int MAX_ALLOWED_BALANCE = 999;
	public static void main(String[] args) {
		System.out.println(Account.MAX_ALLOWED_BALANCE);
		System.out.println(PersonalAccount.MAX_ALLOWED_BALANCE);
		System.out.println(PrivateAccount.MAX_ALLOWED_BALANCE);
	}
}
