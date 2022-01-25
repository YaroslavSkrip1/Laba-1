
public class CoolectAndValue {
int year;
int values;
public CoolectAndValue(int year, int values) {
	super();
	this.year = year;
	this.values = values;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValues() {
	return values;
}
public void setValues(int values) {
	this.values = values;
}
@Override
public String toString() {
	return "CoolectAndValue [year=" + year + ", values=" + values + "]";
}

}
