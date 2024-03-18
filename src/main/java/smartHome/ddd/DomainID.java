package smartHome.ddd;

public interface DomainID extends ValueObject {
    String getID();
    public boolean equals(Object o);
    public int hashCode();
	
}
