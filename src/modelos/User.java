package modelos;
import java.util.Date;

public class User {
    private String id;
    private String nome;
    private String observacao;
    private String placa;
    public User() {
    }

    public User(String id, String nome, String observacao, String placa) {
        this.id = id;
        this.nome = nome;
        this.observacao = observacao;
        this.placa = placa;
    }
	//Gere os métodos getters e setters
	//Subscreva o método toString()   

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setId1(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public User(String placa) {
		super();
		this.placa = placa;
	}

	public void setplaca(String string) {
		// TODO Auto-generated method stub
		
	}


		
}

    
