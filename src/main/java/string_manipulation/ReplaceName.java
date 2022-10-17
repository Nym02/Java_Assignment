package string_manipulation;

public class ReplaceName {

    public void replaceStr(String str){
        str = str.replace("Rahim", "Fahim");
        System.out.println(str);
    }
    public static void main(String[] args) {

        String input = "Ratul and Rahim lives in Rangpur";

        ReplaceName s = new ReplaceName();
        s.replaceStr(input);
    }
}
