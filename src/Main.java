import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        var consumer = getConsumer();
        consumer.accept(1);
        var consumersLambda = getConsumersLambda();
        consumersLambda.accept(1);

        handleConsumer(consumer);
    }
    public static Consumer<Integer> getConsumer(){
        Consumer<Integer> returnValue = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("value in interface : " + integer);
            }
        };
        return returnValue;
    }

    public static Consumer<Integer> getConsumersLambda(){
        return integer -> System.out.println("value in lambda = " + integer);
    }

    public static void handleConsumer(Consumer<Integer> consumer){
        System.out.println("handleConsumer");
        consumer.accept(1);
    }
}

