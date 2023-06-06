package Cards;

import java.util.List;
import java.util.ArrayList;

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
	        return new RentCard("Red or Yellow rent card", Cards.CardPrice.M1,Cards.CardColor.Red,Cards.CardColor.Yellow,"resources/action cards/rent cards/red_yellow.jpg");
	    case "darkblueorgreenrentcard":
	        return new RentCard("Dark Blue or Green rent card", Cards.CardPrice.M1,Cards.CardColor.Blue,Cards.CardColor.Green,"resources/action cards/rent cards/green_blue.jpg");
	    case "pinkororangerentcard":
	        return new RentCard("Pink or Orange rent card", Cards.CardPrice.M1,Cards.CardColor.Pink,Cards.CardColor.Orange,"resources/action cards/rent cards/pink_orange.png");
	    case "lightblueorbrownrentcard":
	        return new RentCard("Light Blue or Brown rent card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,Cards.CardColor.Brown,"resources/action cards/rent cards/brown_blue.jpg");
	    case "railroadorutilityrentcard":
	        return new RentCard("Railroad or Utility rent card", Cards.CardPrice.M1,Cards.CardColor.Black,Cards.CardColor.LightGreen,"resources/action cards/rent cards/railroad_utility.jpg");
	    case "wildrentcard":
	        return new RentCard("Wild Rent Card",Cards.CardPrice.M3,Cards.CardColor.wild,"resources/action cards/rent cards/all.png");
	      //price cards    
	     case "onempricecard":
	         return new PriceCard("price card of 1M",Cards.CardPrice.M1,"resources/money/1.png");
	     case "twompricecard":
	         return new PriceCard("price card of 2M",Cards.CardPrice.M2,"resources/money/2.png");
	     case "threempricecard":
	         return new PriceCard("price card of 3M",Cards.CardPrice.M3,"resources/money/3.png");
	     case "fourmpricecard":
	         return new PriceCard("price card of 4M",Cards.CardPrice.M4,"resources/money/4.png");
	     case "fivempricecard":
	         return new PriceCard("price card of 5M",Cards.CardPrice.M5,"resources/money/5.png");
	     case "tenmpricecard":
	         return new PriceCard("price card of 10M",Cards.CardPrice.M10,"resources/money/10.png");
	     //property card
	     case "redpropertycard":
	         return new PropertyCard("Red property card", Cards.CardPrice.M3,Cards.CardColor.Red,3,"resources/property cards/Red.jpg");
	     case "bluepropertycard":
	         return new PropertyCard("Blue property card", Cards.CardPrice.M4,Cards.CardColor.Blue,2,"resources/property cards/Dark Blue.png");
	     case "brownpropertycard":
	         return new PropertyCard("Brown property card", Cards.CardPrice.M1,Cards.CardColor.Brown,2,"resources/property cards/Brown.jpg");
	     case "utilitypropertycard":
	         return new PropertyCard("Utility property card", Cards.CardPrice.M2,Cards.CardColor.LightGreen,2,"resources/property cards/Utility.jpg");
	     case "greenpropertycard":
	         return new PropertyCard("Green property card", Cards.CardPrice.M4,Cards.CardColor.Green,3,"resources/property cards/Green.jpg");
	     case "yellowpropertycard":
	         return new PropertyCard("Yellow property card", Cards.CardPrice.M3,Cards.CardColor.Yellow,3,"resources/property cards/Yellow.jpg");
	     case "orangepropertycard":
	         return new PropertyCard("Orange property card", Cards.CardPrice.M2,Cards.CardColor.Orange,3,"resources/property cards/Orange.jpg");
	     case "pinkpropertycard":
	         return new PropertyCard("Pink property card", Cards.CardPrice.M2,Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
	     case "lightbluepropertycard":
	         return new PropertyCard("Light Blue property card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,3,"resources/property cards/Light Blue.jpg");
	     case "railroadpropertycard":
	         return new PropertyCard("Railroad property card", Cards.CardPrice.M2,Cards.CardColor.Black,4,"resources/property cards/Railroad.jpg");
	     
	     case "redoryellowpropertycard":
	         return new PropertyCard("Red or Yellow property card", Cards.CardPrice.M3,Cards.CardColor.Red,Cards.CardColor.Yellow,3,3,"resources/property cards/Property Wildcards/yellow_red.png");
	     case "darkblueorgreenpropertycard":
	         return new PropertyCard("Dark Blue or Green property card", Cards.CardPrice.M4,Cards.CardColor.Blue,Cards.CardColor.Green,2,3,"resources/property cards/Property Wildcards/darkblue_green.png");
	     case "pinkororangepropertycard":
	         return new PropertyCard("Pink or Orange property card", Cards.CardPrice.M2,Cards.CardColor.Pink,Cards.CardColor.Orange,3,3,"resources/property cards/Property Wildcards/orange_pink.png");
	     case "lightblueorbrownpropertycard":
	         return new PropertyCard("Light Blue or Brown property card", Cards.CardPrice.M1,Cards.CardColor.CambridgeBlue,Cards.CardColor.Brown,3,2,"resources/property cards/Property Wildcards/light blue_brown.jpg");
	     case "railroadorutilitypropertycard":
	         return new PropertyCard("Railroad or Utility property card", Cards.CardPrice.M2,Cards.CardColor.Black,Cards.CardColor.LightGreen,4,2,"resources/property cards/Property Wildcards/Utility_Railroad.jpg");
	     case "greenorrailroadpropertycard":
	         return new PropertyCard("Green or Railroad property card", Cards.CardPrice.M4,Cards.CardColor.Green,Cards.CardColor.Black,3,4,"resources/property cards/Property Wildcards/green_railroad.jpg");
	     case "lightblueorrailroadpropertycard":
	         return new PropertyCard("Light Blue or Railroad property card", Cards.CardPrice.M4,Cards.CardColor.CambridgeBlue,Cards.CardColor.Black,3,4,"resources/property cards/Property Wildcards/light blue _railroad.jpg");
	    
	    case "wildpropertycard":
	        return new PropertyCard("multi-colour Property Wildcards", Cards.CardPrice.M0,Cards.CardColor.wild,0,"resources/property cards/Property Wildcards/Property Wildcards.jpg");
	        
	    default:
	        
	        break;
	    }

	return null; 
	}

//调用时大概如下
//Card cardl = CardFactory.createCard ("DealBreakerCard")；
//card1.function();

public List<Card> packaging (){
List<Card> cardList = new ArrayList<>();
for (int i = 0; i < 2; i++) {
Card dealBreakerCard1 = createCard("dealBreakerCard");
cardList.add(dealBreakerCard1);}
for (int i = 0; i < 3; i++) {
Card debtCollectorCard1 = createCard("debtCollectorCard");
cardList.add(debtCollectorCard1);}
for (int i = 0; i < 2; i++) {
Card doubleTheRentCards1 = createCard("doubleTheRentCards ");
cardList.add(doubleTheRentCards1 );}
for (int i = 0; i < 4; i++) {
Card forceDealCard = createCard("forceDealCard  ");
cardList.add(forceDealCard );}

for (int i = 0; i < 3; i++) {
Card hotelCard = createCard("hotelCard  ");
cardList.add(hotelCard );}
for (int i = 0; i < 3; i++) {
Card houseCard = createCard("houseCard ");
cardList.add(houseCard );}
for (int i = 0; i < 3; i++) {
Card itIsMyBirthdayCard = createCard("itIsMyBirthdayCard ");
cardList.add(itIsMyBirthdayCard );}
for (int i = 0; i < 3; i++) {
Card justSayNoCard = createCard("justSayNoCard ");
cardList.add(justSayNoCard );}
for (int i = 0; i < 10; i++) {
Card passGoCard = createCard("passGoCard ");
cardList.add(passGoCard );}
for (int i = 0; i < 3; i++) {
Card slyDealCard = createCard("slyDealCard ");
cardList.add(slyDealCard );}
for (int i = 0; i <3 ; i++) {
Card wildRentCard = createCard("wildRentCard ");
cardList.add(wildRentCard );}
for (int i = 0; i < 2; i++) {
Card redoryellowrentcard = createCard("redoryellowrentcard");
cardList.add(redoryellowrentcard);}
for (int i = 0; i <2; i++) {
Card darkblueorgreenrentcard = createCard("darkblueorgreenrentcard ");
cardList.add(darkblueorgreenrentcard );}
for (int i = 0; i < 2; i++) {
Card pinkororangerentcard= createCard("pinkororangerentcard");
cardList.add(pinkororangerentcard);}
for (int i = 0; i < 2; i++) {
Card lightblueorbrownrentcard = createCard("lightblueorbrownrentcard ");
cardList.add(lightblueorbrownrentcard );}
for (int i = 0; i < 2; i++) {
Card railroadorutilityrentcard= createCard("wrailroadorutilityrentcard ");
cardList.add(railroadorutilityrentcard );}
for (int i = 0; i < 6; i++) {
Card onempricecard = createCard("onempricecard");
cardList.add(onempricecard);}
for (int i = 0; i < 5; i++) {
Card twompricecard = createCard("twompricecard");
cardList.add(twompricecard);}
for (int i = 0; i < 3; i++) {
Card threempricecard = createCard("threempricecard");
cardList.add(threempricecard);}
for (int i = 0; i < 3; i++) {
Card fourmpricecard = createCard("fourmpricecard");
cardList.add(fourmpricecard);}
for (int i = 0; i < 2; i++) {
Card fivempricecard = createCard("fivempricecard");
cardList.add(fivempricecard);}
for (int i = 0; i < 1; i++) {
Card tenmpricecard = createCard("tenmpricecard");
cardList.add(tenmpricecard);}
for (int i = 0; i < 3; i++) {
Card redpropertycard = createCard("redpropertycard");
cardList.add(redpropertycard);}
for (int i = 0; i < 3; i++) {
Card bluepropertycard= createCard("bluepropertycard");
cardList.add(bluepropertycard);}
for (int i = 0; i < 3; i++) {
Card brownpropertycard = createCard("brownpropertycard");
cardList.add(brownpropertycard);
}
for (int i = 0; i < 3; i++) {
Card utilitypropertycard = createCard("utilitypropertycard");
cardList.add(utilitypropertycard);}
for (int i = 0; i < 3; i++) {
Card greenpropertycard = createCard("greenpropertycard");
cardList.add(greenpropertycard);}
for (int i = 0; i < 3; i++) {
Card yellowpropertycard = createCard("yellowpropertycard");
cardList.add(yellowpropertycard);}
for (int i = 0; i < 3; i++) {
Card orangepropertycard = createCard("orangepropertycard");
cardList.add(orangepropertycard);}
for (int i = 0; i < 3; i++) {
Card pinkpropertycard = createCard("pinkpropertycard");
cardList.add(pinkpropertycard);}
for (int i = 0; i < 3; i++) {
Card lightbluepropertycard = createCard("lightbluepropertycard");
cardList.add(lightbluepropertycard);}
for (int i = 0; i < 4; i++) {
Card railroadpropertycard = createCard("railroadpropertycard");
cardList.add(railroadpropertycard);}
for (int i = 0; i < 2; i++) {
Card redoryellowpropertycard = createCard("redoryellowpropertycard");
cardList.add(redoryellowpropertycard);}
for (int i = 0; i < 1; i++) {
Card darkblueorgreenpropertycard = createCard("darkblueorgreenpropertycard");
cardList.add(darkblueorgreenpropertycard);}
for (int i = 0; i < 2; i++) {
Card pinkororangepropertycard = createCard("pinkororangepropertycard");
cardList.add(pinkororangepropertycard);}
for (int i = 0; i < 1; i++) {
Card lightblueorbrownpropertycard = createCard("lightblueorbrownpropertycard");
cardList.add(lightblueorbrownpropertycard);}
for (int i = 0; i < 1; i++) {
Card railroadorutilitypropertycard = createCard("railroadorutilitypropertycard");
cardList.add(railroadorutilitypropertycard);}
for (int i = 0; i < 1; i++) {
Card greenorrailroadpropertycard = createCard("greenorrailroadpropertycard");
cardList.add(greenorrailroadpropertycard);}
for (int i = 0; i < 1; i++) {
Card lightblueorrailroadpropertycard = createCard("lightblueorrailroadpropertycard");
cardList.add(lightblueorrailroadpropertycard);}
for (int i = 0; i < 2; i++) {
Card wildpropertycard = createCard("wildpropertycard");
cardList.add(wildpropertycard);}


return cardList;
    }
}