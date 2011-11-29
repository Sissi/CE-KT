package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(new DomainObject("Helga", "Kommentar1"));
		objectSet.add(new DomainObject("Walter", "Kommentar2"));
		objectSet.add(new DomainObject("Hans", "Kommentar3"));
		objectSet.add(new DomainObject("Paul", "Kommentar4"));
		objectSet.add(new DomainObject("Claudia", "Kommentar5"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.toString());
		}
	}
}
