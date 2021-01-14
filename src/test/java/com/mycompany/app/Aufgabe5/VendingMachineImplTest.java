package com.mycompany.app.Aufgabe5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class VendingMachineImplTest {

    @Mock
    private VendingMachineImpl vendingMachine;


    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        UnlimitedCashBox unlimitedCashBox = new UnlimitedCashBox();
        FullBox fullBox1 = new FullBox();
        FullBox fullBox2 = new FullBox();
        Box[] boxArray = {fullBox1, fullBox2};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);

        vendingMachine.selectItem(1);

    }
}
