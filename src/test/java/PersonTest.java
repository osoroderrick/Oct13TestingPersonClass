import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor(){
        //Given
        Person person = new Person();
        String expected = "brown";
        //When
        person.setEyeColor("brown");
        //Then
        String actual = person.getEyeColor();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetWeight(){
        //Given
        Person person = new Person();
        int expected = 211;
        //When
        person.setWeight(211);
        //Then
        int actual = person.getWeight();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetShoeSize(){
        //Given
        Person person = new Person();
        int expected = 9;
        //When
        person.setShoeSize(9);
        //Then
        int actual = person.getShoeSize();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetGender(){
        //Given
        Person person = new Person();
        char expected = 'M';
        //When
        person.setGender('M');
        //Then
        int actual = person.getGender();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetIsInCollege(){
        //Given
        Person person = new Person();
        boolean expected = false;
        //When
        person.setInCollege(false);
        //Then
        boolean actual = person.isInCollege();
        Assertions.assertEquals(expected,actual);
    }




}
