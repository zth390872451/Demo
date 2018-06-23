package com.baili.constant.cmb;

/**
 * A.6 业务处理结果
 */
public enum ProcessResult {

    S("银行支付成功"),
    F("银行支付失败"),
    B("银行支付被退票"),
    R("企业审批否决"),
    D("企业过期不审批"),
    C("企业撤销"),
    M("商务支付"),
    V("委托贷款被借款方拒绝");

    private String desc;

    private ProcessResult(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
