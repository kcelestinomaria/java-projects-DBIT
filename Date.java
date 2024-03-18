public class Date {
    
    private int year;
    private String month;
    private int day;

    public static void main(String[] args){
        System.out.println("Welcome to the Date Class!");
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public String getFullDate(){
        return day + "/" + month + "/" + year;
    }
    
}
