package homework4;

public class GameManager implements IGameService {
	public void add(Game game) {
		System.out.println(game.getName()+" adl� oyun eklendi");
		
	}
	
	public void delete(Game game) {
		System.out.println(game.getName()+" adl� oyun silindi");
		
	}
	
	public void update(Game game) {
		System.out.println(game.getName()+" adl� oyun g�ncellendi");
		
	}

}
