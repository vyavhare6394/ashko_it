package com.ashokit;

public class CustomDate {

	
	
	private  int month;
    private int day;
    private int year;

    public CustomDate() {
    }

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public CustomDate(String month, int day, int year) {
        this.month = Integer.parseInt(month);
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setMonth(String month) {
        this.month = Integer.parseInt(month);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public boolean isLeapYear()
    {
        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0)
                      return true;
                else
                    return false;
            }
            else
                return true;
        }

        else
           return false;
    }
    public void advanceOneDay()
    {
       day=getDay()+1;
    }
    public void advanceOneWeek()
    {
      day=getDay()+7;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomDate)) return false;
        CustomDate that = (CustomDate) o;
        return month == that.month &&
                day == that.day &&
                year == that.year;
    }
    public int compareTo (CustomDate obj)
    {
        if(obj.getDay()>getDay())
            return 1;
        else if(obj.getDay()==getDay())
            return 0;
        else return -1;
    }
	
	
}
