package com.baili.constant.cmb;

/**
 * A.5 业务请求状态
 */
public enum  RequestStatus {

    AUT("等待审批"),
    NTE("终审完毕"),
    WCF("订单待确认[商务支付用]"),
    BNK("银行处理中"),
    FIN("完成"),
    ACK("等待确认(委托贷款用)"),
    APD("待银行确认[国际业务用)"),
    OPR("数据接收中[代发]");

    private String desc;

    private RequestStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
