package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void test1 () {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void test2 () {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void test3 () {
        int amount = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void test4 () {
        int amount = 1;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void test5 () {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}