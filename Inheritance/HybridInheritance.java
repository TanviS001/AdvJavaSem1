class Programmer{
void code(){
System.out.println("Coding...");
}
}

class PythonProgrammer extends Programmer{
void codePython(){
System.out.println("Coding Python...");
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

public class HybridInheritance{
public static void main(String args[]){
HibernateProgrammer h = new HibernateProgrammer();
JavaProgrammer j = new JavaProgrammer();
PythonProgrammer p = new PythonProgrammer();

h.code();
j.code();
p.code();
}
}