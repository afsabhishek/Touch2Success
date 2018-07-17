package com.android.t2s.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.t2s.model.Item;
import com.android.t2s.model.Subcat;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao

public interface SubCatdao {

    @Insert(onConflict = REPLACE)
    void insertSubcat(Subcat subcat);

    @Query("SELECT * FROM Subcat")
    List<Subcat> getSubcat();

    

}