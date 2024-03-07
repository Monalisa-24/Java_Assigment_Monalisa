import java.util.Scanner;



class Grader{
    private int score;
    
    
    public Grader(int score){
        this.score = score;
    }
    
    public String letterGrade(){
        if(score >= 90 && score <= 100){
            return "O";}
        else if(score >= 80 && score < 90){
            return "E";}
       else if(score >= 70 && score < 80){
            return "A";}
       else if(score >= 60 && score <= 70){
            return "B";}
       else if(score >= 50 && score <= 60){
            return "C";}
        else {
            return "F";
		}
    }
}

class Grade {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------------\n'O' - Outstanding\n'E' - Excellent\n'A' - Very Good\n'B' - Good\n'C' - Satisfactory\n'F' - Fail\n---------------------\n");
        System.out.print("Enter your score to know your Grade : ");
        int your_score = sc.nextInt();
        
    
            Grader obj = new Grader(your_score);
            String res = obj.letterGrade();
            
            System.out.println("Your Grade is : " + res);
			}
}