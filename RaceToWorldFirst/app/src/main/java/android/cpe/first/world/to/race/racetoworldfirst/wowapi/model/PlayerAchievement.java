package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class PlayerAchievement {
	Long achievementId;
	Long timestamp;
	
	public Long getAchievementId() {
		return achievementId;
	}
	public void setAchievementId(Long achievementId) {
		this.achievementId = achievementId;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getUTCtime() {
		SimpleDateFormat dateFormatUtc = new SimpleDateFormat("MMM-dd HH:mm");
		dateFormatUtc.setTimeZone(TimeZone.getTimeZone("UTC"));
		//Time in GMT
		return dateFormatUtc.format(new Date(timestamp));	    	    
	}
	
	@Override
	public String toString() {
		return "PlayerAchievement [achievementId=" + achievementId
				+ ", timestamp=" + timestamp + "]";
	}
	
	public PlayerAchievement(Long achievementId, Long timestamp) {
		super();
		this.achievementId = achievementId;
		this.timestamp = timestamp;
	}
}
