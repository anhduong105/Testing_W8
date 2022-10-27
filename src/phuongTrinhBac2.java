public class phuongTrinhBac2 {

    static String solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Vo so nghiem";
                } else return "Vo nghiem";
            } else return "Nghiem duy nhat: " + (double) Math.round((-c / b) * 100) / 100;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) return "Vo nghiem";
        else if (delta == 0) return "Nghiem kep: " + (double) Math.round((-b / (2 * a)) * 100) / 100;
        else {
            return "x1 = " + (double) Math.round(((-b + Math.sqrt(delta)) / (2 * a)) * 100) / 100 + ", x2 = " + (double) Math.round(((-b - Math.sqrt(delta)) / (2 * a)) * 100) / 100;
        }
    }
}
