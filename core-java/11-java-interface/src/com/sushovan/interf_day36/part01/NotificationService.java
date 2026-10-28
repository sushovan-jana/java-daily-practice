package com.sushovan.interf_day36.part01;

public interface NotificationService {
	void sendNotification(String receipent, String message);
	boolean isDelivered();
}
