PGDMP  9            	    	    |            Sistema_Funcional_de_Bebidas    16.4    16.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16402    Sistema_Funcional_de_Bebidas    DATABASE     �   CREATE DATABASE "Sistema_Funcional_de_Bebidas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
 .   DROP DATABASE "Sistema_Funcional_de_Bebidas";
                postgres    false            �            1259    16610    administrador    TABLE     �  CREATE TABLE public.administrador (
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
 !   DROP TABLE public.administrador;
       public         heap    postgres    false            �            1259    16609    administrador_cod_seq    SEQUENCE     �   CREATE SEQUENCE public.administrador_cod_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.administrador_cod_seq;
       public          postgres    false    216            �           0    0    administrador_cod_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.administrador_cod_seq OWNED BY public.administrador.cod;
          public          postgres    false    215            �            1259    16767    bebida    TABLE     k  CREATE TABLE public.bebida (
    cod integer NOT NULL,
    cod_de_barras character varying(13) NOT NULL,
    descricao character varying(100) NOT NULL,
    marca character varying(50) NOT NULL,
    gp_mercadoria character varying(50) NOT NULL,
    t_do_item character varying(60) NOT NULL,
    q_estoque integer NOT NULL,
    v_unitario numeric(10,2) NOT NULL
);
    DROP TABLE public.bebida;
       public         heap    postgres    false            �            1259    16766    bebida_cod_seq    SEQUENCE     �   CREATE SEQUENCE public.bebida_cod_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.bebida_cod_seq;
       public          postgres    false    220            �           0    0    bebida_cod_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.bebida_cod_seq OWNED BY public.bebida.cod;
          public          postgres    false    219            �            1259    16688    cliente    TABLE     |  CREATE TABLE public.cliente (
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
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    16618 
   secretaria    TABLE     r  CREATE TABLE public.secretaria (
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
    DROP TABLE public.secretaria;
       public         heap    postgres    false            '           2604    16613    administrador cod    DEFAULT     v   ALTER TABLE ONLY public.administrador ALTER COLUMN cod SET DEFAULT nextval('public.administrador_cod_seq'::regclass);
 @   ALTER TABLE public.administrador ALTER COLUMN cod DROP DEFAULT;
       public          postgres    false    216    215    216            (           2604    16770 
   bebida cod    DEFAULT     h   ALTER TABLE ONLY public.bebida ALTER COLUMN cod SET DEFAULT nextval('public.bebida_cod_seq'::regclass);
 9   ALTER TABLE public.bebida ALTER COLUMN cod DROP DEFAULT;
       public          postgres    false    219    220    220            �          0    16610    administrador 
   TABLE DATA           q   COPY public.administrador (cod, nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) FROM stdin;
    public          postgres    false    216   c        �          0    16767    bebida 
   TABLE DATA           w   COPY public.bebida (cod, cod_de_barras, descricao, marca, gp_mercadoria, t_do_item, q_estoque, v_unitario) FROM stdin;
    public          postgres    false    220   �        �          0    16688    cliente 
   TABLE DATA           g   COPY public.cliente (cpf, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_rg_sec) FROM stdin;
    public          postgres    false    218   �!       �          0    16618 
   secretaria 
   TABLE DATA           j   COPY public.secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) FROM stdin;
    public          postgres    false    217   0"       �           0    0    administrador_cod_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.administrador_cod_seq', 28, true);
          public          postgres    false    215            �           0    0    bebida_cod_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.bebida_cod_seq', 14, true);
          public          postgres    false    219            *           2606    16617     administrador administrador_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (cod);
 J   ALTER TABLE ONLY public.administrador DROP CONSTRAINT administrador_pkey;
       public            postgres    false    216            0           2606    16772    bebida bebida_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.bebida
    ADD CONSTRAINT bebida_pkey PRIMARY KEY (cod);
 <   ALTER TABLE ONLY public.bebida DROP CONSTRAINT bebida_pkey;
       public            postgres    false    220            .           2606    16714    cliente cliente_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cpf);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    218            ,           2606    16703    secretaria secretaria_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_pkey PRIMARY KEY (rg);
 D   ALTER TABLE ONLY public.secretaria DROP CONSTRAINT secretaria_pkey;
       public            postgres    false    217            2           2606    16708    cliente fk_rg_sec    FK CONSTRAINT     w   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_rg_sec FOREIGN KEY (fk_rg_sec) REFERENCES public.secretaria(rg);
 ;   ALTER TABLE ONLY public.cliente DROP CONSTRAINT fk_rg_sec;
       public          postgres    false    218    4652    217            1           2606    16623 %   secretaria secretaria_fk_cod_adm_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_fk_cod_adm_fkey FOREIGN KEY (fk_cod_adm) REFERENCES public.administrador(cod);
 O   ALTER TABLE ONLY public.secretaria DROP CONSTRAINT secretaria_fk_cod_adm_fkey;
       public          postgres    false    216    4650    217            �   c   x�32��H-�M-��Sp�I-.N�K)��0���461�0��tN�)�I,�LIIIK�LOB���D���������\NC#cS3sKCN_������ D�        �   �   x��ϱ
�@�9}�l�R�^��Z�I�S=[���oo[��-$?��� K�0�M�l,���Dt�+9��K��x��w����w�:\?,4��+�X�*�`C%��h��K�T8_?\�Q�ʔ��a�ipJPl����Yk��ͧ�[wi�v��0KS���F-��a"����`L~+��,����P      �   ~   x���;1Dk�\ ����t\`o�M J@b�X��3SL3�Je��0������!�g�a9����簀�5&RQ�ǹ��Ϗ8Ĕ�h�6&'"�5`��߃��ifC��|�2�?�����ι�-�      �   k   x�3426153��44��H-�M-��Sp�I-.N�K)�7�4200�"#N_L��������iajiailb`af��5'n�Cznbf�^r~.'�*���F�@�M�b���� Ȏ!�     