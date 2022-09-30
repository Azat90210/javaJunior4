package lesson17;

public class TestParam <T>{
    private T t;

    public TestParam() {
    }

    public TestParam(T t) {
        this.t = t;
    }

    public T returnParam(){
        return t;
    }
}
