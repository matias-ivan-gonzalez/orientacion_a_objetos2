package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.*;

public class Usuario {

	private String screenName;
	private String eMail;
	private Set<Tweet> tweets;
	private Set<Retweet> retweets;
	
	public Usuario(String unNombre) {
		this.screenName = unNombre;
	}
	
	public boolean  crearTweet(String text) {
		Tweet nuevoTweet = new Tweet(text, this);
		return tweets.add(nuevoTweet);
	}
	
	public Retweet retweetear(Retweeteable unRetweeteable) {
		Retweet nuevoRetweet = unRetweeteable.retweet();
		retweets.add(nuevoRetweet);
		return nuevoRetweet;
	}
	
	public boolean eliminarTweet(Tweet unTweet) {
		return tweets.remove(unTweet);
	}
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Set<Tweet> getTweets() {
		return tweets;
	}

}
