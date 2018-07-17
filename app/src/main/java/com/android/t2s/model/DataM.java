package com.android.t2s.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.android.t2s.DataConverters;

@Entity
public class DataM
{
   @TypeConverters(DataConverters.class)
    private  Subcat[] subcat;

    public Subcat[] getSubcat() {
        return subcat;
    }
    public void setSubcat(Subcat[] subcat) {
        this.subcat = subcat;
    }
    private String hidden_fix;

    private String second_language_description;

    private String monday;

    private String collection;

    private String pos;

    @PrimaryKey
    private int id;

    private String name;

    private String saturday;

    private String tuesday;

    private String friday;

    private String is_print_label;

    private String background_color;

    private String host;

    private String added;

    private String thursday;

    private String mip_id;

    private String section;

    private String printer;

    private String online_discount_allowed;

    private String exclude_free;

    private String second_language_name;

    private String updated_at;

    private String wednesday;

    private String pos_back;

    private String collection_discount_allowed;

    private String hidden;

    private String sunday;

    private String shrink;

    private String font_color;

    private String delivery;

    private String coupon_allowed;



    public String getHidden_fix ()
    {
        return hidden_fix;
    }

    public void setHidden_fix (String hidden_fix)
    {
        this.hidden_fix = hidden_fix;
    }

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

    public String getCollection ()
    {
        return collection;
    }

    public void setCollection (String collection)
    {
        this.collection = collection;
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

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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

    public String getIs_print_label ()
    {
        return is_print_label;
    }

    public void setIs_print_label (String is_print_label)
    {
        this.is_print_label = is_print_label;
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

    public String getMip_id ()
    {
        return mip_id;
    }

    public void setMip_id (String mip_id)
    {
        this.mip_id = mip_id;
    }

    public String getSection ()
    {
        return section;
    }

    public void setSection (String section)
    {
        this.section = section;
    }

    public String getPrinter ()
    {
        return printer;
    }

    public void setPrinter (String printer)
    {
        this.printer = printer;
    }

    public String getOnline_discount_allowed ()
    {
        return online_discount_allowed;
    }

    public void setOnline_discount_allowed (String online_discount_allowed)
    {
        this.online_discount_allowed = online_discount_allowed;
    }

    public String getExclude_free ()
    {
        return exclude_free;
    }

    public void setExclude_free (String exclude_free)
    {
        this.exclude_free = exclude_free;
    }

    public String getSecond_language_name ()
    {
        return second_language_name;
    }

    public void setSecond_language_name (String second_language_name)
    {
        this.second_language_name = second_language_name;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
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

    public String getHidden ()
    {
        return hidden;
    }

    public void setHidden (String hidden)
    {
        this.hidden = hidden;
    }

    public String getSunday ()
    {
        return sunday;
    }

    public void setSunday (String sunday)
    {
        this.sunday = sunday;
    }

    public String getShrink ()
    {
        return shrink;
    }

    public void setShrink (String shrink)
    {
        this.shrink = shrink;
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
        return "ClassPojo [subcat = "+subcat+", hidden_fix = "+hidden_fix+", second_language_description = "+second_language_description+", monday = "+monday+", collection = "+collection+", pos = "+pos+", id = "+id+", name = "+name+", saturday = "+saturday+", tuesday = "+tuesday+", friday = "+friday+", is_print_label = "+is_print_label+", background_color = "+background_color+", host = "+host+", added = "+added+", thursday = "+thursday+", mip_id = "+mip_id+", section = "+section+", printer = "+printer+", online_discount_allowed = "+online_discount_allowed+", exclude_free = "+exclude_free+", second_language_name = "+second_language_name+", updated_at = "+updated_at+", wednesday = "+wednesday+", pos_back = "+pos_back+", collection_discount_allowed = "+collection_discount_allowed+", hidden = "+hidden+", sunday = "+sunday+", shrink = "+shrink+", font_color = "+font_color+", delivery = "+delivery+", coupon_allowed = "+coupon_allowed+"]";
    }
}