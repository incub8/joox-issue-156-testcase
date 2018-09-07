package de.incub8.testcase.jaxb;

import java.time.LocalTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalTimeAdapter extends XmlAdapter<String, LocalTime>
{
    @Override
    public LocalTime unmarshal(String value)
    {
        return LocalTime.parse(value);
    }

    @Override
    public String marshal(LocalTime value)
    {
        if (value == null)
        {
            return null;
        }
        return value.toString();
    }
}
