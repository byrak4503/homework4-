package homework4;

public class CampaignManager implements ICampaignService {
	public void add(Campaign campaign) {
		System.out.println(campaign.getId()+" kodlu kampanya eklendi");
		
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId()+" kodlu kampanya silindi");
		
	}
	
	
	public void updated(Campaign campaign) {
		System.out.println(campaign.getId()+" kodlu kampanya güncellendi");
		
	}

}
