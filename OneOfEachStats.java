import java.util.Random;

public class OneOfEachStats {

    public static void main(String[] args) {
        

        int t = Integer.parseInt(args[0]);;
        int seed = Integer.parseInt(args[1]);;
        Random generator = new Random(seed);

        boolean isAGirl=false;
        boolean isABoy=false;
        double sumOfNumOfChildren=0;
        int numOfFamilyWithTwoChild=0;
        int numOfFamilyWithThreeChild=0;
        int numOfFamilyWithFourPlusChild=0;
        int numOfChild=0;
        for (int i = 0; i <t ; i++) {
            isAGirl=false;
            isABoy=false;
            numOfChild=0;
            while (!(isAGirl&&isABoy)){
                if (generator.nextDouble()*1>0.5){
                    isAGirl=true;
                }
                else {
                    isABoy=true;
                }
                numOfChild++;
                sumOfNumOfChildren++;
            }
            if (numOfChild==2) {
                numOfFamilyWithTwoChild++;
            } else if (numOfChild==3) {
                numOfFamilyWithThreeChild++;
            }else if(numOfChild>=4) {
                numOfFamilyWithFourPlusChild++;
            }        }
        double avg=  sumOfNumOfChildren /t;
        int commonNumOfChildren= Math.max(numOfFamilyWithTwoChild,Math.max(numOfFamilyWithThreeChild,numOfFamilyWithFourPlusChild));
        System.out.println("Average "+avg+ " children to get at least one of each gender");
        System.out.println("Number of families with 2 children: "+ numOfFamilyWithTwoChild);
        System.out.println("Number of families with 3 children: "+ numOfFamilyWithThreeChild);
        System.out.println("Number of families with 4 or more children: "+ numOfFamilyWithFourPlusChild);
        String result = ((commonNumOfChildren == numOfFamilyWithTwoChild) ? " "+ 2 : (commonNumOfChildren == numOfFamilyWithThreeChild) ? " "+3:" "+4+" or more");

        System.out.println("The most common number of children is"+result);
    }
}
