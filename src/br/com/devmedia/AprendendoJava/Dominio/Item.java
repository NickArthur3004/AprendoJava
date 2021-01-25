package br.com.devmedia.AprendendoJava.Dominio;

public class Item {
    private String nameItem;
    private int anoCriacao;

    public Item(){
    }

    public Item(String nameItem, int anoCriacao){
        this.nameItem = nameItem;
        this.anoCriacao = anoCriacao;
    }
    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + nameItem + '\'' +
                ", anoCriacao=" + anoCriacao +
                '}';
    }
}
