package service.web.container;

import hack.persistence.model.User;

public class Claim {
	
	public Claim() {}
	
	long queryId;
	User user;
	
	public long getQueryId() {
		return queryId;
	}
	public void setQueryId(long queryId) {
		this.queryId = queryId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
