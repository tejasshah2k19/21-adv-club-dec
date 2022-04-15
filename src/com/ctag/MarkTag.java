package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MarkTag extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;//setBodyContent , initBody [ body read ] 
	}

	@Override
	public int doAfterBody() throws JspException {

		JspWriter out = getBodyContent().getEnclosingWriter();

		String body = getBodyContent().getString();
		try {
			out.print("<b>" + body + "</b>");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
