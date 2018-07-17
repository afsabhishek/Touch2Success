package com.android.t2s;

import android.arch.persistence.room.TypeConverter;

import com.android.t2s.model.Subcat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class DataConverters {
    @TypeConverter
    public String fromSubcatList(Subcat[] subcats) {
        if (subcats == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Subcat[]>() {
        }.getType();
        String json = gson.toJson(subcats, type);
        return json;
    }

    @TypeConverter
    public Subcat[] toSubcatList(String subcatString) {
        if (subcatString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Subcat[]>() {
        }.getType();
        Subcat[] subcats = gson.fromJson(subcatString, type);
        return subcats;
    }
}
