package com.epam.task2;

public class GulabJaamun extends ChocolatesAndSweets {
	static int dairyweigth=0;
	static int quantity=0;
	static int totalprice=0;
	static int price=100;
	@Override
	public int totalWeigth(int wt) {
		weight=weight+wt;
		quantity=quantity+1;
		totalprice=totalprice+price*quantity;
		return weight;
	}
	

}
