package homework4;

public class MernisServiceAdapter implements IPlayerCheckService {
	

	@Override
	public boolean CheckIfRealPerson(Player player) {
		if (player.getNationalIdentity() == "12345678910") {
			
			return true;
			}else {
			return false;
		}
	}

}
