package seedu.addressbook.data.person;

public class Tagging  implements Printable {

	public String person;
	public String tag;
	public Tagging(String person, String tag) {
		this.person = person;
		this.tag = tag;
	}
	
    @Override
	public String getPrintableString(){
		return this.person + " [" + this.tag + "]";
    }

}
