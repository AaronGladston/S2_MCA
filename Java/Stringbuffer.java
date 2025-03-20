/*Java implements string from the predefined String class.
It is invocked by java.lang.String.
Generally, string is a sequence of characters but in java string is an object that represents a sequence of
The java.lang.String class is used to create a string object.
1) By string literal - ""
2) By new keyword - String S = new String();
Each time you create a string literal, the JVM checks the string constant pool.
If the already exists in the pool, a reference to the pool instance is returned.
If the string does not exist in the pool, a new string instance is created and placed in the pool.
Using new keyword,JVM will create a new string object in the normal keep memory and the litreal a b c is placed in the string constant pool.
The variable S will refer to the object in a heap.
CharSequence interface - It is an interface available in java.lang package.It enables flexible and implentation text processing across the java platform and the different classes are string handling classes which is available in the java.lang class.
1. Stringclass - encapsulates the series of characters once instantiated a string objects content is fixed and cannot be modified(Immutable).This immutability ensures that the string objects are safe.
2. StringBuffer - It represents a mutable sequence of characters.It includes a various string manipulations like insertion,deletion,append.
   syntax:- StringBuffer obj = new StringBuffer();
3. Stringbuilder - 
*/
//     public static void main(String[] args){
//         String S = "Hello";
//         String str = new String("kiki");
//         System.out.println("The length of the string is: "+S.length());
//     }
// }
class Stringbuffer{
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer("abc");
        System.out.println("Aaron"+obj);
    }
} 