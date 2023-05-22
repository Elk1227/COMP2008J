package Cards;

    public abstract class Card {
        private String name;
        public CardPrice price;

        public Card(String name, CardPrice price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public CardPrice getPrice() {
            return price;
        }
    }
