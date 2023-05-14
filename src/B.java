/* 비동기 */
import java.util.function.Consumer;

public class B {
    public static void main(String[] args) {
        System.out.println("Start main");
        getResult(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                var nextValue = integer + 1;
                assert nextValue ==1;
            }
        });
        System.out.println("Finish main");
    }

    private static void getResult(Consumer<Integer> cb) {
        System.out.println("Start getResult");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        var result = 0;
        cb.accept(result);
        System.out.println("Finish getResult");
    }
}
