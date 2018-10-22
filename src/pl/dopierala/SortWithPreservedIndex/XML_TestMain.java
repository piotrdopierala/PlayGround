package pl.dopierala.SortWithPreservedIndex;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XML_TestMain {
    public static void main(String[] args) {
        Data d1 = new Data("nazwa1");
        Data d2 = new Data("nazwa2");
        Data d3 = new Data("nazwa3");

        try {
            JAXBContext c = JAXBContext.newInstance(Data.class);
            Marshaller marshaller = c.createMarshaller();
            marshaller.marshal(d1,new File("test.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
