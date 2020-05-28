package com.bgl.data;

import com.bgl.databean.DatasBean;

import java.util.List;

/**
 * Created by 包国梁 on 2020/5/28  17:31
 */
public interface ICommonView {
    void ShowToast(String str);

    void setData(List<DatasBean> data);
}
