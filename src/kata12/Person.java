package kata12;

import java.util.Date;

public class Person {
    public String name;
    public Date birthday;
    private int MS_PER_SECOND = 60;
    private int SECONDS_PER_MINUTE = 60;
    private int MINUTES_PER_HOUR = 60;
    private int HOURS_PER_DAY = 24;
    private double DAYS_PER_YEAR = 365.25;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return (int) toYears(new Date().getTime() - birthday.getTime());
    }

    private double toYears(long ms) {
        return (ms/MS_PER_YEAR());
    }

    private double MS_PER_YEAR() {
        return MS_PER_SECOND*SECONDS_PER_MINUTE*MINUTES_PER_HOUR*HOURS_PER_DAY*DAYS_PER_YEAR;
    }
    
    
}
