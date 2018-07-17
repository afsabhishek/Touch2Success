package com.android.t2s.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.android.t2s.Converters;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity
public class Subcat
{
    private String second_language_description;

    private String monday;

    private String show_online;

    private String collection;

    private String menu_inputter_id;

    private String pos;


    @PrimaryKey
    private int id;

    private String modified_by;

    private String page;

    private String offer_all;

    private String addon;

    private String image_backup;

    private String description;

    private String name;

    private String user_id;

    private String saturday;

    private String tuesday;

    private String friday;

    private String background_color;

    private String host;

    private String added;

    private String thursday;

    private String image;

    private String modified;

    private String exclude_free;

    private String online_discount_allowed;

    private String second_language_name;

    private String category;

    private String modified_page;

    private String wednesday;

    private String pos_back;

    private String collection_discount_allowed;

    @TypeConverters(Converters.class)
    private Item[] item;

    private String sunday;

    private String font_color;

    private String delivery;

    private String coupon_allowed;

    public String getSecond_language_description ()
    {
        return second_language_description;
    }

    public void setSecond_language_description (String second_language_description)
    {
        this.second_language_description = second_language_description;
    }

    public String getMonday ()
    {
        return monday;
    }

    public void setMonday (String monday)
    {
        this.monday = monday;
    }

    public String getShow_online ()
    {
        return show_online;
    }

    public void setShow_online (String show_online)
    {
        this.show_online = show_online;
    }

    public String getCollection ()
    {
        return collection;
    }

    public void setCollection (String collection)
    {
        this.collection = collection;
    }

    public String getMenu_inputter_id ()
    {
        return menu_inputter_id;
    }

    public void setMenu_inputter_id (String menu_inputter_id)
    {
        this.menu_inputter_id = menu_inputter_id;
    }

    public String getPos ()
    {
        return pos;
    }

    public void setPos (String pos)
    {
        this.pos = pos;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getModified_by ()
    {
        return modified_by;
    }

    public void setModified_by (String modified_by)
    {
        this.modified_by = modified_by;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getOffer_all ()
    {
        return offer_all;
    }

    public void setOffer_all (String offer_all)
    {
        this.offer_all = offer_all;
    }

    public String getAddon ()
    {
        return addon;
    }

    public void setAddon (String addon)
    {
        this.addon = addon;
    }

    public String getImage_backup ()
    {
        return image_backup;
    }

    public void setImage_backup (String image_backup)
    {
        this.image_backup = image_backup;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getSaturday ()
    {
        return saturday;
    }

    public void setSaturday (String saturday)
    {
        this.saturday = saturday;
    }

    public String getTuesday ()
    {
        return tuesday;
    }

    public void setTuesday (String tuesday)
    {
        this.tuesday = tuesday;
    }

    public String getFriday ()
    {
        return friday;
    }

    public void setFriday (String friday)
    {
        this.friday = friday;
    }

    public String getBackground_color ()
    {
        return background_color;
    }

    public void setBackground_color (String background_color)
    {
        this.background_color = background_color;
    }

    public String getHost ()
    {
        return host;
    }

    public void setHost (String host)
    {
        this.host = host;
    }

    public String getAdded ()
    {
        return added;
    }

    public void setAdded (String added)
    {
        this.added = added;
    }

    public String getThursday ()
    {
        return thursday;
    }

    public void setThursday (String thursday)
    {
        this.thursday = thursday;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getModified ()
    {
        return modified;
    }

    public void setModified (String modified)
    {
        this.modified = modified;
    }

    public String getExclude_free ()
    {
        return exclude_free;
    }

    public void setExclude_free (String exclude_free)
    {
        this.exclude_free = exclude_free;
    }

    public String getOnline_discount_allowed ()
    {
        return online_discount_allowed;
    }

    public void setOnline_discount_allowed (String online_discount_allowed)
    {
        this.online_discount_allowed = online_discount_allowed;
    }

    public String getSecond_language_name ()
    {
        return second_language_name;
    }

    public void setSecond_language_name (String second_language_name)
    {
        this.second_language_name = second_language_name;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getModified_page ()
    {
        return modified_page;
    }

    public void setModified_page (String modified_page)
    {
        this.modified_page = modified_page;
    }

    public String getWednesday ()
    {
        return wednesday;
    }

    public void setWednesday (String wednesday)
    {
        this.wednesday = wednesday;
    }

    public String getPos_back ()
    {
        return pos_back;
    }

    public void setPos_back (String pos_back)
    {
        this.pos_back = pos_back;
    }

    public String getCollection_discount_allowed ()
    {
        return collection_discount_allowed;
    }

    public void setCollection_discount_allowed (String collection_discount_allowed)
    {
        this.collection_discount_allowed = collection_discount_allowed;
    }

    public Item[] getItem ()
    {
        return item;
    }

    public void setItem (Item[] item)
    {
        this.item = item;
    }

    public String getSunday ()
    {
        return sunday;
    }

    public void setSunday (String sunday)
    {
        this.sunday = sunday;
    }

    public String getFont_color ()
    {
        return font_color;
    }

    public void setFont_color (String font_color)
    {
        this.font_color = font_color;
    }

    public String getDelivery ()
    {
        return delivery;
    }

    public void setDelivery (String delivery)
    {
        this.delivery = delivery;
    }

    public String getCoupon_allowed ()
    {
        return coupon_allowed;
    }

    public void setCoupon_allowed (String coupon_allowed)
    {
        this.coupon_allowed = coupon_allowed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [second_language_description = "+second_language_description+", monday = "+monday+", show_online = "+show_online+", collection = "+collection+", menu_inputter_id = "+menu_inputter_id+", pos = "+pos+", id = "+id+", modified_by = "+modified_by+", page = "+page+", offer_all = "+offer_all+", addon = "+addon+", image_backup = "+image_backup+", description = "+description+", name = "+name+", user_id = "+user_id+", saturday = "+saturday+", tuesday = "+tuesday+", friday = "+friday+", background_color = "+background_color+", host = "+host+", added = "+added+", thursday = "+thursday+", image = "+image+", modified = "+modified+", exclude_free = "+exclude_free+", online_discount_allowed = "+online_discount_allowed+", second_language_name = "+second_language_name+", category = "+category+", modified_page = "+modified_page+", wednesday = "+wednesday+", pos_back = "+pos_back+", collection_discount_allowed = "+collection_discount_allowed+", item = "+item+", sunday = "+sunday+", font_color = "+font_color+", delivery = "+delivery+", coupon_allowed = "+coupon_allowed+"]";
    }
}