package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import tarce.testnew.greendao.greendaoBeans.UserLogin;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_LOGIN".
*/
public class UserLoginDao extends AbstractDao<UserLogin, Void> {

    public static final String TABLENAME = "USER_LOGIN";

    /**
     * Properties of entity UserLogin.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UserName = new Property(0, String.class, "userName", false, "USER_NAME");
        public final static Property Password = new Property(1, String.class, "password", false, "PASSWORD");
    }


    public UserLoginDao(DaoConfig config) {
        super(config);
    }
    
    public UserLoginDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_LOGIN\" (" + //
                "\"USER_NAME\" TEXT," + // 0: userName
                "\"PASSWORD\" TEXT);"); // 1: password
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_USER_LOGIN_USER_NAME ON USER_LOGIN" +
                " (\"USER_NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_LOGIN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserLogin entity) {
        stmt.clearBindings();
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(1, userName);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(2, password);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserLogin entity) {
        stmt.clearBindings();
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(1, userName);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(2, password);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public UserLogin readEntity(Cursor cursor, int offset) {
        UserLogin entity = new UserLogin( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // userName
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // password
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserLogin entity, int offset) {
        entity.setUserName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPassword(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(UserLogin entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(UserLogin entity) {
        return null;
    }

    @Override
    public boolean hasKey(UserLogin entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
