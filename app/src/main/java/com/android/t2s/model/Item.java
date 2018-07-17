package com.android.t2s.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity
public class Item
{
    private String subcat;

    private String second_language_description;

    private String monday;

    private String vat;

    private String show_online;

    private String collection;

    private String pos;

    @PrimaryKey
    private int id;

    private String item_code;

    private String modified_by;

    private String page;

    private String is_vat_included;

    private String image_backup;

    private String description;

    private String name;

    private String user_id;

    private String saturday;

    private String btn_name;

    private String tuesday;

    private String friday;

    private String is_print_label;

    private String background_color;

    private String information;

    private String host;

    private String added;

    private String thursday;

    private String item_addon_cat;

    private String image;

    private String mip_id;

    private String offer;

    private String section;

    private String printer;

    private String modified;

    private String exclude_free;

    private String online_discount_allowed;

    private String second_language_name;

    private String modified_page;

    private String price;

    private String wednesday;

    private String collection_discount_allowed;

    private String sunday;

    private String font_color;

    private String delivery;

    private String coupon_allowed;

    private String addon_type;

    public String getSubcat ()
    {
        return subcat;
    }

    public void setSubcat (String subcat)
    {
        this.subcat = subcat;
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

    public String getVat ()
    {
        return vat;
    }

    public void setVat (String vat)
    {
        this.vat = vat;
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

    public String getItem_code ()
    {
        return item_code;
    }

    public void setItem_code (String item_code)
    {
        this.item_code = item_code;
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

    public String getIs_vat_included ()
    {
        return is_vat_included;
    }

    public void setIs_vat_included (String is_vat_included)
    {
        this.is_vat_included = is_vat_included;
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

    public String getBtn_name ()
    {
        return btn_name;
    }

    public void setBtn_name (String btn_name)
    {
        this.btn_name = btn_name;
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

    public String getInformation ()
    {
        return information;
    }

    public void setInformation (String information)
    {
        this.information = information;
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

    public String getItem_addon_cat ()
    {
        return item_addon_cat;
    }

    public void setItem_addon_cat (String item_addon_cat)
    {
        this.item_addon_cat = item_addon_cat;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getMip_id ()
    {
        return mip_id;
    }

    public void setMip_id (String mip_id)
    {
        this.mip_id = mip_id;
    }

    public String getOffer ()
    {
        return offer;
    }

    public void setOffer (String offer)
    {
        this.offer = offer;
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

    public String getModified_page ()
    {
        return modified_page;
    }

    public void setModified_page (String modified_page)
    {
        this.modified_page = modified_page;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getWednesday ()
    {
        return wednesday;
    }

    public void setWednesday (String wednesday)
    {
        this.wednesday = wednesday;
    }

    public String getCollection_discount_allowed ()
    {
        return collection_discount_allowed;
    }

    public void setCollection_discount_allowed (String collection_discount_allowed)
    {
        this.collection_discount_allowed = collection_discount_allowed;
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

    public String getAddon_type ()
    {
        return addon_type;
    }

    public void setAddon_type (String addon_type)
    {
        this.addon_type = addon_type;
    }
}