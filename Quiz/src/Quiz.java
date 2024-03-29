
//importando a biblioteca do Scanner
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// Aluno: Jo�o Vitor Winter
		// Criando var�avel sc de tipo Scanner
		Scanner sc = new Scanner(System.in);
		// Criando var�avel para a resposta e para contar os pontos
		String resposta;
		int pontos = 0;
		// Caixa de informa��es sobre o quiz
		System.out.println("--------------------------------------------------------------------");
		System.out.println("|          Respostas em letras min�sculas(e sem acento)!           |");
		System.out.println("|  Veja a bandeira em ASCII art e tente descobrir o nome do pa�s!  |");
		System.out.println("|   Respostas certas concedem 3 pontos, erros retiram 2 pontos.    |\n"
				+ "|             Para pular uma quest�o, responda com 0!              |");
		System.out.println("--------------------------------------------------------------------");
		// As perguntas v�o ser no estilo abaixo, com a bandeira em ASCII art
		System.out.print("1.\n################################################################################\r\n"
				+ "################################################################################\r\n"
				+ "################################################################################\r\n"
				+ "#######################################..,######################################\r\n"
				+ "###################################*.........(##################################\r\n"
				+ "###############################(.................###############################\r\n"
				+ "############################.......&&&&&&&&&&%.......###########################\r\n"
				+ "########################.......&&&&&&&&&&&&&&&&&&&.......#######################\r\n"
				+ "####################.........&&&&&&&&&&&&&&&&&&&&&&&.........###################\r\n"
				+ "################............  ,# #    &&&&&&&&&&&&&&&............###############\r\n"
				+ "############...............&&&&&&&&&&&&&   ## &&&&&&&&...............###########\r\n"
				+ "########..................%&&&&&&&&&&&&&&&&&&&&    &&&...................#######\r\n"
				+ "##########.................&&&&&&&&&&&&&.&&&&&&&&&& (#.................#########\r\n"
				+ "##############.............&.&&&&&&&&&&%&&&&&&&&&&&&&&.............#############\r\n"
				+ "##################..........&&&&&&&&&&&&&&&&&&&&&&&&&..........#################\r\n"
				+ "######################........&&&&&&&&&&&&&& &&&&&&........#####################\r\n"
				+ "##########################.......&&&&&&&&&&&&&&&.......#########################\r\n"
				+ "##############################.....................#############################\r\n"
				+ "##################################.............#################################\r\n"
				+ "#####################################/.....#####################################\r\n"
				+ "################################################################################\r\n"
				+ "################################################################################\r\n"
				+ "################################################################################\n\nResposta: ");
		// Ent�o, receber a resposta na var�avel
		resposta = sc.nextLine();

		// Para depois verificar se a resposta est� correta ou errada. Tamb�m avalia se
		// ela pulou a quest�o
		if (resposta.equals("brasil")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n2.\n############      ##############################################################\r\n"
				+ "############      ##############################################################\r\n"
				+ "############      ##############################################################\r\n"
				+ "############      ############                                                  \r\n"
				+ "############      ############                                                  \r\n"
				+ "                              ##################################################\r\n"
				+ "                              ##################################################\r\n"
				+ "                              ##################################################\r\n"
				+ "############      ############                                                  \r\n"
				+ "############      ############                                                  \r\n"
				+ "############      ##############################################################\r\n"
				+ "############      ##############################################################\r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "################################################################################\r\n"
				+ "################################################################################\r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "................................................................................\r\n"
				+ "################################################################################\r\n"
				+ "################################################################################\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("grecia")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n3.\n/                                                                               \r\n"
				+ "&&&&/                                                                           \r\n"
				+ "&&&%&&&&(                                                                       \r\n"
				+ "&&&####%&&&&/                                                                   \r\n"
				+ "&&&########%&&&&/                                                               \r\n"
				+ "&&&############%&&&&/                                                           \r\n"
				+ "&&&################%&&&&*                                                       \r\n"
				+ "&&&####################%&&&&/                                                   \r\n"
				+ "&&&########################%&&&&(                                               \r\n"
				+ "&&&############################%&&&&*                                           \r\n"
				+ "&&&################################%&&&&/                                       \r\n"
				+ "&&&####################################%&&&&/                                   \r\n"
				+ "&&&############### %# #####################%&&&&*                               \r\n"
				+ "&&&###(#######%,        /%#######(#############%&&&&/                           \r\n"
				+ "&&&#### .####%            %%###  ##################&&&&&*                       \r\n"
				+ "&&&####%   (#*            /#/   #######################%&&&&*                   \r\n"
				+ "&&&#######                    #############################%&&&&/               \r\n"
				+ "&&&#########(              (###################################%&&&&*           \r\n"
				+ "&&&##############%%%%%%############################################%&&&&*       \r\n"
				+ "&&&####################%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&*   \r\n"
				+ "&&&#######################&&&&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
				+ "&&&#########################%&&&,                                               \r\n"
				+ "&&&############################&&&%                                             \r\n"
				+ "&&&################*/############%&&&.                                          \r\n"
				+ "&&&#########%  ###,  ,###  %########&&&%                                        \r\n"
				+ "&&&##########             .###########%&&&,                                     \r\n"
				+ "&&&#####/                      /#########&&&%                                   \r\n"
				+ "&&&#######*                  *#############%&&&,                                \r\n"
				+ "&&&###%,                        *%############&&&%                              \r\n"
				+ "&&&#####%*                    *%################%&&&,                           \r\n"
				+ "&&&######(                    #####################&&&%                         \r\n"
				+ "&&&####%  .*#,            *(*.  %####################%&&&,                      \r\n"
				+ "&&&##########    #    (    #############################&&&%                    \r\n"
				+ "&&&##########.#####  %#### %##############################%&&&,                 \r\n"
				+ "&&&##########################################################&&&%               \r\n"
				+ "&&&############################################################%&&&,            \r\n"
				+ "&&&###############################################################&&&%          \r\n"
				+ "&&&#################################################################%&&&,       \r\n"
				+ "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&%\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("nepal")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n4.\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%*            *%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%.      .#%%%%%%%%%(.%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%,      %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%.     *%%%%%%%%%%%%%%%%%%%%% .%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%#      %%%%%%%%%%%%%%%%%%%%%#      %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%(     .%%%%%%%%%%%%%%%%%%%(       #%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%      #%%%%%%%%%%%%%%%%%%%%%  #%#* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%      (%%%%%%%%%%%%%%%%%%%%*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%/      ,%%%%%%%%%%%%%/%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%#         .,,,   #%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%#/,..,/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("turquia")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n5.\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################################################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################################################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%########################   ##########################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%######################   ############################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################   #############################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################   #############################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################.   ############################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#######################   ###########################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%##########################   /#######################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################################################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%#####################################################%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("maldivas")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n6.\n                                        (#######################################\r\n"
				+ "       .....                            (#######################################\r\n"
				+ "       |   |                            (#######################################\r\n"
				+ "  ......   ......                       (#######################################\r\n"
				+ "  |             |                       (#######################################\r\n"
				+ "  ......   ......                       (#######################################\r\n"
				+ "       |   |                            (#######################################\r\n"
				+ "       .....                            (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\r\n"
				+ "                                        (#######################################\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("malta")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n7.\n                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                           %%%%%%%%%                                            \r\n"
				+ "                        %%%%%%%%%%%%%%%                                         \r\n"
				+ "                     %%%%%%%%%%%%%%%%%%%%%                                      \r\n"
				+ "                   %%%%%%%%%%%%%%%%%%%%%%%%%                                    \r\n"
				+ "                  %%%%%%%%%%%%%%%%%%%%%%%%%%%                                   \r\n"
				+ "                 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                  \r\n"
				+ "                 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                  \r\n"
				+ "%%%%%%%%%%%%%%%%%                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%                           %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%                         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%                     %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%               %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("groelandia")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		System.out.print("\n8.\n                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                                                            ,                   \r\n"
				+ "                  %@@ %&                                 @,.@@,                 \r\n"
				+ "                 @@, @@* @@.                         %@@ &@@ &@@                \r\n"
				+ "               @@@ @@@ @@@                             @@% @@& @@&              \r\n"
				+ "             %@@ #@@ #@@          #############         .  ..@@..@@.            \r\n"
				+ "                @@* @@/        ###################        &@@ &@@               \r\n"
				+ "                  %@@        #######################        @@*                 \r\n"
				+ "                            #########################                           \r\n"
				+ "                           %##############%%%%%%%%####                          \r\n"
				+ "                           %%%##########%%%%%%%%%%%%##                          \r\n"
				+ "                           %%%%%%%%%%%%%%%%%%%%%%%%%%                           \r\n"
				+ "                            %%%%%%%%%%%%%%%%%%%%%%%%%       .                   \r\n"
				+ "                @@ @@@        %%%%%%%%%%%%%%%%%%%%%        @@% @%               \r\n"
				+ "             @@* @@* @@*        %%%%%%%%%%%%%%%%%        (@@ &@@ &@@            \r\n"
				+ "              #@@ #%  #@@            %%%%%%%           .@@.  @..@@.             \r\n"
				+ "                @@@ @@@ @@@                           @@@ @@@ @                 \r\n"
				+ "                 .@@. @@.                               &@@ &@@                 \r\n"
				+ "                   %@(                                     &@,                  \r\n"
				+ "                                                                                \r\n"
				+ "                                                                                \n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("coreia do sul")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}
		
		System.out.print("\n9.\n,,,,,,,,#################################################################,,,,,,,\r\n"
				+ ",,,,,,,,,,,,,#######################################################,,,,,,,,,,,,\r\n"
				+ "@@@,,,,,,,,,,,,,,,#############################################,,,,,,,,,,,,,,,@@\r\n"
				+ "@@@@@@@@,,,,,,,,,,,,,,,###################################,,,,,,,,,,,,,,,@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@,,,,,,,,,,,,,,,#########################,,,,,,,,,,,,,,,@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,###############,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,#####,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,#####,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,###############,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@,,,,,,,,,,,,,,,#########################,,,,,,,,,,,,,,,@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@,,,,,,,,,,,,,,,###################################,,,,,,,,,,,,,,,@@@@@@@\r\n"
				+ "@@@,,,,,,,,,,,,,,,#############################################,,,,,,,,,,,,,,,@@\r\n"
				+ ",,,,,,,,,,,,,#######################################################,,,,,,,,,,,,\n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("jamaica")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}
		
		System.out.print("\n10.\n          #############################################################         \r\n"
				+ "              #####################################################             \r\n"
				+ "                  #############################################                 \r\n"
				+ "####                  /###################################,                  ###\r\n"
				+ "########                   ###########################                   #######\r\n"
				+ "############                   ###################                   ###########\r\n"
				+ "################                   ###########                  ,###############\r\n"
				+ "#####################                  ###                  ####################\r\n"
				+ "#########################                               ########################\r\n"
				+ "#############################                       ############################\r\n"
				+ "#############################                       ############################\r\n"
				+ "#########################                               ########################\r\n"
				+ "#####################                  ###                  ####################\r\n"
				+ "################                   ###########                   ###############\r\n"
				+ "############                   ###################                   ###########\r\n"
				+ "########                   ###########################                   #######\r\n"
				+ "####                  #####################################                  ###\r\n"
				+ "                  #############################################                 \r\n"
				+ "              #####################################################             \n\nResposta: ");

		resposta = sc.nextLine();

		if (resposta.equals("escocia")) {
			pontos += 3;
		} else if (resposta.equals("0")) {

		} else {
			pontos -= 2;
		}

		// Mostrando o resultado das respostas
		System.out.println("Pontua��o: " + pontos);
		if(pontos == 30) {
			System.out.print("Parab�ns!");
		} else if(pontos >= 20) {
			System.out.print("Muito bom!");
		} else if(pontos >= 10) {
			System.out.println("T� no caminho.");
		} else if(pontos >= 0){
			System.out.println("Precisa melhorar!");
		} else {
			System.out.println("T� ruim pra caramba!");
		}
		
		sc.close();
		
	}

}
