package ru.netology.serviceTest;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void CashbackHackService() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void CashbackHackService2() {
        int amount = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void CashbackHackService3() {
        int amount = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void CashbackHackService4() {
        int amount = 1;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void CashbackHackService5() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}
