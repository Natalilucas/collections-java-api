package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList
             ) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O total de tarefas é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.adicionarTarefa("Tarifa 1");
        listaTarefa.adicionarTarefa("Tarifa 2");
        listaTarefa.adicionarTarefa("Tarifa 3");
        listaTarefa.adicionarTarefa("Tarifa 4");
        listaTarefa.adicionarTarefa("Tarifa 4");
        System.out.println("O total de tarefas é: " + listaTarefa.obterTotalTarefas());

        //listaTarefa.removerTarefa("Tarefa 4");
        System.out.println(" Apos remover, temos o total de tarefas é: " + listaTarefa.obterTotalTarefas());


    }
}
