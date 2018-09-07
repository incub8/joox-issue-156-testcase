package de.incub8.testcase.jaxb;

import java.time.ZonedDateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.github.mizool.core.converter.ZonedDateTimeConverter;

public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime>
{
    private final ZonedDateTimeConverter zonedDateTimeConverter = new ZonedDateTimeConverter();

    @Override
    public ZonedDateTime unmarshal(String value)
    {
        return zonedDateTimeConverter.fromString(value);
    }

    @Override
    public String marshal(ZonedDateTime value)
    {
        return zonedDateTimeConverter.toString(value);
    }
}