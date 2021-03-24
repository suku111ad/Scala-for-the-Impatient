/*Scala for The impatient Book, exercise1*/
//1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?
3.equals(2)               //val res0: Boolean = false
3.toString               //val res1: String = 3
3.toChar                //val res2: Char = ?
3.toByte                //val res3: Byte = 3
//and many more

//2. In the Scala REPL, compute the square root of 3, and then square that value. By how much does
//the result differ from 3? (Hint: The res variables are your friend.)
scala.math.sqrt(3)          //val res4: Double = 1.7320508075688772
res4*res4                  //val res5: Double = 2.9999999999999996
res3-res5                 //val res6: Double = 4.440892098500626E-16

//println(3-pow(sqrt(3),2)

//3.Are the res variables val or var?
//the res variables are val as they cannot be changed/are immutable.

//4. Scala lets you multiply a string with a number—try out "crazy" * 3 in the REPL. What
//does this operation do? Where can you find it in Scaladoc?
"crazy"*3               //val res7: String = crazycrazycrazy
//repeats the string 3 number of times. This could be found in StringOps class.

//5. What does 10 max 2 mean? In which class is the max method defined?
10 max 2                  //val res8: Int = 10
//max displays the maximum among the two numbers. Max method is defined in RichInt class.

//6. Using BigInt, compute 2^1024.
BigInt(2) pow 1024            //val res9: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

//7. What do you need to import so that you can get a random prime as probablePrime(100,
//Random), without any qualifiers before probablePrime and Random?
import BigInt.probablePrime
import scala.util.Random
probablePrime(100, Random)                //val res10: scala.math.BigInt = 649797290695459223069102665571

//8.One way to create random file or directory names is to produce a random BigInt and convert
//it to base 36, yielding a string such as "qsnvbevtomcj38o06kul". Poke around Scaladoc
//to find a way of doing this in Scala.
probablePrime(100, Random).toString(36)           //val res11: String = 2fadg1wdxfcrsa84dbnh

//9.How do you get the first character of a string in Scala? The last character?
val name = "Sukanya"
//first character
name.head               //val res12: Char = S
name(0)                 //val res13: Char = S
//last character
name.last               //val res14: Char = a
name(name.length-1)     //val res15: Char = a

//10.What do the take, drop, takeRight, and dropRight string functions do? What
//advantage or disadvantage do they have over using substring?
name.take(4)            //val res16: String = Suka
//take(n) method retrieves n number of characters starting from the head of the string

name.drop(1)            //val res17: String = ukanya
//drop(n) method removes n number of characters starting from the head of the string

name.takeRight(2)       //val res18: String = ya
//takeRight(n) method retrieves n number of characters starting from the right/tail of the string

name.dropRight(1)       //val res19: String = Sukany
//dropRight(n) method removes n number of characters starting from the right/tail of the string
