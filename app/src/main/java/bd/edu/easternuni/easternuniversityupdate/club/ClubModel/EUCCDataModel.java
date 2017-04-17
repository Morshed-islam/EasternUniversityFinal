package com.eubd.easternuniversity.Clubs.ClubModel;

/**
 * Created by ThirdEye-lll on 12/10/2016.
 */

public class EUCCDataModel {

    String name;
    int id_;
    int image;

    public EUCCDataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.id_ = id_;
        this.image=image;
    }

    public String getName() {
        return name;
    }


    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
