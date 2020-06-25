public class Main {
    public static void main(String[] args) {

        PercentService percentService = new PercentService();

        System.out.println(percentService.addingPercentToNumber(40, 50));

        System.out.println(percentService.subtractingPercentFromNumber(50, 20));

        System.out.println(percentService.percentOfNumberIsAnotherNumber(50, 5) + " %");

        System.out.println(percentService.howManyPercentOneNumberIsGraterThanOther(50, 70) + " %");

        System.out.println(percentService.howManyPercentOneNumberIsSmallerThanOther(100,20) + " %");



    }
}
