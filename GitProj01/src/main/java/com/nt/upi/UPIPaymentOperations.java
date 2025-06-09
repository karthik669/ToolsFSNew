package com.nt.upi;

public class UPIPaymentOperations {

	public String doPayment(String upiId, double amount ) {
		return amount+"is transfered to"+upiId;
		
		public String addrewards(String txId) {
			return txId+" has got" +new Random().nextInt(4000)+"rewards points have come";
		}
	}
}
