package com.github.fastsql.dao;

import com.github.fastsql.util.TableName;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Jiazhi
 * @since 2017/4/2
 */
@TableName(value = "student")
public class Student {
    private String id;

    private String name;

    private Integer age;

    private LocalDate birthday;

    private String homeAddress;

    private String cityId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}