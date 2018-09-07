package de.incub8.testcase.jaxb;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate>
{
	@Override
	public LocalDate unmarshal(String value)
	{
		return LocalDate.parse(value);
	}
	
	@Override
	public String marshal(LocalDate value)
	{
		if (value == null)
		{
			return null;
		}
		return value.toString();
	}
}
