package models;

import javax.persistence.*;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Speaker extends Model {
	
	@Id
	public Long id;
	
	public String name;
	
	public String email;
	
	@Column(length = 1000)
	public String bio;
	
	public String twitterId;
	
	public String pictureUrl;

}
