package at.jku.ce;

public class DomainObject {

	private String uuid;
	private String name;

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

}
