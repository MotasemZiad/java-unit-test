public class Calculator {
    public float division(float x, float y){
        return x / y;
    }

    public String getGrade(int mark) {
        if(mark > 100) {
            return "Invalid";
        }else if(mark >= 90){
            return "Excellent";
        }else if(mark >= 80){
            return "Very Good";
        }else if(mark >= 70){
            return "Good";
        }else if(mark >= 60) {
            return "Accepted";
        }else if(mark >= 40){
            return "Failed";
        }else if(mark > 0){
            return "Invalid";
        }else if(mark == 0){
            return "Invalid";
        }else {
            return "Invalid";
        }
    }
}
