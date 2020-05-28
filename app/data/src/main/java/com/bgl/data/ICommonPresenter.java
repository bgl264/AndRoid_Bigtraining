package com.bgl.data;

import com.bgl.databean.DatasBean;

import java.util.List;

/**
 * Created by 包国梁 on 2020/5/28  17:38
 */
public class ICommonPresenter implements ICommonCallBackl{
    private ICommonView commonView;
    private final ICommonModel iCommonModel;

    public ICommonPresenter(ICommonView commonView) {
        this.commonView = commonView;
        iCommonModel = new ICommonModel();
    }

    @Override
    public void onSuccess(List<DatasBean> data) {
        commonView.setData(data);
    }

    @Override
    public void onFailed(String str) {
        commonView.ShowToast(str);
    }

    public void getData() {
        iCommonModel.getData(this);
    }
}
