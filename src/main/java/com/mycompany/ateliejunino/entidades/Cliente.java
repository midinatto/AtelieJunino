package com.mycompany.ateliejunino.entidades;

public class Cliente {


        private int id;
        private String nomeResponsavel;
        private String nomeDancante;
        private int idade;
        private String rua;
        private String num;
        private String complemento;
        private String bairro;
        private String cidade;
        private String estado;
        private String telefone;
        private String escola;

        public Cliente(){
        }
        public Cliente(String nome, String nomeDancante, String rua, String num, String complemento, String bairro, String cidade, String estado,String telefone,String escola){
            this.id =id;
            this.nomeResponsavel =nomeResponsavel;
            this.idade = idade;
            this.nomeDancante = nomeDancante;
            this.rua = rua;
            this.num = num;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.telefone = telefone;
            this.escola = escola;
        }
        public Cliente(String nomeResponsavel, String nomeDancante, int idade, String rua, String num,
                        String complemento, String bairro, String cidade,
                        String estado, String telefone,String escola){
            this.id =id;
            this.nomeResponsavel =nomeResponsavel;
            this.idade = idade;
            this.nomeDancante = nomeDancante;
            this.rua = rua;
            this.num = num;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.telefone = telefone;
            this.escola = escola;
        }

    public Cliente(int id, String nomeResponsavel, String nomeDancante, int idade, String rua, String num, String complemento, String cidade, String estado, String telefone, String escola) {
        this.id = id;
        this.nomeResponsavel = nomeResponsavel;
        this.nomeDancante = nomeDancante;
        this.idade = idade;
        this.rua = rua;
        this.num = num;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.escola = escola;
    }


    public int getId(){
            return id;
        }
        public void setId(int id){
            this.id =id;
        }
        public String getnomeResponsavel(){
            return nomeResponsavel;
        }
        public void setnomeResponsavel(String nomeResponsavel){
            this.nomeResponsavel =nomeResponsavel;
        }
        public int getidade(){
            return idade;
        }
        public void setidade(int idade){
            this.idade =idade;
        }

        public String getnomeDancante(){
            return nomeDancante;
        }
    public void setnomeDancante(String nomeDancante){
        this.nomeDancante = nomeDancante;
    }
        public String getrua(){
            return rua;
        }
        public void setrua(String rua){
            this.rua = rua;
        }
        public String getnum(){
            return num;
        }
        public void setnum(String num){
            this.num = num;
        }
        public String getcomplemento(){
            return complemento;
        }
        public void setcomplemento(String complemento){
            this.complemento = complemento;
        }
        public String getbairro(){
            return bairro;
        }
        public void setbairro(String bairro){
            this.bairro = bairro;
        }
        public String getcidade(){
            return cidade;
        }
        public void setcidade(String cidade){
            this.cidade = cidade;
        }
        public String getestado(){
            return estado;
        }
        public void setestado(String estado){
            this.estado = estado;
        }
        public String gettelefone(){
            return telefone;
        }
        public void settelefone(String telefone){
            this.telefone = telefone;
        }
    public String getescola(){
        return escola;
    }
    public void setescola(String escola){
        this.escola = escola;
    }
    }



