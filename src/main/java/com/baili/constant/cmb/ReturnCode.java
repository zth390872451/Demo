package com.baili.constant.cmb;

/**
 * A.2 返回代码
 */
public enum ReturnCode {

    SUCCESS(0, "成功"),
    SUBMIT_FAILED(-1, "提交主机失败"),
    EXECUTE_FAILED(-2, "执行失败"),
    DATA_FORMAT_ERROR(-3, "数据格式错误"),
    NOT_LOGIN(-4, "尚未登录"),
    TOO_FREQUENT(-5, "请求太频繁"),
    NOT_CERTIFICATE_CARD_USER(-6, "不是证书卡用户"),
    USER_CANCEL_OPERATION(-7,"用户取消操作"),
    other_error(-9,"其他错误");

    // 返回代码
    private int RETCOD;
    // 错误信息
    private String ERRMSG;

    private ReturnCode(int retcod, String errmsg){
        this.RETCOD = retcod;
        this.ERRMSG=errmsg;
    }

    public int getRETCOD() {
        return RETCOD;
    }

    public void setRETCOD(int RETCOD) {
        this.RETCOD = RETCOD;
    }

    public String getERRMSG() {
        return ERRMSG;
    }

    public void setERRMSG(String ERRMSG) {
        this.ERRMSG = ERRMSG;
    }

    @Override
    public String toString() {
        return "ReturnCode{" +
                "RETCOD=" + RETCOD +
                ", ERRMSG='" + ERRMSG + '\'' +
                '}';
    }
}
