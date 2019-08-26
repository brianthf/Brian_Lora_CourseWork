package com.company.BrianLoraU1M5Summative.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


public class Book {

    private int bookId;
    private String isBn;
    private LocalDate date;
    private int authorId;
    private String title;
    private int publisherId;
    private BigDecimal price;

    // SETTERS
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // GETTERS
    public int getBookId() {
        return bookId;
    }

    public String getIsBn() {
        return isBn;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBookId() == book.getBookId() &&
                getAuthorId() == book.getAuthorId() &&
                getPublisherId() == book.getPublisherId() &&
                Objects.equals(getIsBn(), book.getIsBn()) &&
                Objects.equals(getDate(), book.getDate()) &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getPrice(), book.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getIsBn(), getDate(), getAuthorId(), getTitle(), getPublisherId(), getPrice());
    }
}
