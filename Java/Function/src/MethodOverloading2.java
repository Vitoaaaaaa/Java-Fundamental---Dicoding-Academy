public class MethodOverloading2 {
    public static void main(String[] args) {

        Double p = Double.valueOf(7);
        Double l = Double.valueOf(5);
        Double hasil = luasSegitiga(p,l);
        System.out.println("Luas Segitiga: "+hasil);

        Integer length = 8;
        Integer wide = 5;
        Integer hsl = luasSegitiga(length,wide);
        System.out.println("Luas Segitiga: "+hsl);

    }

    public static double luasSegitiga(Double panjang, Double lebar){
        double result = panjang*lebar;
        return result;
    }

    public static Integer luasSegitiga(Integer panjang, Integer lebar){
        Integer result = panjang*lebar;
        return result;
    }
}
