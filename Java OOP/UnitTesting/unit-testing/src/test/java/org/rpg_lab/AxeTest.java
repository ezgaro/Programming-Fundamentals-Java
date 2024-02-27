package org.rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    private static final int ATTACK = 13;
    private static final int DURABILITY = 42;
    private static final int HEALTH = 100;
    private static final int EXPERIENCE = 200;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp() {
        this.axe = new Axe(ATTACK, DURABILITY);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
    }

    @Test
    public void test_CreateAxe_ShouldSet_CorrectValues_ForAttackAndDurability() {

        Assert.assertEquals(ATTACK, axe.getAttackPoints());
        Assert.assertEquals(DURABILITY, axe.getDurabilityPoints());

    }

    @Test
    public void test_Attack_Durability_Points() {

        axe.attack(dummy);
        //Assert
        Assert.assertEquals(DURABILITY - 1, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void test_Attack_WithBrokenWeapon_ShouldFail() {
        Axe axe = new Axe(ATTACK, 0);
        axe.attack(dummy);
    }
}
