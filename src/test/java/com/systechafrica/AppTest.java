package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest 
{

    @Test
    void add() {
        int result = 2 + 3;
        int expected = 5;

        // verify
        Assertions.assertEquals(expected, result, " The sum of 2 + 3 should be 5");
    }
  

    public void shouldAnswerWithTrue()
    {
      
    }
}
