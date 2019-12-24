/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author VENTI
 */
public class NewUserTest extends TestCase{
    
    public NewUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        NewUser instance = new NewUser();
        System.out.format("Start testing %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of reset method, of class NewUser.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        NewUser instance = new NewUser();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class NewUser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewUser.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
