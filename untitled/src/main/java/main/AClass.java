package main;

public class AClass {
    public String yaz(){
        return "java";
    }
}
class C extends AClass{
    @Override
    public String yaz(){
        return "JavaFx";
    }
}
