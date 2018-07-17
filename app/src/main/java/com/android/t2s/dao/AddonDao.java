package com.android.t2s.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;

import com.android.t2s.model.Addon;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface AddonDao {

    @Insert(onConflict = REPLACE)

    void insert(Addon addon);

    @Query("SELECT * FROM Addon")
    List<Addon> getAddon();
}
