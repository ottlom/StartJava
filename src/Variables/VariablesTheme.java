package Variables;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.print("Work 1:");
        byte numOfCores = 8;
        short versionOfWindows = 11;
        int systemType = 64;
        long hardDiskCapacityMb  = 1500000;
        float freqCpu = 3.80f;
        double ram = 32.0;
        char nameDiskWithOc = 'C';
        boolean availabilityOfVideoCard = true;
        System.out.print("\nName disk where was installed OC " + nameDiskWithOc +","  +  " Version Of Windows " + versionOfWindows + ","
                + " System Type " + systemType + "," + " Numbers Of Cores " + numOfCores + "," + " Capacity Hard disk in MB " + hardDiskCapacityMb + ","
                + " CPU frequency " + freqCpu + "GHz " + "," + " RAM " + ram + "," + " Availability Of VideoCard in PC " + availabilityOfVideoCard);
    }
}
