public class Test {
    public static void main(String[] args) {
        System.out.println("123");
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("freeMemory= "+freeMemory);
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("processors= "+processors);
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("totalMemory= "+totalMemory);
    }
}
