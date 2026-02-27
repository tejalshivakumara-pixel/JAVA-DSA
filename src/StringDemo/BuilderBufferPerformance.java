package StringDemo;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("placement");
        for (int i = 0; i < 1000000; i++) {
            sbl.append("Training");
        }
        System.out.println("Time taken by string builder :" + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Placements");
        for (int i = 0; i < 1000000; i++) {
            sbf.append("training");
        }
        System.out.println("Time taken by Buffer:" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
