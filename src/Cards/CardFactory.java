package Cards;

import Cards.ActionCard.*;
import Cards.PriceCard.*;
import Cards.Properties.*;


public class CardFactory extends AbstractCardFactory {

	@Override
	public Card createCard(String cardType) {
		//Action Card
		switch (cardType.toLowerCase()) {
	    case "dealbreakercard":
	        return new DealBreakerCard();
	    case "debtcollectorcard":
	        return new DebtCollectorCard();
	    case "doubletherentcards":
	        return new DoubleTheRentCards();
	    case "forcedealcard":
	        return new ForceDealCard();
	    case "hotelcard":
	        return new HotelCard();
	    case "housecard":
	        return new HouseCard();
	    case "itismybirthdaycard":
	        return new ItIsMyBirthdayCard();
	    case "justsaynocard":
	        return new JustSayNoCard();
	    case "passgocard":
	        return new PassGoCard();
	    case "slydealcard":
	        return new SlyDealCard();
	   //rent card     
	    case "redoryellowrentcard":
	        return new RentCard("Red or Yellow rent card", Cards.CardPrice.M1,Cards.CardColor.Red,Cards.CardColor.Yellow);
	    case "darkblueorgreenrentcard":
	        return new RentCard("Dark Blue or Green rent card", Cards.CardPrice.M1,Cards.CardColor.Blue,Cards.CardColor.Green);
	    case "pinkororangerentcard":
	        return new RentCard("Pink or Orange rent card", Cards.CardPrice.M1,Cards.CardColor.Pink,Cards.CardColor.Orange);
	    case "lightblueorbrownrentcard":
	        return new RentCard("Light Blue or Brown rent card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,Cards.CardColor.Brown);
	    case "railroadorutilityrentcard":
	        return new RentCard("Railroad or Utility rent card", Cards.CardPrice.M1,Cards.CardColor.Black,Cards.CardColor.LightGreen);
	    case "wildrentcard":
	        return new WildRentCard("Wild Rent Card");
	    //price cards    
	    case "onempricecard":
	        return new PriceCard("price card of 1M",Cards.CardPrice.M1);
	    case "twompricecard":
	        return new PriceCard("price card of 2M",Cards.CardPrice.M2);
	    case "threempricecard":
	        return new PriceCard("price card of 3M",Cards.CardPrice.M3);
	    case "fourmpricecard":
	        return new PriceCard("price card of 4M",Cards.CardPrice.M4);
	    case "fivempricecard":
	        return new PriceCard("price card of 5M",Cards.CardPrice.M5);
	    case "tenmpricecard":
	        return new PriceCard("price card of 10M",Cards.CardPrice.M10);
	    //property card
	    case "redpropertycard":
	        return new PropertyCard("Red property card", Cards.CardPrice.M3,Cards.CardColor.Red,3);
	    case "bluepropertycard":
	        return new PropertyCard("Blue property card", Cards.CardPrice.M4,Cards.CardColor.Blue,2);
	    case "brownpropertycard":
	        return new PropertyCard("Brown property card", Cards.CardPrice.M1,Cards.CardColor.Brown,2);
	    case "utilitypropertycard":
	        return new PropertyCard("Utility property card", Cards.CardPrice.M2,Cards.CardColor.LightGreen,2);
	    case "greenpropertycard":
	        return new PropertyCard("Green property card", Cards.CardPrice.M4,Cards.CardColor.Green,3);
	    case "yellowpropertycard":
	        return new PropertyCard("Yellow property card", Cards.CardPrice.M3,Cards.CardColor.Yellow,3);
	    case "orangepropertycard":
	        return new PropertyCard("Orange property card", Cards.CardPrice.M2,Cards.CardColor.Orange,3);
	    case "pinkpropertycard":
	        return new PropertyCard("Pink property card", Cards.CardPrice.M2,Cards.CardColor.Pink,3);
	    case "lightbluepropertycard":
	        return new PropertyCard("Light Blue property card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,3);
	    case "railroadpropertycard":
	        return new PropertyCard("Railroad property card", Cards.CardPrice.M2,Cards.CardColor.Black,4);
	    
	    case "redoryellowpropertycard":
	        return new PropertyCard("Red or Yellow property card", Cards.CardPrice.M3,Cards.CardColor.Red,Cards.CardColor.Yellow,3,3);
	    case "darkblueorgreenpropertycard":
	        return new PropertyCard("Dark Blue or Green property card", Cards.CardPrice.M4,Cards.CardColor.Blue,Cards.CardColor.Green,2,3);
	    case "pinkororangepropertycard":
	        return new PropertyCard("Pink or Orange property card", Cards.CardPrice.M2,Cards.CardColor.Pink,Cards.CardColor.Orange,3,3);
	    case "lightblueorbrownpropertycard":
	        return new PropertyCard("Light Blue or Brown property card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,Cards.CardColor.Brown,3,2);
	    case "railroadorutilitypropertycard":
	        return new PropertyCard("Railroad or Utility property card", Cards.CardPrice.M2,Cards.CardColor.Black,Cards.CardColor.LightGreen,4,2);
	    case "greenorrailroadpropertycard":
	        return new PropertyCard("Green or Railroad property card", Cards.CardPrice.M4,Cards.CardColor.Green,Cards.CardColor.Black,3,4);
	    case "lightblueorrailroadpropertycard":
	        return new PropertyCard("Light Blue or Railroad property card", Cards.CardPrice.M4,Cards.CardColor.CambridgeBlue,Cards.CardColor.Black,3,4);
	    
	    case "wildpropertycard":
	        return new WildPropertyCard("multi-colour Property Wildcards");
	    
	    
	    
	    
	    default:
	        
	        break;
	    }

	return null; 
	}
}
//调用时大概如下
//Card cardl = CardFactory.createCard ("DealBreakerCard")；
//card1.function();
