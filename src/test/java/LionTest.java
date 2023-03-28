import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex1;
    private final Boolean expected;

    public LionTest(String sex1,Boolean expected){
        this.sex1=sex1;
        this.expected =expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] data() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true},
               // new Object[]{"Исключение", "Используйте допустимые значения пола животного - самей или самка"},
        };}

    /**
     * инициализируем мок
     */
    @Before
    public void init() {
            MockitoAnnotations.initMocks(this);
        }
    @Mock
    Feline feline;


    /**
     * проверка что метод возвращает значение
     */
    @Test
    public void doesHaveManeTest2() throws Exception {
        Lion lion = new Lion(sex1, feline);
        Assert.assertEquals(expected,lion.doesHaveMane());
    }

    /**
     * проверяем что при вызове lion.getKittens вызывается feline.getKittens
     */
    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion(sex1, feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");

    }

    /**
     * проверяем что при вызове lion.getKittens вызывается feline.getKittens
     */
     @Test
    public void getKittensLionTest() throws Exception {
         Lion lion = new Lion(sex1, feline);
         lion.getKittens();
         Mockito.verify(feline).getKittens();
    }
}


