package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHack;
public class CashbackHackTest {
    @Test
    public void shouldGet100IfAmount900() {
        CashbackHack service = new CashbackHack();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldGet550IfAmount450() {
        CashbackHack service = new CashbackHack();

        int amount = 450;
        int expected = 550;
        int actual = service.remain(450);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldGet1000IfAmount0() {
        CashbackHack service = new CashbackHack();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);;
    }

    @Test // здесь ошибка
    public void shouldReturnIfAmount1000() {
        CashbackHack service = new CashbackHack();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn1IfAmount999() {
        CashbackHack service = new CashbackHack();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }
}