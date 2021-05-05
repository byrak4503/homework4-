package homework4;

public class Game extends GameManager {
	private int id;
	private String name;
	
	
	public void Game() {
		
	}
	
	public void Game(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
