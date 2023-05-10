package Cards;

    public abstract class Card {
         String name;
         CardPrice price;

        public Card(String name, CardPrice price) {
            this.name = name;
            this.price = price;
        }

    }
