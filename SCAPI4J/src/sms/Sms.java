package sms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


/**
 * 
 * @author Behar
 * Sms senden 
 */
public class Sms {
	
	private int to;  //Telefonnummer
	private String text; //Nachricht
	private int tokenLength;  //??
	private int expireTime; //?
	 
	
	
	/**
	 * @param apiKey
	 * @param sms
	 * @throws IOException 
	 */
	public static void senden (String apiKey, Sms sms) throws IOException {
		try{
			//URL 
			URL url = new URL("tps://api.swisscom.com/v1/"); 
			
			//Verbindung offnen 
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//Methode
			con.setRequestMethod("POST");
			//Header setezn 
			con.setRequestProperty("client_id", apiKey);
			con.setRequestProperty("Accept", "application/json; charset=utf-8");
			con.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			
			con.setDoOutput(true);
			
			//Json data im Body hinzufügen 
			
		}
		catch (MalformedURLException e) {
			 e.printStackTrace();
		}
		
	} 
	
	//Getter und  Setter Methoden 
	
	/**
	 * 
	 * @return Nachricht 
	 */
	public int getTo() {
		return to;
	}
	
	/**
	 * 
	 * @param to Telefonnummer des Senders 
	 */
	public void setTo(int to) {
		this.to = to;
	}
	
	/**
	 * @return Nachricht
	 */
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getTokenLength() {
		return tokenLength;
	}
	
	public void setTokenLength(int tokenLength) {
		this.tokenLength = tokenLength;
	}
	
	public int getExpireTime() {
		return expireTime;
	}
	
	public void setExpireTime(int expireTime) {
		this.expireTime = expireTime;
	}

}
