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

class HibernateProgrammer extends JavaProgrammer{
void codeHibernate(){
System.out.println("Coding Hibernate...");
}
}

public class MultiLevelInheritance{
public static void main(String args[]){
HibernateProgrammer h = new HibernateProgrammer();
h.code();
}
}