package com.qianfeng.mapper;

import com.qianfeng.dto.WxbGood;

import java.util.List;

public interface WxbGoodMapper {

    List<WxbGood> queryGoodAndGoodSku();
    void goodSave(WxbGood wxbGood);
}
