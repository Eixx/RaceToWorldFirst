package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model;

public class Player {
	String name;
	String realm;
	String region;
	
	public Player(String name, String realm, String region) {
		super();
		this.name = name;
		this.realm = realm;
		this.region = region;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealm() {
		return realm;
	}
	public void setRealm(String realm) {
		this.realm = realm;
	}		
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", realm=" + realm + ", region="
				+ region + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((realm == null) ? 0 : realm.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (realm == null) {
			if (other.realm != null)
				return false;
		} else if (!realm.equals(other.realm))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}	
	
}
