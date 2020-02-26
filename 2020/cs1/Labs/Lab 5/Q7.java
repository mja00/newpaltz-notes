class Q7 {

    public static void main(String[] args) {
        
        double[] grades = {98.6, 78.2, 56.9};
        double[] newGrades = new double[grades.length+1];
        double insertGrade = 88.8;
        for (int i = 0; i<newGrades.length; i++) {
            if (grades.length == i) {
                newGrades[i] = insertGrade;
            } else {
                newGrades[i] = grades[i];
            }
        }
        System.out.println(newGrades[3]);
    }
}