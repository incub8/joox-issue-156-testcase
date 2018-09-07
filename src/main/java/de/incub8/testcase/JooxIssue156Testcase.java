package de.incub8.testcase;

import static org.joox.JOOX.$;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import lombok.extern.slf4j.Slf4j;

import org.w3c.dom.Element;

import de.incub8.testcase.jaxb.OTAProfileCreateRQ;

@Slf4j
public class JooxIssue156Testcase
{
    public static void main(String args[])
    {
        log.info("Testcase for JOOX issue #156: https://github.com/jOOQ/jOOX/issues/156");

        new JooxIssue156Testcase().run();
    }

    private void run()
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(OTAProfileCreateRQ.class);
            OTAProfileCreateRQ createRQ = (OTAProfileCreateRQ) jaxbContext.createUnmarshaller()
                .unmarshal(getClass().getResource("OTA_ProfileCreateRQ.xml"));

            for (Element element : $(createRQ).xpath("//*"))
            {
                log.info($(element).xpath());
            }
        }
        catch (JAXBException e)
        {
            log.error("JAXB error", e);
        }
    }
}
