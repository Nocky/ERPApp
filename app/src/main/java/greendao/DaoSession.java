package greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import tarce.testnew.greendaoBean.LoginResponseBean;
import tarce.testnew.greendaoBean.MenuListBean;
import tarce.testnew.greendaoBean.SaveInventory;

import greendao.LoginResponseBeanDao;
import greendao.MenuListBeanDao;
import greendao.SaveInventoryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig loginResponseBeanDaoConfig;
    private final DaoConfig menuListBeanDaoConfig;
    private final DaoConfig saveInventoryDaoConfig;

    private final LoginResponseBeanDao loginResponseBeanDao;
    private final MenuListBeanDao menuListBeanDao;
    private final SaveInventoryDao saveInventoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        loginResponseBeanDaoConfig = daoConfigMap.get(LoginResponseBeanDao.class).clone();
        loginResponseBeanDaoConfig.initIdentityScope(type);

        menuListBeanDaoConfig = daoConfigMap.get(MenuListBeanDao.class).clone();
        menuListBeanDaoConfig.initIdentityScope(type);

        saveInventoryDaoConfig = daoConfigMap.get(SaveInventoryDao.class).clone();
        saveInventoryDaoConfig.initIdentityScope(type);

        loginResponseBeanDao = new LoginResponseBeanDao(loginResponseBeanDaoConfig, this);
        menuListBeanDao = new MenuListBeanDao(menuListBeanDaoConfig, this);
        saveInventoryDao = new SaveInventoryDao(saveInventoryDaoConfig, this);

        registerDao(LoginResponseBean.class, loginResponseBeanDao);
        registerDao(MenuListBean.class, menuListBeanDao);
        registerDao(SaveInventory.class, saveInventoryDao);
    }
    
    public void clear() {
        loginResponseBeanDaoConfig.clearIdentityScope();
        menuListBeanDaoConfig.clearIdentityScope();
        saveInventoryDaoConfig.clearIdentityScope();
    }

    public LoginResponseBeanDao getLoginResponseBeanDao() {
        return loginResponseBeanDao;
    }

    public MenuListBeanDao getMenuListBeanDao() {
        return menuListBeanDao;
    }

    public SaveInventoryDao getSaveInventoryDao() {
        return saveInventoryDao;
    }

}
