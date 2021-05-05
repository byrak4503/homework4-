package homework4;

public class PlayerManager implements IPlayerService {
	
	private PlayerCheckManager playerCheckManager;
	
	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager=playerCheckManager;
	}
	
	@Override
	public void add(Player player) {
		if (playerCheckManager.CheckIfRealPerson(player)== true) {
			System.out.println(player.getName()+" "+player.getSurname()+" adlý oyuncu eklendi");
		}
		
	}
	@Override
	public void delete(Player player) {
		System.out.println(player.getName()+" "+player.getSurname()+" adlý oyuncu silindi");
	}
	@Override
	public void update(Player player) {
		if (playerCheckManager.CheckIfRealPerson(player)== true) {
			System.out.println(player.getName()+" "+player.getSurname()+" adlý oyuncu güncellendi");
		}
}
}
