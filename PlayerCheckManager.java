package homework4;

public class PlayerCheckManager implements IPlayerCheckService {
    
	@Override
	public boolean CheckIfRealPerson(Player player) {
		if (player.getNationalIdentity() == "12345678910") {
			System.out.println("Doðrulama baþarýlý");
			return true;
			
			
		}else {
			System.out.println("Doðrulama baþarýsýz");
			return false;
		}
		
		
	}

}
