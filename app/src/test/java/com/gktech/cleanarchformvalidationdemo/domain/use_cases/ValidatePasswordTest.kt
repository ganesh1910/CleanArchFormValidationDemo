package com.gktech.cleanarchformvalidationdemo.domain.use_cases

import org.junit.Assert.assertEquals

import org.junit.Before
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `Password is letter-only, returns error`(){

        val result = validatePassword.execute("abcdef")

        assertEquals(result.successful,false)
    }
}