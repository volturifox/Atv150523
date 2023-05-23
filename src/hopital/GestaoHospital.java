package hopital;

public class GestaoHospital {
	FilaNormal filaN = new FilaNormal();
	FilaLeve filaL = new FilaLeve();
	FilaModerado filaM = new FilaModerado();
	FilaSevero filaS = new FilaSevero();
	public void criar() {
        Paciente paciente1 = new Paciente("João", "11111111111", 1);
        Paciente paciente2 = new Paciente("Maria", "22222222222", 2);
        Paciente paciente3 = new Paciente("Pedro", "33333333333", 0);
        Paciente paciente4 = new Paciente("Ana", "44444444444", 3);

        adicionar(paciente1);
        adicionar(paciente2);
        adicionar(paciente3);
        adicionar(paciente4);
    }

    public void adicionar(Paciente paciente) {
        int nivelPrioridade = paciente.getNivelPrioridade();

        switch (nivelPrioridade) {
            case 0:
                filaN.push(paciente);
                break;
            case 1:
                filaL.push(paciente);
                break;
            case 2:
                filaM.push(paciente);
                break;
            case 3:
                filaS.push(paciente);
                break;
            default:
                System.out.println("Nível de prioridade inválido.");
                break;
        }
    }
}
