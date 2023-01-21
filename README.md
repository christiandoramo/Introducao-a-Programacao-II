# 🚀Como habilitar JavaFX com eclipse IDE em 2023
## <mark>**Atenção!**</mark>
Use uma versão do eclipse anterior as de 2022 (como 2021-03), pois as mais recentes podem bugar na criação de arquivos fxml necessarios para o javafx </mark> <br>

Clickar na aba HELP -> install new software. Na janela já aberta coloque em add "e(fx)clipse" (se o link não estiver disponivel tente esse https://download.eclipse.org/efxclipse/updates-released/3.5.0/site/ ou https://download.eclipse.org/efxclipse/updates-released/3.5.0/site/).<br><br>
Agora baixe o arquivo do javafx no site Gluon em uma pasta que voce se lembre. 

No eclipse, clique no seu projeto e abra as propriedadess. Na aba library e depois selecione modulepath, crie uma biblioteca adicionando "external Jars", adicionando todos os jars que estão na pasta lib da pasta do javafx baixado. Agora basta selecionar essa livraria criada e dar o apply and close.

Caso ainda não funcione a execução de uma GUI do javafx no eclipse e apareça o erro <mark>"Error: Could not find or load main class application.Main
Caused by: java.lang.NoClassDefFoundError: javafx/application/Application"</mark> no console, é necessario ir em run configurations do main do seu projeto (também na setinha ao lado do icone de run/play), e aplicar na aba arguments em VM arguments o seguinte: --module-path "O seu caminho absoluto até a pasta lib do javafx" --add-modules=javafx.fxml,javafx.controls


## Bônus:
###<br>para vizualizar as provas passadas do github do prof de IP2 Leandro<br>
<p>Para passar do erro com janela de alerta relativo a "...UTF16..." (<kbd>ou 'boolean com.ibm.icu.text.UTF16.isSurrogate(char)' não lembro no momento</kbd>)basta ir no eclipse em janela/window > prefecias/preferences > java > Editor > mark occurrences e desabilitar: mark occurrences<p>
