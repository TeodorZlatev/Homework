package entities;

import java.sql.Timestamp;
import java.util.List;

public class Topic {
	private int id;
	private String title;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private int userId;
	private int forumId;
	private List<Reply> repliesList;

	public Topic() {
	}

	public Topic(int id, String title, Timestamp createdAt, Timestamp modifiedAt, int userId, int forumId) {
		super();
		this.id = id;
		this.title = title;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.userId = userId;
		this.forumId = forumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public List<Reply> getRepliesList() {
		return repliesList;
	}

	public void setRepliesList(List<Reply> repliesList) {
		this.repliesList = repliesList;
	}

}
