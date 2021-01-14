package com.mycompany.app.Aufgabe5;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class VendingMachineImplMTest {
    private VendingMachineImpl vendingMachine;
    private FullBox fullBox1;
    private FullBox fullBox2;
    private UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
        unlimitedCashBox = mock(UnlimitedCashBox.class);
        fullBox1 = mock(FullBox.class);
        fullBox2 = mock(FullBox.class);
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        when(fullBox2.getPrice()).thenReturn(1);
        when(unlimitedCashBox.getCurrentAmount()).thenReturn(Integer.MAX_VALUE);
        vendingMachine.selectItem(1);

        verify(fullBox2).getPrice();
        verify(unlimitedCashBox).getCurrentAmount();

    }
}