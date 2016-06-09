//constructer  k liye map start krna
class Person
        {

            String fname,lname,score
            def a,b,c
        }

Map m = [fname : "gajesh", lname : "panigrahi" , score : 3, a : 3 , b : 9, c : 3.44]

Person u = new Person(m)//constructer call
println u.fname
println u.lname
println u.score
println u.a
println u.b
println u.c


