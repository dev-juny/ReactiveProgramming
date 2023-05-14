/* 동기 */
public class A {
    public static void main(String[] args) {
        System.out.println("Start main");
        var result = getResult();
        var nextValue = result + 1;
        assert nextValue == 1;
        System.out.println("Finish main");
    }

    private static int getResult() {
        System.out.println("Start getResult");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        var result = 0;
        try {
            return result;
        } finally {
            System.out.println("Finish getResult");
        }
    }


}
