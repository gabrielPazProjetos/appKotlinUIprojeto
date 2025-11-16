--- Conjunto de Testes para TaskActivity

-- Verificar se o botão aparece na tela
kotlin
@Test
fun deveExibirBotaoSalvarNaTela() {
    onView(withId(R.id.botaoSalvar))
        .check(matches(isDisplayed()))
}

-- Verificar se o texto inicial está correto
kotlin
@Test
fun deveExibirMensagemInicialCorreta() {
    onView(withId(R.id.textViewMensagem))
        .check(matches(withText("Nenhuma tarefa salva ainda")))
}

-- Verificar se ao clicar no botão aparece a mensagem de sucesso
kotlin
@Test
fun deveMostrarMensagemAoClicarNoBotao() {
    onView(withId(R.id.botaoSalvar)).perform(click())

    onView(withId(R.id.textViewMensagem))
        .check(matches(withText("Tarefa salva com sucesso!")))
        
}
-- Verificar se o texto muda apenas após o clique
kotlin
@Test
fun naoDeveMostrarMensagemDeSucessoSemClique() {
    onView(withId(R.id.textViewMensagem))
        .check(matches(withText("Nenhuma tarefa salva ainda")))
}
