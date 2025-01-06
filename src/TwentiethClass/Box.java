package TwentiethClass;

public class Box <T>{
    //T stands for "Type"
    private T t;
    public void set(){this.t = t; }
    public T get() {return t; }

    public static void main(String[] args) {
        System.out.println("Hello world");
        Box<Integer> integerBox = new Box<>();

        Box<Integer> stringBox = new Box<>();
    }
    }

