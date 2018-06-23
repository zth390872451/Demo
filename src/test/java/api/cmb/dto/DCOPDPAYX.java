package api.cmb.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DCOPDPAYX")
public class DCOPDPAYX {

    private String YURREF;
    private String DBTACC;
    private String DBTBBK;
    private String TRSAMT;
    private String CCYNBR;

    private String STLCHN;
    private String NUSAGE;
    private String BNKFLG;
    private String CRTACC;
    private String CRTNAM;
    private String CRTBNK;

    public DCOPDPAYX() {
    }

    public DCOPDPAYX(String YURREF, String DBTACC, String DBTBBK, String TRSAMT, String CCYNBR, String STLCHN, String NUSAGE, String BNKFLG, String CRTACC, String CRTNAM, String CRTBNK) {
        this.YURREF = YURREF;
        this.DBTACC = DBTACC;
        this.DBTBBK = DBTBBK;
        this.TRSAMT = TRSAMT;
        this.CCYNBR = CCYNBR;
        this.STLCHN = STLCHN;
        this.NUSAGE = NUSAGE;
        this.BNKFLG = BNKFLG;
        this.CRTACC = CRTACC;
        this.CRTNAM = CRTNAM;
        this.CRTBNK = CRTBNK;
    }

    public static class Builder{
        private String YURREF;
        private String DBTACC;
        private String DBTBBK;
        private String TRSAMT;
        private String CCYNBR;

        private String STLCHN;
        private String NUSAGE;
        private String BNKFLG;
        private String CRTACC;
        private String CRTNAM;
        private String CRTBNK;

        public DCOPDPAYX build(){
            return new DCOPDPAYX(this.YURREF, this.DBTACC, this.DBTBBK, this.TRSAMT, this.CCYNBR, this.STLCHN, this.NUSAGE, this.BNKFLG, this.CRTACC, this.CRTNAM, CRTBNK);
        }
        public Builder setYURREF(String YURREF) {
            this.YURREF = YURREF;
            return this;
        }

        public Builder setDBTACC(String DBTACC) {
            this.DBTACC = DBTACC;
            return this;
        }

        public Builder setDBTBBK(String DBTBBK) {
            this.DBTBBK = DBTBBK;
            return this;
        }

        public Builder setTRSAMT(String TRSAMT) {
            this.TRSAMT = TRSAMT;
            return this;
        }

        public Builder setCCYNBR(String CCYNBR) {
            this.CCYNBR = CCYNBR;
            return this;
        }

        public Builder setSTLCHN(String STLCHN) {
            this.STLCHN = STLCHN;
            return this;
        }

        public Builder setNUSAGE(String NUSAGE) {
            this.NUSAGE = NUSAGE;
            return this;
        }

        public Builder setBNKFLG(String BNKFLG) {
            this.BNKFLG = BNKFLG;
            return this;
        }

        public Builder setCRTACC(String CRTACC) {
            this.CRTACC = CRTACC;
            return this;
        }

        public Builder setCRTNAM(String CRTNAM) {
            this.CRTNAM = CRTNAM;
            return this;
        }

        public Builder setCRTBNK(String CRTBNK) {
            this.CRTBNK = CRTBNK;
            return this;
        }
    }


    public String getYURREF() {
        return YURREF;
    }

    public void setYURREF(String YURREF) {
        this.YURREF = YURREF;
    }

    public String getDBTACC() {
        return DBTACC;
    }

    public void setDBTACC(String DBTACC) {
        this.DBTACC = DBTACC;
    }

    public String getDBTBBK() {
        return DBTBBK;
    }

    public void setDBTBBK(String DBTBBK) {
        this.DBTBBK = DBTBBK;
    }

    public String getTRSAMT() {
        return TRSAMT;
    }

    public void setTRSAMT(String TRSAMT) {
        this.TRSAMT = TRSAMT;
    }

    public String getCCYNBR() {
        return CCYNBR;
    }

    public void setCCYNBR(String CCYNBR) {
        this.CCYNBR = CCYNBR;
    }

    public String getSTLCHN() {
        return STLCHN;
    }

    public void setSTLCHN(String STLCHN) {
        this.STLCHN = STLCHN;
    }

    public String getNUSAGE() {
        return NUSAGE;
    }

    public void setNUSAGE(String NUSAGE) {
        this.NUSAGE = NUSAGE;
    }

    public String getBNKFLG() {
        return BNKFLG;
    }

    public void setBNKFLG(String BNKFLG) {
        this.BNKFLG = BNKFLG;
    }

    public String getCRTACC() {
        return CRTACC;
    }

    public void setCRTACC(String CRTACC) {
        this.CRTACC = CRTACC;
    }

    public String getCRTNAM() {
        return CRTNAM;
    }

    public void setCRTNAM(String CRTNAM) {
        this.CRTNAM = CRTNAM;
    }

    public String getCRTBNK() {
        return CRTBNK;
    }

    public void setCRTBNK(String CRTBNK) {
        this.CRTBNK = CRTBNK;
    }
}
