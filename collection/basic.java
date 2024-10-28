package pack.collection;

public class basic {
    enum week{
        Mon,Tues,Wed,Thurs,Fri,Sat,Sun;  
        //these are enum constants
        //pubkic,static and final
        //since its final you can create child enums
        //type is week

    week(){
        System.out.println("Constructor is called "+this);
    }
    // this is not public or protected or default
    // enum is used when need fixed no og obj.

    //internally : public static final week Mon =new week;
    }
    public static void main(String[] args) {
        week days;
        days = week.Mon;
        // for(week day :week.values()){
        //     System.out.println(day);
        // }
       
       
        //System.out.println(days);// then only mon will be displayed
    }
}
