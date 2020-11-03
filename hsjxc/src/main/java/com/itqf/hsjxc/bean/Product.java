package com.itqf.hsjxc.bean;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 17:01
 * description:
 */
public class Product {

    private int pId;
    private String pName;
    private String pDes;
    private String pNote;
    private String pPrice;
    private int tId;

    private Types types;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDes() {
        return pDes;
    }

    public void setpDes(String pDes) {
        this.pDes = pDes;
    }

    public String getpNote() {
        return pNote;
    }

    public void setpNote(String pNote) {
        this.pNote = pNote;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }
}
