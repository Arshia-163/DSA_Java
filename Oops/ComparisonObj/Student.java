package pack.ComparisonObj;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

public Student(int rollno,float marks){
    this.rollno = rollno;
    this.marks = marks;
}

@Override
public String toString(){
    return marks +"";
}
@Override
public int compareTo(Student o){
    int diff = (int)(this.marks-o.marks);
    //if diff==0 they both are equal
    //if diff <1; means o is bigger;
    return diff;}
    public static void main(String[] args) {
        Student Arshia = new Student(45,82.45f);
        Student kunal  = new Student(22,89.2f );
        Student Aarav  = new Student(68,85.5f );
        Student prince  = new Student(4,99.2f );
        Student pari  = new Student(32,67.2f );
Student[] list = {Arshia,kunal,Aarav,pari,prince};
System.out.println(Arrays.toString(list));

 Arrays.sort(list,new Comparator<Student>() 
    { // this will sort in asc. order acc to marks not rollno
    @Override
public final int compare(Student o1,Student o2){
    return (int)(o1.marks-o2.marks);
}
});
System.out.println(Arrays.toString(list));



        // if(Arshia.compareTo(kunal) < 0){
        //     System.out.println(Arshia.compareTo(kunal));
        //     System.out.println("Kunal has greater marks");
        // }
    }
}
