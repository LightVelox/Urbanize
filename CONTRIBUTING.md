# Como usar GitHub no Visual Studio Code

## Introdução
Devido aos "desenvolvedores-alvo" deste projeto serem geralmente programadores que nunca usaram Git antes (poderíamos incluir até eu mesmo!) achei necessário escrever este breve e simples tutorial.

Notável que quando você procura por tutoriais de Git você encontra vários, mas todos muito profundos, o que você não precisa para ajudar neste projeto, você só precisa saber o básico, e é isso que você aprenderá aqui.


## Controle de versão
Com o controle de versão, você facilmente rastreia as alterações do código, podendo inclusive voltar pra versões anteriores e ter um bom controle do que está sendo feito em equipes de vários desenvolvedores trabalhando junto.

No nosso caso do Projeto Urbanize, isso será muito útil para trabalhar em equipe, já que cada pessoa pode estar desenvolvendo novos scripts ao mesmo tempo, e no final de cada script, diferentes versões de cada desenvolvedor passarão por uma fusão juntando tudo num só.


## Clonando e começando a trabalhar

### Pré-requisitos
* Visual Studio Code
* Conta no GitHub


### Clonando o repositório
Abra o seu Visual Studio Code, puxe a parte debaixo da janela com o mouse para abrir e clique na guia `Terminal`

![](http://2.bp.blogspot.com/-vDYkqx9neho/WROhuwVdhDI/AAAAAAAAORg/Hl2YFZ7LT0QqB-sohOuc8eOq399AI2SVQCK4B/s1600/2.jpg)

Ou se preferir, pressione CTRL+P e digite `>Console` e pressione Enter.

Se quiser definir o diretório onde deseja salvar o projeto, siga em frente, mas vamos continuar na simplicidade...

Digite `git config --global user.name <username>` (troque `<username>` pelo seu username do GitHub). Enter. (irá pedir alguma autentificação? Aqui não pediu).
Em seguida digite `git clone https://github.com/JuniorDjjr/Urbanize.git`. Enter.

Ficará assim:

![](http://1.bp.blogspot.com/--gE5RDsjVpg/WROkI1ewX1I/AAAAAAAAOR4/NVtw82mZ1vo01K3bj-Xrs4SjfwWFr_GTgCK4B/s1600/3.jpg)

E já que não definimos o diretório, será salvo na pasta do seu usuário (no meu caso, em `C:\Users\JuniorDjjr\Urbanize`). É só ir lá e pegar a pasta `Urbanize` e copiar para a pasta `modloader` do seu GTA SA.

Agora é só ir no botão Git do Visual Studio Code e abrir a pasta `modloader\Urbanize`:

![](http://2.bp.blogspot.com/-A1KjjCxPVvg/WROy7HOQDsI/AAAAAAAAOTo/CYMNHiuZMFADYOo69XXfaS_Q1eCRzbAGQCK4B/s1600/4.jpg)

E começar a codar!

![](http://2.bp.blogspot.com/-rQ2D3iPMxuc/WROmtHCITaI/AAAAAAAAOSE/OgpAuBu-vEIQucfJdQtlfiFQCKOzPDWwgCK4B/s1600/5.jpg)


### Fazendo as alterações
_Nota: Você também pode [assistir uma rápida video-aula](https://code.visualstudio.com/docs/introvideos/versioncontrol) para ajudar no entendimento, mas ainda é recomendado que leia abaixo._

Vamos entender na prática:

Suponhamos que você queira começar a criar um script que adicione algumas pessoas numa casa.
Crie um novo "branch" pressionando CTRL+P e digitando `git branch <nome>` (troque `<nome>` por algum nome curto descritivo, de preferência o nome do seu novo script).

![](http://3.bp.blogspot.com/-ftycbA7biEw/WROoQ_fCS9I/AAAAAAAAOSY/M38dES_JVqkShjj67i2vphg0MmPrrG6LwCK4B/s1600/7.jpg)

Na parte inferior da tela terá o nome do seu branch. Note que você pode clicar para mudar de branch, como por exemplo voltar ao master ou ver outros branches.
Do lado o botão para você publicá-lo. Você pode publicar agora, mesmo que ainda não tenhamos feito alterações.

![](http://1.bp.blogspot.com/-r2J2KuiTGBk/WROrAe5mpII/AAAAAAAAOSk/xaJvJ1BzwwwSA9OS7rysE77Y5X_ubwONwCK4B/s1600/7-1.jpg)

Agora, edite o seu código normalmente.

No script raiz, na seção dos triggers eu adicionei o trigger do meu novo script:

![](http://4.bp.blogspot.com/-hyFV4ot4qME/WROrUxRTLKI/AAAAAAAAOSs/nOmkUHvTWcga9H0CfzuY-BI_v3fIJOxnACK4B/s1600/8.jpg)

Perceba que as linhas adicionadas são marcadas com uma linha verde na esquerda. Você notará outras cores também.

Enfim, após eu ter feito todas as edições necessárias para o funcionamento do meu novo script, ter criado o meu .sc, codado ele todo etc, posso dar um commit para minhas alterações irem pro GitHub.

![](http://1.bp.blogspot.com/-Y0T7bpmuqok/WROr6258XDI/AAAAAAAAOS4/Ob6huqUzQaUb6XIV3Yjn6JHcyf9s6gSmQCK4B/s1600/9.jpg)

Note que os arquivos alterados estão listados, você pode selecioná-los individualmente para escolher qual dar commit (com o botão `+` ("Stage")) ou simplesmente dar commit em todos.

Escreva uma descrição e clique no botão:

![](http://4.bp.blogspot.com/-4QoBMWHEycc/WROsXEtOtUI/AAAAAAAAOTA/8dC7UwmI4iguIYDuZ-nljP56PnkWoA_NwCK4B/s1600/10.jpg)

Saiba que a primeira linha da descrição é o "título" do Commit, portanto, seja curto e direto. Geralmente escritos no presente, por exemplo escreva "Adicionar" e não "Adicionado" ou "Adicionando". De qualquer modo, sinta-se livre nos nomes que você dará.

As linhas em seguida são uma descrição maior explicando o que você fez.
E está pronto! Você pode acompanhar o seu branch (o seu novo trabalho no mod) e seus commits (as suas alterações) no GitHub.

![](http://1.bp.blogspot.com/-34nPldas4MM/WROs17psPiI/AAAAAAAAOTM/CzAbtP6PA5wHmGlQanTRATFs23jbL4ByQCK4B/s1600/12.jpg)

Não se esqueça de deixar tudo em dia. Fique de olho no botão na parte inferior para atualizar os arquivos (enviar as suas alterações, e/ou receber as novas alterações). Você também pode fazer isso com a opção "Sync".

![](http://1.bp.blogspot.com/-IPDowq7oumI/WROt3oJ9u4I/AAAAAAAAOTY/V5ZXTH5t65MBLgDtIXHRoqigHPpecISWgCK4B/s1600/11.jpg)

Notou que precisa fazer alterações? Corrigir alguma coisa? Adicionar outra? Faça as alterações e crie um novo commit!

Quando quiser partir para novos trabalhos (como algum novo script), crie um novo branch e continue os processos. Eu (Junior_Djjr) e quem sabe alguém mais cuidará do master.

Também fique de olho nos [Pull Requests](https://github.com/JuniorDjjr/Urbanize/pulls), onde após os commits serem revisados e acredita-se que está tudo pronto, as alterações irão para lá e por fim terá a fusão para a master, onde tudo será juntado num só.

E lembre-se do botão dos branches:

![](http://1.bp.blogspot.com/-yIWXLsIMyD8/WRO1Gl6Bm2I/AAAAAAAAOT0/oZLXbG7Euq0bSiD1OC9U6vQ661RhbMlIACK4B/s1600/13.jpg)

Sempre dê uma olhada nos branches disponíveis, onde são diferentes as versões do mod, novos e antigos scripts, assim como a versão "mestre" (master) do mod.

Assim como lembre-se do botão de sincronizar (atualizar). Lembra dele?


## Aprenda mais Git
Procure mais sobre o uso do Git, e principalmente dê uma olhada no [glossário](https://help.github.com/articles/github-glossary/) para entender melhor as palavras (afinal, como assim fork? garfo? e branch? galho? como assim tronco??) mesmo que você não precise aprender e entender tudo.


## Bugs, melhorias (Issues)
Outra parte importante será o "[Issues](https://github.com/JuniorDjjr/Urbanize/issues)", onde lá você pode informar bugs para corrigir, melhorias para fazer etc. Até mesmo marcar bugs como já corrigidos, melhorias como já feitas e tudo mais.
