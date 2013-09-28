package hack.persistence.model;

import java.util.List;

public class Query {
	
	Query() {}
	
	long id;
	User user;
	String title;
	String description;
	List<String> claimers;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getClaimers() {
		return claimers;
	}
	public void setClaimers(List<String> claimers) {
		this.claimers = claimers;
	}

}
