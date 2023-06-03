package Cards;

public enum CardPrice {
	M0("0M",0),M1("1M",1),M2("2M", 2),M3("3M", 3),M4("4M", 4),
    M5("5M",5),M10("10M",10);
    public String name;
    public  int price ;

    CardPrice(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
//因为WildPropertyCard没有价格所以增加了0元，可以考虑进一步调整