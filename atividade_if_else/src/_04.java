import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora1, min1, hora2, min2, minT = 0, horaT = 0;
		String horaS = "", minS = ""; 

		System.out.print("Hora de in�cio: ");
		hora1 = sc.nextInt();
		System.out.print("Minuto de in�cio: ");
		min1 = sc.nextInt();
		System.out.print("Hora de t�rmino: ");
		hora2 = sc.nextInt();
		System.out.print("Minuto de t�rmino: ");
		min2 = sc.nextInt();

		if (hora2 != hora1 || min1 != min2) {

			if (hora2 < hora1 || (hora2 == hora1 && min2 < min1)) {
				minT = (24 - (hora1 - hora2)) * 60 + (min2 - min1);
			} else if (hora2 > hora1 || (hora2 == hora1 && min2 > min1)) {
				minT = ((hora2 - hora1) * 60 + (min2 - min1));
			}
			
			horaT = minT / 60;
			minT = minT % 60;
			
			if(horaT < 10) {
				horaS += "0" + horaT;
			}
			
			if(minT < 10) {
				minS += "0" + minT;
			}
			
			if(horaT > 9 && minT > 9) {
			System.out.print("Dura��o do jogo: " + horaT + ":" + minT);
			} else if(horaT < 10 && minT > 9) {
				System.out.print("Dura��o do jogo: " + horaS + ":" + minT);
			} else if(horaT > 9 && minT < 10){
				System.out.println("Dura��o do jogo: " + horaT + ":" + minS);
			} else {
				System.out.println("Dura��o do jogo: " + horaS + ":" + minS);
			}
			
			
		} else {
			System.out.print("Informa��es erradas!");
		}
		
		sc.close();

	}

}
