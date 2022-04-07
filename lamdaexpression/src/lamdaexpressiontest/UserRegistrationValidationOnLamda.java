package lamdaexpressiontest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import lamdaexpression.UserRegistrationLamda;

class UserRegistrationValidationOnLamda {

	UserRegistrationLamda userRegistration = new UserRegistrationLamda();
	@Test
    public void givenFirstNameValid() {
        boolean result = userRegistration.getFirstName().validate("Nikita");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid() {
        boolean result = userRegistration.getFirstName().validate("niki");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenLastNameValid() {
        boolean result = userRegistration.getLastName().validate("Gajra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid() {
        boolean result = userRegistration.getLastName().validate("gajra");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNoValid() {
        boolean result = userRegistration.getPhoneNomber().validate("91 9876543215");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoInValid() {
    	boolean result = userRegistration.getPhoneNomber().validate("987456321091");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailValid() {
    	boolean result = userRegistration.geteMail().validate("rash@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid() {
    	boolean result = userRegistration.geteMail().validate("abc@#gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordValid() {
    	boolean result = userRegistration.getPassword().validate("H@4hdgubkjn");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordInValid() {
    	boolean result = userRegistration.getPassword().validate("69ndkHkm");
        Assert.assertFalse(result);
    }
}
