public class LSMCompactionAnalysis {

    public static void main(String[] args) {

        double sstableSize = 1.0; // GB
        int numberOfSSTables = 8;

        double logicalWrites =
                sstableSize * numberOfSSTables;

        double compactionWrites =
                sstableSize * numberOfSSTables;

        double physicalWrites =
                logicalWrites + compactionWrites;

        double writeAmplification =
                physicalWrites / logicalWrites;

        System.out.println(
                "Logical Writes: "
                + logicalWrites + " GB");

        System.out.println(
                "Physical Writes: "
                + physicalWrites + " GB");

        System.out.println(
                "Write Amplification: "
                + writeAmplification + "x");
    }
}