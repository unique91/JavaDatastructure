
public class main {

	public static void main(String[] args) {
		/*
		DoubleLinList l1 = new DoubleLinList(),
				      l2 = new DoubleLinList(),
				      l3;
		
		System.out.println("l1:" + l1);
		l1.insert("AA");
		System.out.println("l1:" + l1);
		System.out.println("" + l1.isInList("BB"));
		System.out.println("" + l1.isInList("AA"));
		System.out.println("l1:" + l1.firstElement());
		l1.insert("CC");
		System.out.println("l1:" + l1.firstElement());
		System.out.println("l1:" + l1.length());
		System.out.println("l1:" + l1.toString());
		l1.delete("CC");
		System.out.println("l1:" + l1.toString());
		l1.append("CC");
		System.out.println("l1" + l1.toString());
		*/
		DoubleLinList l1 = new DoubleLinList();
		l1.addFront(1);
		l1.addFront(3);
		l1.addFront(5);
		l1.InsertAfter(l1.head, 8);
		l1.printList(l1.head);
	}

}
