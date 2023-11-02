public class Stakan {
    public static void main(String[] args) {

        int stakan = 250;
        System.out.println("Объем стакана "+stakan+"мл");

        double pol = 50;
        System.out.println("стакан на половину полон "+pol+"%");

        int polovi = 2;
        int res = stakan / polovi;
        System.out.println("остаток в стакане"+res+"мл");
    }
}
