package com.xuexiang.xtcp.core.model;

import com.xuexiang.xtcp._XTCP;
import com.xuexiang.xtcp.enums.StorageMode;
import com.xuexiang.xtcp.model.IProtocolItem;

/**
 * 默认提供的基础协议项，自定义协议可直接继承XProtocolItem
 *
 * @author xuexiang
 * @since 2018/12/12 下午1:39
 */
public class XProtocolItem implements IProtocolItem {

    @Override
    public int getProtocolLength() {
        return _XTCP.getIProtocolParser().getProtocolLength(this);
    }

    @Override
    public byte[] proto2byte(StorageMode storageMode) {
        return _XTCP.getIProtocolParser().protoBody2Byte(this, storageMode);
    }

    @Override
    public boolean byte2proto(byte[] bytes, int index, int tailLength, StorageMode storageMode) {
        return _XTCP.getIProtocolParser().byte2ProtoBody(this, bytes, index, tailLength, storageMode);
    }
}
