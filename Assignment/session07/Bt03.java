package assignment.session07;

public class Bt03 {
    public class ScoreUtils {
        // Phương thức kiểm tra Đạt/Trượt
        public static boolean checkPass(double score) {
            if(score >= 5){
                return true;
            }
            return false;
        }

        // Phương thức tính trung bình cộng
        public static double calculateAverage(double[] scores) {
            double sum = 0;
            for (double d : scores) {
                sum+= d;
            }
            return sum/scores.length;
        }
    }

    public static void main(String[] args) {
        double[] listScore = {6.5, 8.0, 4.5};
        double avg = ScoreUtils.calculateAverage(listScore);
        System.out.printf("Diem trung binh ca lop: %.2f \n", avg);
        for (double d : listScore) {
            if(ScoreUtils.checkPass(d)){
                System.out.println("Diem: "+ d+": Dat");
            }else{
                System.out.println("Diem: " + d + ": Truot");
            }
        }
    }


}
