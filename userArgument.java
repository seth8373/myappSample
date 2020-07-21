/*
 Example of Command line argument in Java
 This programs takes two user input arguments from the commandline 

To execute this program from the command line, do the following

1. javac userArgument.java ------------------This compiles the java into a machine readable bytecode (i.e. userArgument.class)
2. java userArgument firstargument secondargument (e.g. java userArgument John Doe)------------(this executes the code)

The above code prints out:
 Hi John Doe. How are you?


*/

public class userArgument{

   public static void main(String args[]){
   
   System.out.print("Hi,");
   System.out.print(args[0]);            // first argument note in java indexing starts from 0
   System.out.print(" ");
   System.out.print(args[1]);            // second argument
   System.out.println(". How are you?");

}


}




