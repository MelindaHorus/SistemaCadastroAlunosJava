/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.alunos;

/**
 *
 * @author melin
 * 1 – Desenvolver o seguinte sistema abaixo, empregando os conhecimentos adquiridos nas
aulas sobre interfaces gráficas em java.
a. Criar a seguinte classe Aluno, conforme diagrama:
 * 
 * Dica: Pesquisar a classe UUID.
b. Implementar o formulário possibilitando ao usuário cadastrar uma lista de alunos,
respeitando as seguintes regras:

i. Quando o botão Ok for pressionado os dados contidos em tela devem
ser armazenados em memória (utilizar a interface List <E> em
conjunto com a classe ArrayList<E> para armazenar a lista de alunos
cadastrados em memória)
ii. Limpar apaga o conteúdo dos labels.
iii. Botão Mostrar exibe o pop-up a ser desenvolvido no item (C) deste
trabalho.
iv. Botão Sair encerra a aplicação.
 * 
 * 
 * Criar o mecanismo de exibição abaixo, que contempla todos os ids e nomes dos alunos
cadastrados nesta execução do programa, utilizando a classe:
JOptionPane.showMessageDialog(this, mensagem);
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.UUID;

public class Aluno {
    private UUID uuid;
    private String nome;
    private int idade;
    private String endereco;

    // Construtor
    public Aluno() {
        this.uuid = UUID.randomUUID();
    }

    // Getters e Setters
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}