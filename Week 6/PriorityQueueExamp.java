class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void requestProduct(Shop shop, String productName, int quantity) {
        System.out.println("\n" + name + " is requesting " + quantity + " " + productName + "(s).");
        boolean result = shop.handleRequest(productName, quantity);
        if (result) {
            System.out.println(name + ": Purchase successful.");
        } else {
            System.out.println(name + ": Purchase failed.");
		