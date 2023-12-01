package jlin2.examples.localtesting

import android.util.Log
import com.google.common.truth.Truth
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun correctEmailFormat() {
        val isValidEmail = EmailValidator.isValidEmail("123@abc.com")
        assertTrue(isValidEmail)
        println("Validate Correct Email Format")
    }

    @Test
    fun correctEmailSubdomainFormat (){
        val isValidEmail = EmailValidator.isValidEmail("123@abc.co.ca")
        assertTrue(isValidEmail)
        println("Validate Correct Email with sub domain Format")
    }

    @Test
    fun incorrectEmailFormatIncorrectDomain (){
        val isValidEmail = EmailValidator.isValidEmail("123@abc")
        assertFalse(isValidEmail)
        println("Validate incorrect Email with incorrect domain")
    }

    @Test
    fun incorrectEmailFormatEmailWithDoubleDot (){
        val isValidEmail = EmailValidator.isValidEmail("123@abc..com")
        assertFalse(isValidEmail)
        println("Validate incorrect Email with double dot")
    }

    @Test
    fun incorrectEmailFormatEmailWithOutUsername (){
        val isValidEmail = EmailValidator.isValidEmail("@abc.com")
        assertFalse(isValidEmail)
        println("Validate incorrect Email without username")
    }

    @Test
    fun incorrectEmailFormatEmailWithOutDomain (){
        val isValidEmail = EmailValidator.isValidEmail("testing123")
        assertFalse(isValidEmail)
        println("Validate incorrect Email without domain")
    }

    @Test
    fun incorrectEmailFormatEmailWithEmptyString (){
        val isValidEmail = EmailValidator.isValidEmail(" ")
        assertFalse(isValidEmail)
        println("Validate incorrect Email with empty string")
    }

    @Test
    fun incorrectEmailFormatEmailWithNull (){
        val isValidEmail = EmailValidator.isValidEmail(null)
        assertFalse(isValidEmail)
        println("Validate incorrect Email with null value")
    }






}