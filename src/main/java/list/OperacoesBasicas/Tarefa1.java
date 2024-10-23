package main.java.list.OperacoesBasicas;

public class Tarefa1 {

    //atributo

    private String descrição;

    public Tarefa1(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    @Override
    public String toString() {
        return  descrição;
    }
}
