/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import b.backendmock.FerryManagerDummy;
import com.mycompany.contracttest.BackendHolder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BackendManagerTest.class
})
public class FerryManagerDummyTest {

    @BeforeClass
    public static void setupClass() {
        BackendHolder.manager = new FerryManagerDummy();
    }

}
