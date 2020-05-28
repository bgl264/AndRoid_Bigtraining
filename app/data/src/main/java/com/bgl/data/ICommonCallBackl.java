package com.bgl.data;

import com.bgl.databean.DatasBean;

import java.util.List;

/**
 * Created by 包国梁 on 2020/5/28  17:38
 */
public interface ICommonCallBackl {

    void onSuccess(List<DatasBean> data);

    void onFailed(String str);
}
