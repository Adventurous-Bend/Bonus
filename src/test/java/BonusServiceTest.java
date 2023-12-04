import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegForRegisteredAndUnderLimit() {
        BonusService serviceReg = new BonusService();

        // подготавливаем данные:
        long amountReg = 3000;
        boolean registeredReg = false;
        long expectedReg = 30;

        // вызываем целевой метод:
        long actualReg = serviceReg.calculate(amountReg, registeredReg);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedReg, actualReg);
    }

    @Test
    void shouldCalculateRegForRegisteredAndOverLimit() {
        BonusService serviceReg = new BonusService();

        // подготавливаем данные:
        long amountReg = 1_000_000;
        boolean registeredReg = false;
        long expectedReg = 500;

        // вызываем целевой метод:
        long actualReg = serviceReg.calculate(amountReg, registeredReg);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedReg, actualReg);
    }
}

