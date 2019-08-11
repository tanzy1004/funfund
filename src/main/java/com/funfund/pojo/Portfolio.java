package com.funfund.pojo;

import java.util.Date;

public class Portfolio {
    private String portfolioName;

    private Date date;

    private String manager;

    public Portfolio(String portfolioName, Date date, String manager) {
        this.portfolioName = portfolioName;
        this.date = date;
        this.manager = manager;
    }

    public Portfolio() {
        super();
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName == null ? null : portfolioName.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }
}