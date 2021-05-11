package Business.Concrete;

import Business.Abstract.PlayerCheckService;
import Business.Abstract.PlayerService;
import Entities.Concrete.Player;

public class PlayerManager implements PlayerService{

   PlayerCheckService playerCheckService;
   public PlayerManager(PlayerCheckService playerCheckService) {
	   this.playerCheckService=playerCheckService;
   }
@Override
public void update(Player player) {
	personControl(player);
	System.out.println(player.getFirstName()+": adl� kullan�c� g�ncellendi ");
	
}
@Override
public void add(Player player) {
	personControl(player);
	System.out.println(player.getFirstName()+": adl� kullan�c� eklendi ");
	
}
@Override
public void delete(Player player) {
	personControl(player);
	System.out.println(player.getFirstName()+": adl� kullan�c� silindi ");
	
}

private void personControl(Player player) {
	if(playerCheckService.checkIfRealPerson(player)) {
		System.out.println("kullan�c� bulundu. ");
	}
	else {
		System.out.println("kullan�c� bulunamad�. ");
	}
}

   
   
   
}
