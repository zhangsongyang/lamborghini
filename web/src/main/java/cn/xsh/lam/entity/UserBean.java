package cn.xsh.lam.entity;

import java.util.List;
import java.util.Map;


public class UserBean {

    private String name;

    private boolean sex;

    private String work;

    private int old;

    private Map<String, String> tech;

    private List<String> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public Map<String, String> getTech() {
        return tech;
    }

    public void setTech(Map<String, String> tech) {
        System.out.println("set UserBean......");
        this.tech = tech;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", work='" + work + '\'' +
                ", old=" + old +
                ", tech=" + tech +
                ", books=" + books +
                '}';
    }

    public UserBean() {
        System.out.println("UserBean constructor................");
    }

    public void init() {
        System.out.println("init.....................");
    }

    public void destroy() {
        System.out.println("destroy....................");
    }

}
