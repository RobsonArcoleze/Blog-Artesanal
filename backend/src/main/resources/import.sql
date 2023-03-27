INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

insert into tb_post(id, title, body, img, url, user_id)
values(1, 
	   'Meu Primeiro Post',
	   'Lorem ipsum, dolor sit amet consectetur adipisicing elit. Consectetur ad quidem quas labore vel dolorum illo, quibusdam voluptatibus laudantium reiciendis, enim dolor doloribus doloremque aperiam nulla iure nam id laborum!',
	   'https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.shutterstock.com%2Fimage-photo%2Fmountains-under-mist-morning-amazing-260nw-1725825019.jpg&tbnid=ez-ubljHwN9MSM&vet=12ahUKEwiVrr62mPz9AhW0DdQKHbTEBOgQMygCegUIARCcAg..i&imgrefurl=https%3A%2F%2Fwww.shutterstock.com%2Fsearch%2Fnature&docid=m4H9nlxeVf5uvM&w=390&h=280&q=images&hl=pt-BR&ved=2ahUKEwiVrr62mPz9AhW0DdQKHbTEBOgQMygCegUIARCcAg',
	   'https://www.artesanalinvestimentos.com.br/',
	   1);

