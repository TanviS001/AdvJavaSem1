class Programmer{
void code(){
System.out.println("Coding...");
}
}

class JavaProgrammer extends Programmer{
void codeInJava(){
System.out.println("Coding in Java...");
}
}

public class SingleInheritance{
public static void main(String args[]){
JavaProgrammer j = new JavaProgrammer();
j.code();
}
}