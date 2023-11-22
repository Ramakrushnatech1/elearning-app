package com.intellect;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

	public int compare(User a, User b) {
		return a.name.compareTo(b.name);
	}

}
