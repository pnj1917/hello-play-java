package models;

import javax.persistence.*;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Proposal extends Model{
	
	@Id
	public Long id;
	
	public String title;
	
	@Column(length=1000)
	public String proposal;
	
	public SessionType type = SessionType.OneHourTalk;
	
	public Boolean isApproved = false;
	
	public String keywords;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Speaker speaker;

}
