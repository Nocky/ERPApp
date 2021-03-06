package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import tarce.testnew.greendao.greendaoBeans.SaveInventory;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SAVE_INVENTORY".
*/
public class SaveInventoryDao extends AbstractDao<SaveInventory, Long> {

    public static final String TABLENAME = "SAVE_INVENTORY";

    /**
     * Properties of entity SaveInventory.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PrimaryId = new Property(0, Long.class, "primaryId", true, "_id");
        public final static Property Theoretical_qty = new Property(1, int.class, "theoretical_qty", false, "THEORETICAL_QTY");
        public final static Property Product_qty = new Property(2, int.class, "product_qty", false, "PRODUCT_QTY");
        public final static Property Image_medium = new Property(3, String.class, "image_medium", false, "IMAGE_MEDIUM");
        public final static Property Id = new Property(4, int.class, "id", false, "ID");
        public final static Property Product_name = new Property(5, String.class, "product_name", false, "PRODUCT_NAME");
        public final static Property AreaName = new Property(6, String.class, "areaName", false, "AREA_NAME");
        public final static Property AreaInt = new Property(7, int.class, "areaInt", false, "AREA_INT");
    }


    public SaveInventoryDao(DaoConfig config) {
        super(config);
    }
    
    public SaveInventoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SAVE_INVENTORY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: primaryId
                "\"THEORETICAL_QTY\" INTEGER NOT NULL ," + // 1: theoretical_qty
                "\"PRODUCT_QTY\" INTEGER NOT NULL ," + // 2: product_qty
                "\"IMAGE_MEDIUM\" TEXT," + // 3: image_medium
                "\"ID\" INTEGER NOT NULL ," + // 4: id
                "\"PRODUCT_NAME\" TEXT," + // 5: product_name
                "\"AREA_NAME\" TEXT," + // 6: areaName
                "\"AREA_INT\" INTEGER NOT NULL );"); // 7: areaInt
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_SAVE_INVENTORY_PRODUCT_NAME ON SAVE_INVENTORY" +
                " (\"PRODUCT_NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SAVE_INVENTORY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SaveInventory entity) {
        stmt.clearBindings();
 
        Long primaryId = entity.getPrimaryId();
        if (primaryId != null) {
            stmt.bindLong(1, primaryId);
        }
        stmt.bindLong(2, entity.getTheoretical_qty());
        stmt.bindLong(3, entity.getProduct_qty());
 
        String image_medium = entity.getImage_medium();
        if (image_medium != null) {
            stmt.bindString(4, image_medium);
        }
        stmt.bindLong(5, entity.getId());
 
        String product_name = entity.getProduct_name();
        if (product_name != null) {
            stmt.bindString(6, product_name);
        }
 
        String areaName = entity.getAreaName();
        if (areaName != null) {
            stmt.bindString(7, areaName);
        }
        stmt.bindLong(8, entity.getAreaInt());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SaveInventory entity) {
        stmt.clearBindings();
 
        Long primaryId = entity.getPrimaryId();
        if (primaryId != null) {
            stmt.bindLong(1, primaryId);
        }
        stmt.bindLong(2, entity.getTheoretical_qty());
        stmt.bindLong(3, entity.getProduct_qty());
 
        String image_medium = entity.getImage_medium();
        if (image_medium != null) {
            stmt.bindString(4, image_medium);
        }
        stmt.bindLong(5, entity.getId());
 
        String product_name = entity.getProduct_name();
        if (product_name != null) {
            stmt.bindString(6, product_name);
        }
 
        String areaName = entity.getAreaName();
        if (areaName != null) {
            stmt.bindString(7, areaName);
        }
        stmt.bindLong(8, entity.getAreaInt());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SaveInventory readEntity(Cursor cursor, int offset) {
        SaveInventory entity = new SaveInventory( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // primaryId
            cursor.getInt(offset + 1), // theoretical_qty
            cursor.getInt(offset + 2), // product_qty
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image_medium
            cursor.getInt(offset + 4), // id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // product_name
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // areaName
            cursor.getInt(offset + 7) // areaInt
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SaveInventory entity, int offset) {
        entity.setPrimaryId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTheoretical_qty(cursor.getInt(offset + 1));
        entity.setProduct_qty(cursor.getInt(offset + 2));
        entity.setImage_medium(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setId(cursor.getInt(offset + 4));
        entity.setProduct_name(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAreaName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAreaInt(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SaveInventory entity, long rowId) {
        entity.setPrimaryId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SaveInventory entity) {
        if(entity != null) {
            return entity.getPrimaryId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SaveInventory entity) {
        return entity.getPrimaryId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
