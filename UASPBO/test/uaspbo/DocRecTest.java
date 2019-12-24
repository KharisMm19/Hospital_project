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
import static org.junit.Assert.*;

/**
 *
 * @author VENTI
 */
public class DocRecTest extends TestCase {
    
    public DocRecTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_data method, of class DocRec.
     */
    @Test
    public void testGet_data() {
        System.out.println("get_data");
        DocRec instance = new DocRec();
        instance.get_data();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class DocRec.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DocRec.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
