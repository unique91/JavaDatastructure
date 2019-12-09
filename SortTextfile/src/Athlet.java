// New class Athlet
public class Athlet implements Comparable<Athlet>{
	String name, discipline, result;
	
	// Compare two Strings name Object in the method compareTo() of name-string-object
	public int compareTo(Athlet a) {
		return name.compareTo(a.getName());
	}
	
	Athlet(String n, String d, String r) {
		this.name = n;
		this.discipline = d;
		this.result = r;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDiscipline() {
		return this.discipline;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public String toString() {
		return this.name;
	}
}
