import com.example.Feline;
import com.example.Lion;
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

    public LionTest(String sex1){
        this.sex1=sex1;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самка"},
                {"Самец"},
              //  {"Исключение"},
        };}

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
        System.out.println(lion.doesHaveMane());
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


