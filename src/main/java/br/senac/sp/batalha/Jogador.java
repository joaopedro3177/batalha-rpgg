package br.senac.sp.batalha;

import java.util.Random;

public class Jogador {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    private Random random = new Random();

    public Jogador(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String atacar(Jogador inimigo) {
        int dano = random.nextInt(ataque) + 1;
        int danoFinal = dano - inimigo.getDefesa();

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        inimigo.setVida(inimigo.getVida() - danoFinal);

        return this.nome + " atacou " + inimigo.getNome() + " causando " + danoFinal + " de dano.<br>";
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
}