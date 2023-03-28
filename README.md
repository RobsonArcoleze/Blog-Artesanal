# Blog-Artesanal

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 


Blog-Artesanal é uma API RestFull construida durante o processo seletivo da empresa Artesanal Investimentos, para a vaga de estagiário de desenvolvimento.

O Desafio pedia os seguintes requesitos: 

- Código versionado em repositório GIT

- Java versão 11 ou superior

- Spring Boot

- Banco de Dados Postgresql

- API Restful

- Maven

- Angular

- Arquivo README informando os passos necessários para execução da aplicação.

Deverão ser construídas interfaces Web e APIs de forma a suportar as seguintes operações:

 

**Segurança**

Permitir o cadastro de usuários e login com autenticação via token JWT.

**Post**

Permitir o cadastro e consulta de posts com texto, imagens e links.
Apenas o criador do post poderá ter permissão para excluí-lo.

**Comentários**

Suportar a adição e exclusão de comentários em posts. Os posts
poderão ser visíveis a todos os usuários. Apenas o criador do comentário poderá ter permissão para excluí-lo.

**Fotos**

Permitir a criação de álbuns de fotos. As fotos dos álbuns poderão ser visíveis a todos os usuários. Apenas o dono de um álbum poderá excluí-lo.



# O que foi desenvolvido

- O CRUD de Usuários foi desenvolvido perfeitamente, sem apresentar erros, com autenticação via JWT e refresh token;

- O CRUD de Posts foi desenvolvido em partes, pois não consegui associar o usuário com o post, sendo necessário adcionar o autor via json, contudo é possivel realizar uma busca paginada de posts com os seus comentários;

- O Crud de comentarios, foi desenvolvido até a camada service com alguns endpoints na camada resource, porém não consegui concluir toda a codificação no prazo estabelecido;

- O CRUD de fotos também não foi desenvolvido por conta do prazo;

# Como usar

## Backend

- Java 11+
- Windows, mac ou Linux;
- Clonar o repositório ``` git@github.com:RobsonArcoleze/Blog-Artesanal.git ``` 
- Abrir o projeto na IDE de sua Preferência
- Database: Foi usado o postgreSQL para persistência desta API, a porta padrão é a 5432, porém no projeto está sendo utilizado a 5433, pois para fins didáticos mudei a porta no meu container Docker. Caso use a padrão te aconselho a entrar no arquivo ```application-dev.properties``` e colocar a porta 5432.

Além desta questão, caso queira utilizar esse database, será necessário criar um banco com o nome ```blog ``` e configura-lo corretamente no arquivo application-dev.properties.

É necessario apenas criar o banco, não precisa se preocupar com as tabelas, a aplicação fará isto automaticamente.

- Para testar é aconselhável utilizar o postman utilizando corretamente o verbos HTTP. Os endpoints estão mapeados na camada resource.

**Json para usuários**
Obs: Um usuário pode ter mais de uma Role
```
{
  "name": "Robson",
  "email": "robson@gmail.com",
  "password": "123456",
  "roles": [
    {
      "id": 1
    }
  ]
}
```

**Json para Posts**
```
{
    "title": "Post Maira",
    "body": "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Consectetur ad quidem quas labore vel dolorum illo, quibusdam voluptatibus laudantium reiciendis, enim dolor doloribus doloremque aperiam nulla iure nam id laborum!",
    "img": "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.shutterstock.com%2Fimage-photo%2Fmountains-under-mist-morning-amazing-260nw-1725825019.jpg&tbnid=ez-ubljHwN9MSM&vet=12ahUKEwiVrr62mPz9AhW0DdQKHbTEBOgQMygCegUIARCcAg..i&imgrefurl=https%3A%2F%2Fwww.shutterstock.com%2Fsearch%2Fnature&docid=m4H9nlxeVf5uvM&w=390&h=280&q=images&hl=pt-BR&ved=2ahUKEwiVrr62mPz9AhW0DdQKHbTEBOgQMygCegUIARCcAg",
    "url": "https://www.artesanalinvestimentos.com.br/",
    "author": 2
}
```

## FrontEnd

No fontend foi pedido para construir uma interface web em Angular; com toda a sincerida confesso que, ainda não aprendi esta tecnologia, ela está na minha lista de estudo. Resumindo o frontEnd não foi construido, sinto muito.


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot / Data / Security
- JPA / Hibernate
- Maven
- OAuth2
- JWT
- PostgreSQL

# Conclusão

Em minhas palavras confeso que adorei o desafio, programar é minha paixão e espero fazer isto pelo resto da vida. O código em certos momentos me desafiou ao extremo, virei a noite codificando, e achei isso prazeroso. Espero que todo o esfoço que tive e levando em consideração o tempo, esta APi seja avaliada com carinho, pois o meu sonho é ser desenvolvedor professional.


# Autor

Robson de Oliveira Arcoleze

https://www.linkedin.com/in/robsonarcoleze/
