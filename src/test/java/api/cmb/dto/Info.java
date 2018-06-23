package api.cmb.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Info")
public class Info {

    private String funnam;

    private String dattyp;

    private String lgnnam;

    public String getFunnam() {
        return funnam;
    }
    @XmlElement(name = "funnam")
    public void setFunnam(String funnam) {
        this.funnam = funnam;
    }

    public String getDattyp() {
        return dattyp;
    }
    @XmlElement(name = "dattyp")
    public void setDattyp(String dattyp) {
        this.dattyp = dattyp;
    }

    public String getLgnnam() {
        return lgnnam;
    }
    @XmlElement(name = "lgnnam")
    public void setLgnnam(String lgnnam) {
        this.lgnnam = lgnnam;
    }
}
