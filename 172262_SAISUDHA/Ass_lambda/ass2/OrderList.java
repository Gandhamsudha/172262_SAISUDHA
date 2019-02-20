package ass2;

public class OrderList {

	public static void main(String[] args) {
		Order oa	=(amount)->{
		if(amount>10000)
			System.out.println("order status accepted");
		else
			System.out.println("order status completed");
		return amount;};
		oa.orderamount(20);

	}

}
