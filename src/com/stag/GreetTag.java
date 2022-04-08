package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {

	// logic
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		Date d = new Date();
		int h = d.getHours();

		if (h >= 0 && h <= 11) {
			// gm
			out.print("Good Morning");
		} else if (h >= 12 && h <= 16) {
			// gnoon
			out.print("Good Noon");
		} else {
			// ge
			out.print("Good Evening");
		}
	}
}
