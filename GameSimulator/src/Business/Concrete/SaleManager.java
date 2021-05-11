package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale( Player player,Game game) {
		System.out.println(player.getFirstName()+" "+ game.getName() +" adl� oyunu sat�n ald�");
		
	}

	@Override
	public void campaignSale(Game game, Player player, Campaign campaign) {
		System.out.println(
				
		        player.getFirstName()+" "+ player.getLastName()+" "+
		        game.getName()+" adl� oyunu "+
			    campaign.getName()+" kampanya kapsam�nda  "+"%" + 
			    campaign.getDiscountRate() + " indirimle " + 
		        discountedPrice(game.getPrice(), campaign.getDiscountRate()) +
		        " fiyata sat�n ald� ");
		
	}


	private double discountedPrice(double Price, double discount) {
		return Price - ((Price * discount) / 100);
	}



}
