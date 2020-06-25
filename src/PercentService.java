
public class PercentService {

    public double addingPercentToNumber(double number, double percent){
        return (number * (percent / 100 + 1));
    }

    public double subtractingPercentFromNumber(double number, double percent){
       return number *  (((100 - percent)) / 100);
        //return 100 - ((percent / 100) * number);
    }

    public double percentOfNumberIsAnotherNumber(double mainNumber, double numberToCheck){
        return (numberToCheck / mainNumber) * 100;
    }

    public double howManyPercentOneNumberIsGraterThanOther(double mainNumber, double numberToCheck){
       return  ((numberToCheck / mainNumber) * 100) - 100;
    }

    public double howManyPercentOneNumberIsSmallerThanOther(double mainNumber, double numberToCheck){
        return 100 - ((numberToCheck / mainNumber) * 100);
    }
}
