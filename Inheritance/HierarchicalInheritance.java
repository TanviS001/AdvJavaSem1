class Programmer{
void code(){
System.out.println("Coding...");
}
}

class JavaProgrammer extends Programmer{
void codeJava(){
System.out.println("Coding Java...");
}
}

class HibernateProgrammer extends Programmer{
void codeHibernate(){
System.out.println("Coding Hibernate...");
}
}

public class HierarchicalInheritance{
public static void main(String args[]){
HibernateProgrammer h = new HibernateProgrammer();
JavaProgrammer j = new JavaProgrammer();
h.code();
j.code();
}
}