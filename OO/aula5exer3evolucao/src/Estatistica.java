import java.text.DecimalFormat;
import java.util.Vector;

public class Estatistica
{
	public static void menorIdade(Vector habitantes, int qtdeHabitantes)
	{
		int menoridade = 200;
		Habitante pessoa;

		for (int habitante = 0; habitante < qtdeHabitantes; habitante++)
		{
			pessoa = (Habitante) habitantes.get(habitante);
			if (pessoa.getIdade() < menoridade)
			{
				menoridade = pessoa.getIdade();
			}
		}
		System.out.println("A menor idade registrada foi: " + menoridade);
	}

	public static void maiorSalario(Vector habitantes, int quantidadeHabitantes)
	{
		float maiorSalario = 0;
		Habitante pessoa;
		DecimalFormat mascara = new DecimalFormat("0.00");

		for (int habitante = 0; habitante < quantidadeHabitantes; habitante++)
		{
			pessoa = (Habitante) habitantes.get(habitante);
			if (pessoa.getSalario() > maiorSalario)
			{
				maiorSalario = pessoa.getSalario();
			}
		}
		System.out.println("O maior salario registrado foi: " + mascara.format(maiorSalario));
	}

	public static float mediaNumeroFilhoESalario(Vector habitantes, int quantidadeHabitantes)
	{
		float mediaNumeroFilhos = 0;
		float mediaSalario = 0;
		Habitante pessoa;
		DecimalFormat mascara = new DecimalFormat("0.00");

		for (int habitante = 0; habitante < quantidadeHabitantes; habitante++)
		{
			pessoa = (Habitante) habitantes.get(habitante);
			mediaNumeroFilhos += pessoa.getNumeroFilho();
			mediaSalario += pessoa.getSalario();
		}

		System.out.println("A media dos salarios e: " + mascara.format(mediaSalario / quantidadeHabitantes));
		System.out
				.println("A media do numero de filhos e: " + mascara.format(mediaNumeroFilhos / quantidadeHabitantes));

		return mediaSalario / quantidadeHabitantes;
	}

	public static void salarioSuperiorMedia(Vector habitantes, int quantidadeHabitantes, float mediaSalario)
	{
		int salarioSuperiorMedia = 0;
		float mediaHomensAcima300 = 0f;
		Habitante pessoa;
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		for (int habitante = 0; habitante < quantidadeHabitantes; habitante++)
		{
			pessoa = (Habitante) habitantes.get(habitante);
			if(pessoa.getSalario() > mediaSalario)
			{
				salarioSuperiorMedia++;
			}
		}
		
		System.out.println("O numero de pessoas que possuem salario acima da media e: " + salarioSuperiorMedia);
	}
}
