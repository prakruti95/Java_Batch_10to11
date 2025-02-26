package com.custometag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CopyrightTag extends SimpleTagSupport
{
	@Override
	public void doTag() throws JspException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doTag();
		JspWriter out = getJspContext().getOut();
		try
		{
			out.println("Dont Copy My Data..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
