package com.in;

public class Notification {


    public String name;
    public int account_no;

    public Notification(String name, int account_no) {
        this.name = name;
        this.account_no = account_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public Notification() {
        super();
    }
}



