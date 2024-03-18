package smartHome.ddd;

import java.util.Optional;

public abstract interface Repository<ID extends DomainID, T extends AggregateRoot<ID> > {
  
  public T save(T entity);
  
  public Iterable<T> findAll();
  
  public Optional<T> ofIdentity(ID id);
  
  public boolean containsOfIdentity(ID id);
}