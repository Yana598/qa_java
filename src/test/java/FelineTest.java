import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    /**
     * проверка,что метод вызывается
     */
    @Test
    public void getFamilyTest(){
       feline.getFamily();
       Mockito.verify(feline, Mockito.times(1)).getFamily();
   }

    /**
     * проверка, что метод возвращает "кошачьи"
     */
   @Test
    public void getFamilyTestReturnString(){
       Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
       System.out.println(feline.getFamily());
   }

    /**
     * проверка что метод вызван со аргументом 1
     */
    @Test
    public void getKittensReturnGetKittens() {
            feline.getKittens(1);
            Mockito.verify(feline).getKittens(1);
   }

    /**
     * проверка что метод getkittens вызван 1 раз
     */
    @Test
    public void howManyCalledgetKittenstest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    /**
     * проверили, что метод вызван с любым  числом в качестве аргумента
     */
    @Test
    public void getKittenCalledWithInttest() {
        feline.getKittens(3); // вызвали метод объекта с аргументом
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        // проверили, что метод вызван с любым  числом в качестве аргумента
    }

    /**
     * проверили, что метод вызван с аргументом хищник
     */
    @Test
    public void eatMeatTest() throws Exception{
       feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");

    }
}

