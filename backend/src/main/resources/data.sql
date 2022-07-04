INSERT INTO tb_user (email, password) VALUES ('ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (email, password) VALUES ('bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_team(name) VALUES ('Sales');
INSERT INTO tb_team(name) VALUES ('Management');
INSERT INTO tb_team(name) VALUES ('Training');

INSERT INTO tb_seller(name, email, team_id) VALUES ('Maria', 'maria@gmail.com', 1);
INSERT INTO tb_seller(name, email, team_id) VALUES ('Ana', 'ana@gmail.com', 2);
INSERT INTO tb_seller(name, email, team_id) VALUES ('Bob', 'bob@gmail.com', 1);
