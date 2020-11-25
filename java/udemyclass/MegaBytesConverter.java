package udemyclass;

public class MegaBytesConverter {
    public static void main (String[] args){
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            double megabytes = kiloBytes / 1024;
            long megaBytes = Math.round(megabytes);
            int kilobytes = (int) (kiloBytes - (megaBytes*1024));
            System.out.println(kiloBytes+ " KB = "+ megaBytes + " MB and "+ kilobytes + " KB");
        }
    }
}
