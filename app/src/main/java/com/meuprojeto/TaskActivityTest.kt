package com.meuprojeto

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TaskActivityTest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule(TaskActivity::class.java)

    @Test
    fun deveMostrarMensagemAoClicarNoBotao() {
        // Simula clique no botão
        onView(withId(R.id.botaoSalvar)).perform(click())

        // Verifica se o texto esperado aparece
        onView(withId(R.id.textViewMensagem))
            .check(matches(withText("Tarefa salva com sucesso!")))
    }
}
