package VideoStore;

import java.util.Date;

public class Info {
	private int clientId;
	private int movieId;
	private Date dateEnter;
	private Date dateReturn;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public Date getDateEnter() {
		return dateEnter;
	}

	public void setDateEnter(Date dateEnter) {
		this.dateEnter = dateEnter;
	}

	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}

}
