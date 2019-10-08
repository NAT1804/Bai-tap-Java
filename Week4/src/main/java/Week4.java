public class Week4 {
    public static int max2Int(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static int minArray(int []arr) {
        int min = 999999;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] <= min) min = arr[i];
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height) + 0.05;
        //double BMI_reduce = Math.round((BMI*10)/10);
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI >= 18.5 && BMI <= 22.9) return "Bình thường";
        else if (BMI >= 23 && BMI <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
}
