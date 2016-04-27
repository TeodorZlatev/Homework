package entities;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Forum {
	private int id;
	private String title;
	private Timestamp createdAt;
	private List<Topic> topicsList;

	public Forum() {
	}

	public Forum(int id, String title, Timestamp createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.createdAt = createdAt;
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

	public List<Topic> getTopicsList() {
		return topicsList;
	}

	public void setTopicsList(List<Topic> topicsList) {
		this.topicsList = topicsList;
	}

}
