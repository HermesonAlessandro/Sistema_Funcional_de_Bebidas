--
-- PostgreSQL database cluster dump
--

-- Started on 2024-11-04 01:18:38

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:SsYWr3LBAhDP/I58tEEPyA==$cPIVAV1mgIZHBiNDbizxdd4YhHU9cfbbaK/t5qiS3DI=:wPCl0gUAJ/6OcJz3ZpH1RgMq3JMGI1/MHt4w6QuZU+g=';

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

\connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2024-11-04 01:18:38

--
-- PostgreSQL database dump complete
--

--
-- Database "BDEmpresaHermeson" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4792 (class 1262 OID 16750)
-- Name: BDEmpresaHermeson; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "BDEmpresaHermeson" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE "BDEmpresaHermeson" OWNER TO postgres;

\connect "BDEmpresaHermeson"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16751)
-- Name: departamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.departamento (
    sigladepart character(2) NOT NULL,
    nomedepart character varying(30) NOT NULL,
    valororcamento real NOT NULL,
    nomegerente character varying(50)
);


ALTER TABLE public.departamento OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16756)
-- Name: empregado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empregado (
    matriculaemp character varying(10) NOT NULL,
    nomeemp character varying(50) NOT NULL,
    cargoemp character varying(20) NOT NULL,
    salarioemp real,
    email character varying(30),
    sigladep character(2)
);


ALTER TABLE public.empregado OWNER TO postgres;

--
-- TOC entry 4785 (class 0 OID 16751)
-- Dependencies: 215
-- Data for Name: departamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.departamento (sigladepart, nomedepart, valororcamento, nomegerente) FROM stdin;
\.


--
-- TOC entry 4786 (class 0 OID 16756)
-- Dependencies: 216
-- Data for Name: empregado; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empregado (matriculaemp, nomeemp, cargoemp, salarioemp, email, sigladep) FROM stdin;
\.


--
-- TOC entry 4638 (class 2606 OID 16755)
-- Name: departamento departamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.departamento
    ADD CONSTRAINT departamento_pkey PRIMARY KEY (sigladepart);


--
-- TOC entry 4640 (class 2606 OID 16760)
-- Name: empregado empregado_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empregado
    ADD CONSTRAINT empregado_pkey PRIMARY KEY (matriculaemp);


--
-- TOC entry 4641 (class 2606 OID 16761)
-- Name: empregado fk_sigla_dep; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empregado
    ADD CONSTRAINT fk_sigla_dep FOREIGN KEY (sigladep) REFERENCES public.departamento(sigladepart);


-- Completed on 2024-11-04 01:18:38

--
-- PostgreSQL database dump complete
--

--
-- Database "Sistema_Funcional_de_Bebidas" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4839 (class 1262 OID 16402)
-- Name: Sistema_Funcional_de_Bebidas; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Sistema_Funcional_de_Bebidas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE "Sistema_Funcional_de_Bebidas" OWNER TO postgres;

\connect "Sistema_Funcional_de_Bebidas"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16610)
-- Name: administrador; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.administrador (
    cod integer NOT NULL,
    nome character varying(100) NOT NULL,
    telefone bigint NOT NULL,
    categoria_tel character varying(30) NOT NULL,
    endereco character varying(100) NOT NULL,
    bairro character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    senha character varying(100) NOT NULL,
    sexo character(6) NOT NULL
);


ALTER TABLE public.administrador OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16609)
-- Name: administrador_cod_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.administrador_cod_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.administrador_cod_seq OWNER TO postgres;

--
-- TOC entry 4840 (class 0 OID 0)
-- Dependencies: 215
-- Name: administrador_cod_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.administrador_cod_seq OWNED BY public.administrador.cod;


--
-- TOC entry 220 (class 1259 OID 16767)
-- Name: bebida; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bebida (
    cod integer NOT NULL,
    cod_de_barras character varying(13) NOT NULL,
    descricao character varying(100) NOT NULL,
    marca character varying(50) NOT NULL,
    gp_mercadoria character varying(50) NOT NULL,
    t_do_item character varying(60) NOT NULL,
    q_estoque integer NOT NULL,
    v_unitario numeric(10,2) NOT NULL
);


ALTER TABLE public.bebida OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16766)
-- Name: bebida_cod_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.bebida_cod_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.bebida_cod_seq OWNER TO postgres;

--
-- TOC entry 4841 (class 0 OID 0)
-- Dependencies: 219
-- Name: bebida_cod_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bebida_cod_seq OWNED BY public.bebida.cod;


--
-- TOC entry 223 (class 1259 OID 16830)
-- Name: caixa; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.caixa (
    id_pedido integer NOT NULL,
    nome_produto_pedido character varying(100) NOT NULL,
    valor_total_pedido numeric(10,2) NOT NULL,
    pagamento character varying(25) NOT NULL
);


ALTER TABLE public.caixa OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16688)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    cpf character varying(14) NOT NULL,
    nome character varying(100) NOT NULL,
    d_nasc date NOT NULL,
    sexo character(6) NOT NULL,
    endereco character varying(100) NOT NULL,
    telefone bigint NOT NULL,
    email character varying(100) NOT NULL,
    senha character varying(100) NOT NULL,
    fk_rg_sec character varying(12) NOT NULL
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 16835)
-- Name: extrato; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.extrato (
    ext_id_pedido integer NOT NULL,
    ext_fk_cpf_cliente character varying(14) NOT NULL,
    ext_nome_cliente character varying(100) NOT NULL,
    ext_endereco_cliente character varying(100) NOT NULL,
    ext_telefone_cliente bigint NOT NULL,
    ext_email_cliente character varying(100) NOT NULL,
    ext_descricao_bebida character varying(100) NOT NULL,
    ext_cod_de_barras_bebida character varying(13) NOT NULL,
    ext_marca_bebida character varying(50) NOT NULL,
    ext_gp_mercadoria_bebida character varying(50) NOT NULL,
    ext_t_do_item_bebida character varying(50) NOT NULL,
    ext_q_estoque_bebida integer NOT NULL,
    ext_q_adquirida_do_pedido integer NOT NULL,
    ext_v_unitario_bebida numeric(10,2) NOT NULL,
    ext_v_total_pedido numeric(10,2) NOT NULL,
    ext_fk_cod_bebida integer NOT NULL,
    ext_status_pagamento character varying(30) NOT NULL
);


ALTER TABLE public.extrato OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16788)
-- Name: pedido; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pedido (
    id integer NOT NULL,
    fk_cpf_cliente character varying(14) NOT NULL,
    nome_cliente character varying(100) NOT NULL,
    endereco_cliente character varying(100) NOT NULL,
    telefone_cliente bigint NOT NULL,
    email_cliente character varying(100) NOT NULL,
    descricao_bebida character varying(100) NOT NULL,
    cod_de_barras_bebida character varying(13) NOT NULL,
    marca_bebida character varying(50) NOT NULL,
    gp_mercadoria_bebida character varying(50) NOT NULL,
    t_do_item_bebida character varying(60) NOT NULL,
    q_estoque_bebida integer NOT NULL,
    q_adquirida_do_pedido integer NOT NULL,
    v_unitario_bebida numeric(10,2) NOT NULL,
    v_total_pedido numeric(10,2) NOT NULL,
    fk_cod_bebida integer NOT NULL
);


ALTER TABLE public.pedido OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16787)
-- Name: pedido_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pedido_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.pedido_id_seq OWNER TO postgres;

--
-- TOC entry 4842 (class 0 OID 0)
-- Dependencies: 221
-- Name: pedido_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pedido_id_seq OWNED BY public.pedido.id;


--
-- TOC entry 217 (class 1259 OID 16618)
-- Name: secretaria; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.secretaria (
    rg character varying(12) NOT NULL,
    nome character varying(100) NOT NULL,
    d_nasc date NOT NULL,
    sexo character(20) NOT NULL,
    endereco character varying(100) NOT NULL,
    telefone bigint NOT NULL,
    email character varying(100) NOT NULL,
    senha character varying(100) NOT NULL,
    fk_cod_adm integer NOT NULL
);


ALTER TABLE public.secretaria OWNER TO postgres;

--
-- TOC entry 4660 (class 2604 OID 16613)
-- Name: administrador cod; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrador ALTER COLUMN cod SET DEFAULT nextval('public.administrador_cod_seq'::regclass);


--
-- TOC entry 4661 (class 2604 OID 16770)
-- Name: bebida cod; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bebida ALTER COLUMN cod SET DEFAULT nextval('public.bebida_cod_seq'::regclass);


--
-- TOC entry 4662 (class 2604 OID 16791)
-- Name: pedido id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pedido ALTER COLUMN id SET DEFAULT nextval('public.pedido_id_seq'::regclass);


--
-- TOC entry 4825 (class 0 OID 16610)
-- Dependencies: 216
-- Data for Name: administrador; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.administrador (cod, nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) FROM stdin;
25	Hermeson Alessandro	85989340868	Celular	dddfg	gdgdg	hermesonalessandro@gmail.com	1234567891	M     
\.


--
-- TOC entry 4829 (class 0 OID 16767)
-- Dependencies: 220
-- Data for Name: bebida; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.bebida (cod, cod_de_barras, descricao, marca, gp_mercadoria, t_do_item, q_estoque, v_unitario) FROM stdin;
22	2362839987526	Cidra de Maçã 50ml	Magners	Bebidas Fermentadas	Direto ao Cliente	198	9.80
20	9084468114647	Vinho Tinto Cabernet Sauvignon 1l	Miolo	Bebidas Fermentadas	Direto ao Cliente	0	45.90
34	4017437787525	Negroni 	Negroni	Coquetéis e Drinks	Direto ao Cliente	26	35.90
24	5230301859577	Whisky Scotch Single Malt  100ml	Glenfiddich	Bebidas Destiladas	Direto ao Cliente	49	220.50
30	5023673784195	Licor de Menta  	Peppermint Schnapps	Licores e Outras Bebidas	Direto ao Cliente	69	45.30
21	7489235473851	Saquê Junmai 2l	Hakutsuru	Bebidas Fermentadas	Direto ao Cliente	-1	38.70
28	7808226102437	Licor de Amêndoa  	Disaronno	Licores e Outras Bebidas	Direto ao Cliente	57	85.50
32	6203138576078	Mojito  	Cubano	Coquetéis e Drinks	Direto ao Cliente	59	22.50
27	0330865529173	Licor de Café  200ml	Kahlúa	Licores e Outras Bebidas	Direto ao Cliente	73	65.00
26	6537330363070	Gin	Tanqueray	Bebidas Destiladas	Direto ao Cliente	177	95.80
29	4703344899526	Licor de Laranja  	Cointreau	Licores e Outras Bebidas	Direto ao Cliente	96	90.20
23	2296871719887	Vodka 500ml	Absolut	Bebidas Destiladas	Direto ao Cliente	197	75.00
31	8404151165436	Margarita  	Tradicional	Coquetéis e Drinks	Direto ao Cliente	45	25.00
33	9999066502416	Piña Colada  	Piña Colada  	Coquetéis e Drinks	Direto ao Cliente	38	28.70
19	8995080565781	Cerveja IPA 500ml	BrewDog	Bebidas Fermentadas	Direto ao Cliente	46	12.50
25	5126816679464	Tequila Reposado  500ml	Jose Cuervo	Bebidas Destiladas	Direto ao Cliente	117	130.70
\.


--
-- TOC entry 4832 (class 0 OID 16830)
-- Dependencies: 223
-- Data for Name: caixa; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.caixa (id_pedido, nome_produto_pedido, valor_total_pedido, pagamento) FROM stdin;
54	Cidra de Maçã 50ml	9.80	Pago
55	Vodka 500ml	75.00	Pago
56	Licor de Laranja  	90.20	Pago
57	Cerveja IPA 500ml	12.50	Pago
58	Gin	95.80	Pago
59	Mojito  	22.50	Pago
60	Licor de Café  200ml	65.00	Pago
61	Gin	95.80	Pago
62	Licor de Laranja  	90.20	Pago
63	Vodka 500ml	75.00	Pago
64	Margarita  	125.00	Pago
65	Piña Colada  	28.70	Pago
66	Cerveja IPA 500ml	12.50	Pago
67	Tequila Reposado  500ml	130.70	Pago
68	Cidra de Maçã 50ml	9.80	Não pago
\.


--
-- TOC entry 4827 (class 0 OID 16688)
-- Dependencies: 218
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente (cpf, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_rg_sec) FROM stdin;
791.054.243-71	sasad	2000-10-05	M     	dfgdgfdgfd	85989340868	d@gmail.com	123456789	12345678910
666.582.413-68	bnvnvnv1	2006-06-05	M     	ghfhfhf	85989340868	f@gmail.com	123456789	12345678910
888.888.888-75	Hermeson Alessandro	2006-06-05	M     	fgfgf	85989340868	hermeson@gmail.com	147852369	12345678910
\.


--
-- TOC entry 4833 (class 0 OID 16835)
-- Dependencies: 224
-- Data for Name: extrato; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.extrato (ext_id_pedido, ext_fk_cpf_cliente, ext_nome_cliente, ext_endereco_cliente, ext_telefone_cliente, ext_email_cliente, ext_descricao_bebida, ext_cod_de_barras_bebida, ext_marca_bebida, ext_gp_mercadoria_bebida, ext_t_do_item_bebida, ext_q_estoque_bebida, ext_q_adquirida_do_pedido, ext_v_unitario_bebida, ext_v_total_pedido, ext_fk_cod_bebida, ext_status_pagamento) FROM stdin;
\.


--
-- TOC entry 4831 (class 0 OID 16788)
-- Dependencies: 222
-- Data for Name: pedido; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pedido (id, fk_cpf_cliente, nome_cliente, endereco_cliente, telefone_cliente, email_cliente, descricao_bebida, cod_de_barras_bebida, marca_bebida, gp_mercadoria_bebida, t_do_item_bebida, q_estoque_bebida, q_adquirida_do_pedido, v_unitario_bebida, v_total_pedido, fk_cod_bebida) FROM stdin;
54	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Cidra de Maçã 50ml	2362839987526	Magners	Bebidas Fermentadas	Direto ao Cliente	199	1	9.80	9.80	22
55	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Vodka 500ml	2296871719887	Absolut	Bebidas Destiladas	Direto ao Cliente	199	1	75.00	75.00	23
56	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Licor de Laranja  	4703344899526	Cointreau	Licores e Outras Bebidas	Direto ao Cliente	98	1	90.20	90.20	29
57	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Cerveja IPA 500ml	8995080565781	BrewDog	Bebidas Fermentadas	Direto ao Cliente	48	1	12.50	12.50	19
58	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Gin	6537330363070	Tanqueray	Bebidas Destiladas	Direto ao Cliente	179	1	95.80	95.80	26
59	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Mojito  	6203138576078	Cubano	Coquetéis e Drinks	Direto ao Cliente	60	1	22.50	22.50	32
60	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Licor de Café  200ml	0330865529173	Kahlúa	Licores e Outras Bebidas	Direto ao Cliente	74	1	65.00	65.00	27
61	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Gin	6537330363070	Tanqueray	Bebidas Destiladas	Direto ao Cliente	178	1	95.80	95.80	26
62	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Licor de Laranja  	4703344899526	Cointreau	Licores e Outras Bebidas	Direto ao Cliente	97	1	90.20	90.20	29
63	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Vodka 500ml	2296871719887	Absolut	Bebidas Destiladas	Direto ao Cliente	198	1	75.00	75.00	23
64	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Margarita  	8404151165436	Tradicional	Coquetéis e Drinks	Direto ao Cliente	50	5	25.00	125.00	31
65	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Piña Colada  	9999066502416	Piña Colada  	Coquetéis e Drinks	Direto ao Cliente	39	1	28.70	28.70	33
66	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Cerveja IPA 500ml	8995080565781	BrewDog	Bebidas Fermentadas	Direto ao Cliente	47	1	12.50	12.50	19
67	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Tequila Reposado  500ml	5126816679464	Jose Cuervo	Bebidas Destiladas	Direto ao Cliente	118	1	130.70	130.70	25
68	888.888.888-75	Hermeson Alessandro	fgfgf	85989340868	hermeson@gmail.com	Cidra de Maçã 50ml	2362839987526	Magners	Bebidas Fermentadas	Direto ao Cliente	198	1	9.80	9.80	22
\.


--
-- TOC entry 4826 (class 0 OID 16618)
-- Dependencies: 217
-- Data for Name: secretaria; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) FROM stdin;
12345678910	Hermeson Alessandro1	2006-06-20	M                   	dfgdgf	85989340868	hermesonalessandro@gmail.com	7894561231	25
\.


--
-- TOC entry 4843 (class 0 OID 0)
-- Dependencies: 215
-- Name: administrador_cod_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.administrador_cod_seq', 28, true);


--
-- TOC entry 4844 (class 0 OID 0)
-- Dependencies: 219
-- Name: bebida_cod_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bebida_cod_seq', 34, true);


--
-- TOC entry 4845 (class 0 OID 0)
-- Dependencies: 221
-- Name: pedido_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pedido_id_seq', 68, true);


--
-- TOC entry 4664 (class 2606 OID 16617)
-- Name: administrador administrador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (cod);


--
-- TOC entry 4670 (class 2606 OID 16772)
-- Name: bebida bebida_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bebida
    ADD CONSTRAINT bebida_pkey PRIMARY KEY (cod);


--
-- TOC entry 4674 (class 2606 OID 16834)
-- Name: caixa caixa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.caixa
    ADD CONSTRAINT caixa_pkey PRIMARY KEY (id_pedido);


--
-- TOC entry 4668 (class 2606 OID 16714)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cpf);


--
-- TOC entry 4676 (class 2606 OID 16841)
-- Name: extrato extrato_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.extrato
    ADD CONSTRAINT extrato_pkey PRIMARY KEY (ext_id_pedido);


--
-- TOC entry 4672 (class 2606 OID 16795)
-- Name: pedido pedido_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (id);


--
-- TOC entry 4666 (class 2606 OID 16703)
-- Name: secretaria secretaria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_pkey PRIMARY KEY (rg);


--
-- TOC entry 4679 (class 2606 OID 16796)
-- Name: pedido fk_cod_bebida; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fk_cod_bebida FOREIGN KEY (fk_cod_bebida) REFERENCES public.bebida(cod);


--
-- TOC entry 4680 (class 2606 OID 16801)
-- Name: pedido fk_cpf_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fk_cpf_cliente FOREIGN KEY (fk_cpf_cliente) REFERENCES public.cliente(cpf);


--
-- TOC entry 4678 (class 2606 OID 16708)
-- Name: cliente fk_rg_sec; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_rg_sec FOREIGN KEY (fk_rg_sec) REFERENCES public.secretaria(rg);


--
-- TOC entry 4677 (class 2606 OID 16623)
-- Name: secretaria secretaria_fk_cod_adm_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_fk_cod_adm_fkey FOREIGN KEY (fk_cod_adm) REFERENCES public.administrador(cod);


-- Completed on 2024-11-04 01:18:39

--
-- PostgreSQL database dump complete
--

--
-- Database "dbhermeson" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4796 (class 1262 OID 16720)
-- Name: dbhermeson; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE dbhermeson WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE dbhermeson OWNER TO postgres;

\connect dbhermeson

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16740)
-- Name: dependentes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.dependentes (
    cpfdep character(11) NOT NULL,
    nomedep character varying(90) NOT NULL,
    matriculadep integer NOT NULL
);


ALTER TABLE public.dependentes OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16721)
-- Name: empregados; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empregados (
    matremp integer NOT NULL,
    nomeemp character varying(90) NOT NULL,
    cpfem character(11) NOT NULL,
    emailemp character varying(50) NOT NULL,
    datanascemp date
);


ALTER TABLE public.empregados OWNER TO postgres;

--
-- TOC entry 4790 (class 0 OID 16740)
-- Dependencies: 216
-- Data for Name: dependentes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.dependentes (cpfdep, nomedep, matriculadep) FROM stdin;
\.


--
-- TOC entry 4789 (class 0 OID 16721)
-- Dependencies: 215
-- Data for Name: empregados; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empregados (matremp, nomeemp, cpfem, emailemp, datanascemp) FROM stdin;
\.


--
-- TOC entry 4644 (class 2606 OID 16744)
-- Name: dependentes dependentes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependentes
    ADD CONSTRAINT dependentes_pkey PRIMARY KEY (cpfdep);


--
-- TOC entry 4638 (class 2606 OID 16727)
-- Name: empregados empregados_cpfem_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empregados
    ADD CONSTRAINT empregados_cpfem_key UNIQUE (cpfem);


--
-- TOC entry 4640 (class 2606 OID 16729)
-- Name: empregados empregados_emailemp_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empregados
    ADD CONSTRAINT empregados_emailemp_key UNIQUE (emailemp);


--
-- TOC entry 4642 (class 2606 OID 16725)
-- Name: empregados empregados_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empregados
    ADD CONSTRAINT empregados_pkey PRIMARY KEY (matremp);


--
-- TOC entry 4645 (class 2606 OID 16745)
-- Name: dependentes dependentes_matriculadep_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependentes
    ADD CONSTRAINT dependentes_matriculadep_fkey FOREIGN KEY (matriculadep) REFERENCES public.empregados(matremp);


-- Completed on 2024-11-04 01:18:39

--
-- PostgreSQL database dump complete
--

--
-- Database "dbhermeson_1" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4784 (class 1262 OID 16806)
-- Name: dbhermeson_1; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE dbhermeson_1 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE dbhermeson_1 OWNER TO postgres;

\connect dbhermeson_1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16807)
-- Name: alunos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.alunos (
    matraluno integer NOT NULL,
    nomealuno character varying(90) NOT NULL,
    curso character varying(30) NOT NULL,
    cidade character varying(50) NOT NULL
);


ALTER TABLE public.alunos OWNER TO postgres;

--
-- TOC entry 4778 (class 0 OID 16807)
-- Dependencies: 215
-- Data for Name: alunos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.alunos (matraluno, nomealuno, curso, cidade) FROM stdin;
222	João	RC	Fortaleza
333	Pedro	CC	Caucaia
\.


--
-- TOC entry 4634 (class 2606 OID 16811)
-- Name: alunos alunos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.alunos
    ADD CONSTRAINT alunos_pkey PRIMARY KEY (matraluno);


-- Completed on 2024-11-04 01:18:39

--
-- PostgreSQL database dump complete
--

--
-- Database "dbhermeson_2" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4784 (class 1262 OID 16818)
-- Name: dbhermeson_2; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE dbhermeson_2 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE dbhermeson_2 OWNER TO postgres;

\connect dbhermeson_2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16819)
-- Name: funcionarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionarios (
    matricula integer NOT NULL,
    nome character varying(50) NOT NULL,
    sexo character(1) NOT NULL,
    cargo character varying(50) NOT NULL,
    salario real NOT NULL
);


ALTER TABLE public.funcionarios OWNER TO postgres;

--
-- TOC entry 4778 (class 0 OID 16819)
-- Dependencies: 215
-- Data for Name: funcionarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionarios (matricula, nome, sexo, cargo, salario) FROM stdin;
1011	Maria josé da Silva	F	analista	8000
1012	Eduardo Pereira Santos	M	gerente	10000
1013	José Ricardo Calvacante	M	desenvolvedor	5000
1014	Adriano Ribeiro Parente	M	desenvolvedor	5000
1015	Carlos Roberto Ferreira	M	dba	7000
1016	Ana Maria Souza	F	desenvolvedor	5000
\.


--
-- TOC entry 4634 (class 2606 OID 16823)
-- Name: funcionarios funcionarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_pkey PRIMARY KEY (matricula);


-- Completed on 2024-11-04 01:18:39

--
-- PostgreSQL database dump complete
--

--
-- Database "dbhermeson_3" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4794 (class 1262 OID 16842)
-- Name: dbhermeson_3; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE dbhermeson_3 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE dbhermeson_3 OWNER TO postgres;

\connect dbhermeson_3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16883)
-- Name: curso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.curso (
    codigocurso integer NOT NULL,
    nome character varying(90) NOT NULL,
    datacriacao date,
    codigonivel integer
);


ALTER TABLE public.curso OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16878)
-- Name: nivel; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.nivel (
    codigonivel integer NOT NULL,
    descricao character varying(90) NOT NULL
);


ALTER TABLE public.nivel OWNER TO postgres;

--
-- TOC entry 4788 (class 0 OID 16883)
-- Dependencies: 216
-- Data for Name: curso; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.curso (codigocurso, nome, datacriacao, codigonivel) FROM stdin;
1	Sistemas de Informação	1999-06-19	1
2	Medicina	1990-05-10	1
3	Nutrição	2012-02-19	\N
4	Pedagogia	1999-06-19	1
5	Saúde da Família	1999-09-10	3
6	Computacão Aplicada	1999-09-10	\N
\.


--
-- TOC entry 4787 (class 0 OID 16878)
-- Dependencies: 215
-- Data for Name: nivel; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.nivel (codigonivel, descricao) FROM stdin;
1	Graduação
2	Especialização
3	Mestrado
4	Doutorado
\.


--
-- TOC entry 4640 (class 2606 OID 16887)
-- Name: curso chavepcurso; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT chavepcurso PRIMARY KEY (codigocurso);


--
-- TOC entry 4638 (class 2606 OID 16882)
-- Name: nivel chavepnivel; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.nivel
    ADD CONSTRAINT chavepnivel PRIMARY KEY (codigonivel);


--
-- TOC entry 4642 (class 2606 OID 16889)
-- Name: curso curso_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT curso_nome_key UNIQUE (nome);


--
-- TOC entry 4643 (class 2606 OID 16890)
-- Name: curso curso_codigonivel_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT curso_codigonivel_fkey FOREIGN KEY (codigonivel) REFERENCES public.nivel(codigonivel);


-- Completed on 2024-11-04 01:18:39

--
-- PostgreSQL database dump complete
--

--
-- Database "empresahermesonalessandro" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4784 (class 1262 OID 16812)
-- Name: empresahermesonalessandro; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE empresahermesonalessandro WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE empresahermesonalessandro OWNER TO postgres;

\connect empresahermesonalessandro

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16813)
-- Name: produto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.produto (
    codprod integer NOT NULL,
    descricao character varying(40) NOT NULL,
    valorprod real NOT NULL,
    datacompra date
);


ALTER TABLE public.produto OWNER TO postgres;

--
-- TOC entry 4778 (class 0 OID 16813)
-- Dependencies: 215
-- Data for Name: produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.produto (codprod, descricao, valorprod, datacompra) FROM stdin;
1	caneta preta	5	2023-09-23
2	caneta azul	6	2022-12-13
3	lápis	4	2023-05-05
5	marca texto	10	2023-02-14
7	grampeador	8	2022-10-27
4	caderno 10 matérias	15	2023-09-29
8	cola bastão	9	2023-11-03
\.


--
-- TOC entry 4634 (class 2606 OID 16817)
-- Name: produto produto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (codprod);


-- Completed on 2024-11-04 01:18:40

--
-- PostgreSQL database dump complete
--

--
-- Database "empresahermesonalessandro_1" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4784 (class 1262 OID 16824)
-- Name: empresahermesonalessandro_1; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE empresahermesonalessandro_1 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE empresahermesonalessandro_1 OWNER TO postgres;

\connect empresahermesonalessandro_1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16825)
-- Name: funcionarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionarios (
    matricula integer NOT NULL,
    nome character varying(50) NOT NULL,
    depto integer NOT NULL,
    cargo character varying(30) NOT NULL,
    sexo character(1) NOT NULL,
    salario real NOT NULL
);


ALTER TABLE public.funcionarios OWNER TO postgres;

--
-- TOC entry 4778 (class 0 OID 16825)
-- Dependencies: 215
-- Data for Name: funcionarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionarios (matricula, nome, depto, cargo, sexo, salario) FROM stdin;
1000	Maria José da Silva	1	analista	F	2000
1010	Eduardo Ferreira	3	programador	M	1500
1050	José da Silva Santos	2	programador	M	1700
1080	Antonio da Silva	4	gerente	M	10000
1090	Adriano José Ribeiro	1	programador	M	1800
1120	João Carlos Barbosa	3	analista	M	2300
1200	Suzana Alves	2	gerente	F	5000
1270	Rubens Ferreira	3	Gerente	M	4000
1300	Joana Prado	2	programador	F	1500
1310	Guilherme Dias	1	gerente	M	3000
\.


--
-- TOC entry 4634 (class 2606 OID 16829)
-- Name: funcionarios funcionarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_pkey PRIMARY KEY (matricula);


-- Completed on 2024-11-04 01:18:40

--
-- PostgreSQL database dump complete
--

--
-- Database "museu" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4840 (class 1262 OID 16895)
-- Name: museu; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE museu WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE museu OWNER TO postgres;

\connect museu

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16911)
-- Name: alocacoes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.alocacoes (
    hora_entrada character(5),
    hora_saida character(5),
    numero integer NOT NULL,
    cpf character(11) NOT NULL
);


ALTER TABLE public.alocacoes OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16921)
-- Name: autores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.autores (
    codigo integer NOT NULL,
    nome character varying(50),
    nacionalidade character varying(50)
);


ALTER TABLE public.autores OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16901)
-- Name: esculturas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.esculturas (
    material character varying(30),
    peso numeric(6,2),
    altura numeric(5,2),
    codigo integer NOT NULL
);


ALTER TABLE public.esculturas OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16931)
-- Name: funcionarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionarios (
    turno character(1),
    funcao character varying(20),
    nome character varying(50),
    salario numeric(7,2),
    cpf character(11) NOT NULL
);


ALTER TABLE public.funcionarios OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16906)
-- Name: obras; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.obras (
    codigo integer NOT NULL,
    titulo character varying(50),
    ano integer,
    salao integer,
    autor integer
);


ALTER TABLE public.obras OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16896)
-- Name: pinturas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pinturas (
    estilo character varying(30),
    area numeric(5,2),
    codigo integer NOT NULL
);


ALTER TABLE public.pinturas OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16916)
-- Name: saloes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.saloes (
    area numeric(5,2),
    andar integer,
    numero integer NOT NULL
);


ALTER TABLE public.saloes OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16926)
-- Name: turnos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.turnos (
    codturno character(1) NOT NULL,
    nometurno character varying(5)
);


ALTER TABLE public.turnos OWNER TO postgres;

--
-- TOC entry 4830 (class 0 OID 16911)
-- Dependencies: 218
-- Data for Name: alocacoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.alocacoes (hora_entrada, hora_saida, numero, cpf) FROM stdin;
13:00	14:00	43	78809986598
15:00	16:00	47	78809986598
1000 	1100 	43	34567809238
1000 	1100 	47	09876543229
1300 	1400 	38	34567809238
1400 	1500 	36	01234566737
1500 	1600 	24	01234566737
17:00	18:00	51	78809986598
13:00	14:00	51	38942178472
13:00	14:00	51	78905416276
16:00	17:00	24	38942178472
16:00	17:00	24	66655544477
15:00	17:00	47	78905416276
14:00	17:00	47	66789403264
12:00	14:00	36	66655544477
12:00	13:00	36	66789403264
12:00	18:00	28	41034567799
13:00	14:00	28	66789403264
\.


--
-- TOC entry 4832 (class 0 OID 16921)
-- Dependencies: 220
-- Data for Name: autores; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.autores (codigo, nome, nacionalidade) FROM stdin;
101	PABLO PICASSO	ESPANHOLA
102	SALVADOR DALI	ESPANHOLA
103	PINTOR BRASILEIRO	BRASILEIRA
104	ESCULTOR BRASILEIRO	BRASILEIRA
105	PINT E ESCULT BRASILEIRO	BRASILEIRA
106	PINT E ESCULTOR FRANCES	FRANCESA
107	ESCULTOR  FRANCES	FRANCESA
108	PINTOR HOLANDES	HOLANDESA
109	AUTOR SEM OBRA	BOLIVIANA
\.


--
-- TOC entry 4828 (class 0 OID 16901)
-- Dependencies: 216
-- Data for Name: esculturas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.esculturas (material, peso, altura, codigo) FROM stdin;
ARGILA	20.00	1.00	103
BRONZE	600.00	3.00	104
FERRO	120.00	2.00	108
AÇO	300.00	1.00	111
PEDRA	500.00	2.00	115
MARMORE	150.00	2.00	112
\.


--
-- TOC entry 4834 (class 0 OID 16931)
-- Dependencies: 222
-- Data for Name: funcionarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionarios (turno, funcao, nome, salario, cpf) FROM stdin;
T	SEGURANÇA	SEG5	1000.00	41034567799
M	SEGURANÇA	SEG1	1000.00	38942178472
M	SEGURANÇA	SEG2	2000.00	78905416276
T	SEGURANÇA	SEG3	1000.00	66655544477
T	SEGURANÇA	SEG4	2000.00	66789403264
M	FAXINEIRO	FAX1	1000.00	34567809238
T	FAXINEIRO	FAX2	1000.00	09876543229
T	FAXINEIRO	FAX3	1000.00	01234566737
T	FAXINEIRO	FAX4	1000.00	78809986598
\.


--
-- TOC entry 4829 (class 0 OID 16906)
-- Dependencies: 217
-- Data for Name: obras; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.obras (codigo, titulo, ano, salao, autor) FROM stdin;
101	PINTURA DALI 1	1967	36	102
102	PINTURA DALI 2	1945	43	102
103	ESCULTURA DALI 1	1960	24	102
104	ESCULTURA DALI 2	1966	36	102
105	PINTURA PICASSO 1	1969	47	101
106	PINTURA PICASSO 2	1975	51	101
107	PINTURA PICASSO 3	1945	38	101
108	ESCULTURA SO ESCULTOR BRASILEIRO	1999	38	104
109	PINTURA SO PINTOR BRASILEIRO	1967	43	103
110	PINTURA PINT E ECULT BRAS	1969	47	105
111	ESCULTURA PINT E ESCULT BRAS	1951	24	105
112	ESCULTURA FRANCES	1943	51	107
113	PINTURA HOLANDES	1876	36	108
114	PINTURA PINT E ESCUL FRANCES	1888	38	106
115	ESCULTURA PINT E ESCUL FRANCES	1867	36	106
\.


--
-- TOC entry 4827 (class 0 OID 16896)
-- Dependencies: 215
-- Data for Name: pinturas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pinturas (estilo, area, codigo) FROM stdin;
IMPRESSIONISTA	2.00	101
EXPRESSIONISTA	1.00	102
IMPRESSIONISTA	3.00	105
CUBISTA	6.00	106
CHATISTA	1.00	107
TROPICALISTA	5.00	109
BOLISTA	6.00	110
LEITISTA	3.00	113
QUEIJISTA	2.00	114
\.


--
-- TOC entry 4831 (class 0 OID 16916)
-- Dependencies: 219
-- Data for Name: saloes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.saloes (area, andar, numero) FROM stdin;
200.00	2	24
100.00	3	36
80.00	3	38
60.00	4	43
50.00	4	47
80.00	5	51
67.00	2	28
\N	1	11
\.


--
-- TOC entry 4833 (class 0 OID 16926)
-- Dependencies: 221
-- Data for Name: turnos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.turnos (codturno, nometurno) FROM stdin;
M	MANHÃ
T	TARDE
N	NOITE
\.


--
-- TOC entry 4668 (class 2606 OID 16915)
-- Name: alocacoes alocacoes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.alocacoes
    ADD CONSTRAINT alocacoes_pkey PRIMARY KEY (numero, cpf);


--
-- TOC entry 4672 (class 2606 OID 16925)
-- Name: autores autores_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.autores
    ADD CONSTRAINT autores_pkey PRIMARY KEY (codigo);


--
-- TOC entry 4664 (class 2606 OID 16905)
-- Name: esculturas esculturas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.esculturas
    ADD CONSTRAINT esculturas_pkey PRIMARY KEY (codigo);


--
-- TOC entry 4676 (class 2606 OID 16935)
-- Name: funcionarios funcionarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_pkey PRIMARY KEY (cpf);


--
-- TOC entry 4666 (class 2606 OID 16910)
-- Name: obras obras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obras
    ADD CONSTRAINT obras_pkey PRIMARY KEY (codigo);


--
-- TOC entry 4662 (class 2606 OID 16900)
-- Name: pinturas pinturas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pinturas
    ADD CONSTRAINT pinturas_pkey PRIMARY KEY (codigo);


--
-- TOC entry 4670 (class 2606 OID 16920)
-- Name: saloes saloes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saloes
    ADD CONSTRAINT saloes_pkey PRIMARY KEY (numero);


--
-- TOC entry 4674 (class 2606 OID 16930)
-- Name: turnos turnos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.turnos
    ADD CONSTRAINT turnos_pkey PRIMARY KEY (codturno);


--
-- TOC entry 4681 (class 2606 OID 16961)
-- Name: alocacoes alocacoes_cpf_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.alocacoes
    ADD CONSTRAINT alocacoes_cpf_fkey FOREIGN KEY (cpf) REFERENCES public.funcionarios(cpf);


--
-- TOC entry 4682 (class 2606 OID 16956)
-- Name: alocacoes alocacoes_numero_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.alocacoes
    ADD CONSTRAINT alocacoes_numero_fkey FOREIGN KEY (numero) REFERENCES public.saloes(numero);


--
-- TOC entry 4678 (class 2606 OID 16941)
-- Name: esculturas esculturas_codigo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.esculturas
    ADD CONSTRAINT esculturas_codigo_fkey FOREIGN KEY (codigo) REFERENCES public.obras(codigo);


--
-- TOC entry 4683 (class 2606 OID 16966)
-- Name: funcionarios funcionarios_turno_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_turno_fkey FOREIGN KEY (turno) REFERENCES public.turnos(codturno);


--
-- TOC entry 4679 (class 2606 OID 16951)
-- Name: obras obras_autor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obras
    ADD CONSTRAINT obras_autor_fkey FOREIGN KEY (autor) REFERENCES public.autores(codigo);


--
-- TOC entry 4680 (class 2606 OID 16946)
-- Name: obras obras_salao_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obras
    ADD CONSTRAINT obras_salao_fkey FOREIGN KEY (salao) REFERENCES public.saloes(numero);


--
-- TOC entry 4677 (class 2606 OID 16936)
-- Name: pinturas pinturas_codigo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pinturas
    ADD CONSTRAINT pinturas_codigo_fkey FOREIGN KEY (codigo) REFERENCES public.obras(codigo);


-- Completed on 2024-11-04 01:18:40

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

\connect postgres

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-11-04 01:18:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 4778 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


-- Completed on 2024-11-04 01:18:41

--
-- PostgreSQL database dump complete
--

-- Completed on 2024-11-04 01:18:41

--
-- PostgreSQL database cluster dump complete
--

