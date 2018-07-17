package com.android.t2s;

import android.arch.persistence.room.TypeConverter;

import com.android.t2s.model.Item;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Converters {

    @TypeConverter
    public String fromItemList(Item[] items) {
        if (items == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Item[]>() {
        }.getType();
        String json = gson.toJson(items, type);
        return json;
    }

    @TypeConverter
    public Item[] toItemList(String itemString) {
        if (itemString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Item[]>() {
        }.getType();
        Item[] items = gson.fromJson(itemString, type);
        return items;
    }

}
