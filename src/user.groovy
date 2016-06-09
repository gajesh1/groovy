/**
 * Created by gajesh on 8/6/16.
 */
println "hello world! "

List a = [1, 2, 4, 4, 6]
List a1 = ["Ankit", "singh", 2, 3, 4, true]
if (a){
     println("the a is not empty ") /*space is used in place of ( in println*/
}

String b = ""

if (b) {
     println "b is not empty"
} else {
    println "b is empty"
}

Map data = [firstname: "gajesh", lastname: "panigrahi", info: "i m perfect"]
println data
println(data.firstname)
println(data.get("firstname"))
 println(data["lastname"])   // 3 way to get the map value