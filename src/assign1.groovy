/**
 * Created by gajesh on 8/6/16.
 */
class USER {
    String fname,lname,email;
    int  age;
    //String toString ko bhi use kr skte hai because it isi ko call krta hai
}

USER u1 = new USER([fname: "gajesh ", lname : " pani" , email: " panigrahigajesh@gmail.com ", age : 9])
USER u2 = new USER([fname:"ayush", lname : " bijoura" , email: " panigrahigajesh@gmail.com ", age : 9])
USER u3 = new USER([fname: "atul", lname : " agg" , email: " panigrahigajesh@gmail.com ", age : 9])
USER u4 = new USER([fname: "Ansu", lname : " sing" , email: " panigrahigajesh@gmail.com ", age : 9])

List l =[u1,u2,u3,u4]
   l.each{
        println it.fname +it.lname + "(" +it.age + ")"

       }

