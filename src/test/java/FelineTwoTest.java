import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTwoTest {
    @Spy // шпион для объекта
    private Feline feline;

    /**
     * проверка что метод вызван с аргуметом 1
     */
    @Test
   public void getKittensReturnGetKittensTest(){
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

}
