package com.bgl.data;

import com.bgl.databean.DaoSession;
import com.bgl.databean.DatasBean;
import com.bgl.databean.DatasBeanDao;

/**
 * Created by 包国梁 on 2020/5/28  17:19
 */
public class GrenDaoUtils {
    static {
        session = BaseApp.getInstance().getDaoSession();
    }

    private static DaoSession session;

    //添加数据库
    public static void insert(DatasBean datasBean) {
    //    if (quearAll(datasBean) == null) {
            DatasBeanDao datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            datasBeanDao.insert(datasBean);
       // }
    }

    //删除数据库
    public static void delete(DatasBean datasBean) {
        if (quearAll(datasBean) != null) {
            DatasBeanDao datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            datasBeanDao.delete(datasBean);
        }
    }

    //查询
    public static DatasBean quearAll(DatasBean datasBean) {
        return session.queryBuilder(DatasBean.class).where(DatasBeanDao.Properties.Title.eq(datasBean.getTitle())).unique();
    }
}
