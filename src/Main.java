public class Main {
    public static void main(String[] args) {
        long currentSum = 1005678;
        long addedSum = 1678;

        long resultBonus = calculateBonus(addedSum);

        currentSum += (addedSum + resultBonus);

        System.out.printf("Итоговый бонус: %d\n", resultBonus);
        System.out.printf("Количество денег на текущем счёте клиента: %d", currentSum);
    }

    public static long calculateBonus(long sum){
        int limitSum = 1000;
        int divider = 100;

        if(sum > limitSum) {
            return sum / divider;
        }

        return 0;
    }
}
