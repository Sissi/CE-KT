package at.jku.ce;

public class DomainObject {

	private String uuid;
	private String name;
	private String comment;

  /** 
   *  Default constructor
   */
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) {
		super();
		this.id = id;
	}
	
	public String getUuid() {
		return uuid;
	}
	
	public String id = UUID.random().toString()
	
	public String getComment(){
		return comment;
	}
	
	public String setComment(String comment){
		this.comment = comment;
	}

}
