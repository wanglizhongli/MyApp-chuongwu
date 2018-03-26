package com.example.pc.myapp_chuongwu.shujuku;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by pc on 2018/3/23.
 */
@Entity
public class Shu {
    @Id(autoincrement = true)
 private  long  ID;
 private   String   name;
    private   String size;
    @Generated(hash = 372442565)
    public Shu(long ID, String name, String size) {
        this.ID = ID;
        this.name = name;
        this.size = size;
    }
    @Generated(hash = 770183894)
    public Shu() {
    }
    public long getID() {
        return this.ID;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return this.size;
    }
    public void setSize(String size) {
        this.size = size;
    }

}
