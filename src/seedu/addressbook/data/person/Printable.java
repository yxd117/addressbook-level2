package seedu.addressbook.data.person;

import seedu.addressbook.data.tag.Tag;

public interface Printable {
	String getPrintableString();
	default String getPrintableString(String[] arg) {
		String combine = "";
		for (int i = 0; i < arg.length; i++) 
			combine += arg[i];
		return combine;
	}

}
