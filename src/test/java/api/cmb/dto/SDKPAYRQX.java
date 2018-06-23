package api.cmb.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SDKPAYRQX
{

    private String buscod;
    private String modals;

    public String getModals() {
        return modals;
    }

    @XmlElement(name = "MODALS")
    public void setModals(String modals) {
        this.modals = modals;
    }

    public String getBuscod() {
        return buscod;
    }
    @XmlElement(name = "BUSCOD")
    public void setBuscod(String buscod) {
        this.buscod = buscod;
    }
}
