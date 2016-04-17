package VideoStore;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MainClass {

	public static Connection connection = null;
	public static PreparedStatement prst = null;
	public static ResultSet rs = null;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/videostore", "root", "841952");
			menu();

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Connection didn't closed !!");
				e.printStackTrace();
			}
		}
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(
					"����:\n1.������� �� �����.\n2.������� �� �����.\n3.���������� �� ����� �����.\n4.��������� �� �����.\n5.�������.\n6.�������� �� XML\n7.�������� �� JSON.\n8.�����.");
			System.out.print("�������� �����: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				clientTakes();
				break;
			case 2:
				clientReturns();
				break;
			case 3:
				showInfromation();
				break;
			case 4:
				showTitles();
				break;
			case 5:
				showClients();
				break;
			case 6:
				transferToXML();
				break;
			case 7:
				transferToJSON();
			default:
				break;
			}
		} while (choice > 0 && choice < 8);
	}

	private static void showTitles() {
		try {
			String queryString = "SELECT * FROM videos WHERE quantity > 0;";
			prst = connection.prepareStatement(queryString);
			rs = prst.executeQuery();
			System.out.println("\n������� �����: ");
			System.out.println("ID |��������:                     |����");
			System.out.println("---|------------------------------|----");
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				int quantity = rs.getInt("quantity");
				System.out.println(String.format("%-3d|%-30s|%-4d", id, title, quantity));
			}
			System.out.println("---|------------------------------|----\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void showClients() {
		// TODO Auto-generated method stub
		try {
			String queryString = "SELECT * FROM clients";
			prst = connection.prepareStatement(queryString);
			rs = prst.executeQuery();
			System.out.println("\n�������:");
			System.out.println("ID |���:                          |����� �����");
			System.out.println("---|------------------------------|-----------");
			while (rs.next()) {
				int id_User = rs.getInt("id");
				String fullName = rs.getString("fullName");
				int filmsCounter = rs.getInt("filmsCounter");
				System.out.println(String.format("%-3d|%-30s|%-11d", id_User, fullName, filmsCounter));
			}
			System.out.println("---|------------------------------|-----------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void showInfromation() {
		// TODO Auto-generated method stub
		try {
			String queryString = "SELECT clients.fullName,videos.title, information.dateTaken, information.dateReturn FROM information JOIN clients ON (information.client_id = clients.id) JOIN videos ON (information.film_id = videos.id);";
			prst = connection.prepareStatement(queryString);
			rs = prst.executeQuery();

			System.out.println("\n����������:");
			System.out.println("                    |                              |  ���� ��  |  ���� ��");
			System.out.println("��� �� ������       |��� �� ������ ����            |  �������  |  �������");
			System.out.println("--------------------|------------------------------|-----------|-----------");
			while (rs.next()) {
				String clientName = rs.getString("fullName");
				String movieName = rs.getString("title");
				Date dateTaken = rs.getDate("dateTaken");
				Date dateReturn = rs.getDate("dateReturn");
				System.out.println(
						String.format("%-20s|%-30s|%-11s|%-10s", clientName, movieName, dateTaken, dateReturn));
			}
			System.out.println("--------------------|------------------------------|-----------|-----------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void clientTakes() {
		try {
			String updateUser = "UPDATE clients SET filmsCounter = ? WHERE id = ?";
			String updateFilm = "UPDATE videos SET quantity = ? WHERE id = ?";
			String updateInfo = "INSERT INTO information(client_id,film_id,dateTaken,dateReturn) VALUES (?,?,DATE(CURDATE()), DATE(CURDATE() + 2));";
			showClients();
			User user = new User();
			user = getUserInfo();
			if (user.getFilmsCounter() < 5) {
				showTitles();
				Movie movie = new Movie();
				movie = getMovieInfo();
				prst = connection.prepareStatement(updateUser);
				prst.setInt(1, user.getFilmsCounter() + 1);
				prst.setInt(2, user.getId());
				prst.execute();
				prst = connection.prepareStatement(updateFilm);
				prst.setInt(1, movie.getQuantity() - 1);
				prst.setInt(2, movie.getId());
				prst.execute();
				prst = connection.prepareStatement(updateInfo);
				prst.setInt(1, user.getId());
				prst.setInt(2, movie.getId());
				prst.execute();
				System.out.println("���������� " + user.getFullName() + " ��� ���� \"" + movie.getTitle() + "\".");
			} else {
				System.out.println("������������ ���� ����� �� ����� ������ �����!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void clientReturns() {
		Scanner sc = new Scanner(System.in);
		try {
			String deleteInfo = "DELETE FROM information WHERE information.client_id = ? AND information.film_id = ?;";
			String updateClient = "UPDATE clients SET filmsCounter = filmsCounter - 1 WHERE id = ?;";
			String updateMovie = "UPDATE videos SET quantity = quantity + 1 WHERE id = ?;";
			String queryString = "SELECT clients.fullName, videos.id,videos.title, information.dateTaken, information.dateReturn FROM information JOIN clients ON (information.client_id = clients.id) JOIN videos ON (information.film_id=videos.id) WHERE clients.id = ?;";
			ArrayList<Info> list = new ArrayList();
			list = getInfo();
			if (!list.isEmpty()) {
				int clientId = list.get(0).getClientId();
				prst = connection.prepareStatement(queryString);
				prst.setInt(1, clientId);
				rs = prst.executeQuery();
				System.out.println("                    |ID- |                              |  ���� ��  |  ���� ��");
				System.out.println("��� �� ������       |����|��� �� ������ ����            |  �������  |  �������");
				System.out.println("--------------------|----|------------------------------|-----------|-----------");
				while (rs.next()) {
					String clientName = rs.getString("fullName");
					int movieId = rs.getInt("id");
					String movieName = rs.getString("title");
					Date dateTaken = rs.getDate("dateTaken");
					Date dateReturn = rs.getDate("dateReturn");
					System.out.println(String.format("%-20s|%-4d|%-30s|%-11s|%-10s", clientName, movieId, movieName,
							dateTaken, dateReturn));
				}
				System.out.println("--------------------|----|------------------------------|-----------|-----------");
				System.out.print("�������� \"id\" �� ���� �� �������: ");
				int movieIdReturn = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getMovieId() == movieIdReturn) {
						Date currentDate = new Date();
						Date returnDate = list.get(i).getDateReturn();
						if (returnDate.compareTo(currentDate) < 0) {
							long days = getDateDiff(returnDate, currentDate, TimeUnit.DAYS);
							double penalty = 0.25 * (days);
							System.out.println(
									"������������ ����� " + penalty + " ���� �����. ��������� � � " + days + " ���!");
						}
					}
				}
				prst = connection.prepareStatement(deleteInfo);
				prst.setInt(1, clientId);
				prst.setInt(2, movieIdReturn);
				prst.execute();
				prst = connection.prepareStatement(updateClient);
				prst.setInt(1, clientId);
				prst.execute();
				prst = connection.prepareStatement(updateMovie);
				prst.setInt(1, movieIdReturn);
				prst.execute();
				System.out.println("������������ ����� ���� ����.");
			} else {
				System.out.println("������������ ���� ����� �� �������!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static User getUserInfo() {
		User user = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("�������� \"id\" �� ������: ");
			int clientID = sc.nextInt();
			String getUser = "SELECT * FROM clients where id = ?;";
			user = new User();
			prst = connection.prepareStatement(getUser);
			prst.setInt(1, clientID);
			rs = prst.executeQuery();
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setFullName(rs.getString("fullName"));
				user.setFilmsCounter(rs.getInt("filmsCounter"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	private static Movie getMovieInfo() {
		Movie movie = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("�������� \"id\" �� ����: ");
			int filmID = sc.nextInt();
			String getFilm = "SELECT * FROM videos WHERE id = ?;";
			movie = new Movie();
			prst = connection.prepareStatement(getFilm);
			prst.setInt(1, filmID);
			rs = prst.executeQuery();
			if (rs.next()) {
				movie.setId(rs.getInt("id"));
				movie.setTitle(rs.getString("title"));
				movie.setQuantity(rs.getInt("quantity"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movie;
	}

	private static ArrayList<Info> getInfo() {
		ArrayList<Info> list = null;
		try {
			Scanner sc = new Scanner(System.in);
			showClients();
			System.out.print("�������� \"id\" �� ������: ");
			int clientID = sc.nextInt();
			String getInfo = "SELECT * FROM information WHERE information.client_id = ?;";
			list = new ArrayList<Info>();
			prst = connection.prepareStatement(getInfo);
			prst.setInt(1, clientID);
			rs = prst.executeQuery();
			if (rs.next()) {
				Info info = new Info();
				info.setClientId(rs.getInt("client_id"));
				info.setMovieId(rs.getInt("film_id"));
				info.setDateEnter(rs.getDate("dateTaken"));
				info.setDateReturn(rs.getDate("dateReturn"));
				list.add(info);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}

	public static void transferToXML() {
		try {
			String showMovies = "SELECT * FROM videos;";
			String showClients = "SELECT * FROM clients";
			prst = connection.prepareStatement(showMovies);
			rs = prst.executeQuery();
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();

			Element videoStore = doc.createElement("Videostore");
			Element movies = doc.createElement("Movies");
			doc.appendChild(videoStore);
			videoStore.appendChild(movies);
			while (rs.next()) {
				Element movie = doc.createElement("Movie");
				Element titleMovie = doc.createElement("Title");
				Element quantityMovie = doc.createElement("Quantity");

				movies.appendChild(movie);
				int id = rs.getInt("id");
				String idStr = id + "";
				movie.setAttribute("id", idStr);

				movie.appendChild(titleMovie);
				String title = rs.getString("title");
				titleMovie.appendChild(doc.createTextNode(title));

				movie.appendChild(quantityMovie);
				int quantity = rs.getInt("quantity");
				String quantityStr = quantity + "";
				quantityMovie.appendChild(doc.createTextNode(quantityStr));
			}

			prst = connection.prepareStatement(showClients);
			rs = prst.executeQuery();
			Element clients = doc.createElement("Clients");
			videoStore.appendChild(clients);
			while (rs.next()) {
				Element client = doc.createElement("Client");
				Element name = doc.createElement("Names");
				Element filmsCount = doc.createElement("Count");

				clients.appendChild(client);
				int id_User = rs.getInt("id");
				String idStr = id_User + "";
				client.setAttribute("id", idStr);

				client.appendChild(name);
				String fullName = rs.getString("fullName");
				client.appendChild(doc.createTextNode(fullName));

				client.appendChild(filmsCount);
				int filmsCounter = rs.getInt("filmsCounter");
				String filmsCounterStr = filmsCounter + "";
				client.appendChild(doc.createTextNode(filmsCounterStr));
			}

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("Videostore.xml"));
			transformer.transform(source, result);
			
			System.out.println("������� �� �������� � XML ������.");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void transferToJSON() {
		JSONObject obj = new JSONObject();
		String showMovies = "SELECT * FROM videos;";
		String showClients = "SELECT * FROM clients";
		try {
			prst = connection.prepareStatement(showMovies);
			rs = prst.executeQuery();
			JSONArray movies = new JSONArray();
			while (rs.next()) {
				JSONObject movie = new JSONObject();
				movie.put("id", rs.getInt("id"));
				movie.put("Title", rs.getString("title"));
				movie.put("Quantity", rs.getInt("quantity"));
				movies.put(movie);

			}
			obj.put("Movies", movies);
			
			prst = connection.prepareStatement(showClients);
			rs = prst.executeQuery();
			JSONArray clients = new JSONArray();
			while (rs.next()) {
				JSONObject client = new JSONObject();
				client.put("id", rs.getInt("id"));
				client.put("Name", rs.getString("fullName"));
				client.put("Films count:", rs.getInt("filmsCounter"));
				clients.put(client);

			}
			obj.put("Clients", clients);

			FileWriter file = new FileWriter("Videostore.json");
			file.write(obj.toString());
			file.flush();
			file.close();
			System.out.println("������� �� �������� � JSON ������.");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
