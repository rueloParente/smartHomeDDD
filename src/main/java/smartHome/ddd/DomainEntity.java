package smartHome.ddd;

public interface DomainEntity<ID extends DomainID> {

	public ID identity();

	public boolean sameAs(Object object);
}
