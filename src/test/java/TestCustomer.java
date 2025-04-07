import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCustomer {
    Customer TestCase;
    String Name = "Winston";
    String Last = "Blogs";
    String Id = "1234567891011";
    String Address = "84 Victory mansion";


    @Test
    void ConstructFAIL_Name_Test(){
        Name = "Wi";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("Name too short", expt.getMessage());
    }

    @Test
    void ConstructFAIL_LastName_Test(){
        Last = "Bl";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("Last name too short", expt.getMessage());
    }

    @Test
    void ConstructFAIL_ID_Short_Test(){
        Id = "94270";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("ID too short", expt.getMessage());
    }

    @Test
    void ConstructFAIL_ID_Long_Test(){
        Id = "933411812345532423";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("ID too long", expt.getMessage());
    }


    @Test
    void ConstructFAIL_Address_Short_Test(){
        Address = "Ireland";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("Address too short", expt.getMessage());
    }

    @Test
    void ConstructFAIL_Address_Long_Test(){
        Address = "Galway-Mayo-IT, Galway, Galway, Connact, Republic of Ireland, Earth";
        Exception expt = assertThrows(IllegalArgumentException.class, () -> {TestCase = new Customer(Name, Last, Id, Address);});
        assertEquals("Address too long", expt.getMessage());
    }

    @Test
    void ConstructPass(){
        TestCase = Customer(Name, Last, Id, Address);
        assertNotNull(TestCase);
    }





}
