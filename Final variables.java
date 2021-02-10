package com.company;
public class MainClass extends Student{
    public static void main(String[] args) {
       final Student obj1 = new Student();
        Student obj2= new Student();

/*        Till u have not used final key word you can pass the reference of obj1 to obj 2 i.e referenece
           of obj1 will missed and both the reference of obj1 and ob2 will save in obj */

//        obj1 = obj2 ;
//        We cant change reference but we can change the obj.
        obj1.name="Anand";
    }
}
