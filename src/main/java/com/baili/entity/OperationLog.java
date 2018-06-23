package com.baili.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.io.Serializable;

@TableName("operation_log")
public class OperationLog extends Model<OperationLog> {

    private Long id;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public static void main(String[] args) {
        OperationLog operationLog = new OperationLog();
    }
}
