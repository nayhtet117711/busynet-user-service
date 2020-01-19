package com.bcsolutions.busynet.constant;

public class AppConst {
	
	public static enum UserType {
		Admin,
		Manager,
		Supplier,
		Customer,
		Employee,
	}
	
	public static enum TransactionType {
		In,
		Out,
	}
	
	public static class Param {
		public static final String ADMIN_ID = "adminId";
		public static final String CLIENT_ID = "clientId";
		public static final String BUSINESS_ID = "businessId";
	}
	
}
