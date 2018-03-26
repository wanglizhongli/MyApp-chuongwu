package com.example.pc.myapp_chuongwu.shujuku;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig shuDaoConfig;

    private final ShuDao shuDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        shuDaoConfig = daoConfigMap.get(ShuDao.class).clone();
        shuDaoConfig.initIdentityScope(type);

        shuDao = new ShuDao(shuDaoConfig, this);

        registerDao(Shu.class, shuDao);
    }
    
    public void clear() {
        shuDaoConfig.clearIdentityScope();
    }

    public ShuDao getShuDao() {
        return shuDao;
    }

}
