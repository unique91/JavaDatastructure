public interface List {
	boolean isEmpty();
	boolean isInList(Object x);
	Object firstElement();
	int length();
	List find(Object x);
	List insert(Object x);
	List append(Object x);
	List delete(Object x);
	List delete();
}
