package io.wisoft.homework.week3;

public class Employee {

    private String code;
    private String name;
    private String mgt;
    private String sal;
    private String rcode;

    public Employee(String code, String name, String mgt, String sal, String rcode) {
        this.code = code;
        this.name = name;
        this.mgt = mgt;
        this.sal = sal;
        this.rcode = rcode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMgt() {
        return mgt;
    }

    public void setMgt(String mgt) {
        this.mgt = mgt;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }
}
