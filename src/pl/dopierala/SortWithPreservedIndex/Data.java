package pl.dopierala.SortWithPreservedIndex;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {
    public String name;


    public Data(String name) {
        this.name = name;
    }

    private Data(){

    }
}
