package com.android.t2s.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.android.t2s.Converters;
import com.android.t2s.dao.AddonDao;
import com.android.t2s.dao.DataMDao;
import com.android.t2s.dao.ItemDao;
import com.android.t2s.dao.SubCatdao;
import com.android.t2s.model.Addon;
import com.android.t2s.model.DataM;
import com.android.t2s.model.Item;
import com.android.t2s.model.Subcat;


@Database(entities = {DataM.class,Subcat.class,Item.class, Addon.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class DataMDB extends RoomDatabase {
    private static DataMDB INSTANCE;
    public abstract DataMDao dataMDao();
    public abstract SubCatdao subcatDao();
    public abstract ItemDao itemDao();
    public abstract AddonDao addonDao();
    public static DataMDB getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), DataMDB.class, "menu-submenu")
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}

