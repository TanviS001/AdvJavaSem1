interface Animal{
void speak();
}

interface Bird{
void fly();
}

class Bat implements Animal, Bird{
@Override 
public void speak(){
System.out.println("Can make sound");
}

@Override
public void fly(){
System.out.println("Can fly");
}
}


class MultipleInheritance{
public static void main(String args[]){

Bat bat = new Bat();
bat.speak();
bat.fly();
}
}