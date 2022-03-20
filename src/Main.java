public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        //В первом случае цена билета такая же, как из предыдущей версии приложения
        int validPrice = service.calculate(1200);
        System.out.println("Количество бонусных милль = " + validPrice + ". Значение как из предыдущей версии приложения ");

        //Во втором случае интересно было посмотреть количество бонусных милль при высокой цене за билет
        int bigPrice = service.calculate(1_000_000);
        System.out.println("Количество бонусных милль = " + bigPrice + ", при высокой цене за один билет");

        //В третьем случае цена билета меньше одной бонусной милли
        int priceLessThanOneBonusMiles = service.calculate(15);
        System.out.println("Количество бонусных милль = " + priceLessThanOneBonusMiles + ", когда цена билета меньше бонусной милли ");

        //В четвортом случае цена билета равняется нулю
        int priceIsZero = service.calculate(0);
        System.out.println("Количество бонусных милль = " + priceIsZero + ", когда цена билета равна нулю ");
    }
}