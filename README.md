Desenvolver uma aplicação que possua as seguintes Activities:

Activity Boas Vindas

Criar uma Activity de boas vindas com os seguintes elementos:

Tela de abertura do sistema com o nome do sistema.
Três botões, que levam a três activities distintas: Login - Cadastro - Sobre.
Activity Login 

Tela de login com os seguintes elementos:

Campo de e-mail
Campo de senha
Botão de login.
Ao pressionar o botão de login, o sistema deverá validar se os dados digitados são iguais ao seu e-mail da UniFTEC (exemplo:algumacoisa@algumemail.com.br) e a senha é igual à 123456. Caso os dados estiverem seguindo a regra acima, chamar a Activity "Sucesso Login". Caso os dados não estiverem seguindo a regra acima, chamar a Activity "Erro Login".
Activity Sucesso Login

Tela de sucesso no login com os seguintes elementos:

Texto "Login realizado com sucesso"
Botão "Sobre".
Ao clicar no botão "Sobre", chamar a Activity "Sobre".
Activity Erro Login

Tela de erro no login com os seguintes elementos:

Texto "Erro no Login. Verifique seus dados e tente novamente."
Botão "Voltar".
Ao clicar no botão "Voltar", chamar a Activity "Login".
Activity Cadastro

Leva a uma tela de cadastro pedindo os seguintes elementos:

Campo Nome completo
Campo Endereço
Campo Número
Campo CEP
Campo Complemento
Campo E-mail
Botão Salvar
Ao clicar no botão "Salvar, verificar se o conteúdo de todos os campos não está em branco. Caso todos os campos estiverem digitados, chamar a Activity "Sucesso Cadastro". Caso algum campo esteja em branco, chamar a Activity "Erro Cadastro".
Activity Sucesso Cadastro

Tela de sucesso no cadastro com os seguintes elementos:

Texto "Olá <nome>. Cadastro realizado com sucesso"
Botão "Sobre".
Ao clicar no botão "Sobre", chamar a Activity "Sobre".
No texto acima, substituir <nome> pelo nome cadastrado no campo Nome Completo da Activity Cadastro.
Activity Erro Cadastro

Tela de erro no login com os seguintes elementos:

Texto "Erro no Cadastro. Os campos <campo1> e <campo2> devem ser preenchidos."
Botão "Voltar".
Ao clicar no botão "Voltar", chamar a Activity "Cadastro".
No texto acima, substituir <campo1>, <campo2>, <campon> pelo nome do campo que está em brando na Activity Cadastro.
Activity Sobre

Tela sobre o aplicativo com os seguintes elementos: 

Nome do aluno desenvolvedor.
Além disso, possui um botão que leva à página da UniFTEC e um botão que chama a Activity Boas Vindas.
