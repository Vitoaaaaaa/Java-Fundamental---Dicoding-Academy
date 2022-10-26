public class ifThenElseIFThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 81;
        char indeksPrestasi;

        if (nilaiUjian>=80){
            indeksPrestasi='A';
        } else if (nilaiUjian>=70) {
            indeksPrestasi='B';
        } else if (nilaiUjian>60) {
            indeksPrestasi='C';
        }else if (nilaiUjian>=50){
            indeksPrestasi='D';
        }else if (nilaiUjian<=40){
            indeksPrestasi='E';
        }else {
            indeksPrestasi='F';
        }
        System.out.println("Nilai Ujian Akhir anda adalah: "+indeksPrestasi);
    }
}
