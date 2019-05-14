package demo;

public class Consumer {
    private int num;

    public void consume(MyMessage message) {
        System.out.println(num+"号消费"+message);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}