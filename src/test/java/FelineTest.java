import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    Feline feline = new Feline();


    /**
     * проверка, что метод возвращает "кошачьи"
     */
   @Test
    public void getFamilyTestReturnStringTest(){
       Assert.assertEquals("Кошачьи",feline.getFamily());
   }

    /**
     * проверили, что метод возвращает заданное значение     */
    @Test
    public void eatMeatTest() throws Exception{
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());

    }

    /**
     * проверяем что метод возвращает определенное значение
     */
    @Test
    public void getKittensTest(){
        Assert.assertEquals(5,feline.getKittens(5));
    }
}

