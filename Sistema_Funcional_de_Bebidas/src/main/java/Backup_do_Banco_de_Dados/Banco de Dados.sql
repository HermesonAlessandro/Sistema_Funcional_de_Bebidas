PGDMP  3                
    |            Sistema_Funcional_de_Bebidas    16.4    16.4 )    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
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
          public          postgres    false    219            �            1259    16830    caixa    TABLE     �   CREATE TABLE public.caixa (
    id_pedido integer NOT NULL,
    nome_produto_pedido character varying(100) NOT NULL,
    valor_total_pedido numeric(10,2) NOT NULL,
    pagamento character varying(25) NOT NULL
);
    DROP TABLE public.caixa;
       public         heap    postgres    false            �            1259    16688    cliente    TABLE     |  CREATE TABLE public.cliente (
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
       public         heap    postgres    false            �            1259    16835    extrato    TABLE     �  CREATE TABLE public.extrato (
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
    DROP TABLE public.extrato;
       public         heap    postgres    false            �            1259    16788    pedido    TABLE     
  CREATE TABLE public.pedido (
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
    DROP TABLE public.pedido;
       public         heap    postgres    false            �            1259    16787    pedido_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pedido_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.pedido_id_seq;
       public          postgres    false    222            �           0    0    pedido_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.pedido_id_seq OWNED BY public.pedido.id;
          public          postgres    false    221            �            1259    16618 
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
       public         heap    postgres    false            4           2604    16613    administrador cod    DEFAULT     v   ALTER TABLE ONLY public.administrador ALTER COLUMN cod SET DEFAULT nextval('public.administrador_cod_seq'::regclass);
 @   ALTER TABLE public.administrador ALTER COLUMN cod DROP DEFAULT;
       public          postgres    false    215    216    216            5           2604    16770 
   bebida cod    DEFAULT     h   ALTER TABLE ONLY public.bebida ALTER COLUMN cod SET DEFAULT nextval('public.bebida_cod_seq'::regclass);
 9   ALTER TABLE public.bebida ALTER COLUMN cod DROP DEFAULT;
       public          postgres    false    220    219    220            6           2604    16791 	   pedido id    DEFAULT     f   ALTER TABLE ONLY public.pedido ALTER COLUMN id SET DEFAULT nextval('public.pedido_id_seq'::regclass);
 8   ALTER TABLE public.pedido ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    222    222            �          0    16610    administrador 
   TABLE DATA           q   COPY public.administrador (cod, nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) FROM stdin;
    public          postgres    false    216   �8       �          0    16767    bebida 
   TABLE DATA           w   COPY public.bebida (cod, cod_de_barras, descricao, marca, gp_mercadoria, t_do_item, q_estoque, v_unitario) FROM stdin;
    public          postgres    false    220   99       �          0    16830    caixa 
   TABLE DATA           ^   COPY public.caixa (id_pedido, nome_produto_pedido, valor_total_pedido, pagamento) FROM stdin;
    public          postgres    false    223   �;       �          0    16688    cliente 
   TABLE DATA           g   COPY public.cliente (cpf, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_rg_sec) FROM stdin;
    public          postgres    false    218   �<       �          0    16835    extrato 
   TABLE DATA           �  COPY public.extrato (ext_id_pedido, ext_fk_cpf_cliente, ext_nome_cliente, ext_endereco_cliente, ext_telefone_cliente, ext_email_cliente, ext_descricao_bebida, ext_cod_de_barras_bebida, ext_marca_bebida, ext_gp_mercadoria_bebida, ext_t_do_item_bebida, ext_q_estoque_bebida, ext_q_adquirida_do_pedido, ext_v_unitario_bebida, ext_v_total_pedido, ext_fk_cod_bebida, ext_status_pagamento) FROM stdin;
    public          postgres    false    224   �=       �          0    16788    pedido 
   TABLE DATA           .  COPY public.pedido (id, fk_cpf_cliente, nome_cliente, endereco_cliente, telefone_cliente, email_cliente, descricao_bebida, cod_de_barras_bebida, marca_bebida, gp_mercadoria_bebida, t_do_item_bebida, q_estoque_bebida, q_adquirida_do_pedido, v_unitario_bebida, v_total_pedido, fk_cod_bebida) FROM stdin;
    public          postgres    false    222   �=       �          0    16618 
   secretaria 
   TABLE DATA           j   COPY public.secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) FROM stdin;
    public          postgres    false    217   0@       �           0    0    administrador_cod_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.administrador_cod_seq', 28, true);
          public          postgres    false    215            �           0    0    bebida_cod_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.bebida_cod_seq', 34, true);
          public          postgres    false    219            �           0    0    pedido_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.pedido_id_seq', 68, true);
          public          postgres    false    221            8           2606    16617     administrador administrador_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (cod);
 J   ALTER TABLE ONLY public.administrador DROP CONSTRAINT administrador_pkey;
       public            postgres    false    216            >           2606    16772    bebida bebida_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.bebida
    ADD CONSTRAINT bebida_pkey PRIMARY KEY (cod);
 <   ALTER TABLE ONLY public.bebida DROP CONSTRAINT bebida_pkey;
       public            postgres    false    220            B           2606    16834    caixa caixa_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.caixa
    ADD CONSTRAINT caixa_pkey PRIMARY KEY (id_pedido);
 :   ALTER TABLE ONLY public.caixa DROP CONSTRAINT caixa_pkey;
       public            postgres    false    223            <           2606    16714    cliente cliente_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cpf);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    218            D           2606    16841    extrato extrato_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.extrato
    ADD CONSTRAINT extrato_pkey PRIMARY KEY (ext_id_pedido);
 >   ALTER TABLE ONLY public.extrato DROP CONSTRAINT extrato_pkey;
       public            postgres    false    224            @           2606    16795    pedido pedido_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_pkey;
       public            postgres    false    222            :           2606    16703    secretaria secretaria_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_pkey PRIMARY KEY (rg);
 D   ALTER TABLE ONLY public.secretaria DROP CONSTRAINT secretaria_pkey;
       public            postgres    false    217            G           2606    16796    pedido fk_cod_bebida    FK CONSTRAINT     {   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fk_cod_bebida FOREIGN KEY (fk_cod_bebida) REFERENCES public.bebida(cod);
 >   ALTER TABLE ONLY public.pedido DROP CONSTRAINT fk_cod_bebida;
       public          postgres    false    4670    220    222            H           2606    16801    pedido fk_cpf_cliente    FK CONSTRAINT     ~   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT fk_cpf_cliente FOREIGN KEY (fk_cpf_cliente) REFERENCES public.cliente(cpf);
 ?   ALTER TABLE ONLY public.pedido DROP CONSTRAINT fk_cpf_cliente;
       public          postgres    false    222    4668    218            F           2606    16708    cliente fk_rg_sec    FK CONSTRAINT     w   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_rg_sec FOREIGN KEY (fk_rg_sec) REFERENCES public.secretaria(rg);
 ;   ALTER TABLE ONLY public.cliente DROP CONSTRAINT fk_rg_sec;
       public          postgres    false    4666    218    217            E           2606    16623 %   secretaria secretaria_fk_cod_adm_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.secretaria
    ADD CONSTRAINT secretaria_fk_cod_adm_fkey FOREIGN KEY (fk_cod_adm) REFERENCES public.administrador(cod);
 O   ALTER TABLE ONLY public.secretaria DROP CONSTRAINT secretaria_fk_cod_adm_fkey;
       public          postgres    false    4664    217    216            �   c   x�32��H-�M-��Sp�I-.N�K)��0���461�0��tN�)�I,�LIIIK�LOB���D���������\NC#cS3sKCN_������ D�        �   �  x��T�n1]�|����ǲ��Bi�"l�8����ةg�����;�l�c�IJ+�"M�rF3�{����
�Q\CœE �~�s��(����/S(�y\���eR���XB��Ϥ�#>��7�t�)8j�Ԗ1���/1�2�ńT~J
-���6.SN�ᤘ�<p�Ǝ��I��~ò���T����>6$�I�i�n/��\��
ʬr�������L/s{�"Ә�u/P��h/�I�U\,����$4m���]:������(z`���9g�2�����E�nQT���n��K�_�S���8��Q��:	\����q��V1���n�@N������u�6]�:����c�����s�(G#��8���"�{Lb�ю�_�^�j�ͩ`��hj,�������G�a&�^���BP����L��W�{B���~U�~��PF,��Gh<�S��P8�	f>!����a��ڷ	}4HY������3_|��%�2��߽���X�1�	�q�f����k�W@/�Ѽ�u�d������T2ŘVRh�K�җ�O��x�L����
�W����#������I�{J}i��;]X��<3���R����PnJ����Q���O�r`S�v���8ވZ��"��M�:��a���@�Os�QĤ�恚3LО���h4�t�g      �   �   x���AN�0EדS�	,ǭ'�e��U��6��P��B]T,9�/F�!Q����3_���:�Ŏ�9�P��QK�y���ћ��*-�D�ه�]p����BM�
Z�v���7��R	=�n���5�����1He!ɼ�������(_C��0R��G����:+n�<���4�.~2�~`���E5A�ޘ*x�o70.�ο��^T3�c�+_��'��${EQ|��{,      �   �   x���K
1DםSx��ο�ӝo�&�IF�L��;�A쪂�T=�@k�2�{	5֘@!"������R.��f (h��ұ��1��<�T�X�)|>��9',)a��k�6=�dC8��F�>7����}"[��p��t8]�qJ���˪��z�<��*����`�� �
J�      �      x������ � �      �   _  x�͖�n�0���S�*p�䭎��1FO���0�ņ�S�yz(r�W�XFK{���T 42�~����c�q{�y���7����7�����Wb�5V̀!W�U/�;�|wd��h���~�S�v��������>5�̯C���{J�:�M!�6R�
x�n-���A�L��p?���!dO),�5��h2[7�ڷ(�iC�WH�r��(d�`2�󰉩S��%W_;JI���Ea��4��P�ɻ�p�o���mB��<AmM�,������Y��;��o/f��,3L�҆���.��D,�b�#�`_����ZJ&A2���շ{�ܷ-�{��ި}�);�2^|#% ���(L2߯]1����C��E
��S�����;��(E��&w��]�)}�Ѧx�R�r-�{wU~���.�������ys�yϽ��q�|~��7V�n\-]ں�NTS��+�A�*�2lB�]ubua=)"zH>�$�`�Yu?��N+ĵ�0 �D����ӈeײ����C�(�tSk��� L7�V�v�6���ظ;퀬� ��-�w�b����]<����[�u�;�2�nr��/.����s�e�Z���      �   k   x�3426153��44��H-�M-��Sp�I-.N�K)�7�4200�"#N_L��������iajiailb`af��5'n�Cznbf�^r~.'�*���F�@�M�b���� Ȏ!�     