package asc.msc.coursework.com.expensetracker.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 */
public class Transaction implements Serializable {

    private String name;
    private String comment;
    private ArrayList<Integer> date;
    private BigDecimal value;
    public Transaction(String name, String comment, ArrayList<Integer> date, BigDecimal value) {
        setName(name);
        setComment(comment);
        setDate(date);
        setValue(value);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<Integer> getDate() {
        return date;
    }

    public void setDate(ArrayList<Integer> date) {
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}