public class Task14 {
    public static void main(String[] args) {
        String text1="* * * * * * ==================================";
        String text2=" * * * * *  ==================================";
        String text3="==============================================";
        for(int i=1; i<=15; i++){
            if (i<10) {
                if (i % 2 == 1) {
                    System.out.println(text1);
                } else {
                    System.out.println(text2);
                }
            } else System.out.println(text3);

        }
    }
}
