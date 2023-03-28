# Alura
Este programa foi desenvolvido com o objetivo de utilizar a API do aplicativo IMDB (Aplicativo de gestão de filmes exibidos), para mostrar quais são 
os melhores filmes, conforme a sua classificação, eleito pelos usuários da plataforma.
O programa faz a chamada do servidor onde se encontraPI do aplicativo, através do objeto (HttpClient).
Em seguida o programa faz um request (HttpRequest), solicitando ao servidor do aplicativo IMDB, os dados as serem consultados, através do link passado, ou seja https://
Com o objeto (HttpResponse) o programa recebe as informações solicitadas ao servidor detentora da aplicação IMDB.
Em seguida o programa exibe os dados solicitados por ordem de melhor filme, segundo a preferência do usuário da plataforma IMDB.
