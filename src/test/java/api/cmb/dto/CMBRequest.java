package api.cmb.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CMBSDKPGK")
public class CMBRequest {


    private Info info;

    private SDKPAYRQX sdkpayrqx;

    private DCOPDPAYX dcopdpayx;

    public Info getInfo() {
        return info;
    }

    @XmlElement(name = "INFO")
    public void setInfo(Info info) {
        this.info = info;
    }

    public SDKPAYRQX getSdkpayrqx() {
        return sdkpayrqx;
    }

    @XmlElement(name = "SDKPAYRQX")
    public void setSdkpayrqx(SDKPAYRQX sdkpayrqx) {
        this.sdkpayrqx = sdkpayrqx;
    }

    public DCOPDPAYX getDcopdpayx() {
        return dcopdpayx;
    }

    @XmlElement(name = "DCOPDPAYX")
    public void setDcopdpayx(DCOPDPAYX dcopdpayx) {
        this.dcopdpayx = dcopdpayx;
    }
}