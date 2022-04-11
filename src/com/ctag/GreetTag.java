package com.ctag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetTag extends TagSupport {

	public int doStartTag() throws JspException {
		Date d = new Date();
		int h = d.getHours();
		JspWriter out = pageContext.getOut();
		try {

			if (h >= 0 && h <= 11) {
				out.print("Good Morning!!");

			} else if (h >= 12 && h <= 17) {
				out.print("Good Noon");
			} else {
				out.print("Good Evening");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
//		return EVAL_BODY_INCLUDE;

	}

	public int doEndTag() throws JspException {

		return EVAL_PAGE;
//		return SKIP_PAGE;
	}
}
