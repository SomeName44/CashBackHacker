package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackTest {
    @Test
    public void shouldGet100IfAmount900() {
        CashbackHack service = new CashbackHack();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldGet500IfAmount500() {
        CashbackHack service = new CashbackHack();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(500);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldGet1000IfAmount0() {
        CashbackHack service = new CashbackHack();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test // здесь ошибка
    public void shouldReturnIfAmount1000() {
        CashbackHack service = new CashbackHack();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}