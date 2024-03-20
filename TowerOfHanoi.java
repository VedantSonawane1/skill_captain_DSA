public class TowerOfHanoi {
    public static void towerOfHanoi(int diskCount, String source, String destination, String helper) {
        if (diskCount == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        towerOfHanoi(diskCount - 1, source, helper, destination);
        System.out.println("Move disk " + diskCount + " from rod " + source + " to rod " + destination);
        towerOfHanoi(diskCount - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int diskCount = 3;
        String source = "A";
        String destination = "C";
        String helper = "B";
        System.out.println("Steps to solve the Tower of Hanoi problem with " + diskCount + " disks:");
        towerOfHanoi(diskCount, source, destination, helper);
    }
}
