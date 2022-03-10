package lessons.test.happyTickets;

public class HappyTickets {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 999999; i++) {
            if (findHappyTicket(i)) sum++;
        }
        System.out.println("Счастливых билетиков получлиось целая уйма, а именно - "+ sum);
    }

    public static boolean findHappyTicket(int ticket){
        int a = ticket / 100000;
        int b = (ticket % 100000) / 10000;
        int c = (ticket % 10000) / 1000;
        int d = (ticket % 1000) / 100;
        int e = (ticket % 100) /10;
        int f = ticket % 10;
        if (a+b+c == d+e+f) return true;
        return false;
    }

}
