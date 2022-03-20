public class BonusMilesService {
    public int calculate(int priceTicket) {
        int oneBonusMiles = 20;
        int countBonusMiles = (priceTicket / oneBonusMiles);
        return countBonusMiles;
    }
}

