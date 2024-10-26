INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60031, 'João da Silva', 'joao.silva@email.com', '71991234567', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60032, 'Maria dos Santos', 'maria.santos@email.com', '71999876543', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60033, 'Carlos Oliveira', 'carlos.oliveira@email.com', '71991231234', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60034, 'Ana Mendes', 'ana.mendes@email.com', '71992345678', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60035, 'Pedro Souza', 'pedro.souza@email.com', '71994567890', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60036, 'Juliana Lima', 'juliana.lima@email.com', '71993456789', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60037, 'Fernando Alves', 'fernando.alves@email.com', '71995678901', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60038, 'Amanda Costa', 'amanda.costa@email.com', '71996789012', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60039, 'Ricardo Pereira', 'ricardo.pereira@email.com', '71997890123', '2024-10-25 17:21:30.017');
INSERT INTO public.customers
(customers_id, "name", email, phone, created_at)
VALUES(60040, 'Laura Rodrigues', 'laura.rodrigues@email.com', '71998901234', '2024-10-25 17:21:30.017');



INSERT INTO products (id, name, description, price, stock, created_at) VALUES
(70001, 'Celular', 'Smartphone com câmera de alta resolução', 1500.00, 50, '2024-10-25 17:21:30.017'),
(70002, 'Notebook', 'Notebook com 8GB RAM e 256GB SSD', 3000.00, 20, '2024-10-25 17:21:30.017'),
(70003, 'Geladeira', 'Geladeira frost-free 350L', 2200.00, 15, '2024-10-25 17:21:30.017'),
(70004, 'Fogão', 'Fogão 5 bocas com forno elétrico', 1200.00, 30, '2024-10-25 17:21:30.017'),
(70005, 'TV 4K', 'Televisão 4K de 55 polegadas', 2500.00, 25, '2024-10-25 17:21:30.017'),
(70006, 'Micro-ondas', 'Micro-ondas 25L', 400.00, 40, '2024-10-25 17:21:30.017'),
(70007, 'Máquina de lavar', 'Máquina de lavar roupa 10kg', 1600.00, 10, '2024-10-25 17:21:30.017'),
(70008, 'Cafeteira', 'Cafeteira de cápsulas', 300.00, 60, '2024-10-25 17:21:30.017'),
(70009, 'Ventilador', 'Ventilador de mesa 30cm', 120.00, 80, '2024-10-25 17:21:30.017'),
(70010, 'Ar-condicionado', 'Ar-condicionado 9000 BTUs', 1800.00, 18, '2024-10-25 17:21:30.017');


INSERT INTO categories (id, name, description) VALUES
(80001, 'Eletrônicos', 'Produtos eletrônicos diversos'),
(80002, 'Eletrodomésticos', 'Aparelhos para uso doméstico'),
(80003, 'Móveis', 'Móveis para casa e escritório'),
(80004, 'Escritório', 'Produtos para uso em escritório'),
(80005, 'Esportes', 'Itens para prática esportiva'),
(80006, 'Saúde e Beleza', 'Cuidados pessoais e beleza'),
(80007, 'Ferramentas', 'Ferramentas para reparos e construção'),
(80008, 'Brinquedos', 'Brinquedos e jogos'),
(80009, 'Vestuário', 'Roupas e acessórios'),
(80010, 'Alimentos e Bebidas', 'Produtos de consumo');


INSERT INTO product_categories (product_id, category_id) VALUES
(70001, 80001), (70002, 80001), (70003, 80002), (70004, 80002), (70005, 80001),
(70006, 80002), (70007, 80002), (70008, 80002), (70009, 80001), (70010, 80002);


INSERT INTO orders (id, customer_id, total, status, created_at) VALUES
(90001, 60031, 2000.00, 'COMPLETED', '2024-10-25 17:21:30.017'),
(90002, 60032, 450.00, 'PENDING', '2024-10-25 17:21:30.017'),
(90003, 60033, 700.50, 'CANCELLED', '2024-10-25 17:21:30.017'),
(90004, 60034, 300.00, 'COMPLETED', '2024-10-25 17:21:30.017'),
(90005, 60035, 1600.00, 'PENDING', '2024-10-25 17:21:30.017'),
(90006, 60036, 980.00, 'COMPLETED', '2024-10-25 17:21:30.017'),
(90007, 60037, 210.00, 'CANCELLED', '2024-10-25 17:21:30.017'),
(90008, 60038, 750.00, 'PENDING', '2024-10-25 17:21:30.017'),
(90009, 60039, 630.00, 'COMPLETED', '2024-10-25 17:21:30.017'),
(90010, 60040, 480.00, 'PENDING', '2024-10-25 17:21:30.017');



INSERT INTO order_items (id, order_id, product_id, quantity, price) VALUES
(100001, 90001, 70001, 2, 1500.00),
(100002, 90001, 70002, 1, 3000.00),
(100003, 90002, 70003, 1, 450.00),
(100004, 90003, 70004, 2, 1200.00),
(100005, 90004, 70005, 1, 2500.00),
(100006, 90005, 70006, 3, 400.00),
(100007, 90006, 70007, 1, 1600.00),
(100008, 90007, 70008, 1, 300.00),
(100009, 90008, 70009, 3, 120.00),
(100010, 90009, 70010, 2, 1800.00);



INSERT INTO payments (id, order_id, amount, payment_method, status, payment_date) VALUES
(110001, 90001, 2000.00, 'Cartão', 'COMPLETED', '2024-10-25 17:21:30.017'),
(110002, 90002, 450.00, 'PIX', 'PENDING', '2024-10-25 17:21:30.017'),
(110003, 90003, 700.50, 'Boleto', 'CANCELLED', '2024-10-25 17:21:30.017'),
(110004, 90004, 300.00, 'Cartão', 'COMPLETED', '2024-10-25 17:21:30.017'),
(110005, 90005, 1600.00, 'PIX', 'PENDING', '2024-10-25 17:21:30.017'),
(110006, 90006, 980.00, 'Boleto', 'COMPLETED', '2024-10-25 17:21:30.017'),
(110007, 90007, 210.00, 'Cartão', 'CANCELLED', '2024-10-25 17:21:30.017'),
(110008, 90008, 750.00, 'PIX', 'PENDING', '2024-10-25 17:21:30.017'),
(110009, 90009, 630.00, 'Cartão', 'COMPLETED', '2024-10-25 17:21:30.017'),
(110010, 90010, 480.00, 'PIX', 'PENDING', '2024-10-25 17:21:30.017');



INSERT INTO shipping (id, order_id, address, shipping_method, status, shipping_date, delivery_date) VALUES
(120001, 90001, 'Rua A, 123, Salvador - BA', 'CORREIOS', 'DELIVERED', '2024-10-25 17:21:30.017', '2024-10-27 10:00:00.000'),
(120002, 90002, 'Av. B, 456, Salvador - BA', 'SEDEX', 'PENDING', '2024-10-25 17:21:30.017', NULL),
(120003, 90003, 'Rua C, 789, Lauro de Freitas - BA', 'TRANSPORTADORA', 'CANCELLED', '2024-10-25 17:21:30.017', NULL),
(120004, 90004, 'Rua D, 101, Salvador - BA', 'CORREIOS', 'SHIPPED', '2024-10-25 17:21:30.017', NULL),
(120005, 90005, 'Av. E, 202, Camaçari - BA', 'SEDEX', 'PENDING', '2024-10-25 17:21:30.017', NULL),
(120006, 90006, 'Rua F, 303, Feira de Santana - BA', 'CORREIOS', 'DELIVERED', '2024-10-25 17:21:30.017', '2024-10-28 14:30:00.000'),
(120007, 90007, 'Av. G, 404, Salvador - BA', 'TRANSPORTADORA', 'CANCELLED', '2024-10-25 17:21:30.017', NULL),
(120008, 90008, 'Rua H, 505, Vitória da Conquista - BA', 'SEDEX', 'SHIPPED', '2024-10-25 17:21:30.017', NULL),
(120009, 90009, 'Av. I, 606, Itabuna - BA', 'CORREIOS', 'DELIVERED', '2024-10-25 17:21:30.017', '2024-10-29 11:45:00.000'),
(120010, 90010, 'Rua J, 707, Barreiras - BA', 'TRANSPORTADORA', 'PENDING', '2024-10-25 17:21:30.017', NULL);




