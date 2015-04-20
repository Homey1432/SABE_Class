
public class Semester {

public Term term;
private int year;

public Semester() {
	
}

public Semester(Term term, int year) {
	this.term = term;
	this.year = year;
}

public Term getTerm() {
	return term;
}
public void setTerm(Term term) {
	this.term = term;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

//DCH 4/19/2015 not sure why this is here
public int hashCode() {
	
	return 0;
}

//DCH 4/19/2015 not sure why this is here
public boolean equals(Object obj) {
	return false;
}

}
