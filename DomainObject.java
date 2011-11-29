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
	
	public DomainObject(String name, String comment) {
    super();
    this.name = name;
    this.comment = comment;
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
	
	public String getName(){
		return name;
	}
	
	public String setName(String pname){
		this.name = pname;
	}

}
