--
-- PostgreSQL database cluster dump
--

-- Started on 2024-10-09 14:06:12

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

-- Started on 2024-10-09 14:06:12

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

-- Completed on 2024-10-09 14:06:12

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

-- Started on 2024-10-09 14:06:12

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


-- Completed on 2024-10-09 14:06:12

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

-- Started on 2024-10-09 14:06:12

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
-- TOC entry 4813 (class 1262 OID 16402)
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
-- TOC entry 4814 (class 0 OID 0)
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
-- TOC entry 4815 (class 0 OID 0)
-- Dependencies: 219
-- Name: bebida_cod_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bebida_cod_seq OWNED BY public.bebida.cod;


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
-- TOC entry 4647 (class 2604 OID 16613)
-- Name: administrador cod; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrador ALTER COLUMN cod SET DEFAULT nextval('public.administrador_cod_seq'::regclass);


--
-- TOC entry 4648 (class 2604 OID 16770)
-- Name: bebida cod; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bebida ALTER COLUMN cod SET DEFAULT nextval('public.bebida_cod_seq'::regclass);


--
-- TOC entry 4803 (class 0 OID 16610)
-- Dependencies: 216
-- Data for Name: administrador; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.administrador (cod, nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) FROM stdin;
25	Hermeson Alessandro	85989340868	Celular	dddfg	gdgdg	hermesonalessandro@gmail.com	1234567891	M     
\.


--
-- TOC entry 4807 (class 0 OID 16767)
-- Dependencies: 220
-- Data for Name: bebida; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.bebida (cod, cod_de_barras, descricao, marca, gp_mercadoria, t_do_item, q_estoque, v_unitario) FROM stdin;
12	9032705781179	skol 1000ml	skol	Bebidas Fermentadas	Direto ao Cliente	50	5.80
13	3212170411675	Licor 43 (Cuarenta y Tres) 700 ml	Licor	Bebidas Fermentadas	Direto ao Cliente	50	10.00
14	3196989511551	Whisky Jack Daniel's 1000 ml	Whisky	Bebidas Destiladas	Revenda	10000	5.80
\.


--
-- TOC entry 4805 (class 0 OID 16688)
-- Dependencies: 218
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente (cpf, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_rg_sec) FROM stdin;
791.054.243-71	sasad	2000-10-05	M     	dfgdgfdgfd	85989340868	d@gmail.com	123456789	12345678910
666.582.413-68	bnvnvnv1	2006-06-05	M     	ghfhfhf	85989340868	f@gmail.com	123456789	12345678910
\.


--
-- TOC entry 4804 (class 0 OID 16618)
-- Dependencies: 217
-- Data for Name: secretaria; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) FROM stdin;
12345678910	Hermeson Alessandro1	2006-06-20	M                   	dfgdgf	85989340868	hermesonalessandro@gmail.com	7894561231	25
\.


--
-- TOC entry 4816 (class 0 OID 0)
-- Dependencies: 215
-- Name: administrador_cod_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.administrador_cod_seq', 28, true);


--
-- TOC entry 4817 (class 0 OID 0)
-- Dependencies: 219
-- Name: bebida_cod_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bebida_cod_seq', 14, true);


--
-- TOC entry 4650 (class 2606 OID 16617)
-- Name: administrador administrador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (cod);


--
-- TOC entry 4656 (class 2606 OID 16772)
-- Name: bebida bebida_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bebida
    ADD CONSTRAINT bebida_pkey PRIMARY KEY (cod);


--
-- TOC entry 4654 (class 2606 OID 16714)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cpf);


--
-- TOC entry 4652 (class 2606 OID 16703)
-- Name: secretaria secretaria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_pkey PRIMARY KEY (rg);


--
-- TOC entry 4658 (class 2606 OID 16708)
-- Name: cliente fk_rg_sec; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_rg_sec FOREIGN KEY (fk_rg_sec) REFERENCES public.secretaria(rg);


--
-- TOC entry 4657 (class 2606 OID 16623)
-- Name: secretaria secretaria_fk_cod_adm_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_fk_cod_adm_fkey FOREIGN KEY (fk_cod_adm) REFERENCES public.administrador(cod);


-- Completed on 2024-10-09 14:06:13

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

-- Started on 2024-10-09 14:06:13

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


-- Completed on 2024-10-09 14:06:13

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

-- Started on 2024-10-09 14:06:13

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


-- Completed on 2024-10-09 14:06:13

--
-- PostgreSQL database dump complete
--

-- Completed on 2024-10-09 14:06:13

--
-- PostgreSQL database cluster dump complete
--

