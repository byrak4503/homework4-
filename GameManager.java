package homework4;

public class GameManager implements IGameService {
	public void add(Game game) {
		System.out.println(game.getName()+" adlý oyun eklendi");
		
	}
	
	public void delete(Game game) {
		System.out.println(game.getName()+" adlý oyun silindi");
		
	}
	
	public void update(Game game) {
		System.out.println(game.getName()+" adlý oyun güncellendi");
		
	}

}
