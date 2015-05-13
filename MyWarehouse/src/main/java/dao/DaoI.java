package dao;


public interface DaoI {
	public <T> T persist(T entity);
	public <T> T find(Class<T> type,int id);
	public <T> T update(T entity);
	public <T> void remove(T entity);
}
