package homework4;

public class PlayerCheckManager implements IPlayerCheckService {
    
	@Override
	public boolean CheckIfRealPerson(Player player) {
		if (player.getNationalIdentity() == "12345678910") {
			System.out.println("Do�rulama ba�ar�l�");
			return true;
			
			
		}else {
			System.out.println("Do�rulama ba�ar�s�z");
			return false;
		}
		
		
	}

}
