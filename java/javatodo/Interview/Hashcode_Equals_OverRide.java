package Interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Hashcode_Equals_OverRide {
  

    @Test
    public void testInt(){
        int s=4;
        var r=Integer.hashCode(s);
        assertEquals(s, r, "message");
    }
}