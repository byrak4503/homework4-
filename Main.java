package homework4;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.setId(1);
		player.setName("Burak");
		player.setSurname("BAÞAK");
		player.setDateOfBirth("24.01.2001");
		player.setNationalIdentity("12345678910");
		player.setEmail("byrak@gmail.com");
		
		
		Game game = new Game();
		game.setId(1);
		game.setName("Adam Asmaca");
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaz Kampanyasý");
		campaign.setDiscount(75);
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.add(player);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		

	}

}
