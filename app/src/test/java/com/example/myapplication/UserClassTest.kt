package com.example.myapplication

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UserClassTest {

    @Test
    fun isAdult() {
        val user = UserClass("Julian", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun isTeenager() {
        val user = UserClass("Julian", 12)
        assertTrue(user.isTeenager())
    }

    @Test
    fun isChild() {
        val user = UserClass("Julian", 9)
        assertTrue(user.isChild())
    }
}