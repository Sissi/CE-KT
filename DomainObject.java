package at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;

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
	
	public String id = UUID.randomUUID().toString()
	public String getUuid() {
		return uuid;
	}

}
