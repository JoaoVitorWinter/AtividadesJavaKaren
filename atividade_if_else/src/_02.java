import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, hora, min;
		String mesExtenso = "";
		
		System.out.print("Dia: ");
		dia = sc.nextInt();
		System.out.print("Mês: ");
		mes = sc.nextInt();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		System.out.print("Horas: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		

		if(mes == 1) {
			mesExtenso = "Janeiro";
		} else if(mes == 2) {
			mesExtenso = "Fevereiro";
		}else if(mes == 3) {
			mesExtenso = "Março";
		}else if(mes == 4) {
			mesExtenso = "Abril";
		}else if(mes == 5) {
			mesExtenso = "Maio";
		}else if(mes == 6) {
			mesExtenso = "Junho";
		}else if(mes == 7) {
			mesExtenso = "Julho";
		}else if(mes == 8) {
			mesExtenso = "Agosto";
		}else if(mes == 9) {
			mesExtenso = "Setembro";
		}else if(mes == 10) {
			mesExtenso = "Outubro";
		}else if(mes == 11) {
			mesExtenso = "Novembro";
		}else if(mes == 12) {
			mesExtenso = "Dezembro";
		}
		
		if(dia < 32 && mes < 13 && hora < 24 && min < 61) {
			
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.print(dia + "/" + mesExtenso + "/" + ano + "   " + hora + ":" + min);
	
			}
			
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				
				if(dia == 31) {
					System.out.print("Data inválida!");
				} else {
					System.out.print(dia + "/" + mesExtenso + "/" + ano + "   " + hora + ":" + min);
				}
			}
			
			if(mes == 2) {
				
				if(ano % 4 == 0) {
					
					if(dia > 29) {
						System.out.print("Data inválida!");
					} else {
						System.out.print(dia + "/" + mesExtenso + "/" + ano + "   " + hora + ":" + min);
					}
				} else {
					if(dia > 28) {
						System.out.print("Data inválida!");
					} else {
						System.out.print(dia + "/" + mesExtenso + "/" + ano + "   " + hora + ":" + min);
					}
				}
			}
		} else {
			System.out.print("Data inválida!");
		}
		
		sc.close();
		
	}

}
