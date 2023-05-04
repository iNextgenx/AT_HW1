package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testWhenAllCorrect() {
        CashbackHackService service = new CashbackHackService();
        int expected = 400;
        int actual = service.remain(600);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase2001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(2001);
        Assert.assertEquals(expected, actual);
    }
}