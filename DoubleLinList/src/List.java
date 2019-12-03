public interface List {
	boolean isEmpty();
	boolean isInList(Object x);
	Object firstElement();
	int length();
	List insert(Object x);
	List append(Object x);
	List delete(Object x);
	List delete();
}
