package com.android.t2s.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.t2s.model.DataM;
import com.android.t2s.model.Item;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface DataMDao {

    @Insert(onConflict = REPLACE)

    void insert(DataM dataM);

    @Query("SELECT * FROM DataM")
    List<DataM> getDataM();

    

}