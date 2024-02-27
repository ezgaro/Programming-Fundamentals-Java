package org.rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private static final int HEALTH = 100;
    private static final int EXP = 200;
    private static final int ATTACK = 10;

    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, EXP);
        this.deadDummy = new Dummy(0 ,EXP);
    }


    @Test(expected = IllegalStateException.class)
    public void test_Dummy_CannotBeAttacked_WhenDead() {
        deadDummy.takeAttack(ATTACK);
    }

    @Test()
    public void test_Dummy_Looses_Health_WhenAlive_And_Attacked() {
        dummy.takeAttack(ATTACK);
        assertEquals(dummy.getHealth() , HEALTH - ATTACK);
    }

    @Test
    public void test_Dummy_GivesExperience_WhenDead() {
        int actualXp = deadDummy.giveExperience();
        assertEquals(EXP,actualXp);
    }

    @Test(expected = IllegalStateException.class)
    public void test_Dummy_CannotGiveEXP_WhenAlive() {
        dummy.giveExperience();
    }

    @Test
    public void test_Dummy_IsDead_WhenHealthIsZero() {
        assertTrue(deadDummy.isDead());
    }@Test
    public void test_Dummy_IsDead_WhenHealthIs_BelowZero() {
        assertTrue(new Dummy(-1, 1).isDead());
    }

    @Test
    public void test_Dummy_IsAlive_WhenHealthIsMoreThanZero() {
        assertFalse(new Dummy(1, 1).isDead());
    }

}