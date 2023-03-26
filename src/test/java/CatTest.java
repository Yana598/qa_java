import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline  feline;


    @Test
    public void getSoundMyau() {
        Cat cat=new Cat(feline);
        // Получаем значения из реального объекта
        System.out.println(cat.getSound()); //
    }

    @Test
    public void getFoodCalledEatMeet() throws Exception {
        Cat cat=new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}