package com.example.task03;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SampleData implements Serializable {
    static final transient long serialVersionUID = 132706691457162967L;

    private final String name;
    private final int value;
    private final Date date;

    public SampleData(String name, int value, Date date) {
        this.name = name;
        this.value = value;
        this.date = date;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleData that = (SampleData) o;
        return value == that.value &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value, date);
    }
    @Override
    public String toString() {
        return "SampleData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}