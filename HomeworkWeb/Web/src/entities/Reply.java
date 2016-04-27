package entities;

import java.sql.Timestamp;


public class Reply {
	private int id;
	private String message;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private int topicId;
	private int userId;

	public Reply() {
	}

	public Reply(int id,String message, Timestamp createdAt, Timestamp modifiedAt, int topicId, int userId) {
		super();
		this.id = id;
		this.message = message;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.topicId = topicId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
