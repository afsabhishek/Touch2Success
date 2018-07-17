package com.android.t2s.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Addon {

    private String created_date;

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getNext_move() {
        return next_move;
    }

    public void setNext_move(String next_move) {
        this.next_move = next_move;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getItem_addon_cat() {
        return item_addon_cat;
    }

    public void setItem_addon_cat(String item_addon_cat) {
        this.item_addon_cat = item_addon_cat;
    }

    public String getShow_online() {
        return show_online;
    }

    public void setShow_online(String show_online) {
        this.show_online = show_online;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShow_on_receipt() {
        return show_on_receipt;
    }

    public void setShow_on_receipt(String show_on_receipt) {
        this.show_on_receipt = show_on_receipt;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecond_language_name() {
        return second_language_name;
    }

    public void setSecond_language_name(String second_language_name) {
        this.second_language_name = second_language_name;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFont_color() {
        return font_color;
    }

    public void setFont_color(String font_color) {
        this.font_color = font_color;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBackground_color() {
        return background_color;
    }

    public void setBackground_color(String background_color) {
        this.background_color = background_color;
    }

    private String next_move;

    private String host;

    private String sys;

    private String item_addon_cat;

    private String show_online;

    private String offer;

    private String type;

    private String show_on_receipt;

    private String pos;

    @PrimaryKey @NonNull
    private String id;

    private String second_language_name;

    private String updated_at;

    private String price;

    private String name;

    private String font_color;

    private String user;

    private String background_color;
}
